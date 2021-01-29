FROM ghcr.io/graalvm/graalvm-ce:20.3.0 AS builder

RUN gu install native-image && mkdir /fast-fibonacci

WORKDIR /fast-fibonacci
COPY . .

RUN ./gradlew build -x test && ./gradlew graalNativeImage

FROM gcr.io/distroless/cc-debian10:debug
LABEL version="1.0"

COPY --from=builder /fast-fibonacci/build/fibonacci /
COPY --from=builder /opt/graalvm-ce-java11-20.3.0/lib/libsunec.so /

COPY --from=debian:10.2 /usr/lib/x86_64-linux-gnu/libz* /usr/lib/x86_64-linux-gnu/
COPY --from=debian:10.2 /lib/x86_64-linux-gnu/libz* /lib/x86_64-linux-gnu/

ENTRYPOINT ["/fibonacci"]
CMD ["-a", "DYNAMIC", "42"]
