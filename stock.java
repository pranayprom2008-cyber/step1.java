class stock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];

            int current = prices[i] - min;

            if (current > profit)
                profit = current;
        }

        System.out.println(profit);
    }
}