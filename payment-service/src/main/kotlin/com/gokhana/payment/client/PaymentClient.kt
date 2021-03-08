package com.gokhana.payment.client

import com.gokhana.payment.BankingServiceGrpc
import com.gokhana.payment.PaymentGRPCApp
import io.grpc.ManagedChannel
import java.util.logging.Logger

class PaymentClient {

    private val LOGGER = Logger.getLogger(BankingServiceGrpc::class.java.getName())

    fun invokeGrpcSampleService(channel: ManagedChannel) {
        val blockingStub: BankingServiceGrpc.BankingServiceBlockingStub = BankingServiceGrpc.newBlockingStub(channel)
        val request: PaymentGRPCApp.paymentDTO = PaymentGRPCApp.paymentDTO.newBuilder()
            .setId(1)
            .setPayDetail("Hello from GRPC Client")
            .build()
        val rpcResponse: PaymentGRPCApp.bankDTO = blockingStub.pay(request)
        LOGGER.info(rpcResponse.toString())
    }
}