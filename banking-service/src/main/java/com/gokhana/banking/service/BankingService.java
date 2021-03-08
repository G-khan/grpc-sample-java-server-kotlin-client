package com.gokhana.banking.service;

import com.gokhana.banking.PaymentGRPCApp;
import io.grpc.stub.StreamObserver;

public interface BankingService {
    void pay(PaymentGRPCApp.paymentDTO request, StreamObserver<PaymentGRPCApp.paymentDTO>response);
}
