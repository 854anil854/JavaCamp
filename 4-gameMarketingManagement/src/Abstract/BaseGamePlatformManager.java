package Abstract;

import Entities.Gamer;

public abstract class BaseGamePlatformManager implements GamerService{
	@Override
	public void add(Gamer gamer) {
		System.out.println("A new user added : " + gamer.getFirstName());
		
	}
	
	
}
