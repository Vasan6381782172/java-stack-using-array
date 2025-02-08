1. Find Maximum and Minimum Element in Array
import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 2, 8, 9};
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Min: " + min + ", Max: " + max);
    }
}


2. Reverse an Array

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


3. Reverse a String

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}




4. Reverse a Singly Linked List

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class ReverseLinkedList {
    public static Node reverse(Node head) {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

5.Move Zeros to End of the Array
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;
        for (int num : arr) if (num != 0) arr[index++] = num;
        while (index < arr.length) arr[index++] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
6. Find Duplicate Elements in an Array
import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        Set<Integer> seen = new HashSet<>(), duplicates = new HashSet<>();
        for (int num : arr) if (!seen.add(num)) duplicates.add(num);
        System.out.println("Duplicates: " + duplicates);
    }
}


7. Check if a Number is Armstrong

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.println(num + " is " + (sum == num ? "" : "not ") + "an Armstrong number");
    }
}


8. Merge Two Sorted Arrays
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5}, arr2 = {2, 4, 6};
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
    }
}


9. Find Intersection of Two Arrays
import java.util.*;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}, arr2 = {3, 4, 5, 6, 7};
        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        for (int num : arr1) set1.add(num);
        for (int num : arr2) if (set1.contains(num)) set2.add(num);
        System.out.println("Intersection: " + set2);
    }
}

10. Find Majority Element in an Array

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int candidate = arr[0], count = 1;
        for (int num : arr) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        System.out.println("Majority Element: " + candidate);
    }
}

11. Find kth Smallest Element
import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        Arrays.sort(arr);
        System.out.println("Kth Smallest Element: " + arr[k - 1]);
    }
}

12. Check if a String is a Palindrome
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is Palindrome: " + str.equals(new StringBuilder(str).reverse().toString()));
    }
}
13. Print Multiplication Table

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= 10; i++) System.out.println(num + " x " + i + " = " + (num * i));
    }
}


14. Left Rotate an Array

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}, rotated = new int[arr.length];
        int d = 2, n = arr.length;
        for (int i = 0; i < n; i++) rotated[i] = arr[(i + d) % n];
        System.out.println(Arrays.toString(rotated));
    }
}
15. Reverse a Number using do-while Loop

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234, rev = 0;
        do {
            rev = rev * 10 + num % 10;
            num /= 10;
        } while (num != 0);
        System.out.println("Reversed Number: " + rev);
    }
}




























