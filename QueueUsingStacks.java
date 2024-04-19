import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<intger>();
        stack2 = new Stack<intger>();
    }

    public void enqueue(int item) {
        // Simply push the item onto stack1
        stack1.push(item);
    }

    public int dequeue() {import java.util.Stack;

        public class QueueUsingStacks {
            private Stack<Integer> stack1;
            private Stack<Integer> stack2;
        
            public QueueUsingStacks() {
                stack1 = new Stack<>();
                stack2 = new Stack<>();
            }
        
            public void enqueue(int item) {
                // Simply push the item onto stack1
                stack1.push(item);
            }
        
            public int dequeue() {
                if (stack2.isEmpty()) {
                    // If stack2 is empty, transfer elements from stack1 to stack2
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
                // Pop from stack2
                if (!stack2.isEmpty()) {
                    return stack2.pop();
                } else {
                    System.out.println("Queue is empty");
                    return -1; // or throw an exception
                }
            }
        
            public void display() {
                if (!stack2.isEmpty()) {
                    for (int i = stack2.size() - 1; i >= 0; i--) {
                        System.out.print(stack2.get(i) + " ");
                    }
                } else {
                    for (int i = 0; i < stack1.size(); i++) {
                        System.out.print(stack1.get(i) + " ");
                    }
                }
                System.out.println();
            }
        
            public static void main(String[] args) {
                QueueUsingStacks queue = new QueueUsingStacks();
                queue.enqueue(1);
                queue.enqueue(2);
                queue.enqueue(3);
                queue.display();  // Output: 1 2 3
        
                System.out.println(queue.dequeue());  // Output: 1
                System.out.println(queue.dequeue());  // Output: 2
        
                queue.enqueue(4);
                queue.display();  // Output: 3 4
            }
        }