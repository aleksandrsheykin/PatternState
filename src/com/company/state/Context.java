package com.company.state;

/**
 * Created by admin on 05.05.2017.
 */
public abstract class Context {
    private static State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setNextStatus() {

    }

    public void setPreviousStatus() {

    }

    public boolean setStatus(State state) {
        return false;
    }
}
