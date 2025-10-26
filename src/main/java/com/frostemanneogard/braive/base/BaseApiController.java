package com.frostemanneogard.braive.base;

import org.springframework.beans.factory.annotation.Value;

import java.net.URI;
import java.util.UUID;

public abstract class BaseApiController {

    @Value("${server.servlet.context-path}")
    private String basePath;

    protected abstract String getRequestMapping();

    public URI createControllerUri(String path) {
        return URI.create(String.format("%s/%s/%s", basePath, getRequestMapping(), path));
    }

    public URI createControllerUri(UUID path) {
        return createControllerUri(String.valueOf(path));
    }

}
