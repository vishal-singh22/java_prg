class duplucate_linkedlist{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    Node head;
    public void add(int data){
        Node new_node = new Node(data);

        if (head == null){
            head = new_node;
        }
        else{
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next= new_node;
        }
    }

    public void show() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public duplucate_linkedlist createDivisibleBy3Or5List(){
        duplucate_linkedlist result = new duplucate_linkedlist();

        Node temp = head;
        while(temp.next!=null){
            if(temp.data%3==0 || temp.data%5==0){
                result.add(temp.data);   
            }
            temp = temp.next;
        }
        return result;
    }
    public static void main(String args[]){
        duplucate_linkedlist linklist = new duplucate_linkedlist();

        linklist.add(10);
        linklist.add(15);
        linklist.add(13);
        linklist.add(3);
        linklist.add(1);
        linklist.add(5);
        
        System.out.println("orginal linklist");
        linklist.show();

        duplucate_linkedlist divisible_list = linklist.createDivisibleBy3Or5List();

        System.out.println("new linklist");

        divisible_list.show();


    } 
}