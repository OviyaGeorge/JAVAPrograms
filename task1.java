package day4_tasks;

class task1 { 
    void talk() {
        System.out.println("Hello");
    }
    void talk(String name) {
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args) {
        task1 t1 = new task1();
        t1.talk();
        t1.talk("Hardin");
    }
}
