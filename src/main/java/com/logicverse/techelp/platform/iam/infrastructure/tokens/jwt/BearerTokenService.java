package com.logicverse.techelp.platform.iam.infrastructure.tokens.jwt;

import com.logicverse.techelp.platform.iam.application.internal.outboundservices.tokens.TokenService;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;


public interface BearerTokenService extends TokenService {
    String generateToken(Authentication authentication);

    String getBearerTokenFrom(HttpServletRequest request);

}