package com.company.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 05.05.2017.
 */
public abstract class State {
    public static State state;
    public static String statusName;
    public static List<State> resolutionStatus = new ArrayList<>();
    public static State nextStatus;
    public static State previousStatus;

}
