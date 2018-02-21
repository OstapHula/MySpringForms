package ua.online.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.online.courses.entity.Item;
import ua.online.courses.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping("/add")
	public String showCreateItemPage(Model model) {
		model.addAttribute("item", new Item());
		return "item/add-item";
	}
	
	@PostMapping("/add")
	public String saveItem(@ModelAttribute("item") Item item){
		itemService.saveItem(item);
		return "redirect:/item/list";
	}
	
	@GetMapping("/list")
	public String showListOfItems(Model model) {
		model.addAttribute("itemList", itemService.findAllItem());
		return "item/list";
	}
	
	@GetMapping("/{itemId}/edit")
	public String editItem(@PathVariable("itemId") int id, Model model) {
		model.addAttribute("item", itemService.findItemById(id));
		return "item/edit-item";
	}
	
	@PostMapping("{itemId}/edit")
	public String saveEditedItem(@ModelAttribute("item") Item item) {
		itemService.saveItem(item);
		return "redirect:/item/list";
	}
	
}
