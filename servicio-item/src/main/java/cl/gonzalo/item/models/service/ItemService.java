package cl.gonzalo.item.models.service;

import java.util.List;

import cl.gonzalo.item.models.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
	

}
