package com.sentilab.core;
/*
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/css/**", "/js/**", "/img/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception { // 5
        http
                .authorizeRequests()
                .antMatchers("/login", "/signup", "/main").permitAll() // everyone
                .antMatchers("/").hasRole("USER") // USER, ADMIN
                .antMatchers("/admin").hasRole("ADMIN") // ADMIN
                .anyRequest().authenticated() // 나머지 - 권한이 있어야 접근
                .and()
                .formLogin()
                .loginPage("/login") // login page
                .defaultSuccessUrl("/") // page after login succ
                .and()
                .logout()
                .logoutSuccessUrl("/login") // page after logout succ
                .invalidateHttpSession(true); // 세션 날리기
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                // enable in memory based authentication with a user named "user" and "admin"
                .inMemoryAuthentication().withUser("user").password("password").roles("USER")
                .and().withUser("admin").password("password").roles("USER", "ADMIN");
    }
}*/
