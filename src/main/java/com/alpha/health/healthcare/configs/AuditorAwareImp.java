package com.alpha.health.healthcare.configs;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImp implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		// TODO Auto-generated method stub
		return Optional.of("Laxman Koirala");
	}

}
