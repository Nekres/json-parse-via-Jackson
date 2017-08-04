/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testable.pojo;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author nekres
 */
public class Segments {
    @JsonProperty()
    private int id;
    @JsonProperty()
    private int stoppingId;
    @JsonProperty
    private int routeId;
    @JsonProperty
    private int direction;
    @JsonProperty
    private int built;
    @JsonProperty
    private double lat;
    @JsonProperty
    private double lng;
    @JsonProperty
    private int position;
    @JsonProperty
    private List<Point> points;

    @Override
    public String toString() {
        return "Segments{" + "id=" + id + ", stoppingId=" + stoppingId + ", routeId=" + routeId + ", direction=" + direction + ", built=" + built + ", lat=" + lat + ", lng=" + lng + ", position=" + position + ", points=" + points + '}';
    }
    
}
