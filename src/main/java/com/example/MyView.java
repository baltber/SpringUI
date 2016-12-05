package com.example;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TreeTable;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

/**
 * Created by tays on 05.12.2016.
 */
@SpringView(name = MyView.MYVIEW_NAME)
public class MyView extends VerticalLayout implements View {
        public static final String MYVIEW_NAME ="myview";
@PostConstruct
    void init() {
        addComponent(new Button("This is the myview view"));

    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }
}
