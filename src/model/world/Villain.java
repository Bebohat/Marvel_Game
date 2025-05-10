package model.world;

import java.util.ArrayList;

import model.effects.Stun;

public class Villain extends Champion {

	public Villain(String name, int maxHP, int maxMana, int actions, int speed, int attackRange, int attackDamage) {
		super(name, maxHP, maxMana, actions, speed, attackRange, attackDamage);

	}

	@Override
	public void useLeaderAbility(ArrayList<Champion> targets) {
		for (Champion c : targets) {

			c.setCurrentHP(0);
			Stun s= new Stun(4);
			s.apply(c);
			c.getAppliedEffects().add(s);

		}

	}

}
