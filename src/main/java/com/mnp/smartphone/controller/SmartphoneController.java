package com.mnp.smartphone.controller;

import com.mnp.smartphone.model.Smartphone;
import com.mnp.smartphone.service.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("smartphone")
public class SmartphoneController {

    private SmartphoneService smartphoneService;

    @Autowired
    public SmartphoneController(SmartphoneService smartphoneService) {
        this.smartphoneService = smartphoneService;
    }

    @GetMapping("get-smartphones")
    public List<Smartphone> getListSmartphones(){
        return smartphoneService.getListSmartphones();
    }

    @GetMapping("get-smartphone")
    public Optional<Smartphone> getSmartphone(@RequestParam int id){
        return smartphoneService.getSmartphone(id);
    }

    @PostMapping("save-smartphone")
    public Smartphone saveSmartphone(@RequestBody Smartphone smartphone){
        return smartphoneService.saveSmartphone(smartphone);
    }

    @DeleteMapping("delete-smartphone")
    public void deleteSmartphone(@RequestParam int id){
        smartphoneService.deleteSmartphone(id);
    }
}
