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
        if (head == null) {
            return "equal";
        }
        ListNode current = head;
        int evenCount = 0;
        int oddCount = 0;
        int remainder = 0;

        //only runs if there only one node
        if (current.next == null) {
            remainder = current.data % 2;     
            if (remainder > 0) {
                return "odd";
            } else {
                return "even";
            }       
        }

        //runs when it's a normal link list
        while (current != null) {
            remainder = current.data % 2;
            if (remainder > 0) {
                oddCount++;
            } else {
                evenCount++;
            }
            current = current.next;
        }

        if (oddCount > evenCount) {
            return "odd";
        }
        if (evenCount > oddCount) {
            return "even";
        }
        return "equal";
    }
}