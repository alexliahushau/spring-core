package org.shop.api.impl;

import java.util.List;

import org.shop.api.ItemService;
import org.shop.data.Item;
import org.shop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemServiceImpl implements ItemService {
    
    private ItemRepository repository;

    public ItemServiceImpl(ItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public Long createItem(Item item) {
        return repository.createItem(item);
    }

    @Override
    public void deleteItem(Long itemId) {
        repository.deleteItem(itemId);
    }

    @Override
    public List<Item> getItemsByOrderId(Long orderId) {
        return repository.getItemsByOrderId(orderId);
    }
}
