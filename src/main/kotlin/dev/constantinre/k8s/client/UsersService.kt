package dev.constantinre.k8s.client

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.http.RequestEntity
import org.springframework.stereotype.Service

private val cls = object : ParameterizedTypeReference<List<Any>>() {}

@Service
class UsersService(private val serviceProperties: ServiceProperties,
                   restTemplateBuilder: RestTemplateBuilder) {

    private val usersClient = restTemplateBuilder.rootUri(serviceProperties.usersEndpoint.toString()).build()

    fun getUsers(): List<Any> {
        return usersClient.exchange("/users", HttpMethod.GET, RequestEntity.EMPTY, cls).body!!
    }
}