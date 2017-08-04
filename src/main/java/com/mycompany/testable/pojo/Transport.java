/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testable.pojo;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author nekres
 */

public class Transport {
    @JsonProperty("id")
    private long id;
    @JsonProperty("inventoryNumber")
    private int inventoryNumber;
    @JsonProperty("url")
    private String url;
    @JsonProperty("routeId")
    private int routeId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("seats")
    private int seats;
    @JsonProperty("title")
    private String title;

    @Override
    public String toString() {
        return "Transport{" + "id=" + id + ", inventoryNumber=" + inventoryNumber + ", url=" + url + ", routeId=" + routeId + ", type=" + type + ", seats=" + seats + '}';
    }
    
}
