public class Game {
    private Player player;
    private Room room;

    public Game(Player player, Room room) {
        this.player = player;
        this.room = room;
    }

    public Player getPlayer() {
        return player;
    }

    public Monster getMonster() {
        return room.getMonster();
    }

    public Room getRoom() {
        return room;
    }

    public int playerAttack(){
        return this.player.basicAttack();
    }

    public int monsterAttack(){
        return this.room.getMonster().getMonsterDamage();
    }

    public boolean successfulFight(){
        while (true) {
            this.room.getMonster().loseHealth(playerAttack());
                if (room.getMonster().isDead()){
                    return true;
                }
                else{
                    this.player.loseHealth(monsterAttack());
                    if (player.isDead()){
                        return false;
                    }
                }
        }
    }

    public void runGame(){
        while(true){
            break;
        }
    }
}
