class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class Linkedlist:
    def __init__(self):
        self.head = None
        
    # add node in linklist
    def add(self,data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = new_node
            
            
        # is_prime check function
        
    def is_prime(self,num):
        if(num<2):
            return False
        else:
            for i in range(2, int(num ** 0.5)+1):
                if(num%i == 0):
                    return False
        return True
    
    #count frequency function
    
    def freq_prime(self):
        count = 0
        temp = self.head 
        while temp.next:
            if self.is_prime(temp.data):
                count += 1
            temp = temp.next
        return count
    
    def print_linledlist(self):
        temp = self.head
        while temp.next:
            print(temp.data,end=' --> ')
            temp = temp.next
        print()
if __name__ == "__main__":
    linked_list = Linkedlist()
        
    linked_list.add(11)
    linked_list.add(13)
    linked_list.add(4)
    linked_list.add(17)
    linked_list.add(15)
        
    
    print("linked list")
    linked_list.print_linledlist()
    
    
    # Calculating the frequency of prime numbers
    prime_count = linked_list.freq_prime()
    print(f"Frequency of prime numbers in the linked list: {prime_count}")
    