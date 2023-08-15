package net.totime.sso.server.config;

import jakarta.annotation.Resource;
import net.totime.sso.server.interceptor.PermissionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/08/15
 * @description WebMvcConfigurer
 * @see WebMvcConfigurer
 * @since 1.0.0
 */
@Configuration
public class SsoWebMvcConfigurer implements WebMvcConfigurer {
    @Resource
    private PermissionInterceptor permissionInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(permissionInterceptor).addPathPatterns("/**");
    }
}
