package by.itClass.entity;

public class FormValues {
    private String firstParam;
    private String secondParam;
    private String[] thirdParams;
    private String checkbox1;
    private String checkbox2;
    private String checkbox3;
    private String radio;

    public FormValues() {
    }

    public FormValues(String firstParam, String secondParam, String[] thirdParams, String checkbox1, String checkbox2, String checkbox3, String radio) {
        this.firstParam = firstParam;
        this.secondParam = secondParam;
        this.thirdParams = thirdParams;
        this.checkbox1 = checkbox1;
        this.checkbox2 = checkbox2;
        this.checkbox3 = checkbox3;
        this.radio = radio;
    }

    public String getFirstParam() {
        return firstParam;
    }

    public void setFirstParam(String firstParam) {
        this.firstParam = firstParam;
    }

    public String getSecondParam() {
        return secondParam;
    }

    public void setSecondParam(String secondParam) {
        this.secondParam = secondParam;
    }

    public String[] getThirdParams() {
        return thirdParams;
    }

    public void setThirdParams(String[] thirdParams) {
        this.thirdParams = thirdParams;
    }

    public String getCheckbox1() {
        return checkbox1;
    }

    public void setCheckbox1(String checkbox1) {
        this.checkbox1 = checkbox1;
    }

    public String getCheckbox2() {
        return checkbox2;
    }

    public void setCheckbox2(String checkbox2) {
        this.checkbox2 = checkbox2;
    }

    public String getCheckbox3() {
        return checkbox3;
    }

    public void setCheckbox3(String checkbox3) {
        this.checkbox3 = checkbox3;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }
}
