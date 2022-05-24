/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.editoriales.controller;

import com.examen.editoriales.model.Editorial;
import com.examen.editoriales.service.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodri
 */
@RestController
@RequestMapping("/post")
public class EditorialRestController {
     @Autowired
     private EditorialService editorialService;
     
     @GetMapping("/all")
     public List<Editorial> getPosts() {
        return editorialService.readAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Editorial> getPost(@PathVariable int id){
        Editorial edi = editorialService.read(id);
        return ResponseEntity.ok(edi);
    }
    
    @DeleteMapping("/{id}")
    public int deletePost(@PathVariable int id) {        
        return editorialService.delete(id);
    }
    @PostMapping("/add")
    public int addPost(@RequestBody Editorial edi) {  
        System.out.println(edi.getNombre());
        return editorialService.create(edi);
    }
    @PutMapping("/edit")
    public int editPost(@RequestBody Editorial edi) {  
        Editorial ed = new Editorial(edi.getIdeditorial(),edi.getNombre(),edi.getPais());
        System.out.println(edi.getIdeditorial()+" , "+edi.getNombre()+" , "+edi.getPais());
        return editorialService.update(edi);
    }
}
