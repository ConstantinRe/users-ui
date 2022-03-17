package dev.constantinre.k8s.client

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import java.net.URI

@Component
@ConfigurationProperties(prefix = "service")
class ServiceProperties {
    lateinit var usersEndpoint: URI
}