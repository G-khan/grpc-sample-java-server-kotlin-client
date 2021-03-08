package com.gokhana.banking.grpc;

import java.io.IOException;

public interface GRPCService {
    void start() throws IOException, InterruptedException;

    void blockUnitShutDown() throws InterruptedException;
}
