package com.lq.fc;

public class Car {

private int speed;
private int gas;
private boolean engineState;

/**
 * @param s
 * @param g
 * @param es
 */
Car (int s, int g, boolean es){
	speed = s;
	gas = g;
	engineState = es;
}

public void setSpeed (int s) {
	speed = s;
}

public void setGas (int g) {
	gas = g;
}

public void setEngineState (boolean es) {
	engineState = es;
}

public int getSpeed () {
	return speed;
}

public int getGas () {
	return gas;
	}

public boolean getEngineState () {
	return engineState;
}

}
