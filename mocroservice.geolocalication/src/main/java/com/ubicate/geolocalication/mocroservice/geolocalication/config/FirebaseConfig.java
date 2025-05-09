package com.ubicate.geolocalication.mocroservice.geolocalication.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import org.springframework.context.annotation.Configuration;
import jakarta.annotation.PostConstruct;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class FirebaseConfig {

    @PostConstruct
    public void initialize() {
        try {
            // Carga el archivo JSON con las credenciales de Firebase desde el classpath
            InputStream serviceAccount = new ClassPathResource("").getInputStream();

            // Configura las opciones de Firebase
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://ubicate-3900d.firebaseio.com") // URL de tu base de datos en Firebase
                    .build();

            // Inicializa Firebase con las opciones configuradas
            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
