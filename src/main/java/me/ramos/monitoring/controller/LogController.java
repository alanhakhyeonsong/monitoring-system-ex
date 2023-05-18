package me.ramos.monitoring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Logging Level Test용 Controller 입니다.
 * Actuator의 loggers 엔드포인트를 통해 실시간으로 로깅 레벨을 변경하기 위한 예제 입니다.
 *
 * @author hakhyeonsong
 */
@Slf4j
@RestController
public class LogController {

    /**
     * @return Test용 GET 요청의 응답 결과입니다.
     */
    @GetMapping("/log")
    public String log() {
        log.trace("TRACE LOG");
        log.debug("DEBUG LOG");
        log.info("INFO LOG");
        log.warn("WARN LOG");
        log.error("ERROR LOG");

        return "ok";
    }
}
