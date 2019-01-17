import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RoomTest {

    Room room;
    Monster monster;
    ArrayList<WeaponType> weaponLoot;
    ArrayList<ArmourType> armourLoot;

    @Before
    public void setUp() throws Exception {
        monster = new Monster("Skeleton", 5, 2);
        weaponLoot = new ArrayList<>();
        weaponLoot.add(WeaponType.AXE);
        weaponLoot.add(WeaponType.BATTLEAXE);
        armourLoot = new ArrayList<>();
        armourLoot.add(ArmourType.ENCHANTEDCLOTH);

        room = new Room("Spooky Room", monster, false, weaponLoot, armourLoot);
    }

    @Test
    public void getRoomName() {
        assertEquals("Spooky Room", room.getRoomName());
    }

    @Test
    public void getMonster() {
        assertEquals("Skeleton", room.getMonster().getMonsterName());
    }

    @Test
    public void getWeaponLoot() {
        assertEquals("Battle Axe", room.getWeaponLoot().getName());
    }

    @Test
    public void getArmourLoot() {
        assertEquals(3, room.getArmourLoot().getValue());
    }

    @Test
    public void setLoot() {
        room.setLoot();
        assertNotEquals(5, room.getLoot());
    }

    @Test
    public void getTrap() {
        assertEquals(false, room.getTrap());
    }
}