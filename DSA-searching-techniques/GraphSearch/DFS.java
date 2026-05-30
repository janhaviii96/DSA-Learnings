import java.util.*;

public class DFS {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public DFS(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Adding edge
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src); // for undirected graph
    }

    // DFS recursive helper
    private void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS Traversal starting from " + start + ": ");
        dfsUtil(start, visited);
    }

    public static void main(String[] args) {
        DFS graph = new DFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        graph.dfs(0);
    }
}

/* Stack is used. Goes deep path first.
Output:
DFS Traversal starting from 0: 0 1 3 5 2 4
Complexity: O(V + E)
*/
