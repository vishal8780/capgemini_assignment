package com.spring.security.securitydemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;

@Controller
@EnableWebSecurity
public class AppSecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Bean
    @Override
    protected UserDetailsService userDetailsService() {

        List<UserDetails> users = new ArrayList();
            users.add(User.withDefaultPasswordEncoder().username("vishal").password("0000").roles("USER").build());
        return new InMemoryUserDetailsManager(users);
	}

}
