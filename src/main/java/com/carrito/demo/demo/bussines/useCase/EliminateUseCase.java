package com.carrito.demo.demo.bussines.useCase;

import org.springframework.stereotype.Component;

import com.carrito.demo.demo.bussines.utils.EventOperation;
import com.carrito.demo.demo.model.CarritoEventObject;
import com.carrito.demo.demo.model.response.CarritoResponse;

@Component
public class EliminateUseCase implements EventOperation{

    @Override
    public CarritoResponse execute(CarritoEventObject event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

}
