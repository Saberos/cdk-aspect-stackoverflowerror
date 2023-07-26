# Sample project for reproducing StackOverflowErrors when using stacks with many resources in combination with aspects. 

The project contain a stack filled to the maximum number of resources. Additionally, an aspect is added that does nothing. 

To reproduce the issue run `cdk synth`. In `cdk.json` the thread stack size is limited to simulate a system with limited resources.

Note that when the Aspect in `CdkAspectStackoverflowerrorApp` is removed or commented out, the `cdk synth` command completes succesfully as expected. 
