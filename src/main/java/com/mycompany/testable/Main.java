/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testable;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author nekres
 */
public class Main {
    
    public static void main(String[] args) throws MalformedURLException, IOException {
         String url = "http://transport.odessa.ua/php/LoadingRoute.php";
        URL uri = new URL(url);
        HttpURLConnection huc = (HttpURLConnection)uri.openConnection();
        
        String urlParams = "type=tram&number=12&language=ru";
        byte[] postData = urlParams.getBytes(StandardCharsets.UTF_8);
        
        huc.setDoOutput(true);
        huc.setRequestMethod("POST");
        huc.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
        huc.setRequestProperty("Content-Length", Integer.toString(postData.length));
        try(DataOutputStream dos = new DataOutputStream(huc.getOutputStream())){
            dos.write(postData);
            dos.flush();
        }
        ObjectMapper mapper = new ObjectMapper();
        Response response = mapper.readValue(huc.getInputStream(), Response.class);
        System.out.println(response.toString());
        
    }
}
