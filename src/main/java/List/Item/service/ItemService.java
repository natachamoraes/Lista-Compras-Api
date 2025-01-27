package List.Item.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import List.Item.Entity.ItemModel;
import List.Item.repository.ItemRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public ItemModel salvarItem(ItemModel item) {
        return itemRepository.save(item);
    }

    public List<ItemModel> buscarTodosItens() {
        return itemRepository.findAll();
    }

    public Optional<ItemModel> buscarItemPorId(Long id) {
        return itemRepository.findById(id);
    }

    public void excluirItem(Long id) {
        itemRepository.deleteById(id);
    }
}
    
