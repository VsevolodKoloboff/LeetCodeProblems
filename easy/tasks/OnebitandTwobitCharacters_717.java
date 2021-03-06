package tasks;

public class OnebitandTwobitCharacters_717 {

    /* We have two special characters. The first character can be represented by one bit 0.
     * The second character can be represented by two bits (10 or 11).
     * Now given a string represented by several bits.
     * Return whether the last character must be a one-bit character or not.
     * The given string will always end with a zero.*/

    public static boolean isOneBitCharacter(int[] bits) {

        int i = bits.length - 2;
        while (i >= 0 && bits[i] > 0)
            i--;

        return (bits.length - i) % 2 == 0;
    }
    /*main*/
    public static void main(String[] args) {
        int arr1[] = {1, 0, 1, 1};
        System.out.println(isOneBitCharacter(arr1));
        int arr2[] = {1, 0, 0};
        System.out.println(isOneBitCharacter(arr2));

    }
}
