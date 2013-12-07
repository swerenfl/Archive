package com;

//Step 1: Watch Lesson 7 and create Monster.java and JavaLessonSeven.java -- COMPLETED

public class Monster
{
	public final String TOMBSTONE = "Here Lies a Dead monster";
	private int health = 0; //Step 5: Reset initialization variable to 0
	private int attack = 0; //Step 5: Reset initialization variable to 0
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	public String name = "Big Monster";
	
	public int getAttack()
	{
		return attack;
	}
	
	public int getMovement()
	{
		return movement;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	//Step 4: Add functions (Part 1)
	public void AddHealth(int addHealth)
	{
		health = health + addHealth;
		if (health > 0)
		{
			alive = true;
		}
	}
	
	//Step 4: Add functions (Part 2)
	public void AddHealth(double addHealth)
	{
		int intAddHealth = (int) addHealth;
		health = health + intAddHealth;
		if (health > 0)
		{
			alive = true;
		}
	}
	
	//Step 5: Modify existing functions (Part 1)
	public void DecreaseHealth(int decreaseHealth)
	{
		health = decreaseHealth*attack;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	//Step 5: Modify existing functions (Part 2)
	public void DecreaseHealth(double decreaseHealth)
	{
		int intDecreaseHealth = (int) decreaseHealth;
		health = intDecreaseHealth*attack;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	//Step 6: Add Set Methods (Part 1)
	public void setAttack (int staticAttack)
	{
		attack = staticAttack;
	}
	
	//Step 6: Add Set Methods (Part 2)
	public void setMovement (int staticMovement)
	{
		movement = staticMovement;
	}
	
	//Step 6: Add Set Methods (Part 3)
	public void setHealth (int staticHealth)
	{
		health = staticHealth;
	}
	
	//Step 7: Add getAlive get function
	public boolean getAlive()
	{
		return alive;
	}
	
	public Monster(int health, int attack, int movement)
	{
		this.health = health;
		this.attack = attack;
		this.movement = movement;
	}
	
	public Monster()
	{
		
	}
	
}