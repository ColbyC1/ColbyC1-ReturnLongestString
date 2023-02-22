
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties
     *         for the longest string.
     */

    public String longest(String[] arr) {

        int index = 0;
        int longestString = arr[0].length();

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].length() > longestString) {
                longestString = arr[i].length();
                index = i;
            }
        }

        longestString = arr[index].length();
        return arr[index];
    }
}
