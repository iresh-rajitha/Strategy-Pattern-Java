package com.ireshrajitha;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int execute(int x, int y){
        return strategy.cal(x,y);
    }
}
