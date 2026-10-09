package com.dgmf.sec01;

import com.dgmf.AbstractTest;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class BasicChatTest extends AbstractTest {
    private static final  Logger log = (Logger) LoggerFactory
            .getLogger(BasicChatTest.class);

    @Test
    public void basicChat() {
        var response = this.chatClient
                .prompt("What is the Capital of U.S.A?")
                .call()
                .content();

        log.info(response);
    }

}
