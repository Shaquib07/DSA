class Solution {
    private Map<Integer, List<String>> memo;

    public List<String> wordBreak(String s, List<String> wordDict) {
        memo = new HashMap<>();
        return solve(s, 0, new HashSet<>(wordDict));
    }

    private List<String> solve(String s, int index, Set<String> dict) {

        // Already computed
        if (memo.containsKey(index))
            return memo.get(index);

        List<String> result = new ArrayList<>();

        // Base case
        if (index == s.length()) {
            result.add("");
            return result;
        }

        for (int end = index + 1; end <= s.length(); end++) {

            String word = s.substring(index, end);

            if (dict.contains(word)) {

                List<String> suffixSentences = solve(s, end, dict);

                for (String sentence : suffixSentences) {

                    if (sentence.isEmpty()) {
                        result.add(word);
                    } else {
                        result.add(word + " " + sentence);
                    }
                }
            }
        }

        memo.put(index, result);

        return result;
    }
}