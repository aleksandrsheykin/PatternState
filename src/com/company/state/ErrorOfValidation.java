package com.company.state;

/**
 * Created by admin on 05.05.2017.
 */
public class ErrorOfValidation extends State {
    public static State nextStatus;
    public static State previousStatus = RegistrySt.state;
    public static String statusName = "Ошибка валидации";
}
