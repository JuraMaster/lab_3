package lab.rob3;

public class Action {

    public static void moreInfo() {
        System.out.println("У нас діє акція!");
        System.out.println("Правила: ");
        System.out.println("Потрібно відгадати товар із закритими очима");
        System.out.println("Приз: скидка на цей товар");
    }
    public static void start() {
        Info info = new Info();
        info.moreInfo();
    }
    static class Info {
        void moreInfo() {
            System.out.println("Приймаєте участь?");
        }
    }

    public static void forCastromers(){
        moreInfo();
        start();
    }
}
