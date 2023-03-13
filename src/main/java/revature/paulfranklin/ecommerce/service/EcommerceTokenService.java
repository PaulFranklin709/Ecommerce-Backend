package revature.paulfranklin.ecommerce.service;

import org.springframework.stereotype.Service;

import revature.paulfranklin.ecommerce.utility.JwtConfig;

@Service
public class EcommerceTokenService {
	private final JwtConfig jwtConfig;
	
	public EcommerceTokenService(JwtConfig jwtConfig) {
		this.jwtConfig = jwtConfig;
	}
}
