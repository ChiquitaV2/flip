package me.chiquita.java;

public class Main {

    public static void main(String[] args) {
        // Take input as int and loop
        int n = 10;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        int heads = 0;
        int tails = 0;

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("elapsed: " + (endTime - startTime) + "ms");
        System.out.println("heads: " + heads);
        System.out.println("tails: " + tails);
        System.out.println("flips: " + n);
        System.out.println("heads ratio: " + (double) heads / n);
        System.out.println("tails ratio: " + (double) tails / n);
    }


}
