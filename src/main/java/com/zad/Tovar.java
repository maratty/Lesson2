package com.zad;

public class Tovar {
    String name, made, country, booking;
    int date, price;

    public Tovar(String name, int date, String made, String country, int price, String booking) {
        this.name = name; // название
        this.date = date; // дата производства
        this.made = made; // производитель
        this.country = country; // страна происхождения
        this.price = price; // цена
        this.booking = booking; // состояние бронирования покупателем
    }

    public static void main(String[] args) {

        Tovar telefon = new Tovar("телефон", 2024, "nokia", "Китай", 1000, "забронировано");

        System.out.println("Наименование товара:" + telefon.name + "  дата производства:" + telefon.date + " производитель:" + telefon.made + " страна происхождения:" + telefon.country + " цена:" + telefon.price + " состояние бронирования покупателе:" + telefon.booking);
    }
}



