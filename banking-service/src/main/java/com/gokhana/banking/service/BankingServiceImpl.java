package com.gokhana.banking.service;


import com.gokhana.banking.BankingServiceGrpc;
import com.gokhana.banking.PaymentGRPCApp;
import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class BankingServiceImpl extends BankingServiceGrpc.BankingServiceImplBase {
  private static final Logger LOGGER = Logger.getLogger(BankingServiceImpl.class.getName());

    @Override
    public void pay(PaymentGRPCApp.paymentDTO request, StreamObserver<PaymentGRPCApp.bankDTO> response) {
        LOGGER.info("gRPC request " + request.toString());
        PaymentGRPCApp.bankDTO  gRPCResponse = PaymentGRPCApp.
                        bankDTO.newBuilder()
                .setId(request.getId())
                .setMessage("Transaction "+request.getTransactionId()+" successfully completed with type "+ request.getPaymentType())
                .setIsSuccess(true)
                .setReferenceId(LocalDateTime.now().getNano())
                .build();
        response.onNext(gRPCResponse);
        response.onCompleted();
    }
}
