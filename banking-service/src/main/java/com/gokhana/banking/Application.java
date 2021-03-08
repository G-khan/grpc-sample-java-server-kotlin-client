package com.gokhana.banking;

import com.gokhana.banking.grpc.GRPCService;
import com.gokhana.banking.grpc.GRPCServiceImpl;

import java.io.IOException;

public class Application {

    public static void main(String... args) throws InterruptedException, IOException {
        final GRPCService grpcService = new GRPCServiceImpl();
        grpcService.start();
        grpcService.blockUnitShutDown();
    }
}
