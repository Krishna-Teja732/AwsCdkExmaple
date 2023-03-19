package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

public class CdkProjectApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkProjectStack(app, "CdkProjectStack", StackProps.builder()
                .env(Environment.builder()
                        .account("387030945958")
                        .region("us-west-2")
                        .build())
                .build());

        new CdkPipeline(app, "CdkPipeline", StackProps.builder()
                .env(Environment.builder()
                        .account("387030945958")
                        .region("us-west-2")
                        .build())
                    .build());

        app.synth();
    }
}

