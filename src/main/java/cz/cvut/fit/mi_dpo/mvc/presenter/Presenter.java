package cz.cvut.fit.mi_dpo.mvc.presenter;

import java.util.Observer;

/**
 * Presenter is also an observer, that is notified when model changes
 * 
 * Each observable model update triggers observer (presenters) to repaint view 
 */
public interface Presenter extends Observer {

}
