import java.util.ArrayList;

public abstract class Player {
    private String name;
    protected int hitPoints;
    protected ArmourType armour;
    private WeaponType currentWeapon;
    private ArrayList<WeaponType>weapons;
    protected int gold;
    protected int gems;

    public Player(String name, int hitPoints, ArmourType armour, WeaponType curentWeapon) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.weapons = new ArrayList<>();
        this.armour = armour;
        this.currentWeapon = curentWeapon;
        gold = 0;
        gems = 0;

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

    public void setArmour(ArmourType armour) {
        this.armour = armour;
    }

    public void addGold(int loot){
        this.gold += loot;
    }

    public void addGems(int loot){
        this.gems += loot;
    }
}
