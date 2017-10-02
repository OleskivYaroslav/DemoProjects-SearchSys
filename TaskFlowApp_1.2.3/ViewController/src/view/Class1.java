 package view;

import oracle.adf.share.ADFContext;

import oracle.jbo.*;
import oracle.jbo.client.Configuration;
import oracle.jbo.domain.Number;

public class Class1 {
    public Class1() {
        super();
    }

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        ADFContext oldContext = ADFContext.initADFContext(null, null, null, null);
        try {
            String amDef = "test.TestModule";
            String config = "TestModuleLocal";
            ApplicationModule am = Configuration.createRootApplicationModule(amDef, config);
            ViewObject vo = am.findViewObject("TestView");
            vo.executeQuery();
            // Work with your appmodule and view object here
            Configuration.releaseRootApplicationModule(am, true);
        } finally {
            ADFContext.resetADFContext(oldContext);
        }
    }
}
