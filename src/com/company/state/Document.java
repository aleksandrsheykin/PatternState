package com.company.state;

/**
 * Created by admin on 05.05.2017.
 */
public class Document extends Context {
    private static State currentState = SendingSt.state;

    @Override
    public void setNextStatus() {
        super.setNextStatus();
    }

    @Override
    public void setPreviousStatus() {
        super.setPreviousStatus();
    }

    @Override
    public boolean setStatus(State state) {
        return super.setStatus(state);
    }

    public String getCurrentStatusName() {
        return currentState.
    }
}
