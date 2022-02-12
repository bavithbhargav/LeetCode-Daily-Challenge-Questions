package DailyChallengeQuestions;
/*
127. Word Ladder

Link: https://leetcode.com/problems/word-ladder/

A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:
a)Every adjacent pair of words differs by a single letter.
b)Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
c)sk == endWord
Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.

Example 1:
Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
Output: 5
Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.

Example 2:
Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
Output: 0
Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
 */
import java.util.*;
public class WordLadder {
	class Solution {
	    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
	        Set<String> dictionary = new HashSet<>(wordList);
	        if (!dictionary.contains(endWord)) {
	            return 0;
	        }

	        int minLength = 0;
	        Queue<String> queue = new LinkedList<>();
	        Set<String> visited = new HashSet<>();

	        queue.offer(beginWord);
	        visited.add(beginWord);

	        while (!queue.isEmpty()) {
	            int levelSize = queue.size();
	            minLength += levelSize != 0 ? 1 : 0;

	            for (int i = 0; i < levelSize; i++) {
	                String current = queue.poll();
	                if (current.equals(endWord)) {
	                    return minLength;
	                } else {
	                    char[] currentChars = current.toCharArray();
	                    for (int j=0; j < currentChars.length; j++) {
	                        char prevChar = currentChars[j];
	                        for (char nextChar = 'a'; nextChar <= 'z'; nextChar++) {
	                            currentChars[j] = nextChar;
	                            String nextWord = new String(currentChars);
	                            if (dictionary.contains(nextWord) && !visited.contains(nextWord)) {
	                                queue.offer(nextWord);
	                                visited.add(nextWord);
	                            }
	                        }
	                        currentChars[j] = prevChar;
	                    }
	                }
	            }
	        }
	        return 0;
	    }
	}
}
