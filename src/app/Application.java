package app;

public class Application {
        public static final String ami1 = "jackie";
        public static final String ami2 = "niilo";
        public static final String ami3 = "christopher";

        public static void main(String[] args) {
                System.out.println("");
                System.out.println("");
                Ami Ami1 = new Ami();
                Ami Ami2 = new Ami();
                Ami Ami3 = new Ami();
                boolean condition = true;
                do {
                        System.out.println("prochain round : ");
                        if (Ami1.x == 0) {
                                System.out.println(ami1 + " est complètement bourré!");
                        } else {
                                System.out.println(ami1 + " bières restants : " + Ami1.x);
                        }
                        if (Ami2.x == 0) {
                                System.out.println(ami2 + " est complètement bourré!");
                        } else {
                                System.out.println(ami2 + " bières restants : " + Ami2.x);
                        }
                        if (Ami3.x == 0) {
                                System.out.println(ami3 + " est complètement bourré!");
                        } else {
                                System.out.println(ami3 + " bières restants : " + Ami3.x);
                        }
                        if (Ami1.x == 0 & Ami2.x == 0 & Ami3.x == 0) {
                                condition = false;
                        }
                        boit(Ami3);
                        boit(Ami2);
                        boit(Ami1);
                        System.out.println("");
                        System.out.println("");

                } while (condition);
        }

        public static int boit(Ami ami) {
                ami.x -= 1;
                if (ami.x < 0) {
                        ami.x = 0;
                }
                return ami.x;
        }
}
