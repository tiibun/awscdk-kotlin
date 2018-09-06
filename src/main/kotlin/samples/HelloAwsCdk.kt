package samples

import software.amazon.awscdk.App

fun main(args: Array<String>) {
    println(HelloAwsCdk(args.asList()).run())
}

class HelloAwsCdk(args: List<String>) : App(args) {
    init {
        MyStack(this, "hello-cdk")
    }
}
