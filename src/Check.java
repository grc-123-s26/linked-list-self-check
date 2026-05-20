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
        String ret = "";
        int count = 0;
        ListNode current = head;
        while(current != null){
            if(current.data % 2 == 0){count++;}
            else{count--;}
            current = current.next;
        }
        if(count > 0 ){
            ret = "even";
        }
        else if(count < 0 ){
            ret = "odd";
        }
        else{
            ret = "equal";
        }
        return ret;
    }
}