package com.epicode.U5D2.dao;

import com.epicode.U5D2.entities.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ItemsService {
    @Autowired
    private ItemsDAO itemsDao;

    public void saveItem(Item newItem){

        itemsDao.save(newItem);
        log.info("Item salvato correttamente");
    }
}
