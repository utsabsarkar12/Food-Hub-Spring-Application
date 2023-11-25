package com.example.foodhubapplicationspring.grobal_data;

import com.example.foodhubapplicationspring.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GrobalData {
    public static List<Product> cart;
    static {
        cart = new ArrayList<Product>();
    }
}
