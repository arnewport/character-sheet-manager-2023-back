package capstone.manager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.TestingAuthenticationProvider;

@Configuration
public class TestSecurityConfig {

    @Bean
    public AuthenticationManager authenticationManager() {
        return new ProviderManager(new TestingAuthenticationProvider());
    }
}