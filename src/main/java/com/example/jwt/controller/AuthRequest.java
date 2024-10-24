package com.example.jwt.controller;

public record AuthRequest(
        String email,
        String password
) {
}