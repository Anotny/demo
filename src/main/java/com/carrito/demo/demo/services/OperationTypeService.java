package com.carrito.demo.demo.services;

import java.util.EnumMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.carrito.demo.demo.bussines.useCase.AddUseCase;
import com.carrito.demo.demo.bussines.useCase.EliminateUseCase;
import com.carrito.demo.demo.bussines.useCase.ShowUseCase;
import com.carrito.demo.demo.bussines.utils.EventOperation;
import com.carrito.demo.demo.model.types.OperationType;

@Service
public class OperationTypeService {
    
    private Map<OperationType, EventOperation> operationMap = new EnumMap<>(OperationType.class);

    public OperationTypeService(AddUseCase addUseCase, EliminateUseCase eliminateUseCase, ShowUseCase showUseCase){
        operationMap.put(OperationType.ADD, addUseCase);
        operationMap.put(OperationType.DELETE, eliminateUseCase);
        operationMap.put(OperationType.SHOW, showUseCase);
    }

    public EventOperation getOperation(OperationType operationType){
        return operationMap.get(operationType);
    }

}
