package com.example.consumer.Controller;



import com.example.consumer.Service.EnseignantQueryService;
import com.example.consumer.entity.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/enseignants")
@RestController
public class EnseignantQueryController {
    @Autowired

    private EnseignantQueryService queryService;
    @GetMapping
    public List<Enseignant> getEnseign()
    {
       return queryService.getEnseignants();
    }

    @GetMapping("/get-ens")
    public Enseignant getEns(@PathVariable Long id){
        return queryService.getEns(id);
    }



}
