package org.example;

public class Context {
    private Strategy strategy=new DefaultStrategyImpl();
    public void effectuerOperation() {
        strategy.operationStrategy();
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
