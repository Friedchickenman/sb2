package org.zerock.sb2.reply.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.sb2.reply.service.ReplyService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping
@RequiredArgsConstructor
@Log4j2
public class ReplyController {
    
    private final ReplyService service;
}
