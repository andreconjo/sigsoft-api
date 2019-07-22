package com.andreconjo.sigsoft.Controller;

import com.andreconjo.sigsoft.Model.DTO.SceneDTO;
import com.andreconjo.sigsoft.Model.Scene;
import com.andreconjo.sigsoft.Service.SceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SceneController {

    @Autowired
    SceneService sceneService;

    @PostMapping("save")
    public ResponseEntity<Scene> save(@RequestBody Scene scene) {

        return new ResponseEntity<>(sceneService.save(scene), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Scene>> get() {
        return new ResponseEntity<>(sceneService.getAll(), HttpStatus.OK);
    }


    @GetMapping("{id}")
    public ResponseEntity<Scene> save(@PathVariable String id) {
        return new ResponseEntity<>(sceneService.get(id), HttpStatus.OK);
    }
}
