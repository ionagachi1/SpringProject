package com.example.springprojectadvanced.stereotypeannotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
    @Value("Java Architect and Isntructor")
    private String title;

    @Value("Endava")
    private String company;

    @Override
    public String toString() {
        return "Profile{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

}
