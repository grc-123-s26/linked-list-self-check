public class Check {
    /**
     * Given the head of a linked list, return whether there are more even or 
     * odd values in the nodes.
     * 
     * If there are more even nodes, return "even"
     * If there are more odd nodes, return "odd"
     * If there are an equal of even and odd nodes, return "equal"
     * If head is null, return "equal"
     * 
     * @param head the head of the list
     * @return "even", "odd", or "equal" depending on whether there are more even or odd values
     */
    public static String evenOdd(ListNode head) {
        //Count of even and odd nodes respectively
        int[] evenOddCount = {0, 0};
        ListNode current = head;

        while (current != null){
            int value = current.data;
            if (value % 2 == 0) {
                evenOddCount[0]++;
            } else {
                evenOddCount[1]++;
            }
            current = current.next;
        }

        if (evenOddCount[0] > evenOddCount[1]) {
            return "even";
        } else if (evenOddCount[0] < evenOddCount[1]) {
            return "odd";
        }

        return "equal";
    }
}