public enum ArmourType {

    CLOTH("Cloth", 2),
    ENCHANTEDCLOTH("Enchanted Cloth", 3),
    LOINCLOTH("Loin cloth", 1),
    MAGICAL("Magical Cloth", 5),
    STEEL("Steel Plate", 7);

    private final String name;
    private final int value;

    ArmourType(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
