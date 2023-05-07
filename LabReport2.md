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
The handleRequest method is being called. The url is http://localhost:4250/add-message?s=Hello. Since /add-message?s=Hello was entered into the search bar, the first if statement was not satisfied and moved onto the else statement. It satisfies the else statement and changes the previous value, which was an empty string, of string to be Hello. In StringServer.java, add-message?s=Hello gets split at the equal sign and the argument is what is after the equal sign. In this case, it's Hello. The string "Hello" gets displayed on the server.



![Image](localhost_4250_add-message_s=Hello - Google Chrome 4_23_2023 12_11_53 PM.png)
The handleRequest method is being called. The URL is http://localhost:4250/add-message?s=How%20are%20you. In StringServer.java, the url gets split at the equal sign. The argument is what is after it, in this case, it's How are you, exluding the % symbols. The first if statement was not satisfied and moved onto the else statement. It satisfies the else statement and changes the previous value, which was Hello, of string to be Hello How are you. After Hello is a new line character. 

# **Part 2**
Failure inducing inputs for both reverse methods was any array that was not empty and had more than one elements. An example of failure inducing inputs are
```
@Test
  public void testReversed2Elem(){
    int[] input1 = {1, 2};
    assertArrayEquals(new int[]{2, 1}, ArrayExamples.reversed(input1));
  }
@Test 
   public void testReverseInPlace4Elem() {
     int[] input1 = {9, 6, 3, 0};
     ArrayExamples.reverseInPlace(input1);
     assertArrayEquals(new int[]{0, 3, 6, 9}, input1);
}
```

Non failure inducing inputs for both reverse methods are 
```
@Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
 @Test 
    public void testReverseInPlaceEmpty() {
      int[] input1 = {};
      ArrayExamples.reverseInPlace(input1);
      assertArrayEquals(new int[]{}, input1);
}
```

Code and bug before change:
```
public class ArrayExamples {
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }

  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```
![Image](ArrayTests.java - lab3 - Visual Studio Code 4_23_2023 1_49_55 PM.png)
The bug for the reversed in place method was that it changed the values in the input array instead of moving them around. The bug for the reversed method was that it returned arr instead of newArray. Arr is the input array and newArray is the new array. In addition, it didn't change the values in the new array. 





Code and bug after change:
```
public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[(arr.length - 1) - i];
      arr[(arr.length - 1) - i] = temp;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```
![Image](ArrayTests.java - lab3 - Visual Studio Code 4_23_2023 1_44_47 PM.png)
The change for reversed in place method fixed the bug because it only moves elements around up to the middle of the array and it doesn't actually change any elements. The change for the reversed method fixed the bug because it returns the new array.

# **Part 3**
Something new I learned from lab 2 and 3 was making a server that would display changes. For lab 3, I had to create a server similar to lab2, but this one dealt with strings instead of numbers.

