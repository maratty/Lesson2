package com.zad;

class Park {
    private String time = "с 10.00 до 22.00";
    private String price = "100 рублей";
    private String adress = "Волшебная, 100";
    private String age = "с 5 до 10 лет";

    public Park() {
    }

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        Inner() {
        }

        void display() {
            System.out.println("Время работы аттракциона Карусель:" + Park.this.time);
            System.out.println("Стоимость аттракциона Карусель:" + Park.this.price);
            System.out.println("Адрес аттракциона Карусель:" + Park.this.adress);
            System.out.println("Ограниччение по возрасту аттракциона Карусель:" + Park.this.age);
        }
    }
}
