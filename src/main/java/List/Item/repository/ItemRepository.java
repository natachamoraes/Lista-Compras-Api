package List.Item.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import List.Item.Entity.ItemModel;

public interface ItemRepository extends JpaRepository<ItemModel, Long> {
}
