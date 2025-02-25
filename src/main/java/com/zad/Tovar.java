package com.zad;

public class Tovar {
    String name, made, country, booking;
    double date, price;

    public Tovar(String name, double date, String made, String country, double price, String booking ) {
        this.name = name; // название
        this.date = date; // дата производства
        this.made = made; // производитель
        this.country = country; // страна происхождения
        this.price = price; // цена
        this.booking = booking; // состояние бронирования покупателем
    }

    public static void main(String[] args) {

         Tovar tovar1 = new Tovar("телефон", 2024, "nokia", "Китай", 1000, "Забронировано");

         System.out.println("Название:" + tovar1.name);
         System.out.println("Дата производства:" + tovar1.date);
         System.out.println("Производитель:" + tovar1.made);
         System.out.println("Страна происхождения:" + tovar1.country);
         System.out.println("Цена:" + tovar1.price);
         System.out.println("Состояние бронирования покупателемм:" + tovar1.booking);

    }
}