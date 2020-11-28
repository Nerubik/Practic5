package ru.mirea.inbo02.pract10.numb2;

interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}

interface Chair {
    boolean hasLegs();
}

class ChairFactory implements AbstractChairFactory {

    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}



class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }


    @Override
    public boolean hasLegs() {
        return false;
    }
}

class MagicChair implements Chair {
    public void doMagic() {

    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}

class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}

class Client {
    public Chair chair;

    public void sit() {
        if (chair.hasLegs()) {
            System.out.println("Присаживайтесь");
        } else {
            System.out.println("Вы не можете садиться на этот стул((");
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}