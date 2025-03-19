public class stack{
    int arr[];
    int top;
    int capacity;

    stack(int size){
        top = -1;
        capacity = size;
        arr = new int[size];
    }

    boolean is_stack_full(){
        return (top == capacity - 1);
    }

    boolean is_stack_empty(){
        return(top == -1);  
    }

    void push(int element){
        if(is_stack_full()){
            System.out.println("Stack is Full");
            System.exit(1);
        }
        arr[++top] = element;
    }

    int pop(){
        if(is_stack_empty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
      
        return(arr[top--]);
    }

    void display(){
        System.out.print("[START]->");
        for(int i = top; i >= 0; i--)
            System.out.printf("[%d]->",arr[i]);
        System.out.print("[END]");
        System.out.println();
    }

    public static void main(String[] args){
        stack s1 = new stack(6);
        for(int i = 10; i < 60; i+=10)
            s1.push(i);
      

        s1.display();

        System.out.println("POPING: " + s1.pop());
        System.out.println("POPING: " + s1.pop());

        
        
       
        s1.display();
    }

}
