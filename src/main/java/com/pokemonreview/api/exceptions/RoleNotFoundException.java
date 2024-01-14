package com.pokemonreview.api.exceptions;

import java.io.Serial;

public class RoleNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1;

    public RoleNotFoundException(String message) {
        super(message);
    }
}