/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examen.editoriales.service;

import com.examen.editoriales.model.Editorial;
import java.util.List;

/**
 *
 * @author rodri
 */
public interface EditorialService {
     int create(Editorial edi);
    int update(Editorial edi);
    int delete(int id);
    Editorial read(int id);
    List<Editorial> readAll();
}
