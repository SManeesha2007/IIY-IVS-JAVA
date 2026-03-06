public class CharacterFreq {
    static void mostFrequent(String str) {
        int freq[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        System.out.print("Most frequent character(s): ");
        for (int i = 0; i < 26; i++) {
            if (freq[i] == max) {
                System.out.print((char)(i + 'a') + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "programming";
        mostFrequent(str.toLowerCase());
    }
}
