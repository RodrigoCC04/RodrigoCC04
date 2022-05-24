/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.editoriales.serviceImpl;

import com.examen.editoriales.dao.EditorialDao;
import com.examen.editoriales.model.Editorial;
import com.examen.editoriales.service.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rodri
 */
@Service
public class EditorialServiceImpl implements EditorialService {
    @Autowired
    private EditorialDao editorialDao;
    @Override
    public int create(Editorial edi) {
        return editorialDao.create(edi);
    }

    @Override
    public int update(Editorial edi) {
       return editorialDao.update(edi);
    }

    @Override
    public int delete(int id) {
       return editorialDao.delete(id);
    }

    @Override
    public Editorial read(int id) {
        return editorialDao.read(id);
    }

    @Override
    public List<Editorial> readAll() {
        return editorialDao.readAll();
    }
    
}
