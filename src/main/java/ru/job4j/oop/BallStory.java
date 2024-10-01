package ru.job4j.oop;

class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Колобок съеден");
        } else {
            System.out.println("Колобок сбежал");
        }
    }
}

class Hare {
    public void tryEat(Ball ball) {
        ball.tryRun(false);
    }
}

class Wolf {
    public void tryEat(Ball ball) {
        ball.tryRun(false);
    }
}

class Fox {
    public void tryEat(Ball ball) {
        ball.tryRun(true);
    }
}

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
