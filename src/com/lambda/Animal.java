package com.lambda;

public interface Animal {
    // The point of an interface is that it defines methods you want your class to implement.
    void move();
    void eat(int i);
    String speak();
    // These are purely abstract methods so far, they don't do anything.
    // Classes can inherit from multiple interfaces, but just from 1 class. So now we can create an animal that's also a vehicle. This forces you to make these methods in the class.
}
