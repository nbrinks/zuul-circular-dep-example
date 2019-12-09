package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
class MethodSecurityConfig : GlobalMethodSecurityConfiguration() {

    @Autowired
    lateinit var exampleClient: ExampleClient

    // Custom implementation
}
