package com.acme.basic;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    HelloWorld hw = new HelloWorld();
    assertEquals(hw.sayHello(), "Hello World!");
  }
}
