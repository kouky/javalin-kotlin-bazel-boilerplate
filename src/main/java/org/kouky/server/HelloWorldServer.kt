package org.kouky.server

import io.javalin.Javalin

public class HelloWorldServer {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val app = Javalin.create().start(7000)
      app.get("/") { ctx -> ctx.result("Hello World!") }
    }    
  }
}
