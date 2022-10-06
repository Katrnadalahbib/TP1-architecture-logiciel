package com.directi.training.lsp.exercise;

public class PoolDucks
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        quack(donaldDuck);
        swim(donaldDuck);
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        PoolDucks pool = new PoolDucks();
        pool.run();
    }
}