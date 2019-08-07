package tasks;

public class OnebitandTwobitCharacters_717 {

    /* We have two special characters. The first character can be represented by one bit 0.
     * The second character can be represented by two bits (10 or 11).
     * Now given a string represented by several bits.
     * Return whether the last character must be a one-bit character or not.
     * The given string will always end with a zero.*/

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i<bits.length-1)
            i+=bits[i]+1;
        return (bits.length - i) % 2 == 0;
    }
}
