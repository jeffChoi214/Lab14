/**
 * Created by hyunchoi on 2/14/17.
 */
public class ProgramConfiguration {
    private int connectionLimit;
    private int portNumber;
    private String URL;
    private int timeout;

    // private static ProgramConfiguration instance variable
    private static ProgramConfiguration instance = new ProgramConfiguration();

    // private constructor
    private ProgramConfiguration() {}

    //public getInstance method
    public static ProgramConfiguration getInstance() {
        if (instance == null) {
            instance = new ProgramConfiguration();
        }
        return instance;
    }

    public int getConnectionLimit() {
        return connectionLimit;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public String getURL() {
        return URL;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setConnectionLimit(int connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
