package List.Item.Entity;

import org.hibernate.annotations.DynamicInsert;

import List.Categoria.Entity.CategoriaModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@DynamicInsert
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity(name = "ITEM")
public class ItemModel {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "PRIORIDADE", nullable = false)
    private Boolean prioridade;

    @Column(name = "QUANTIDADE", nullable = false)
    private int quantidade;

    @Column(name = "COMPRADO", nullable = false)
    private boolean comprado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORIA_ID", nullable = false)
    private CategoriaModel categoriaId;
}
