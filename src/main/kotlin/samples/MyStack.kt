package samples

import software.amazon.awscdk.App
import software.amazon.awscdk.Stack
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketProps

class MyStack(parent: App, name: String) : Stack(parent, name) {
    init {
        Bucket(this, "MyFirstBucket", BucketProps.builder()
                .withVersioned(true)
                .build())
    }
}
