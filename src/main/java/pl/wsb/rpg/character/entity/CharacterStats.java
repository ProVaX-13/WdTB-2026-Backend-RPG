package pl.wsb.rpg.character.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;

@Embeddable
public class CharacterStats {
    @Column(name = "max_hit_points", nullable = false)
    private Integer maxHitPoints;

    @Column(name = "current_hit_points", nullable = false)
    private Integer currentHitPoints;

    @Column(name = "experience_points", nullable = false)
    private Integer experiencePoints;
    protected CharacterStats() {
    }
    public CharacterStats(Integer maxHitPoints, Integer currentHitPoints, Integer experiencePoints){
        this.maxHitPoints = maxHitPoints;
        this.currentHitPoints = currentHitPoints;
        this.experiencePoints = experiencePoints;
    }
    public Integer getMaxHitPoints(){return maxHitPoints;}
    public Integer getCurrentHitPoints(){return currentHitPoints;}
    public Integer getExperiencePoints(){return experiencePoints;}
}
