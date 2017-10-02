package view;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class BackingLogin {
    private RichInputText password;

    public BackingLogin() {
    }

    public void setPassword(RichInputText password) {
        this.password = password;
    }

    public RichInputText getPassword() {
        return password;
    }
}
