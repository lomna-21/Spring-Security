package com.springboot.Security.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("Rohit")
                .password("rohit@123")
                .authorities("deo")
                .and()
                .withUser("Pankaj")
                .password("pankaj@123")
                .authorities("doctor")
                .and()
                .withUser("Janam")
                .password("janam@123")
                .authorities("ceo");
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/doctor/**").hasAuthority("doctor")
                .antMatchers("/ceo/**").hasAuthority("ceo")
                .antMatchers("/deo/**").hasAuthority("deo")
                .antMatchers("/schedule/**").hasAnyAuthority("doctor","deo","ceo")
                .antMatchers("/**").permitAll()
                .and()
                .formLogin();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){

        return NoOpPasswordEncoder.getInstance();
    }

}
