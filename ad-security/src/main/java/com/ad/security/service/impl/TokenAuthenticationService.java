package com.ad.security.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

public interface TokenAuthenticationService {
	Authentication authenticate(HttpServletRequest request);
}
