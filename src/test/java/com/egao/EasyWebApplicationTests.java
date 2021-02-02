package com.egao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EasyWebApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test_logDebug() {
        Log log = LogFactory.getLog(EasyWebApplicationTests.class);

        log.info("dog");
        log.warn("zero");
        log.debug("someting");
    }

}
