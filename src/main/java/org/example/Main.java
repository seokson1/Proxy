package org.example;

public class Main {
    public static void main(String[] args) {

        QueryExecutor queryExecutor = new QueryExecutorImpl();
        QueryExecutor readOnlyQueryExecutor = new ReadOnlyQueryExecutor(queryExecutor);

        readOnlyQueryExecutor.execute("select * from user  where id = 1");
        readOnlyQueryExecutor.execute("update user set name = 'hello' where id = 1");
        readOnlyQueryExecutor.execute("delete from user where id = 2");



    }
    //@Bean - 실제로는 빈으로 등록됨  주입 받아서 진행
   /* public QueryExecutor queryExecutor(){
        return new QueryExecutorImpl();*/

    //@Bean
   /* public ReadOnlyQueryExecutor readOnlyQueryExecutor( QueryExecutor queryExecutor){
        return new ReadOnlyQueryExecutor(queryExecutor);*/

}