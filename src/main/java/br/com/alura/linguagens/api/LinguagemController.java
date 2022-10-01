package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class LinguagemController {
    
    @Autowired
    private LinguagemRepository repositorio;
    
    @CrossOrigin
    @GetMapping(value = "/api/list")
    public List<Linguagem> obterLinguagens() {
        List<Linguagem> linguagens = repositorio.findAll(Sort.by(Sort.Direction.DESC, "ranking"));
        return linguagens;
    }

    @PostMapping(value = "/linguagens")
    @ResponseStatus(HttpStatus.CREATED)
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
        Linguagem linguagemSalva = repositorio.save(linguagem);
        return linguagemSalva;
    }


    @DeleteMapping(value = "/linguagens/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarLinguagem(@PathVariable String id) {
        repositorio.deleteById(id);
    }

    @PutMapping(value = "/linguagens/{id}")
    public Linguagem atualizarLinguagem(@PathVariable String id, @RequestBody Linguagem linguagem) {
        Linguagem linguagemSalva = repositorio.findById(id).get();
        if (linguagem.getTitle() != null) {
            linguagemSalva.setTitle(linguagem.getTitle());
        }
        if (linguagem.getImage() != null) {
            linguagemSalva.setImage(linguagem.getImage());
        }
        if (linguagem.getRanking() != 0) {
            linguagemSalva.setRanking(linguagem.getRanking());
        }
        return repositorio.save(linguagemSalva);
        // linguagemSalva.setTitle(linguagem.getTitle());
        // linguagemSalva.setImage(linguagem.getImage());
        // linguagemSalva.setRanking(linguagem.getRanking());
        
        // return repositorio.save(linguagemSalva);
    }
    
    @CrossOrigin
    @PatchMapping(value = "/api/vote&{title}")
    public Linguagem votarLinguagem(@PathVariable String title) {
        Linguagem linguagem = repositorio.findByTitle(title);
        linguagem.setRanking(linguagem.getRanking() + 1);
        return repositorio.save(linguagem);
    }
}
