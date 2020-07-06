package com.tkluza.hackerrank.tasks;

public abstract class AbstractTask implements Task {

    @Override
    public void test() {
        printTaskName();
        
        initTestData();

        solve();

        printResult();
    }

    protected abstract void printTaskName();

    protected abstract void initTestData();

    protected abstract void solve();
}
