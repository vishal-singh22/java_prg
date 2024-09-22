// find the frequency of prime numeber in given linklist 
class freq_prime{
    // Node class to represent each node in the linked list
    static class Node {
        int data;
        Node next;

        // Constructor for creating a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;  // Head node of the linked list

    // Function to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Function to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to count the number of prime numbers in the linked list
    public int countPrimes() {
        int primeCount = 0;
        Node temp = head;

        while (temp != null) {
            if (isPrime(temp.data)) {
                primeCount++;
            }
            temp = temp.next;
        }

        return primeCount;
    }

    public static void main(String[] args) {
        freq_prime list = new freq_prime();

        // Adding some values to the linked list
        list.add(11);
        list.add(15);
        list.add(3);
        list.add(18);
        list.add(17);

        // Counting the prime numbers in the linked list
        int primeFrequency = list.countPrimes();

        System.out.println("Frequency of prime numbers in the linked list: " + primeFrequency);
    }
}
