public class StringCaseChanger implements StringTransformer {

@Override
public void execute(StringDrink drink){

    String s= drink.getText();
    String s1="";
    char c;
    for (int i=0; i<s.length();i++){
        c = s.charAt(i);
        if (Character.isUpperCase(c)) c = Character.toLowerCase(c);
        else c = Character.toUpperCase(c);

        s1+=c;
    }
    drink.setText(s1);
}
}
