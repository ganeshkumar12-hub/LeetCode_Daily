
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord == null || endWord == null) return 0;
        if (beginWord.equals(endWord)) return 1;

        Set<String> words = new HashSet<>(wordList);

        if (!words.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String cur = queue.remove();

                if (cur.equals(endWord)) return level;

                char[] chars = cur.toCharArray();

                for (int pos = 0; pos < chars.length; pos++) {
                    char original = chars[pos];

                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == original) continue;

                        chars[pos] = ch;
                        String next = new String(chars);

                        if (words.contains(next) && !visited.contains(next)) {
                            queue.add(next);
                            visited.add(next);
                        }
                    }

                    chars[pos] = original;
                }
            }

            level++;
        }

        return 0;
    }
}
