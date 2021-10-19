
// 动物
class Animation{

    public String name;
    Animation(String name){
        this.name=name;
    }

    // 所有动物都会吃东西
    public void eat(){
        System.out.println(this.name+"正在吃");
    }

}

// 鸟
class Bird extends Animation{

    Bird(String name){
        super(name);
    }

    // 鸟会飞
    public void fly(){
        System.out.println(this.name+"正在飞");
    }

}

class Extends{

    public static void main(String [] args) {

        Animation animation = new Animation("动物");
        Bird bird =new Bird("鸟");

        animation.eat();
        // animation.fly(); // 不可以

        bird.eat();
        bird.fly();

    }

}
