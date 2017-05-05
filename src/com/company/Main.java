package com.company;

import com.company.state.Document;

public class Main {

    public static void main(String[] args) {
        Document document = new Document();
        System.out.println(document.getCurrentStatusName());
        document.setNextStatus();
        System.out.println(document.getCurrentStatusName());
        document.setNextStatus();
        System.out.println(document.getCurrentStatusName());
        document.setNextStatus();
        System.out.println(document.getCurrentStatusName());
    }
}
