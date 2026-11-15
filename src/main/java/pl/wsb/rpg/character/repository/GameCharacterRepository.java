package pl.wsb.rpg.character.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.wsb.rpg.character.entity.GameCharacter;
import java.util.List;

public interface GameCharacterRepository extends JpaRepository<GameCharacter, Long> {

    @Query("SELECT c FROM GameCharacter c WHERE c.gameSystem.systemName = :systemName")
    List<GameCharacter> findByGameSystemCharacterName(@Param("systemName") String systemName);
}