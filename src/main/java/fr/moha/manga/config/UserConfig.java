//package fr.moha.manga.config;
//
//import fr.moha.manga.models.Avatar;
//import fr.moha.manga.models.User;
//
//import fr.moha.manga.repositories.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//
//@Configuration
//public class UserConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(UserRepository repository) {
//        return args -> {
//            User user1 = new User(
//                    "wolfy01",
//                    "Wolfy",
//                    "Burns",
//                    "wburns0@vistaprint.com",
//                    "9dxK08",
//                    new Avatar(),
//                    LocalDate.of(1982, Month.NOVEMBER, 13)
//            );
//            repository.save(user1);
//        };
//    }
//}
