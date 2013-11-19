package sessionBeans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entities.FunctionalRequirement;
import entities.UseCase;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import sessionBeans.AbstractServiceImp;
import sessionBeans.UseCaseService;
@Stateful
public class UseCaseImp extends AbstractServiceImp<UseCase> implements UseCaseService {

    @PostConstruct
    public void init() {
        setEntityClass(UseCase.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<UseCase> findProjectsByDependency(UseCase usecase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UseCase> findUseCaseByRequirement(FunctionalRequirement functionalRequirement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UseCase> findUseCaseByDependency(UseCase useCase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
