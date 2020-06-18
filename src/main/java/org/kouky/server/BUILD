java_binary(
    name = "hello_world_server",
    main_class = "org.kouky.server.HelloWorldServer",
    visibility = [
        "//visibility:public",
    ],
    runtime_deps = [
        ":hello_world_server_lib",
    ],
)


load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library")
kt_jvm_library(
    name = "hello_world_server_lib",
    srcs = glob(["*.kt"]),
    deps = [
        "@third_party//3rdparty/jvm/io/javalin:javalin",
        "@third_party//3rdparty/jvm/org/slf4j:slf4j_simple",
    ],
)
