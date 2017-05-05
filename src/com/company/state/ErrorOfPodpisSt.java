package com.company.state;

/**
 * Created by admin on 05.05.2017.
 */
public class ErrorOfPodpisSt extends State {
    public static State nextStatus = RegistrySt.state;
    public static State previousStatus = PodpisanSt.state;
    public static String statusName = "Ошибка подписи";
}
