package pl.wsb.rpg.inventory.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "game_item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column(name = "item_name", nullable = false, unique = true, length = 60)
    private String itemName;

    @Column(name = "weight", nullable = false, precision = 10, scale = 2)
    private BigDecimal weight;

    @Column(name = "cost", nullable = false, precision = 10, scale = 2)
    private BigDecimal cost;

    @Column(name = "is_magical", nullable = false)
    private Boolean isMagical;

    protected Item() {
    }

    public Item(String itemName, BigDecimal weight, BigDecimal cost, Boolean isMagical) {
        this.itemName = itemName;
        this.weight = weight;
        this.cost = cost;
        this.isMagical = isMagical;
    }

    public Long getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public BigDecimal getWeight() { return weight; }
    public BigDecimal getCost() { return cost; }
    public Boolean getIsMagical() { return isMagical; }
}