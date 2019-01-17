import java.util.ArrayList;
import java.util.Random;

public class Room {
    private String roomName;
    private Monster monster;
    private ArrayList<WeaponType>weaponLoot;
    private ArrayList<ArmourType>armourLoot;
    private int loot;
    private Boolean trap;



    public Room(String roomName, Monster monster, Boolean setTrap, ArrayList<WeaponType>setupWeapons, ArrayList<ArmourType>setupArmours) {
        this.roomName = roomName;
        this.monster = monster;
        this.trap = setTrap;
        this.loot = 5;
        this.weaponLoot = setupWeapons;
        this.armourLoot = setupArmours;

    }

    public String getRoomName() {
        return roomName;
    }

    public Monster getMonster() {
        return monster;
    }

    public WeaponType getWeaponLoot() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(weaponLoot.size());
        return weaponLoot.get(randomNumber);
    }

    public ArmourType getArmourLoot() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(armourLoot.size());
        return armourLoot.get(randomNumber);
    }

    public int getLoot() {
        return loot;
    }

    public void setLoot() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        this.loot=randomNumber;
    }

    public Boolean getTrap() {
        return trap;
    }
}
