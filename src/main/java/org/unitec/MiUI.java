/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author T-107
 */

@SpringUI
@Theme("valo")

public class MiUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
        //Creamos un Layout
        VerticalLayout layout=new VerticalLayout();
        
        //Generamos una etiqueta
        
        Label etiqueta = new Label("Mi primera etiqueta");
        layout.addComponent(etiqueta);
        setContent(layout);
        
        
    }
    
}
