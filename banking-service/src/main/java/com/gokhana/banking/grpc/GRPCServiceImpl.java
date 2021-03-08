package com.gokhana.banking.grpc;

import com.gokhana.banking.Application;
import com.gokhana.banking.service.BankingServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class GRPCServiceImpl implements GRPCService {

    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());
    int port = 8090;
    private Server server;

    @Override
    public void start() throws IOException, InterruptedException {
        server = ServerBuilder.forPort(port)
                .addService(new BankingServiceImpl())
                .build()
                .start();
        LOGGER.info("GRPC server start on " + port);
    }

    @Override
    public void blockUnitShutDown() throws InterruptedException {
        if (null != server) {
            server.awaitTermination();
        }
    }

}
