
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

class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        int size = 1;
        while (temp.next != null) {

            temp = temp.next;
            size++;
        }

        k = k % size;
        temp.next = head;

        for (int i = 0; i < size - k; i++) {
            temp = temp.next;
            head = head.next;
        }
        temp.next = null;
        return head;
    }
}