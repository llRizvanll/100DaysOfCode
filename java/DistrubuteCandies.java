public class DistrubuteCandies {

    private static int distributeCandies(int[] candyType) {
        HashSet set = new HashSet<>();
        for (int candy:candyType) {
            set.add(candy);
        }

        return set.size() >= candyType.length/2 ? candyType.length/2 : set.size();
    }

    public static void main(String[] args) {
        int[] candies = {1,1,2,2,3,3};
        System.out.println("Distributed Candies : "+distributeCandies(candies));
    }
}
