public class LinkedList<T> {

        Node<T> head;
        void printLinkedList() {
            Node<T> curr=head;
            while(curr!=null) {
                System.out.print(curr.data +" ");
                curr=curr.next;
            }
            System.out.println();
        }

        void add(T e) {
            Node<T> temp=new Node<T>(e);
            if(head==null) { // list is empty
                head=temp;
            }
            else {
                Node<T> curr=head;
                while(curr.next!=null) {   // list not empty
                    curr=curr.next;
                }
                curr.next=temp;
            }
        }

        public  void addFirst(T e) {
            Node<T> temp=new Node<T>(e);  //list is empty
            if(head==null) {
                head=temp;
            }
            else {
                temp.next=head;
                head=temp;
            }
        }

        void add(int index,T e) throws IndexOutOfBoundsException{  // adding at specific index.
            try {
                if(index==0) {
                    addFirst(e);
                }
                else {
                    Node<T> temp=new Node<T>(e);
                    int count=0;
                    Node<T> curr=head;
                    while(count<index-1) {
                        curr=curr.next;
                        count++;
                    }
                    temp.next=curr.next;
                    curr.next=temp;
                }
            }
            catch(NullPointerException e1) {
                throw new IndexOutOfBoundsException();   // if it the index not avaiable
            }

        }

        void addAll(T[] ar) {
            for(T e:ar) {
                add(e);
            }
        }
        public  void removeFirst() {
            if(head==null) { //Zero Elements
                System.out.println("No Elements to remove");
            }
            else if(head.next==null) { //One Element
                head=null;
            }
            else if(head.next!=null) {
                Node<T> curr=head;

                head=curr.next;   //MoreThan One element
                curr.next=null;
            }
        }
        public void removeLast() {
            if(head==null) {
                System.out.println("No Elements to remove");
            }
            else if(head.next==null) {
                head=null;
            }
            else if(head.next!=null) {
                Node<T> curr=head;
                while(curr.next.next!=null) {
                    curr=curr.next;
                }
                curr.next=null;
            }
        }
        void remove(int index) {
            if(head==null) {
                System.out.println("No Elements to remove");
            }
            else if(head.next==null) {
                head=null;
            }
            else if(head.next!=null) {
                Node<T> curr=head;
                int count=0;

                while(count!=index-1) {
                    count++;
                    curr=curr.next;
                }
                curr.next=curr.next.next;

            }
        }


        int indexOf(T e) {
            Node<T> curr=head;
            int count=0;
            while(curr!=null) {
                if(curr.data==e) {
                    return count;
                }
                count++;
                curr=curr.next;

            }
            return -1;
        }
        int lastIndexOf(T e) {
            int index=-1;
            Node<T> curr=head;
            int count=0;
            while(curr!=null) {
                if(curr.data==e) {
                    index=count;
                }
                count++;
                curr=curr.next;

            }
            return index;
        }
        int size() {
            if(head==null) {
                return -1;
            }
            Node<T> curr=head;
            int count=0;
            while(curr!=null) {
                count++;
                curr=curr.next;
            }
            return count;
        }


}
