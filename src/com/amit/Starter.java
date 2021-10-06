package com.amit;

class Starter
{
public static void main(String[] args)
{
Reservation r1=new Reservation();
r1.doMenu();

r1.doBook();
r1.doCancel();
r1.doDispList();
r1.doSearch();

r1.doExit();
}
}