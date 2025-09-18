package com.carrito.demo.demo.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarritoRequest {
    private int idProducto;
    private String nombre;
    private int cantidad;
}
