package List.Item.controller;

import List.Item.model.ItemModel;
import List.Item.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class ItemController {
    
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<ItemModel> criarItem(@RequestBody ItemModel item) {
        ItemModel novoItem = itemService.salvarItem(item);
        return ResponseEntity.ok(novoItem);
    }

    @GetMapping
    public ResponseEntity<List<ItemModel>> buscarTodosItens() {
        List<ItemModel> itens = itemService.buscarTodosItens();
        return ResponseEntity.ok(itens);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemModel> buscarItemPorId(@PathVariable Long id) {
        ItemModel item = itemService.buscarItemPorId(id);
        return ResponseEntity.ok(item);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirItem(@PathVariable Long id) {
        itemService.excluirItem(id);
        return ResponseEntity.noContent().build();
    }
}