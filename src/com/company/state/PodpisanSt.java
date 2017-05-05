package com.company.state;

/**
 * Created by admin on 05.05.2017.
 */
public class PodpisanSt extends State {
    public static State nextStatus = ErrorOfPodpisSt.state;
    public static State previousStatus = NewSt.state;
    public static String statusName = "Подписан";
}
