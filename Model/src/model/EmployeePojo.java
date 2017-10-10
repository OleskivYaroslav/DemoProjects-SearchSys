package model;

import java.util.Date;

public class EmployeePojo {
    public EmployeePojo() {
        super();
    }
    
    private int EmployeeID;
    private String FirsName;
    private String LastName;
    private String Email;
    private String PhoneNumber;
    private Date HireDate;
    private String JobID;
    private int Salary;
    private double CommissionPct;
    private int ManagerID;
    private int DepartmentID;


    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setFirsName(String FirsName) {
        this.FirsName = FirsName;
    }

    public String getFirsName() {
        return FirsName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setHireDate(Date HireDate) {
        this.HireDate = HireDate;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public void setJobID(String JobID) {
        this.JobID = JobID;
    }

    public String getJobID() {
        return JobID;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getSalary() {
        return Salary;
    }


    public void setManagerID(int ManagerID) {
        this.ManagerID = ManagerID;
    }

    public int getManagerID() {
        return ManagerID;
    }

    public void setDepartmentID(int DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setCommissionPct(double CommissionPct) {
        this.CommissionPct = CommissionPct;
    }

    public double getCommissionPct() {
        return CommissionPct;
    }
}
