import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarbarianTest {
    private Barbarian connan;

    @Before
    public void setUp() throws Exception {
        connan = new Barbarian("Connan");
    }

    @Test
    public void getHitPoints() {
        assertEquals(150, connan.getHitPoints());
    }

    @Test
    public void getArmour() {
        assertEquals(ArmourType.LOINCLOTH, connan.getArmour());
    }

    @Test
    public void getCurrentWeapon() {
        assertEquals(WeaponType.CLUB, connan.getCurrentWeapon());
    }

    @Test
    public void getWeapons() {
        assertEquals(1, connan.getWeapons().size());
    }

    @Test
    public void getGold() {
        assertEquals(0, connan.getGold());
    }

    @Test
    public void getGems() {
        assertEquals(0, connan.getGems());
    }

    @Test
    public void startsNotDead() {
        assertEquals(false, connan.isDead());
    }

    @Test
    public void getName() {
        assertEquals("Connan", connan.getName());
    }

    @Test
    public void canloseHealth() {
        connan.loseHealth(10);
        assertEquals(141, connan.getHitPoints());
    }


    @Test
    public void setCurrentWeapon() {
        connan.setCurrentWeapon(WeaponType.BATTLEAXE);
        assertEquals(WeaponType.BATTLEAXE, connan.getCurrentWeapon());
    }

    @Test
    public void basicAttack() {
        assertEquals(3, connan.basicAttack());
    }

    @Test
    public void canSetArmour(){
        connan.setArmour(ArmourType.ENCHANTEDCLOTH);
        assertEquals(ArmourType.ENCHANTEDCLOTH, connan.getArmour());
    }
}