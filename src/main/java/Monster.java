public class Monster {
    private String monsterName;
    private int monsterHealth;
    private int monsterDamage;

    public Monster(String monsterName, int monsterHealth, int monsterDamage) {
        this.monsterName = monsterName;
        this.monsterHealth = monsterHealth;
        this.monsterDamage = monsterDamage;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int getMonsterHealth() {
        return monsterHealth;
    }

    public int getMonsterDamage() {
        return monsterDamage;
    }

    public void loseHealth(int amountDmg){
        this.monsterHealth -= amountDmg;
    }

    public boolean isDead(){
        if (this.monsterHealth < 1){
            return true;
        }
        return false;
    }


}
