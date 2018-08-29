/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JaxRx2.config;

import com.JaxRx2.controller.HelloWorldController;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author peanu
 */

@ApplicationPath("jax-rs2")
public class AppConfig extends ResourceConfig {
    
    public AppConfig() {
        register(HelloWorldController.class);
        register(JacksonFeature.class);
    }
    
}
