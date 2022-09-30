import java.lang.StringBuilder;


public class StringInverter implements StringTransformer {




    public void execute(StringDrink drink){


        StringBuilder s = new StringBuilder(drink.getText());
        s=s.reverse();
        drink.setText(String.valueOf((s)));



    }

}
