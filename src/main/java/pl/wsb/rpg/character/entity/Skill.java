package pl.wsb.rpg.character.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;

    @Column(name = "skill_name", nullable = false, length = 60)
    private String skillName;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "is_magical", nullable = false)
    private Boolean isMagical;

    @Column(name = "base_value", nullable = false)
    private Integer baseValue;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_system_id", nullable = false)
    private GameSystem gameSystem;

    protected Skill() {
    }

    public Skill(String skillName, String description, Boolean isMagical, Integer baseValue) {
        this.skillName = skillName;
        this.description = description;
        this.isMagical = isMagical;
        this.baseValue = baseValue;
    }

    public Long getSkillId() { return skillId; }
    public String getSkillName() { return skillName; }
    public String getDescription() { return description; }
    public Boolean getIsMagical() { return isMagical; }
    public Integer getBaseValue() { return baseValue; }
}