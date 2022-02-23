package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    // org.slf4j.Logger
    // @Slf4j (Lombok)
    // private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        // 연산이 일어나서 출력이 되지 않더라도 쓸모없는 리소스 사용 (+ 사용 X)
        log.info("info log=" + name);

        // log 사용
        // application.properties 에서 단계 설정 가능 -> default는 info
        log.trace("trace log={}", name);    // 로컬에서 사용
        log.debug("debug log={}", name);    // debug (개발)
        log.info("info log={}", name);  // 정보 (운영에서도 봐야될수도 있는)
        log.warn("warn log={}", name);  // 경고
        log.error("error log={}", name);       // 에러
        return "ok";
    }
}
