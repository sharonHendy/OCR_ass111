public class Main {

    public static void main(String[] args) throws InterruptedException {
        boolean terminate = false;
        if(args.length == 5){
            terminate = true;
        }
       Application app = new Application(args[1], args[2], Integer.parseInt(args[3]), terminate);
       app.start();
    }
}
