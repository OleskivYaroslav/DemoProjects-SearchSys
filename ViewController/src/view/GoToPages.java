package view;




public class GoToPages {
    public GoToPages() {
    }
    
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }


    public String b1_action() {
        setStr("first button");
        return "toPage1";
    }
    
    public String b2_action() {
        setStr("second button");
        return "toPage2";
    }


    public String goToPage1() {
        MainOparetion ssn = new MainOparetion();
        ssn.setView("page1");
        return "go";
    }
    public String goToPage2() {
        MainOparetion ssn = new MainOparetion();
        ssn.setView("page2");
        return "go";
    }
    
    public String goBack() {
        MainOparetion ssn = new MainOparetion();
        ssn.setView("welcomePage");
        return "go";
    }


    public String goToTF() {
        MainOparetion ssn = new MainOparetion();
        ssn.setView("tf");
        return "go";
    }

    public String goBackTo() {
        MainOparetion ssn = new MainOparetion();
        ssn.setView("welcomePage");
        return "goBack";
    }
}
