package br.msc.example.spring_kafka_consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StrListener {

  @KafkaListener(topics = "str-topic", groupId = "group-1")
  public void listen(String message) {
    log.info("Received Message: {}" + message);
  }
}
