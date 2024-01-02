package by.tort.mojno.tortm.service.impl;

import by.tort.mojno.tortm.model.cake.Cake;
import by.tort.mojno.tortm.model.cake.Cream;
import by.tort.mojno.tortm.model.cake.response.ResponseCakeDTO;
import by.tort.mojno.tortm.service.CakeService;
import by.tort.mojno.tortm.util.mapper.CakeMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CakeServiceImpl implements CakeService {

    @Autowired
    CakeMapper cakeMapper;
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<ResponseCakeDTO> getAllCakes() {
        Session session = entityManager.unwrap(Session.class);
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Cake> cr = criteriaBuilder.createQuery(Cake.class);
        Root<Cake> variableRoot = cr.from(Cake.class);
        cr.select(variableRoot);
        List<Cake> cakes=session.createQuery(cr).getResultList();
        return cakeMapper.mapToCake(cakes);
    }
}
