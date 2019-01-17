public enum WeaponType {

    STAFF("Staff", 1),
    MACE("Mace", 2),
    CLUB("Club", 3),
    AXE("Axe", 4),
    GREATSWORD("Great Sword", 6),
    BATTLEAXE("Batle Axe", 8);

    private final String name;
    private final int damageValue;

    WeaponType(String name, int damageValue) {
        this.name = name;
        this.damageValue = damageValue;
    }

    public String getName() {
        return name;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
