package com.webserver.webapplication.domain.controller;

import jakarta.servlet.annotation.WebServlet;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


@WebServlet("/createMybatis")
public class Controller extends jakarta.servlet.http.HttpServlet {

    public Controller() throws IOException {
    }

    @Override
    protected void doGet(jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse resp) throws IOException {
    }

    String resource = "org/mybatis/example/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
}
