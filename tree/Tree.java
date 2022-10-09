import java.util.ArrayList;
import java.util.Stack;

public class Tree{
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
        public Node(int data){
            this.data=data;
        }
    }

    public static void display(Node node){
        String str = node.data + " -> ";
        for(Node child: node.children){
            str += child.data + ", ";
        }
        str += ". ";
        System.out.println(str);

        for(Node child: node.children){
           display(child);
        }

    }

    public static int size(Node node){
        int s=0;
        for(Node child:node.children){
            int cs=size(child);
            s=s+cs;
        }
        s=s+1;
        return s;
    }

    public static int max(Node node){
        int max=Integer.MIN_VALUE;
        for(Node child:node.children){
            int cm=max(child);
            max=Math.max(cm, max);
        }
        // System.out.println(node.data);
        max=Math.max(node.data, max);
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};

        //create tree
        Stack<Node> st = new Stack<>();
        Node root=null;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }
            else{
                Node newNode = new Node(arr[i]);
                if(st.isEmpty()){
                    root = newNode;
                }
                else{
                    st.peek().children.add(newNode);
                }
                st.push(newNode);
            }
        }
        
        display(root);
        int size=size(root);
        System.out.println(size);
        int max=max(root);
        System.out.println(max);
    }
}