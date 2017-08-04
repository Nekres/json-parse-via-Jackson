/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testable;

import com.mycompany.testable.pojo.Data;
import com.mycompany.testable.pojo.Transport;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author nekres
 */
public class Response {
    @JsonProperty("success")
    private boolean success;
    @JsonProperty("data")
    private Data data;

    @Override
    public String toString() {
        return "Response{" + "success=" + success + ", data=" + data + '}';
    }
    
}
