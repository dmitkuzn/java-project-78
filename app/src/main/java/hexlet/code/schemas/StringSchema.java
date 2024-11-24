package hexlet.code.schemas;

public class StringSchema {

    private boolean isRequired;
    private int minLenght;
    private String strContains;

    public boolean isValid(String str) {
        System.out.println("isValid");
        System.out.println(str);
        if (isRequired && (str == null || str.length() == 0)) {
            return false;
        }
        if ((minLenght != -1) && (str.length() < minLenght)) {
            return false;
        }
        if ((strContains != null) && (str.indexOf(strContains) < 0)) {
            return false;
        }
        return true;
    }

    public StringSchema() {
        isRequired = false;
        minLenght = -1;
        strContains = null;
    }

    public StringSchema required() {
        isRequired = true;
        return this;
    }

    public StringSchema minLength(int min) {
        minLenght = min;
        return this;
    }

    public StringSchema contains(String str) {
        strContains = str;
        return this;
    }

}
