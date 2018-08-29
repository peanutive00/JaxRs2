/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JaxRx2.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;

/**
 *
 * @author peanu
 */
public class JacksonFeature implements Feature {

    private static final ObjectMapper mapper = new ObjectMapper() {
        {
            configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        }
    };

    private static final JacksonJaxbJsonProvider provider = new JacksonJaxbJsonProvider() {
        {
            setMapper(mapper);
        }
    };

    @Override
    public boolean configure(FeatureContext context) {
        context.register(provider);
        return true;
    }

}
