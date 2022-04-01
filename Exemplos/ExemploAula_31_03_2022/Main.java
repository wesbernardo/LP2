class Main {
    public static void main(String[] args) {
        System.out.println("Running...");
        
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        
        System.out.println(args.length);

        for (String parametro:args) {
            System.out.println(parametro);
        }
        System.out.println("Hello World!");
    }
}
