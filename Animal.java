package Animal;

// voici la classe principale animals avec toutes les methodes principales

public class Animals {

    int weight;
    String color;

    void Eat(){

    }

    void Drink(){

    }

    void Move(){

    }

    void scream(){

    }
}

package Animal;

// la classe canine fille de la classe animal

public class Canin extends Animals{



    @Override
    void Move() {

        super.Move();
    }




}

package Animal;

//seconde classe feline , fille de la classe animals

public class Feline extends Animals {



    @Override
    void Move() {

        super.Move();
    }




}

// ici on a les differents animaux des 2 classes filles avec chacun leur cris particulier 

package Animal;

public class Cat extends Feline {

    Cat chat = new Cat();

    @Override
    void scream() {
        chat.scream();
        super.scream();
    }
}

package Animal;

public class Tiger extends  Feline{

    Tiger tigre = new Tiger();

    @Override
    void scream() {
        tigre.scream();
        super.scream();
    }
}

package Animal;

public class Lion extends  Feline{

    Lion lion = new Lion();

    @Override
    void scream() {
        lion.scream();
        super.scream();
    }
}

package Animal;

public class Dog extends Canin  {

    Dog chien = new Dog();

    @Override
    void scream() {
        chien.scream();
        super.scream();
    }
}

package Animal;

public class Wolf extends Canin{

    Wolf loup = new Wolf();

    @Override
    void scream() {
        loup.scream();
        super.scream();
    }


}

// je vous laisse creer votre propre main(test) et tester de ce code comme vous voulez :)



