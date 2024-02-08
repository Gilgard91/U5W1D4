package com.epicode.U5D2.dao;

import com.epicode.U5D2.entities.Pizza;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PizzasService {
    @Autowired
    private PizzasDAO itemsDao;

    public void savePizza(Pizza newPizza){

        itemsDao.save(newPizza);
        log.info("Pizza salvata correttamente");
    }
}
