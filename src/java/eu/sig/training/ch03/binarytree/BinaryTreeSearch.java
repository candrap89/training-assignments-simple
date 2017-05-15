package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        } else {
//            if (nodeValue < node.getValue() && node.getLeft() != null) {
//            	return 1+ calculateDepth(node.getLeft(), nodeValue);          	
//            } else {
//            	return 1+ calculateDepth(node.getRight(), nodeValue);
//            }
        	return traversalByValue(node, nodeValue);
        }
    }
    // end::calculateDepth[]
    
   private static int traversalByValue(BinaryTreeNode<Integer> node, int nodeValue){
	   BinaryTreeNode<Integer> childNode = getChildNode(node, nodeValue);
	   if (childNode == null) {
		   throw new TreeException("Value not found in the tree");
	   }else {
		   return 1+ calculateDepth(childNode, nodeValue);
	   }
   }

   
   private static BinaryTreeNode<Integer> getChildNode(BinaryTreeNode<Integer> node, int nodeValue){
	   if (nodeValue < node.getValue()){
		   return node.getLeft();
		   
	   }else {
		   return node.getRight();
	   }
   }
}