package Repositories;

import Generators.StringGenerator;
import java.util.ArrayList;


public class StringObjectsRepository extends Repository
{
    StringGenerator generator;
    public StringObjectsRepository()
    {
        generator = new StringGenerator();
    }

    public void fillLists(int xSize, int ySize)
    {
        for(int i = 0; i < xSize; i++)
        {
            X.add(generator.generate());
        }
        for(int i = 0; i < ySize; i++)
        {
            Y.add(generator.generate());
        }

    }

    public void fillLists(String x, String y) {
        for (String s : x.split(" ")) {
            X.add(s);
        }
        for (String s : y.split(" ")) {
            Y.add(s);
        }
    }

    @Override
    public ArrayList<Object> getListX() {
        return X;
    }

    @Override
    public ArrayList<Object> getListY() {
        return Y;
    }
}
