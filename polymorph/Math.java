class Math {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        System.out.println("a " + a +  " b " + b);
        return a + b;
    }

    public static float sum(int a, float b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Math math = new Math();

        System.out.println(Math.sum(1, 1));
        System.out.println(Math.sum(1.1f, 1.1f));
        System.out.println(Math.sum(1, 1.1f));
        System.out.println(Math.sum(1, 1, 1));
        System.out.println(Math.sum(1.1f, 1));

        System.out.println(math.sum(3.1f, 1));

    }
}
