/*
stringTimes
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
*/

public String stringTimes(String str, int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
        result += str;
    }
    return result;
}

/*
frontTimes
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;
*/

public String frontTimes(String str, int n) {
    String result = "";
    String front = str.length() > 3 ? str.substring(0, 3) : str;
    for (int i = 0; i < n; i++) {
        result += front;
    }
    return result;
}

/*
countXX
Count the number of "xx" in the given string.
We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
*/

int countXX(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.substring(i, i + 2).equals("xx")) count++;
    }
    return count;
}

/*
doubleX
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
*/

boolean doubleX(String str) {
    int isX = str.indexOf('x');
    if (isX == -1) return false;
    if (isX + 1 >= str.length()) return false;
    return str.substring(isX + 1, isX + 2).equals("x");

    /* another approach
    String x = str.substring(isX);
    return x.startsWith("xx");
    */
}

/*
stringBits
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
*/

public String stringBits(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i += 2) {
        result += str.substring(i, i + 1);
    }
    return result;
}

/*
stringSplosion
Given a non-empty string like "Code" return a string like "CCoCodCode".
*/

public String stringSplosion(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        result += str.substring(0, i + 1);
    }
    return result;
}

/*
last2
Given a string, return the count of the number of times that a substring length 2 appears in the string
and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
*/

public int last2(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 2; i++) {
        if (str.substring(i, i + 2).equals(str.substring(str.length() - 2))) count++;
    }
    return count;
}