package pl.wsb.rpg.character.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "game_character")
public class GameCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;

    @Column(name = "name", nullable = false, length = 60)
    private String characterName;

    @Column(name = "character_level", nullable = false)
    private Integer characterLevel;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    private CharacterStatus status;

    @Column(name = "created_date", nullable = false)
    private LocalDate createdDate;

    @Embedded
    private CharacterStats stats;

    protected GameCharacter() {
    }

    public GameCharacter(String name, Integer characterLevel, CharacterStatus status, LocalDate createdDate, CharacterStats stats) {
        this.characterName = name;
        this.characterLevel = characterLevel;
        this.status = status;
        this.createdDate = createdDate;
        this.stats = stats;
    }

    public Long getCharacterId() { return characterId; }
    public String getCharacterName() { return characterName; }
    public Integer getCharacterLevel() { return characterLevel; }
    public CharacterStatus getStatus() { return status; }
    public LocalDate getCreatedDate() { return createdDate; }
    public CharacterStats getStats() { return stats; }
}