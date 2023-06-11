package com.neko.seed.player.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author XU BIAO
 * @since 2023-06-10
 */
@RestController
@RequestMapping("/player")
public class PlayerController {

    @GetMapping("/example")
    public String example(){
        return "hello world ! this is example response";
    }
}
