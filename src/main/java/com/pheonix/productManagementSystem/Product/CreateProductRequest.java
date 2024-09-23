package com.pheonix.productManagementSystem.Product;

import com.pheonix.productManagementSystem.Entity.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class CreateProductRequest {
    private String title;

    private String description;

    private int price;

    private int discountedPrice;

    private int discountPersent;

    private int quantity;

    private String brand;

    private String color;

    private Set<Size> size=new HashSet<>();

    private String imageUrl;

    private String topLavelCategory;
    private String secondLavelCategory;
    private String thirdLavelCategory;

}
