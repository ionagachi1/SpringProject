package com.example.springprojectadvanced.stereotypeannotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;

@Component("instr")
@Scope("prototype")
public class Instructor {
    @Value("#{new Integer(88)}")
    private int id;

    @Value("#{new java.lang.String('Ion Agachi')}")
    private String name;

    @Value("#{2+4>8?true:false}")
    private boolean active;

    @Value("#{topics}")
    private List<String> topics;

    @Autowired
    private Profile profile;


    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", topics=" + topics +
                ", profile=" + profile +
                '}';
    }
}
