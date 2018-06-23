package ua.bondar;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

//                       (-)
//                      /   \
//                     /     \
//                    /       \
//                   /         \
//                 	/           \
//                 (*)         (/)
//                 /   \       /   \
//               (3)   (2)   (+)   (8)
//                           / \
//                         (5) (3)


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
             return  "("+left + value  + right +")" ;
         }
     }

    public static void main(String[] args) throws ScriptException {
        System.out.println("test1");

        Node tree = new Node("-");
        tree.left = new Node("*");
        tree.right = new Node("/");
        tree.left.left = new Node("3");
        tree.left.right = new Node("2");
        tree.right.left = new Node("+");
        tree.right.left.left = new Node("5");
        tree.right.left.right = new Node("3");
        tree.right.right = new Node("8");
        String expression = tree.toString();
        System.out.println(expression);
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        System.out.println(engine.eval(expression));
    }
}
