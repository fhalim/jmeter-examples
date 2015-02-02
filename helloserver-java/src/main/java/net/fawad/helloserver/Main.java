package net.fawad.helloserver;

import io.netty.buffer.ByteBuf;
import io.reactivex.netty.RxNetty;
import io.reactivex.netty.protocol.http.server.HttpServer;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 9993;
        System.out.println("Server running on " + port);
        HttpServer<ByteBuf, ByteBuf> server = RxNetty.createHttpServer(port, (request, response) -> {
            response.writeString("Hello, " + request.getPath());
            return response.close();
        });

        server.start();
        new CountDownLatch(1).await();
    }
}
