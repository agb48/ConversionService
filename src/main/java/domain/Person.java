/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author Javier Beneito Barquero <jbbarquero@gmail.com>
 */
public class Person {
    
    private Long id;
    private String name;
    private List<String> surnames;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public List<String> getSurnames() {
        return surnames;
    }

    public void setSurnames(List<String> surnames) {
        this.surnames = surnames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString()
    {
        return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surnames=" + surnames +
            '}';
    }

}
