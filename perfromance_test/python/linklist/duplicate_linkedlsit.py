class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
        
class Linkedlist:
    def __init__(self):
        self.head = None
        
    def add(self,data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = new_node
    def create_another_linkedlist(self):
        divisible_list = Linkedlist()
        temp = self.head
        while temp.next:
            if (temp.data %3 == 0 or temp.data%5 == 0):
                divisible_list.add(temp.data)                
            temp = temp.next       
        return divisible_list
    
    def print_list(self):
        temp = self.head
        
        while temp:
            print(temp.data, end='-->')
            temp = temp.next
        print('!')   
            
if __name__ == "__main__":
    original_lsit = Linkedlist()
    
    original_lsit.add(12)
    original_lsit.add(15)
    original_lsit.add(3)
    original_lsit.add(16)
    original_lsit.add(23)
    original_lsit.add(28)
    
    original_lsit.print_list()
    
    divisible_list = original_lsit.create_another_linkedlist()
    
    print("\nlinked list that are divisible by 3 and 5 ")
    
    divisible_list.print_list()

            

        
        
        