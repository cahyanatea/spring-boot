/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *
 * @author okt19
 */
@Service
@Profile("prod")
public class ProdProvileBean implements EnvBasedConfig {

    @Override
    public void setup() {
        System.out.println("Menggunakan prod config");
    }
    
}
