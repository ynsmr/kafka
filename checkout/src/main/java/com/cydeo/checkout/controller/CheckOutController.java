package com.cydeo.checkout.controller;

import com.cydeo.checkout.dto.CheckoutDTO;
import com.cydeo.checkout.service.ProducerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class CheckOutController {
    private final ProducerService producerService;

    public CheckOutController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public String checkout(@RequestBody CheckoutDTO checkoutDTO) throws JsonProcessingException {
       return producerService.sendMessage(checkoutDTO);
    }



}


