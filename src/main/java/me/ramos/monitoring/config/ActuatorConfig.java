package me.ramos.monitoring.config;

import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Actuator의 endpoint를 활성화 하기 위한 설정 클래스입니다.
 *
 * @author hakhyeonsong
 */
@Configuration
public class ActuatorConfig {

    /**
     * httpexchanges endpoint를 활성화 하기 위한 Bean을 등록합니다.
     *
     * @return HTTP 요청/응답 기록을 저장하고 있는 HttpExchangeRepository
     * @author hakhyeonsong
     */
    @Bean
    public HttpExchangeRepository httpExchangeRepository() {
        return new InMemoryHttpExchangeRepository();
    }
}
