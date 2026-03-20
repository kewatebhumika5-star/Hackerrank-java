class Add {
    
    void add(int... numbers) {
        int sum = 0;
        
        
        for (int num : numbers) {
            sum += num;
        }
        

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print("+");
            }
        }
        
        System.out.println("=" + sum);
    }
}
