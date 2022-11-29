public class Main {

    public static void main(String[] args) throws InterruptedException {
        boolean terminate = false;
        if(args.length == 4){
            terminate = true;
        }
       Application app = new Application(args[0], args[1], Integer.parseInt(args[2]), terminate);
       app.start();
    }
}
