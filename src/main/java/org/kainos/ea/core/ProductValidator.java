package org.kainos.ea.core;
/* test 50 CHARS NOW*/
public class ProductValidator {
    public String isValidProduct(ProductRequest product) {
        if (product.getName().length > 50) {
            return "Name greater than 75 characters";
        }

        if (product.getDescription().length() > 500) {
            return "Description greater than 500 characters";
        }

        if (product.getPrice() < 10){
            return "Price less than £10";
        }

        return null;
    }
};