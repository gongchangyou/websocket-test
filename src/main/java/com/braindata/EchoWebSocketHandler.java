package com.braindata;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.text.MessageFormat;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/4/13 12:05 下午
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import javax.annotation.Resource;
import java.text.MessageFormat;

/**
 * 通过继承 {@link org.springframework.web.socket.handler.AbstractWebSocketHandler} 的示例
 *
 * @author zifangsky
 * @date 2018/10/9
 * @since 1.0.0
 */
@Slf4j
public class EchoWebSocketHandler extends TextWebSocketHandler{
    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.debug("Opened new session in instance " + this);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        //组装返回的Echo信息

        session.sendMessage(message);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        session.close(CloseStatus.SERVER_ERROR);
        logger.debug("Info: WebSocket connection closed.");
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        log.info("afterConnectionClosed");
    }
}
