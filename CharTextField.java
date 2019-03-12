package sample;

import  javafx.scene.control.TextField;

public class CharTextField extends TextField {


    @Override
    public void replaceText(int i, int il, String string){
        if(string.matches("[a-z]") || string.isEmpty() ){
            super.replaceText(i, il, string);
            verify();
        }
    }

    @Override
    public void replaceSelection(String string){
        super.replaceSelection(string);
    }


    private void verify() {
        if (getText().length() > 1) {
            setText(getText().substring(0, 1));
        }

    }

}