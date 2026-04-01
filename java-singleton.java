class Singleton {

    // Step 1: Create static instance (only one object)
    private static Singleton instance;

    // Step 2: Public variable
    public String str;

    // Step 3: Private constructor
    private Singleton() {
    }

    // Step 4: Method to get single instance
    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
