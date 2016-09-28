package Repositories;

import java.util.ArrayList;

public abstract class Repository
{
    protected ArrayList<Object> X = new ArrayList<>();
    protected ArrayList<Object> Y = new ArrayList<>();

    public abstract ArrayList<Object> getListX();
    public abstract ArrayList<Object> getListY();
}
