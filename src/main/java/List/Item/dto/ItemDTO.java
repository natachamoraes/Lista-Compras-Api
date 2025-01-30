package List.Item.dto;

import List.Categoria.Entity.CategoriaModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDTO {
    private Long id;
    private String nome;
    private Boolean prioridade;
    private int quantidade;
    private boolean comprado;
    private CategoriaModel categoria;
}
