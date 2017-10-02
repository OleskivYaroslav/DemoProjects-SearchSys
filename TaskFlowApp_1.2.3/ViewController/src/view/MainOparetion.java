package view;

import java.util.Map;

import oracle.adf.view.rich.context.AdfFacesContext;

public class MainOparetion {
    public MainOparetion() {
        super();
    }
    
    
    public void setView(String input){
        Map pfs = AdfFacesContext.getCurrentInstance().getPageFlowScope();
        pfs.put("param", input);
    }
    
}
