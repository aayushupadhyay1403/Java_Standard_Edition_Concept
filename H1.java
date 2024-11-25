class LivingBeing{}
class Animal extends LivingBeing{}
class Cat extends Animal{}
class Dog extends Animal{}
class Cow extends Animal{}
class BDog extends Dog{}

class H{
    static Animal pro(){
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();
        Cow cw = new Cow();
        BDog b = new BDog();

        return a;
        return c;
        return d;
        return cw;
        return b;

        //all can be used in return type 

        
    }
}