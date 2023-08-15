package net.totime.sso.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/08/15
 * @description 启动类
 * @since 1.0.0
 */
@SpringBootApplication
public class JiZhiSsoApplication {
	public static void main(String[] args) {
		System.setProperty("user.timezone", "Asia/Shanghai");
		System.setProperty("file.encoding", "UTF-8");
		System.setProperty("user.language", "zh");
		System.setProperty("user.country", "CN");
        SpringApplication.run(JiZhiSsoApplication.class, args);
	}
}
