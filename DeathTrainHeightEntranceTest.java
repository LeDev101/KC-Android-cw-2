public class DeathTrainHeightEntranceTest {
    public static void main(String[] args) {
        int neededHeight = 160;
        int availableHeight = 165;
        if (availableHeight >= neededHeight) {
            System.out.println("You can ride the death train.");
        }
        if (availableHeight < neededHeight) {
            System.out.println("You cannot ride the death train.");
        }
    }
}