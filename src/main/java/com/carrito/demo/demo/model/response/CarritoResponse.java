package com.carrito.demo.demo.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarritoResponse {
    private int idProducto;
    private String nombre;
    private int cantidad;
}
