package com.company.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 05.05.2017.
 */
public class NewSt extends State {
    public static State nextStatus = PodpisanSt.state;
    public static State previousStatus = SendingSt.state;
    public static String statusName = "Новый";
}
