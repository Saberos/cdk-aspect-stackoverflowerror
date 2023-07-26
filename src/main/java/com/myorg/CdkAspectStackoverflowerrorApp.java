package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Aspects;
import software.amazon.awscdk.StackProps;

public class CdkAspectStackoverflowerrorApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkAspectStackoverflowerrorStack(app, "CdkAspectStackoverflowerrorStack", StackProps.builder()
                .build());

        // Adding this aspect causes a StackOverflowError to be thrown during synthesising. Removing the aspect the synth completes as expected. 
        Aspects.of(app).add(node -> {
            // Implementation does not matter
        });

        app.synth();
    }
}

