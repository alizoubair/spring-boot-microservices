package com.springbootmicroservices.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
