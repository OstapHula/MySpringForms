package ua.online.courses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.online.courses.entity.Item;
import ua.online.courses.repository.ItemRepository;
import ua.online.courses.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemRepository repository;
	
	@Override
	public void saveItem(Item item) {
		repository.save(item);
	}

	@Override
	public List<Item> findAllItem() {
		return repository.findAll();
	}

	@Override
	public Item findItemById(int id) {
		return repository.findOne(id);
	}

	@Override
	public void deleteItem(int id) {
		repository.delete(id);
	}

	@Override
	public Item findItemByName(String name) {
		return repository.findItemByName(name); 
	}

}
