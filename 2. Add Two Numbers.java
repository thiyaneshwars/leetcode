import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode deserialize(String data) {
    if (data == null || data.isEmpty()) return null;
    
    data = data.replaceAll("[\\[\\]]", "");
    
    String[] values = data.split(",");
    ListNode dummyHead = new ListNode(0);
    ListNode current = dummyHead;
    
    for (String val : values) {
        current.next = new ListNode(Integer.parseInt(val.trim())); 
        current = current.next;
    }
    
    return dummyHead.next;
}

}

class Solution {
    public static void insert(ListNode l){
        ListNode obj = new ListNode();
        Scanner sc = new Scanner(System.in);
        obj.val = sc.nextInt();
        while(l.next != null){
            l = l.next;
        }
        obj.next = l.next;
        l.next = obj;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummyHead.next;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        ListNode l1 = new ListNode();
        l1.next = null;
        for(int i = 0; i < a; i++) {
            insert(l1);
        }

        int b = sc.nextInt();
        ListNode l2 = new ListNode();
        l2.next = null;
        for(int i = 0; i < b; i++) {
            insert(l2);
        }

        Solution solution = new Solution();
        ListNode sumList = solution.addTwoNumbers(l1.next, l2.next); 

        while (sumList != null) {
            System.out.print(sumList.val + " ");
            sumList = sumList.next;
        }
    }
}
