import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GameTest {

    private Barbarian connan;
    private Room room;
    private Monster monster;
    private ArrayList<WeaponType> weaponLoot;
    private ArrayList<ArmourType> armourLoot;
    private Game game;


    @Before
    public void before() {
        connan = new Barbarian("Connan");
        monster = new Monster("Skeleton", 5, 2);
        weaponLoot = new ArrayList<>();
        weaponLoot.add(WeaponType.AXE);
        weaponLoot.add(WeaponType.BATTLEAXE);
        armourLoot = new ArrayList<>();
        armourLoot.add(ArmourType.ENCHANTEDCLOTH);

        room = new Room("Spooky Room", monster, false, weaponLoot, armourLoot);

        game = new Game(connan, room);
    }

    @Test
    public void succesfulFight(){
        assertEquals(true, game.successfulFight());
    }

    @Test
    public void canGetLoot(){
        game.getLoot();
        assertEquals(5, connan.getGold());
        assertEquals(ArmourType.ENCHANTEDCLOTH, connan.getArmour());
    }


}