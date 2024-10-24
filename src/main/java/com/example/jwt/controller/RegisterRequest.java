package com.example.jwt.controller;

public record RegisterRequest(
        String name,
        String email,
        String password
) {
}