package samples

import software.amazon.awscdk.App

fun main(args: Array<String>) {
    val app = App()
    MyStack(app, "hello-cdk")
    app.run()
}
