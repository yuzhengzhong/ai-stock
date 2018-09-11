package com.yzz.aistock.service;

import com.yzz.aistock.model.AiStockEntity;
import com.yzz.aistock.model.AiStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AiStockService {

    @Autowired
    private AiStockRepository aiStockRepository;

    /**
     * test print
     */
    public void testPrint() {

        /*AiStockEntity entity = new AiStockEntity();
        entity.setId(UUID.randomUUID().toString());
        entity.setName("yzz");

        this.aiStockRepository.save(entity);*/

        List<AiStockEntity> entities = this.aiStockRepository.findAll();

        for (AiStockEntity entity : entities) {
            System.out.println(entity.getId() + "," + entity.getName());
        }

        System.out.println("test print in service...........");
    }

}
