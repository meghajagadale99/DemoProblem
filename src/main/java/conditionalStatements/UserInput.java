package conditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public
class UserInput {

    public static
    void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String name=bufferedReader.readLine();
        System.out.println(name);
    }
}
