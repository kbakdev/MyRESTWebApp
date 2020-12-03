package com.kbak.myrestwebapp.api.model;

import lombok.Data;

import java.util.List;


/**
 * Created by Kacper Bąk on 01/12/2020
 */

@Data
public class PetDTO implements List<PetDTO> {
    Long id;
    String name;
    String status;
}
