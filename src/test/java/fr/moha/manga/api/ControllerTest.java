package fr.moha.manga.api;

import fr.moha.manga.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource
public class ControllerTest  {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private UserRepository repository;

    @Test
    public void givenUser_Status200() throws Exception {

    }
}
