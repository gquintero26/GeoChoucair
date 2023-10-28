package com.automation.qa.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class a {


        @FindBy(id = "Serenity_Demo_Northwind_ProductDialog9_ProductImage > div input")
        private WebElement productImageInput;

        public void insertImage(String imagePath) {
            String imageBase64 = imageToBase64(imagePath);
            productImageInput.sendKeys(imageBase64);
        }

        private String imageToBase64(String imagePath) {
            try {
                byte[] bytes = Files.readAllBytes(Paths.get(imagePath));
                return Base64.getEncoder().encodeToString(bytes);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}


