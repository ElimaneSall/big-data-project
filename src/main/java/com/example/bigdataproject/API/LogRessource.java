package com.example.bigdataproject.API;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDateTime;
import java.util.*;

@Path("/error")
public class LogRessource {


    // temperature moyenne de la journee
    @Path("/retard")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<LocalDateTime, String> retard(){
        // A implementer

        LocalDateTime dateTime1 = LocalDateTime.of(2023, 5, 1, 10, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 5, 2, 14, 30);
        String message1 = "Les données ont subi un retard";
        String message2 = "Les données sont en cours de traitement";

        // Créer un objet Map pour stocker les retards et les messages correspondants
        Map<LocalDateTime, String> retardMap = new HashMap<>();
        retardMap.put(dateTime1, message1);
        retardMap.put(dateTime2, message2);

        return retardMap;
    }
}
