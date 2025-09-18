package com.carrito.demo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarritoEventObject implements Event{
    private int idProducto;
    private String nombre;
    private int cantidad;
}
