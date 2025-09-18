package com.carrito.demo.demo.dto;

import com.carrito.demo.demo.model.CarritoEventObject;
import com.carrito.demo.demo.model.request.CarritoRequest;
import com.carrito.demo.demo.model.response.CarritoResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarritoDto {
    private int idProducto;
    private String nombre;
    private int cantidad;

    public CarritoDto(CarritoEventObject event){
        this.idProducto = event.getIdProducto();
        this.nombre = event.getNombre();
        this.cantidad = event.getCantidad();
    }

    public CarritoEventObject toModel(){
        return new CarritoEventObject(
            this.idProducto,
            this.nombre,
            this.cantidad
        );
    }

    public CarritoDto(CarritoRequest request){
        this.idProducto = request.getIdProducto();
        this.nombre = request.getNombre();
        this.cantidad = request.getCantidad();
    }

    public CarritoRequest toRequest(){
        return new CarritoRequest(
            this.idProducto,
            this.nombre,
            this.cantidad
        );
    }

    public CarritoDto(CarritoResponse response){
        this.idProducto = response.getIdProducto();
        this.nombre = response.getNombre();
        this.cantidad = response.getCantidad();
    }

    public CarritoResponse toResponse(){
        return new CarritoResponse(
            this.idProducto,
            this.nombre,
            this.cantidad
        );
    }
}
