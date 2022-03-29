### Solid Principles and Design Patterns
---

Creational Design Pattern
	
- [x] Builder 
- [x] Simple Factory
- [x] Factory Method
- [x] Prototype
- [x] Abstract Factory
- [x] Singleton
- [x] Object Pool

Structural Design Pattern

- [x] Adapter
- Bridge
- Decorator
- Composite
- Facade
- Flyweight
- Proxy



#### Notes
---
Structural Patterns ==> deal with how classes and objects are arranged or composed
---
Adapter Design Pattern (Wrapper)
- existing object which provides the functionality that client needs. But client code can't use this object because it expects an object with different interface.

*Implement an Adapter*
- Creating a class for Adapter
	- Adapter must implement the interface expected by client.
	- class adapter implementation we're simply going forward the method to another method inherited from adaptee
	- object apdater, implement target interface and accept adaptee as constructor argument in adapter i.e. make use of composition
- Object adapter should take adaptee as anrgument in constructor or as a less preferred solution, you can instantiate it in the constructor thus tightly coupling with specific adaptee

*Implementation Consideration*
- The adapter does depends upon the differencs between target interface and object being adapted. If method arguments are same or similar adapter has very less work to do.
- Using class adapter "allows" you to override some of the adaptee's behaviour. But this has to be avoided as you end up with adapater that behaves differently than adaptee. Fixing defects is not easy anymore.

*Design Consideration*
- In java a "class adapter" may not be possible if both target and adaptee are concrete classes. In such cases the object adapter is the only solution. Also since there is no private inheritance in Java,it's better to stick with object mapper.
- A class adapter is also called as a 2 way adapter, since it can be stand in for both the target interface and for the adaptee. That is we can use object of adapter where either target interface is expected as well as where an adaptee object is expected.












