package revison.cp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // Number of people
            int m = sc.nextInt(); // Number of friendships

            // Use HashSet for fast lookup
            Set<Integer>[] adj = new HashSet[n + 1];
            for (int i = 1; i <= n; i++) {
                adj[i] = new HashSet<>();
            }

            // Read friendships
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                if (u != v) { // ignore self-friendship just in case
                    adj[u].add(v);
                    adj[v].add(u);
                }
            }

            // Try to find 5 completely disconnected people (no friendships)
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (adj[i].contains(j)) continue;
                    for (int k = j + 1; k <= n; k++) {
                        if (adj[i].contains(k) || adj[j].contains(k)) continue;
                        for (int l = k + 1; l <= n; l++) {
                            if (adj[i].contains(l) || adj[j].contains(l) || adj[k].contains(l)) continue;
                            for (int p = l + 1; p <= n; p++) {
                                if (adj[i].contains(p) || adj[j].contains(p) || adj[k].contains(p) || adj[l].contains(p)) continue;
                                System.out.println(i + " " + j + " " + k + " " + l + " " + p);
                                return;
                            }
                        }
                    }
                }
            }

            // Try to find 5 fully connected people (all pairwise friendships)
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (!adj[i].contains(j)) continue;
                    for (int k = j + 1; k <= n; k++) {
                        if (!adj[i].contains(k) || !adj[j].contains(k)) continue;
                        for (int l = k + 1; l <= n; l++) {
                            if (!adj[i].contains(l) || !adj[j].contains(l) || !adj[k].contains(l)) continue;
                            for (int p = l + 1; p <= n; p++) {
                                if (!adj[i].contains(p) || !adj[j].contains(p) || !adj[k].contains(p) || !adj[l].contains(p)) continue;
                                System.out.println(i + " " + j + " " + k + " " + l + " " + p);
                                return;
                            }
                        }
                    }
                }
            }

            // No valid group found
            System.out.println("-1");
        }
    }
}
