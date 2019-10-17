package extractInterface.mySolution;

public class FireBall implements Attack{
    private final int fireballDamage, fireballManaRequired;

    public FireBall(int fireballDamage, int fireballManaRequired) {
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;
    }


    @Override
    public String attack(GameCharacter attacker, GameCharacter target) {
        if (attacker.useMana(fireballManaRequired)) {
            target.takeDamage(fireballDamage);
            return attacker.getName() + " hit " + target.getName() + " with a fireball for "
                    + fireballDamage + " points of damage";
        } else {
            return attacker.getName() + " did not have enough mana for a fireball attack";
        }
    }
}
