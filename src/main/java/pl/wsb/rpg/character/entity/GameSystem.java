package pl.wsb.rpg.character.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "game_system")
public class GameSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long systemId;

    @Column(name = "name", nullable = false, unique = true, length = 60)
    private String systemName;

    @Column(name = "publisher", nullable = false, length = 60)
    private String publisher;

    @Column(name = "edition", length = 20)
    private String edition;

    @Column(name = "is_active", nullable = false)
    private Boolean systemIsActive;

    protected GameSystem(){}
    public GameSystem(String name, String publisher, String edition, Boolean isActive) {
        this.systemName = name;
        this.publisher = publisher;
        this.edition = edition;
        this.systemIsActive = isActive;
    }
    public Long getSystemId() { return systemId; }
    public String getSystemName() { return systemName; }
    public String getPublisher() { return publisher; }
    public String getEdition() { return edition; }
    public Boolean getSystemIsActive() { return systemIsActive; }
}
