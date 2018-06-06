package ua.bondar;

//                  (-)
//                 /   \
//                 /         \
//                 (*)         (/)
//                 /   \       /   \
//                 (3)   (2)   (+)   (8)
//                              /   \
//                              (5)   (3)


public class AmazonClasses {
     static  Node {
         private String value;

         public String getValue() {
             return value;
         }

         public Node(String value) {
             this.value = value;
         }

         Node left;
         Node right;

         @Override
         public String toString() {

             return  value + left  + right ;

//             return "Node{" +
//                     "value='" + value + '\'' +
//                     ", left=" + left +
//                     ", right=" + right +
//                     '}';
         }
     }

    public static void main(String[] args) {
        System.out.println("test");

        Node tree = new Node("-");
        tree.right = new Node("*");
        tree.left = new Node("/");
        tree.right.right = new Node("3");
        tree.right.left = new Node("2");
        tree.left.right = new Node("+");
        tree.left.left = new Node("8");
        tree.left.right.right = new Node("5");
        tree.left.right.left = new Node("3");
        System.out.println(tree);
    }
}
