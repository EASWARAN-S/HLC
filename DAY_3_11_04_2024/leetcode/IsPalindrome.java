
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        boolean isPalin = true;
        if (head == null)
            return isPalin;
        ListNode temp = head;
        int size = 1;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        int arr[] = new int[size];
        int rev[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = head.val;
            head = head.next;
        }
        for (int j = 0; j < size; j++) {
            rev[j] = arr[size - 1 - j];
            System.out.println(rev[j]);
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] == rev[i]) {
                isPalin = (isPalin && true);
            } else
                isPalin = (isPalin && false);

        }
        return isPalin;
    }
}