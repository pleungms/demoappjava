// https://dzone.com/articles/run-simple-jar-application-in-docker-container-1
//
// >javac HelloWorld.java
// >jar cfm HelloWorld.jar manifest.txt HelloWorld.class
// >java -jar HelloWorld.jar
// >docker build -t helloworld .
// >docker run helloworld
public class HelloWorld {
  public static void main(String[] args){
    System.out.println("Hello World :) ");
  }
}