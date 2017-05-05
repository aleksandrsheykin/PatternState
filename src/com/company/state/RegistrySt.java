package com.company.state;

/**
 * Created by admin on 05.05.2017.
 */
public class RegistrySt extends State {
    public static State nextStatus = ErrorOfValidation.state;
    public static State previousStatus = ErrorOfPodpisSt.state;
    public static String statusName = "Зарегестрирован";
}
