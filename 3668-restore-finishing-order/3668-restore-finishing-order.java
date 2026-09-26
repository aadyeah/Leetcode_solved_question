class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {int n = order.length;
        
        // Step 1: Mark which IDs belong to your friends
        boolean[] isFriend = new boolean[n + 1];
        for (int id : friends) {
            isFriend[id] = true;
        }

        // Step 2: Traverse 'order' and collect friends in finishing order
        int[] result = new int[friends.length];
        int idx = 0;

        for (int id : order) {
            if (isFriend[id]) {
                result[idx++] = id;
            }
        }

        return result;
        
    }
}