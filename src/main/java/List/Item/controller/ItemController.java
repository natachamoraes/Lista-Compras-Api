package List.Item.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import List.Item.Entity.ItemModel;
import List.Item.service.ItemService;

@RestController
@RequestMapping("/compras")
public class ItemController {
    
    @Autowired
    private ItemService itemService;

    @PostMapping
    public ItemModel criarItem(@RequestBody ItemModel item) {
        return itemService.salvarItem(item);
    }

    @GetMapping
    public List<ItemModel> buscarTodosItens() {
        return itemService.buscarTodosItens();
    }

    @GetMapping("/{id}")
    public Optional<ItemModel> buscarItemPorId(@PathVariable Long id) {
        return itemService.buscarItemPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirItem(@PathVariable Long id) {
        itemService.excluirItem(id);
    }
}
