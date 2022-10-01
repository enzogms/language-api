package br.com.alura.linguagens.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicAuthWebSecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
     http
          .csrf().disable()
          .authorizeRequests()
          .antMatchers("/api/**").permitAll()
          .and()
          .authorizeRequests()
          .antMatchers("/linguagens/**").hasRole("ADMIN")
          .anyRequest().authenticated()
          .and()
          .httpBasic();
      return http.build();
    }

}