public class StringReplacer implements StringTransformer {

    char a;
    char b;
    char c;

    StringReplacer(char a, char b){
        this.a=a;
        this.b=b;
    }

    public void execute(StringDrink drink) {
        String s= drink.getText();
        String s1="";

    for (int i=0;i<s.length();i++){
        c = s.charAt(i);
        if (c==a) c =b;

        s1+=c;}

        drink.setText(s1);}
    }

