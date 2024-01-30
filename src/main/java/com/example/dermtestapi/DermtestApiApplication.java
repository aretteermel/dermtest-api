package com.example.dermtestapi;

// import com.example.dermtestapi.doctor.Doctor;
// import com.example.dermtestapi.doctor.DoctorRepository;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
//@EntityScan(basePackages = "com.example.dermtestapi.doctor")
public class DermtestApiApplication {
    @Value("${environment}")
    private String environmentProperty;

    public static void main(String[] args) {
        SpringApplication.run(DermtestApiApplication.class, args);
    }

//    @Bean
//    ApplicationRunner applicationRunner(Environment environment) {
//        return args -> {
//            log.info((environmentProperty.equals("default") ?
//                    "message from application.properties: " :
//                    "message from application-" + environmentProperty + ".properties: ") +
//                    environment.getProperty("welcome.message"));
//        };
//    }

/*    @Bean
    public CommandLineRunner demo(DoctorRepository repository) {
        return (args) -> {
            repository.save(new Doctor(1L,"Ahti", "Põld", "Kirurg"));
        };
    }*/

}
