package com.carrito.demo.demo.model.types;

import com.carrito.demo.demo.bussines.utils.EventOperation;
import com.carrito.demo.demo.model.CarritoEventObject;
import com.carrito.demo.demo.model.response.CarritoResponse;
import com.carrito.demo.demo.services.OperationTypeService;

public enum OperationType {
    ADD,
    DELETE,
    SHOW;

    public CarritoResponse execute(CarritoEventObject eventObject, OperationTypeService operationTypeService){
        EventOperation operation = operationTypeService.getOperation(this);
        return operation.execute(eventObject);
    }

}
