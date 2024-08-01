import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static final int MAX_POOL_SIZE = 2;
    private static List<DBConnection> freeDBConnectionPool = new ArrayList<>();
    private static List<DBConnection> usedDBConnectionPool = new ArrayList<>();

    private static volatile ConnectionPool connectionPoolInstance;

    private ConnectionPool(){
        for (int i = 0; i < MAX_POOL_SIZE; i++){
            freeDBConnectionPool.add(new DBConnection());
        }
    }

    public static ConnectionPool getInstance(){
        if (connectionPoolInstance == null){
            synchronized(ConnectionPool.class){
                if (connectionPoolInstance == null){
                    return new ConnectionPool();
                }
            }
        }

        return connectionPoolInstance;
    }

    public synchronized DBConnection getConnection(){
        if (!freeDBConnectionPool.isEmpty()) {
            System.out.println("getting free connection pool");
            DBConnection dbConnection = freeDBConnectionPool.get(0);
            freeDBConnectionPool.remove(dbConnection);
            usedDBConnectionPool.add(dbConnection);
            return dbConnection;
        }

        System.out.println("free connection pool not found!");
        return null;
    }

    public synchronized void releaseConnection(DBConnection dbConnection){
        System.out.println("releasing connection...");
        freeDBConnectionPool.add(dbConnection);
        usedDBConnectionPool.remove(dbConnection);
    }
}
