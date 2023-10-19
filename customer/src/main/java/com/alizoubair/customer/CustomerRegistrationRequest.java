package com.alizoubair.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
