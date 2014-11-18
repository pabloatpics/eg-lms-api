package com.picsauditing.employeeguard.lms.service.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * An extremely basic auth setup for the sake of a demo project
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("ssouser@pics.com").password("123456").roles("USER");
    auth.inMemoryAuthentication().withUser("pablo").password("pablo").roles("USER");
    auth.inMemoryAuthentication().withUser("alex").password("alex").roles("USER");
    auth.inMemoryAuthentication().withUser("lms").password("lms").roles("USER");
  }
}
