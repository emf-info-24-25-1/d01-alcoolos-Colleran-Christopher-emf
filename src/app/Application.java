package app;

import models.Ami;

public class Application {
        public static void main(String[] args) {
                System.out.println("");
                System.out.println("");
                Ami ami1 = new Ami("jackie", 3);
                Ami ami2 = new Ami("niilo", 7);
                Ami ami3 = new Ami("christopher", 10);
                ami1.boitUneBiere();
                ami1.boitUneBiere();
                ami1.boitUneBiere();
                ami1.boitUneBiere();

                System.out.println("Le nombre de bières supportables par " + ami1.getNom() + "est de "
                                + ami1.getNmbreBieresSupportables());
        }
}
