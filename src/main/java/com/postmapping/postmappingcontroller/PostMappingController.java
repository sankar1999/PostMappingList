package com.postmapping.postmappingcontroller;

import com.postmapping.Item.Item;
import com.postmapping.service.PostMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class PostMappingController {

    @Autowired
    PostMappingService service;

    @GetMapping("/getAllItems")
    public List<Item> getAllItems() {
        return service.getAllItems();
    }

    @PostMapping("/addItems")
    public String addItems(@RequestBody Item item) {
        return service.addItems(item);
    }
}
