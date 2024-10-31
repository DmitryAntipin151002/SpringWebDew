package com.example.SpringWebDew.entity;

import lombok.Data;

import javax.swing.*;
import java.util.List;

@Data
public class Taco {
    private Spring Name;
    public List<Ingredient> ingredients;
}
