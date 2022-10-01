package br.com.alura.linguagens.api;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
    //Buscar linguagem por title
    Linguagem findByTitle(String title);
}
