package ua.bondar;

//                      (-)
//                    /       \
//                   /         \
//                 	/           \
//                 (*)         (/)
//                 /   \       /   \
//                 (3)   (2)   (+)   (8)
//                              /   \
//                              (5)   (3)


public class AmazonClasses {
     private static class Node {
         private String value;

         public String getValue() {
             return value;
         }

         public Node(String value) {
             this.value = value;
             this.left = null;
             this.right = null;
         }

         Node left;
         Node right;

         @Override
         public String toString() {
        	 if (this.left == null || this.right == null) {
        		 return value;
        	 }
             return  "("+left.value + value  + right.value +")" ;

//             return "Node{" +
//                     "value='" + value + '\'' +
//                     ", left=" + left +
//                     ", right=" + right +
//                     '}';
         }
     }

    public static void main(String[] args) {
        System.out.println("test1");

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
