package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.s3.Bucket;
import software.amazon.awscdk.services.s3.BucketProps;


public class CdkProjectStack extends Stack {
    public CdkProjectStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public CdkProjectStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);


        Bucket bucket = new Bucket(this, "CDKS3Bucket", BucketProps.builder().versioned(false).build());
    }
}


// import software.amazon.awscdk.services.lambda.CfnFunction;
// import com.amazonaws.services.lambda.runtime.RequestHandler;
// import com.amazonaws.services.lambda.runtime.Context;

        // CfnFunction lambdaFunction = CfnFunction.Builder
        //                             .create(scope, "CDKLambdaFunction")
        //                             .runtime("java8")
        //                             .handler("com.myorg.CdkProjectStack.MyHandler::handleRequest")
        //                             .role("Admin")
        //                             .build();



// class MyHandler implements RequestHandler<String, String>{

//     @Override
//     public String handleRequest(String event, Context context) {
//         return event+" Recieved";
//     }
// }