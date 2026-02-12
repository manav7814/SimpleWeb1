package com.Manav.SimpleWebApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageDate;


    public byte[] getImageDate() {

        return new byte[0];
    }

    public void setImageName(String originalFilename) {
    }

    public void setImageType(String contentType) {
    }

    public void setImageDate(byte[] bytes) {
    }

    public String getImageType() {

        return null;
    }
}
