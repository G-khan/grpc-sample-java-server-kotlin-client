package com.gokhana.payment

import com.gokhana.payment.client.PaymentClient
import io.grpc.ManagedChannelBuilder

class Application

private const val serverURL = "localhost:8090"

fun main(args: Array<String>) {
    val channel = ManagedChannelBuilder.forTarget(serverURL)
        .usePlaintext()
        .build()
    val grpcClient = PaymentClient()
    grpcClient.invokeGrpcSampleService(channel)
}

