package com.ecommerce.fixture;

import com.ecommerce.model.order.Order;
import com.ecommerce.model.product.Category;
import com.ecommerce.model.product.Product;
import com.ecommerce.model.order.Status;

public class OrderFixture {
    public static Product product = new Product("Computador",  4500.00, Category.NOTEBOOK);
    public static Product product2 = new Product("Smartphone",  3000.00, Category.SMARTPHONE);
    public static Order order = new Order( "000001", Status.ENVIADO);
    public static Order order2 = new Order( "000003", Status.EM_ANDAMENTO);
    public static Order order3 = new Order( "000054", Status.ENVIADO);
    public static Order order4 = new Order( "0000032", Status.FINALIZADO);
    public static Order order5 = new Order( "000028", Status.FEITO);

}
