package Generators;

import java.util.Random;

public class StringGenerator implements Generator
{
    private String variants = "abcde";
    Random random = new Random();

    @Override
    public String generate()
    {
        String str = "";
        while(str.length() != 2)
        {
            str = str + variants.charAt(random.nextInt(variants.length()));
        }
        return str;
    }
}
