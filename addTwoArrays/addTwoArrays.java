class addTwoArrays {

    public static void main(String[] args) {

        int[] numArrayA = {1,2,3,4,5,6,7,8,9};
        int[] numArrayB = {5,8,4,3,6,0,7,5,6};
        int[] sumArray  = new int[10];


        // Write your logic here:
        for (int i = 0; i < 10; i++) {
            int sum = numArrayA[i] + numArrayB[i];
            sumArray[i] = sum;
            System.out.println(sumArray[i]);
        }
    }
}
