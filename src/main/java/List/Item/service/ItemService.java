package List.Item.service;

import org.springframework.stereotype.Service;

import List.Item.model.ItemModel;
import List.Item.repository.ItemRepository;
import java.util.List;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ItemModel salvarItem(ItemModel item) {
        return itemRepository.save(item);
    }
    public List<ItemModel> buscarTodosItens() {
        return itemRepository.findAll();
    }
    public ItemModel buscarItemPorId(Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item com ID " + id + " não foi encontrado."));
    }

    public void excluirItem(Long id) {
        if (!itemRepository.existsById(id)) {
            throw new RuntimeException("Não foi possível excluir. O item com ID " + id + " não existe.");
        }
        itemRepository.deleteById(id);
    }
}
    
