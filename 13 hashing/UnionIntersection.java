import java.util.HashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        // New TreeSet1
        HashSet<Integer> treeSet1 = new HashSet<>();

        // Add elements to treeSet1
        treeSet1.add(10);
        treeSet1.add(20);
        treeSet1.add(30);

        // New TreeSet1
        HashSet<Integer> treeSet2 = new HashSet<>();

        // Add elements to treeSet2
        treeSet2.add(20);
        treeSet2.add(30);
        treeSet2.add(40);
        treeSet2.add(50);

        // Print the TreeSet1
        System.out.println("TreeSet1: " + treeSet1);

        // Print the TreeSet1
        System.out.println("TreeSet2: " + treeSet2);

        // New TreeSet
        HashSet<Integer> union = new HashSet<>();

        // Get a Union using addAll() method
        union.addAll(treeSet2);
        union.addAll(treeSet1);
        // Print the Union
        System.out.println("Union: " + union);

        // New TreeSet
        HashSet<Integer> intersection = new HashSet<>();
        intersection.addAll(treeSet1);
        intersection.retainAll(treeSet2);
        // Print the intersection
        System.out.println("Intersection: " + intersection);
    }    
}
