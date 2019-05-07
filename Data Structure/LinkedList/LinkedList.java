package project;

public class LinkedList<T> {
    
    private Node<T> nodes;
    
    public LinkedList() {
        nodes = null;
    }
    
    // CRUD
    // Create
    // Read
    // Update
    // Delete
    
    public void addNode(T data) {
        if(nodes == null) {
            nodes = new Node<T>(data);
        }
        else {
            Node<T> lastNode = getLastNode(nodes);
            lastNode.setNode(new Node<T>(data));
        }
    }
    
    private void removeNode(Node<T> node) {
        // 1. 노드를 찾느다.
        // 2. 첫번째 노드이면 헤드의 위치를 변경한다.
        // 3. 중간 노드이면 node에 앞뒤 노드를 연결한다.
        // 4. 마지막 노드이면 이전 노드를 null을 가르킨다.
        Node<T> target = null;
        try {
            while(target != node) {
                target = nodes.getNode();
                if(target == null) {
                    throw new Exception("존재 하지 않는 노드 입니다.");
                }
            }
        } catch(Exception e) {
            System.err.print(e.getMessage());
        }
        if(nodes == target) {
            nodes = target.getNode();
        }
        else if(target.getNode() == null) {
            // 마지막 노드 삭제
            // 앞 노드를 찾는다.
            Node<T> prevNode = findPrevNode(nodes, target);
            prevNode.setNode(null);
        }
        else {
            // 중간 노드삭제
            // 앞노드를 찾는다.
            Node<T> prevNode = findPrevNode(nodes, target);
            Node<T> nextNode = target.getNode();
            prevNode.setNode(nextNode);
        }
    }
    
    private findPrevNode(Node<T> currentNode, Node<T> target) {
        if(currentNode.getNode() == target) {
            return currentNode;
        }
        else {
            return findPrevNode(currentNode.getNode(), target);
        }
    }
    
    private Node<T> getLastNode(Node<T> node) {
        if(node.getNode() == null) {
            return node;
        }
        else {
            return getLastNode(node.getNode());
        }
    }
    
}
