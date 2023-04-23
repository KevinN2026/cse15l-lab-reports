# **Part 1**

```
import java.io.IOException;
import java.net.URI;

class StringHandler implements URLHandler {
    String string = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Kevin's message %s", string);
        } 
        else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("=");
                string += parameters[1] + "\n";
                return string;
            }
            return "404 Not Found!";
        }
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new StringHandler());
    }
}

```

![Image](localhost_4250_add-message_s=Hello - Google Chrome 4_23_2023 12_11_05 PM.png)
The handleRequest method is being called. The argument for this method is the URL, in this case would be http://localhost:4250/add-message?s=Hello. Since /add-message?s=Hello was entered into the search bar, the first if statement was not satisfied and moved onto the else statement. It satisfies the else statement and changes the previous value, which was an empty string, of string to be Hello. 

![Image](localhost_4250_add-message_s=Hello - Google Chrome 4_23_2023 12_11_53 PM.png)
The handleRequest method is being called. The argument for this method is the URL, in this case would be http://localhost:4250/add-message?s=How%20are%20you. Since /add-message?s=How are you was entered into the search bar, the first if statement was not satisfied and moved onto the else statement. It satisfies the else statement and changes the previous value, which was Hello, of string to be Hello How are you. After Hello is a new line character. 

# **Part 2**
