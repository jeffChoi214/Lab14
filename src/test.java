/**
 * Created by hyunchoi on 2/14/17.
 */
public class test {
    public static void main(String[] args) {
        ProgramConfiguration test = ProgramConfiguration.getInstance();
        // below should produce an error
        // ProgramConfiguration test2 = new ProgramConfiguration();

        test.setConnectionLimit(4);
        test.setPortNumber(5);
        test.setURL("testing");
        test.setTimeout(4);
        System.out.println(test.getConnectionLimit() + " " + test.getPortNumber()
         + " " + test.getTimeout() + " " + test.getURL());
    }
}
