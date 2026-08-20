class Solution {
    public double averageWaitingTime(int[][] customers) {
        int free=0;
        double waits=0;
        for(int i=0;i<customers.length;i++){
           free=Math.max(customers[i][0],free)+customers[i][1];
           waits+=free-customers[i][0];
        }
        return (double)(waits/customers.length);
    }
}