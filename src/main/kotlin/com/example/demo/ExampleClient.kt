package com.example.demo

import org.springframework.cloud.openfeign.FeignClient

@FeignClient(
    name = "example-service",
    url = "https://wwww.example.com"
)
interface ExampleClient {}
