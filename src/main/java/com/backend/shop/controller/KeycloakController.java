package com.backend.shop.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/keycloak")
public class KeycloakController {

    @GetMapping
    @PreAuthorize("hasRole('shop-user')")
    public String user() {
        return "User access from Keycloak";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('spring-admin')")
    public String admin() {
        return "Admin access from Keycloak";
    }
}
