package es.labturing.connect4.controllers.core;

import es.labturing.connect4.daos.SessionDAO;
import es.labturing.connect4.models.Session;

public abstract class SaveController extends Controller implements AcceptorController{

    private SessionDAO sessionDAO;

    SaveController(Session session, SessionDAO sessionDAO) {
        super(session);
        this.sessionDAO = sessionDAO;
    }

    public void save(){
        this.sessionDAO.save();
    }

    public void save(String name){
        this.sessionDAO.save(name);
    }

    public boolean exists(String name){
        return this.sessionDAO.exists(name);
    }

    public boolean hasName(){
        return this.session.hasName();
    }

    @Override
    public void accept(ControllersVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    } 
    
}
