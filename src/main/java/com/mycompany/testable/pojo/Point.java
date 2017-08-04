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
public class Point {
    @JsonProperty
    private int id;
    @JsonProperty
    private int segmentId;
    @JsonProperty
    private double lat;
    @JsonProperty
    private double lng;
    @JsonProperty
    private int position;

    @Override
    public String toString() {
        return "Point{" + "id=" + id + ", segmentId=" + segmentId + ", lat=" + lat + ", lng=" + lng + ", position=" + position + '}';
    }
    
}
