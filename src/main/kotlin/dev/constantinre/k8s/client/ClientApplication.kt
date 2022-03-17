package dev.constantinre.k8s.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClientApplication

fun main(args: Array<String>) {
	runApplication<ClientApplication>(*args)
}
