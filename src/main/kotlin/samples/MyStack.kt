package samples

import software.amazon.awscdk.App
import software.amazon.awscdk.Stack
import software.amazon.awscdk.StackProps
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketProps

class MyStack(parent: App, name: String, props: StackProps? = null) : Stack(parent, name, props) {
    init {
        Bucket(this, "MyFirstBucket", BucketProps.builder()
                .withVersioned(true)
                .build())
    }
}
