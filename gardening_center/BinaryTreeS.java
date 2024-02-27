/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.gardening_center;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janawalaa
 */
public class BinaryTreeS {
  private static class Node {
        private Flower flower;
        private Node left;
        private Node right;

        public Node(Flower flower) {
            this.flower = flower;
            left = null;
            right = null;
        }
    }
        
    private Node root = null;
        
    public BinaryTreeS() { }
        
    public void addNode(Flower flower) {
        root = addNodeRecursiveByPrice(root, flower);
    }    
        
   private Node addNodeRecursiveByPrice(Node n, Flower flower) {
    if (n == null) {
        Node temp = new Node(flower);
        return temp;
    }
    if (flower.getPrice() < n.flower.getPrice()) {
        n.left = addNodeRecursiveByPrice(n.left, flower);
    } else {
        n.right = addNodeRecursiveByPrice(n.right, flower);
    }
    return n;
}     
    public Flower searchNodeByName(String name) {
        return searchNodeRecursive(root, name);
    }

    private Flower searchNodeRecursive(Node node, String name) {
        if (node == null) {
            return null;
        }
        if (name.equals(node.flower.getName())) {
            return node.flower;
        } else if (name.compareTo(node.flower.getName()) < 0) {
            return searchNodeRecursive(node.left, name);
        } else {
            return searchNodeRecursive(node.right, name);
        }
    }
    
    public ArrayList<Flower> getFlowersInRange(double minPrice, double maxPrice) {
    ArrayList<Flower> result = new ArrayList<>();
    getFlowersInRangeRecursive(root, minPrice, maxPrice, result);
    return result;
}

    private void getFlowersInRangeRecursive(Node n, double minPrice, double maxPrice, List<Flower> result) {
    if (n == null) {
        return;
    }
    if (n.flower.getPrice() >= minPrice && n.flower.getPrice() <= maxPrice) {
        result.add(n.flower);
    }
    if (n.flower.getPrice() > minPrice) {
        getFlowersInRangeRecursive(n.left, minPrice, maxPrice, result);
    }
    if (n.flower.getPrice() < maxPrice) {
        getFlowersInRangeRecursive(n.right, minPrice, maxPrice, result);
    }
}
}
   

