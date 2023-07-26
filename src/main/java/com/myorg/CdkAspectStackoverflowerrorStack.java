package com.myorg;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.iam.Role;
import software.amazon.awscdk.services.iam.RoleProps;
import software.amazon.awscdk.services.iam.ServicePrincipal;
import software.constructs.Construct;

public class CdkAspectStackoverflowerrorStack extends Stack {

    private static final int NUMBER_OF_STACK_RESOURCES = 499;

    public CdkAspectStackoverflowerrorStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public CdkAspectStackoverflowerrorStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // StackOverFlow error only occurs on stacks with many resources. Fill the stack to the max to help reproduce the issue.
        for (int i = 0; i < NUMBER_OF_STACK_RESOURCES; ++i) {
            new Role(this, "Role" + i, RoleProps.builder()
                    .roleName("role" + i)
                    .assumedBy(new ServicePrincipal("sqs.amazonaws.com"))
                    .build());
        }
    }
}
