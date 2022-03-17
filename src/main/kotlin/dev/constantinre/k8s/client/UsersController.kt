package dev.constantinre.k8s.client

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class UsersController(private val usersService: UsersService) {
    @GetMapping("/users")
    fun getUsers(): ModelAndView {
        return ModelAndView("users/index", mapOf("users" to usersService.getUsers()))
    }
}