package flapps.entity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.Date;

@SpringBootApplication
public class StartAttendanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartAttendanceApplication.class, args);
    }

    @Profile("demo")
    @Bean
    CommandLineRunner initDatabase(AttendanceRepository repository) {
        return args -> {
            repository.save(new AttendanceEntity((long) 281921, "Fadhillah Moulita", "Female", "05101994", 2, new Date(), (long) 0700, (long) 1700));
            repository.save(new AttendanceEntity((long) 282121, "Vino G Bastian", "Male", "091295", 4, new Date(), (long) 0700, (long) 1700));
            repository.save(new AttendanceEntity((long) 212123, "Abel Cantika", "Female", "080593", 8, new Date(), (long) 0700, (long) 1700));
        };
    }
}
