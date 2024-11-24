package hexlet.code.schemas;

public class StringSchema {

    public boolean isValid(String str) {
        return false;
    }

    public StringSchema required() {
        return this;
    }

    public StringSchema minLength(int min) {
        return this;
    }

    public StringSchema contains(String str) {
        return this;
    }

}
