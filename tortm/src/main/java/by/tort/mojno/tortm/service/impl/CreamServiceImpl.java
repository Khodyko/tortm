package by.tort.mojno.tortm.service.impl;

import by.tort.mojno.tortm.model.cake.Cream;
import by.tort.mojno.tortm.service.CreamService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CreamServiceImpl implements CreamService {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Cream> getAllCreams() {
        Session session = entityManager.unwrap(Session.class);
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Cream> cr = criteriaBuilder.createQuery(Cream.class);
        Root<Cream> variableRoot = cr.from(Cream.class);
        cr.select(variableRoot);
        return session.createQuery(cr).getResultList();
    }

    @Override
    public void addCream(Cream cream){
        Session session = entityManager.unwrap(Session.class);
        session.persist(cream);
    }

}
