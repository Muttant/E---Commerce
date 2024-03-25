package com.sheryians.major.configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected  void config(HttpSecurity http){
        http
                .authorizaRequest()
                .antMatchers( "/", "/shop/**", "/register", "/h2-console/**").permitAll()
                .antMatcherss("/admin/**").hasRole("ADMIN")
                .authentiacated()
                .and()
                .forLoginPage("/login")
                .permitAll()
                .failureUrl("/login?eror = true")
                .defaultSuccessUrl("/")
                .usernameParameter("email")
                .passwordParameter("password")
                .and()
                .oauth2Login()
                .loginPage("/login")
                .successHandler(GoogleAuth2SuccsessHandler)
                .and()
                .logout()
                .logoutRequestmatcher(new AntPathRequestmatcher("/logout"))
                .logoutSuccsessUrl("/login")
                .invalidateHttpSeccession(true)
                .deleteCookies("JSESSIONID")
                .and()
                .exceptionHandling()
                .and()
                .csrf()
                .disable();
        http.headers().frameOption().disable();
    }
    @Bean
    public BCrytPasswordEncoder bCrytPasswordEncoder(){
        return new BCrytPasswordEncoder();
    }
    @Override
    protected void configure(AuthenticationManageBuilder auth) throws Exception{
        auth.userDetailsService(customUserDeatilService);
    }
    @Override
    private void configurure(WebSecurity web) throws Exception{
        web ignoring().antMatchers(".resources/**", "/static/**", "/image/**", "/productimage/**", "/css/**", "/js/**")
    }
}
