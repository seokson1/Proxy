package org.example;

public class QueryExecutorImpl implements QueryExecutor {
    public QueryExecutorImpl() {
    }

    //
    @Override
    public void execute(String sql) {
        System.out.println("sql : " + sql);
    }
}
