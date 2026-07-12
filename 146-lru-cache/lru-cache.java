class Node{
    int key;
    int value;
    Node prev;
    Node next;
    Node (int key,int value){
        this.key=key;
        this.value=value;
        prev=null;
        next=null;
    }
}

class LRUCache {
    
    private int capacity;
    private Map<Integer,Node> cacheMap;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.cacheMap= new HashMap<>();
        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);
        this.head.next=this.tail;
        this.tail.prev=this.head;
    }
    
    public int get(int key) {
        if(!cacheMap.containsKey(key)){
            return -1;
        }
        Node nodeRef=cacheMap.get(key);
        deleteNode(nodeRef);
        addNode(nodeRef);
        return nodeRef.value;
    }
    
    public void put(int key, int value) {
        //delete if key value already exist
        if(cacheMap.containsKey(key)){
            Node oldNodeRef=cacheMap.get(key);
            deleteNode(oldNodeRef);
        }
        //create new node and add for MRU-most recent used
        Node newNode= new Node(key,value);
        cacheMap.put(key,newNode);
        addNode(newNode);
        //check capacity and delete LRU that present in tail
        if(cacheMap.size()>capacity){
            Node nodeLru=tail.prev;
            deleteNode(nodeLru);
            cacheMap.remove(nodeLru.key);
        }
    }
    //to add after head MRU
    public void addNode(Node node){
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
        node.prev=head;

    }
    //delete node from linkedList
    public void deleteNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */