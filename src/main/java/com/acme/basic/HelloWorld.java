package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }

  void doLoop() {
    int j = 0;
    while (true) { // Noncompliant; end condition omitted
      j++;
      
      if (j == 100) {
        break;
      }
      
    }
  }

}
