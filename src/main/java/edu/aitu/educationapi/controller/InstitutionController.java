package edu.aitu.educationapi.controller;

import edu.aitu.educationapi.model.InstitutionModel;
import edu.aitu.educationapi.repository.InstitutionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/institutions")
public class InstitutionController {

    private final InstitutionRepository repository;

    public InstitutionController(InstitutionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<InstitutionModel> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public InstitutionModel create(@RequestBody InstitutionModel institution) {
        return repository.save(institution);
    }

    @GetMapping("/{id}")
    public InstitutionModel getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
