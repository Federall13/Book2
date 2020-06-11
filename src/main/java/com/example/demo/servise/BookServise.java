package com.example.demo.servise;

import com.example.demo.model.Book;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Repository
public class BookServise {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public List<Book> getAllBook() {
        return sessionFactory.openSession()
                .createQuery("FROM Book", Book.class).getResultList();
    }

    @Transactional
    public Book getId(int id){
        return sessionFactory.openSession()
                .createQuery("FROM Book WHERE id = :id", Book.class)
                .setParameter("id", id)
                .uniqueResult();
    }

    @Transactional
    public String deleteId(int id) {
         sessionFactory.openSession().createQuery("DELETE Book WHERE id = :id", Book.class)
                .setParameter("id", id)
                .uniqueResult();
                 return "deleted";
    }


}
