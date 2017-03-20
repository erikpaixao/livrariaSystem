package br.e3ti.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import br.e3ti.util.UrlPath;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers(UrlPath.PUBLICO + "/**").permitAll().anyRequest()
			.hasRole("USER").and()
			.formLogin().
			permitAll();
	}
	

}
