public enum SpellType {

    POISONNOVA("Poison Nova", 3),
    HOLYRAYS("Holy Rays", 2),
    SHADOWBURN("Shadow Burn", 4);

    private final String spellName;
    private final int spellDamage;

    SpellType(String spellName, int spellDamage) {
        this.spellName = spellName;
        this.spellDamage = spellDamage;
    }

    public String getSpellName() {
        return spellName;
    }

    public int getSpellDamage() {
        return spellDamage;
    }
}
