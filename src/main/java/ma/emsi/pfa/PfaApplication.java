package ma.emsi.pfa;

import ma.emsi.pfa.dao.CompteRepository;
import ma.emsi.pfa.dao.RoleRepository;
import ma.emsi.pfa.dao.UserRepository;
import ma.emsi.pfa.entities.Role;
import ma.emsi.pfa.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication
public class PfaApplication {
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    CompteRepository compteRepository;
    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(PfaApplication.class, args);
    }


}