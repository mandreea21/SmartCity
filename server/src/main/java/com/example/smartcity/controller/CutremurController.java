package com.example.smartcity.controller;

import com.example.smartcity.dto.CutremurDto;
import com.example.smartcity.model.Cutremur;
import com.example.smartcity.service.CutremurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CutremurController {
    @Autowired
    private CutremurService cutremurService;

    @ResponseBody
    @GetMapping("/cutremur")
    public ResponseEntity<CutremurDto> getLastCutremur() {
        return ResponseEntity.ok().body(cutremurService.getLastCutremur());
    }

    @ResponseBody
    @GetMapping("/cutremure")
    public ResponseEntity<List<CutremurDto>> getAllCutremure() {
        return ResponseEntity.ok().body(cutremurService.getAllCutremure());
    }

    @PostMapping(value = "/cutremur", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CutremurDto> saveCutremur(@RequestBody Cutremur cutremur) {
        return ResponseEntity.ok().body(cutremurService.saveCutremur(cutremur));
    }
}
