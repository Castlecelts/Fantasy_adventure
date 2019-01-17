import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int hitPoints;
    private ArmourType armour;
    private WeaponType currentWeapon;
    private ArrayList<WeaponType>weapons;
    private int gold;
    private int gems;

    public Player(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void loseHealth(int damage){
        this.hitPoints -= damage;
    }
//
//    public void setHitPoints(){
//        this.hitPoints = 140;
//    }

    public void heal(int healAmount){
        this.hitPoints += healAmount;
    }

    public ArmourType getArmour() {
        return armour;
    }

    public ArrayList<WeaponType> getWeapons() {
        return weapons;
    }

    public int getGold() {
        return gold;
    }

    public int getGems() {
        return gems;
    }

    public WeaponType getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(WeaponType newWeapon) {
        currentWeapon = newWeapon;

    }

    public int basicAttack(){
        return this.currentWeapon.getDamageValue();
    }

    public boolean isDead(){
        if (this.hitPoints < 1){
            return true;
        }
        return false;
    }
}
