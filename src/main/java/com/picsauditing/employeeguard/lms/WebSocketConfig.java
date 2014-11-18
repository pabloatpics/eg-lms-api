package com.picsauditing.employeeguard.lms;

import com.picsauditing.employeeguard.lms.service.chat.ActiveUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

import java.util.List;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {


  @Override
  public void configureMessageBroker(MessageBrokerRegistry config) {
    config.enableSimpleBroker("/queue", "/topic");
    config.setApplicationDestinationPrefixes("/app");
  }

  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
    registry.addEndpoint("/chat", "/activeUsers").withSockJS();
  }

  @Override
  public void configureClientInboundChannel(ChannelRegistration channelRegistration) {
  }

  @Override
  public void configureClientOutboundChannel(ChannelRegistration channelRegistration) {
  }

  @Override
  public boolean configureMessageConverters(List<MessageConverter> converters) {
    return true;
  }

  @Bean
  public ActiveUserService activeUserService() {
    return new ActiveUserService();
  }

}
