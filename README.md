
# Simple Synchronous Communication Example with gRPC


  

![Java Server and Kotlin Client](https://cdn-images-1.medium.com/max/800/1*WmVzLWnExOp8lhw1uzMvow.png)
**Java Server and Kotlin Client**
  

## Requirements
1. Java - 1.11.x
2. Gradle- 3.x.x

  
**Step 1: Running the Banking service as gRPC Server**

Open the banking Service path then,
Type the following commands in your terminal to run the banking service

    ./gradlew clean build
    ./gradlew run

**Step 2: Running the Payment service as gRPC Client**

Open the payment Service path then,
Type the following commands in your terminal to run the payment service

    ./gradlew clean build
    ./gradlew run


Logs after run the applications:

**Payment Service:**
 
    > Task :run
    Mar 08, 2021 8:59:48 PM com.gokhana.payment.client.PaymentClient invokeGrpcSampleService
    INFO: id: 1535502916
    isSuccess: true
    referenceId: 292592000
    message: "Transaction 2384327497216806399 successfully completed with type Credit Card"

  

**Banking Service:**
   
    Mar 08, 2021 8:59:48 PM com.gokhana.banking.service.BankingServiceImpl pay
    INFO: gRPC request id: 1535502916
    paymentType: "Credit Card"
    bankId: 3233083119461668241
    transactionId: 2384327497216806399
    payDetail: "Hello from GRPC Client"
