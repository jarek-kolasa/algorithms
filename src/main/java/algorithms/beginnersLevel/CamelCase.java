package algorithms.beginnersLevel;

public class CamelCase {

    public String textToChange(String text){

        if (text == null) {
            return null;
        } else if( text.equals("")) {
            return "";
        }

        char [] textArray = text.trim().toCharArray();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < textArray.length; i++) {
            if(i % 2 == 0){
                stringBuffer.append(String.valueOf(textArray[i]).toUpperCase());
            } else {
                stringBuffer.append(String.valueOf(textArray[i]).toLowerCase());
            }
        }

        return stringBuffer.toString();
    }
}
