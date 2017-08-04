/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testable.pojo;

import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author nekres
 */
public class Data {
    @JsonProperty("id")
    private int id;
    @JsonProperty("Number")
    private int number;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("title")
    private String title;
    @JsonProperty("color")
    private String color;
    @JsonProperty("distance")
    private String distance;
    @JsonProperty("eng")
    private String eng;
    @JsonProperty("cost")
    private int cost;
    @JsonProperty("last_update")
    private String last_update;
    @JsonProperty("transport")
    private List<Transport> transport;
     @JsonProperty("segments")
    private List<Segments> segments;

    @Override
    public String toString() {
        return "Data{" + "id=" + id + ", type=" + type + ", title=" + title + ", color=" + color + ", distance=" + distance + ", eng=" + eng + ", cost=" + cost + ", last_update=" + last_update + ", transport=" + transport + ", segments=" + segments + '}';
    }
    
}
