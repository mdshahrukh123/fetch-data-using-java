package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class demo {
    public static void main(String []args) throws Exception{
        Object https;
        var url="https://api.nationalize.io/?name=nathaniel";
        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
       var client= HttpClient.newBuilder().build();
       var response = client.send(request, HttpResponse.BodyHandlers.ofString());
      System.out.println(response.statusCode());
       System.out.println(response.body());
    }
}
