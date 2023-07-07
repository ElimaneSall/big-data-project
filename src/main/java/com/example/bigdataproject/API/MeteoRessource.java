package com.example.bigdataproject.API;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


@Path("/meteo")
    public class MeteoRessource {

        // temperature moyenne de la journee
        @Path("/meamTemperatureOfDay")
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public double meamTemperatureOfDay(){
            // A implementer
            return 21.4;
        }
        // Moyenne de la temperature par heure
        @Path("/meamTemperaturePerHour")
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public Map<String, Double> meamTemperaturePerHour() {
            // A implementer
            List<String> hours = Arrays.asList("12h", "13h");
            List<Double> temperatures = Arrays.asList(23.3, 24.5);

            // Créer le dictionnaire pour stocker les températures par heure
            Map<String, Double> temperatureByHour = new HashMap<>();
            for (int i = 0; i < hours.size(); i++) {
                String hour = hours.get(i);
                Double temperature = temperatures.get(i);
                temperatureByHour.put(hour, temperature);
            }

            return temperatureByHour;
        }

        // temperature moyenne des 15 dernieres minutes
        @Path("/meamTemperatureOfLast15min")
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public double meamTemperatureOfLast15min() {
            // A implementer
            return 21.7;
        }

        // l'humidite actuelle basée sur le calcul de la moyenne des 15 dernieres minutes
        @Path("/currentHumidity")
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public double currentHumidity() {
            // A implementer
            return 21.7;
        }

        // la vitesse du vent actuelle basée sur les données des 15 dernieres minutes
        @Path("/currentWindSpeed")
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public double currentWindSpeed() {
            // A implementer
            return 21.7;
        }

        // la direction du vent actuelle basée sur les données des 15 dernieres minutes
        @Path("/currentWindDirection")
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public double currentWindDirection() {
            // A implementer
            return 21.7;
        }

    // L'ensoleillement actuel basé sur les données des 15 dernieres minutes
        @Path("/ensoleillement")
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public String ensoleillement() {
            // A implementer
            return "Cloud";
        }

        // L'heure du couché du soleil
        @Path("/sunriseTime")
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public LocalDateTime sunriseTime() {
            // A implementer
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTime = currentTime.format(formatter2);
            return currentTime;
        }
        // L'heure du levée du soleil
        @Path("/sunsetTime")
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public LocalDateTime sunsetTime() {
            // A implementer
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//            String formattedTime = currentTime.format(formatter2);
            return currentTime;
        }





    }
