package model.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class EmpTranslatedViewObjSDOImpl extends SDODataObject implements EmpTranslatedViewObjSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public EmpTranslatedViewObjSDOImpl() {}

   public java.lang.Integer getEmployeeId() {
      return getInt(START_PROPERTY_INDEX + 0);
   }

   public void setEmployeeId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getFirstName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setFirstName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getLastName() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setLastName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getSalary() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setSalary(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.Integer getDepartmentId() {
      return getInt(START_PROPERTY_INDEX + 4);
   }

   public void setDepartmentId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getDepartmentName() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setDepartmentName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

