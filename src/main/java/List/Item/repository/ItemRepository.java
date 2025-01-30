package List.Item.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import List.Item.model.ItemModel;

public interface ItemRepository extends JpaRepository<ItemModel, Long> {

    List<ItemModel> findByCategoriaId(Long categoriaId);

    List<ItemModel> findByCompradoFalse();

    List<ItemModel> findByNomeIgnoreCase(String nome);

}
