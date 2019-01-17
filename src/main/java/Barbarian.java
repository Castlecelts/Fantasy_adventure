import java.util.ArrayList;

public class Barbarian extends Player {
    private ArmourType armour;
    private WeaponType currentWeapon;
    private ArrayList<WeaponType> weapons;
//    private int gold;
//    private int gems;

    public Barbarian(String name) {
        super(name, 150, ArmourType.LOINCLOTH, WeaponType.CLUB );
//        this.hitPoints = 150;
        this.armour = ArmourType.LOINCLOTH;
        this.currentWeapon = WeaponType.CLUB;
        this.weapons = new ArrayList<>();
        this.weapons.add(currentWeapon);
//        this.gold = 0;
//        this.gems = 0;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public void loseHealth(int damage){
        this.hitPoints -= damage - armour.getValue();
    }

    @Override
    public ArmourType getArmour() {
        return armour;
    }

    @Override
    public WeaponType getCurrentWeapon() {
        return currentWeapon;
    }

    @Override
    public void setCurrentWeapon(WeaponType newWeapon) {
        currentWeapon = newWeapon;
    }

    @Override
    public ArrayList<WeaponType> getWeapons() {
        return weapons;
    }

    @Override
    public int getGold() {
        return gold;
    }

    @Override
    public int getGems() {
        return gems;
    }

    @Override
    public int basicAttack(){
        return this.currentWeapon.getDamageValue();
    }

    public void setArmour(ArmourType armour) {
        this.armour = armour;
    }


}
