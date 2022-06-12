package com.postmapping.service;

import com.postmapping.Item.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostMappingService {

    private static List<Item> loadItemsFromObject() {
        List<Item> ItemObject = new ArrayList<Item>();
        ItemObject.add(new Item(1, "Item 1", 100));
        ItemObject.add(new Item(2, "Item 2", 200));
        ItemObject.add(new Item(3, "Item 3", 300));
        return ItemObject;
    }

    private List<Item> items = loadItemsFromObject();

    public List<Item> getAllItems() {
        return items;
    }

    public String addItems(Item item) {
        items.add(item);
        return "Item added Successfully";
    }
}
