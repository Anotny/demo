package com.carrito.demo.demo.bussines.utils;

import org.springframework.stereotype.Service;
import com.carrito.demo.demo.model.CarritoEventObject;
import com.carrito.demo.demo.model.response.CarritoResponse;

@Service
public interface EventOperation {
    CarritoResponse execute(CarritoEventObject event);
}
