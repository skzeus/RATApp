package RATAPP.RAT.Client;

import java.net.*; 
import java.io.*; 
import java.util.StringTokenizer; 

public class RATClient {

    public static void main(String[] args) throws IOException {

        String command = args[0];

        try(Socket connectionToServer = new Socket("localhost", 80)){

            InputStream in  = connectionToServer.getInputStream();
            OutputStream out = connectionToServer.getOutputStream(); 
            
            BufferedReader headerReader = new BufferedReader(new InputStreamReader(in)); 
            BufferedWriter headerWriter = new BufferedWriter(new OutputStreamWriter(out)); 
            
            DataInputStream dataIn = new DataInputStream(in); 
            DataOutputStream dataOut = new DataOutputStream(out);

            if(command.equals("g")){

                String header = "get " + "\n";
				headerWriter.write(header, 0, header.length());
				headerWriter.flush();

            }

        }
    }

}

