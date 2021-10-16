package br.com.constanzo.livecodingcampeonatobrasileiro.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class JogoRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private static final String PATH = "/jogos";

    @Test
    void testGerarJogos() throws Exception {
        mockMvc.perform(post(PATH))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void testFindById() throws Exception {
        mockMvc.perform(get(PATH + "/{id}", "1"))
                .andDo(print())
                .andExpect(status().isNotFound());
    }

    @Test
    void testFindAll() throws Exception {
        mockMvc.perform(get(PATH))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void testGetClassificacao() throws Exception {
        mockMvc.perform(get(PATH + "/classificacao"))
                .andDo(print())
                .andExpect(status().isOk());
    }


}
