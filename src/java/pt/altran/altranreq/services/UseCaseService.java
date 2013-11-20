package pt.altran.altranreq.services;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import pt.altran.altranreq.entities.FunctionalRequirement;
import pt.altran.altranreq.entities.UseCase;
import java.util.List;

/**
 *
 * @author User
 * @param <T>
 */
public interface UseCaseService extends AbstractService<UseCase> {

    public List<UseCase> findUseCaseByDependency(UseCase useCase);

    public List<UseCase> findUseCaseByRequirement(FunctionalRequirement functionalRequirement);
}