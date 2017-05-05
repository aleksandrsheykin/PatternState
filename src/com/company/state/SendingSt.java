package com.company.state;

/**
 * Created by admin on 05.05.2017.
 */
public class SendingSt extends State {
    public static State nextStatus = NewSt.state;
    public static State previousStatus;
    public static String statusName = "Отправляется";
}
