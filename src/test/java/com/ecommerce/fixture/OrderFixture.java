package com.ecommerce.fixture;

import com.ecommerce.model.Order;
import com.ecommerce.model.Product;

import java.util.List;

public class OrderFixture {
    public static Product product = new Product("Computador", "1", 4500.00);
    public static Product product2 = new Product("Smartphone", "2", 3000.00);
    public static Order order = new Order( "000001","Em andamento");
    public static Order order2 = new Order( "000003", "Enviado");
    public static Order order3 = new Order( "000054", "Enviado");
    public static Order order4 = new Order( "0000032", "Finalizado");
    public static Order order5 = new Order( "000028", "Feito");

}
