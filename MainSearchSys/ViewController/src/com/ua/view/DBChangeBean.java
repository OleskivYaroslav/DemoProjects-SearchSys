package com.ua.view;

import com.ua.model.EmployeePojo;

import com.ua.model.EmployeesViewRowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class DBChangeBean {
    
    private EmployeePojo employeePojo = new EmployeePojo();
    private RichPopup addPopup;
    private RichPopup deletePopup;
    private RichPopup updatePopup;

    public DBChangeBean() {
    }
    
    public void setEmployeePojo(EmployeePojo employeePojo) {
        this.employeePojo = employeePojo;
    }

    public EmployeePojo getEmployeePojo() {
        return employeePojo;
    }

    public String b1_action() {
        
        return null;
    }
    
    public void addNewEmployee() {
        
        System.out.print(employeePojo.toString());
    }


    public String addNewEmployees() {
        try {
            DCBindingContainer bc = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding iter = bc.findIteratorBinding("EmployeesView1Iterator");
            ViewObject obj = iter.getViewObject();

            Row r;
            r = obj.createRow();
            r.setAttribute("CommissionPct",employeePojo.getCommissionPct());
            r.setAttribute("FirstName", employeePojo.getFirsName());
            r.setAttribute("LastName", employeePojo.getLastName());
            r.setAttribute("Email", employeePojo.getEmail());
            r.setAttribute("PhoneNumber", employeePojo.getPhoneNumber());
            r.setAttribute("DepartmentId", employeePojo.getDepartmentID());
            r.setAttribute("JobId",employeePojo.getJobID());
            r.setAttribute("HireDate", employeePojo.getHireDate());
            r.setAttribute("ManagerId", employeePojo.getManagerID());
            r.setAttribute("Salary", employeePojo.getSalary());
            
            obj.insertRow(r);

            OperationBinding operationBinding;
            operationBinding = bc.getOperationBinding("Commit");
            operationBinding.execute();
            RichPopup popup = getAddPopup();
            popup.cancel();
            

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        employeePojo = new EmployeePojo();
        return "";
    }
    
    
    public String deleteEmployee() {
        try {
            DCBindingContainer bc = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding iter = bc.findIteratorBinding("EmployeesView1Iterator");
            ViewObject obj = iter.getViewObject();

            

            Row r;
            r = obj.getCurrentRow();    
            
            r.remove();
             
            OperationBinding operationBinding;
            operationBinding = bc.getOperationBinding("Commit");
            operationBinding.execute();
            RichPopup popup = getDeletePopup();
            popup.cancel();

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        return "";
    }
    
  
    public String updateEmployee() {
        try {
            DCBindingContainer bc = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding iter = bc.findIteratorBinding("EmployeesView1Iterator");
            ViewObject obj = iter.getViewObject();            

            OperationBinding operationBinding;
            operationBinding = bc.getOperationBinding("Commit");
            operationBinding.execute();
            RichPopup popup = getUpdatePopup();
            popup.cancel();
            
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        
        return "";
    }
    
    
    
    public String closePopup(){
        addPopup.cancel();
        deletePopup.cancel();
        updatePopup.cancel();
        
        return "";
    }
    
    /*public String cb2_action() {
    // Add event code here...
    Row newRow;
    BindingContainer bindings = getBindings();
    OperationBinding operationBinding = bindings.getOperationBinding("Commit");
    Object result ;
    ApplicationModule am = ADFUtils.getApplicationModuleForDataControl("BHCModuleDataControl"); //application name from data controls and not application module
    ViewObject myView = am.findViewObject("TempView1"); //view name from data controls
    newRow = (oracle.jbo.server.ViewRowImpl)myView.createRow();
    newRow.setAttribute("Name", "Amol");
    myView.insertRow(newRow);
    operationBinding = bindings.getOperationBinding("Commit");
    result = operationBinding.execute();

    return null;
    }*/

    public void setAddPopup(RichPopup addPopup) {
        this.addPopup = addPopup;
    }

    public RichPopup getAddPopup() {
        return addPopup;
    }

    public void setDeletePopup(RichPopup deletePopup) {
        this.deletePopup = deletePopup;
    }

    public RichPopup getDeletePopup() {
        return deletePopup;
    }

    public void setUpdatePopup(RichPopup updatePopup) {
        this.updatePopup = updatePopup;
    }

    public RichPopup getUpdatePopup() {
        return updatePopup;
    }
}
