package pl.wsb.rpg.inventory.entity;

import jakarta.persistence.*;
import pl.wsb.rpg.character.entity.GameCharacter;
import java.math.BigDecimal;

@Entity
@Table(name = "character_item")
public class CharacterItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private GameCharacter gameCharacter;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "is_equipped", nullable = false)
    private Boolean isEquipped;

    protected CharacterItem() {
    }

    public CharacterItem(GameCharacter gameCharacter, Item item, Integer quantity, Boolean isEquipped) {
        this.gameCharacter = gameCharacter;
        this.item = item;
        this.quantity = quantity;
        this.isEquipped = isEquipped;
    }

    public Long getId() { return id; }
    public GameCharacter getGameCharacter() { return gameCharacter; }
    public Item getItem() { return getItem(); }
    public Integer getQuantity() { return quantity; }
    public Boolean getIsEquipped() { return isEquipped; }
}