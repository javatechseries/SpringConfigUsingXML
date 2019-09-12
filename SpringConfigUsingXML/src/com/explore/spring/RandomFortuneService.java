package com.explore.spring;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
	
	private String[] fortunes = {"Today is your lucky day!","Today will be rewarding!","You will win a jackpot today!"};
	private Random random=new Random();
	
	@Override
	public String getFortune() {
		
		int index=random.nextInt(fortunes.length);
		return fortunes[index];
	}
	
	

}
