/*
helloName
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
*/

public String helloName(String name) {
    return "Hello " + name + "!";
}

/*
makeAbba
Given two strings, a and b, return the result of putting them together in the order abba,
e.g. "Hi" and "Bye" returns "HiByeByeHi".
*/

public String makeAbba(String a, String b) {
    return a + b + b + a;
}

/*
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
*/

public String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
}

/*
makeOutWord
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string,
e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
*/

public String makeOutWord(String out, String word) {
    return out.substring(0, 2) + word + out.substring(out.length() -2, out.length());
}

/*
extraEnd
Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.
*/

public String extraEnd(String str) {
    String last = str.substring(str.length() - 2);
    return last + last + last;
}

/*
Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
If the string is shorter than length 2, return whatever there is, so "X" yields "X",
and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
*/

public String firstTwo(String str) {
    if (str.length() <= 2) {
        return  str;
    }
    return  str.substring(0, 2);
}

/*
firstHalf
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
*/

public String firstHalf(String str) {
    return str.substring(0, str.length() / 2);
}

/*
withoutEnd
Given a string, return a version without the first and last char, so "Hello" yields "ell".
The string length will be at least 2.
*/

public String withoutEnd(String str) {
    return str.substring(1, str.length() - 1);
}

/*
comboString
Given 2 strings, a and b, return a string of the form short+long+short,
with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).
*/

public String comboString(String a, String b) {
    if (a.length() < b.length()) {
        return a + b + a;
    }
    return b + a + b;
}

/*
nonStart
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
*/

public String nonStart(String a, String b) {
    return a.substring(1) + b.substring(1);
}

/*
left2
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
The string length will be at least 2.
*/

public String left2(String str) {
    return str.substring(2) + str.substring(0, 2);
}

/*
right2
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
The string length will be at least 2.
*/

public String right2(String str) {
    return str.substring(str.length() -2) + str.substring(0, str.length() -2);
}

/*
theEnd
Given a string, return a string length 1 from its front, unless front is false,
in which case return a string length 1 from its back. The string will be non-empty.
*/

public String theEnd(String str, boolean front) {
    if (!front) return str.substring(str.length() - 1);
    return str.substring(0,1);
}

/*
withoutEnd2
Given a string, return a version without both the first and last char of the string.
The string may be any length, including 0.
*/

public String withouEnd2(String str) {
    String result = "";
    if (str.length() > 1) {
        result =  str.substring(1, str.length() - 1);
    }
    return result;
}

/*
middleTwo
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
The string length will be at least 2.
*/

public String middleTwo(String str) {
    int split = str.length() / 2;
    String a = str.substring(0, split);
    String b = str.substring(split, str.length());
    return a.substring(a.length() - 1) + b.substring(0, 1);
}

/*
endsLy
Given a string, return true if it ends in "ly".
*/

public boolean endsLy(String str) {
    if (str.length() <= 1) return false;
    return (str.substring(str.length() - 2).equals("ly"));
}

/*
nTwice
Given a string and an int n, return a string made of the first and last n chars from the string.
The string length will be at least n.
*/

public String nTwice(String str, int n) {
    return str.substring(0, n) + str.substring(str.length() - n);
}

/*
twoChar
Given a string and an index, return a string length 2 starting at the given index.
If the index is too big or too small to define a string length 2, use the first 2 chars.
The string length will be at least 2.
*/

public String twoChar(String str, int index) {
    if (index < 1 || index > str.length() - 2) {
        return str.substring(0, 2);
    }
    return str.substring(index, index + 2);
}

/*
middleThree
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
The string length will be at least 3.
*/

public String middleThree(String str) {
    String a = str.substring(0, str.length() / 2);
    String b = str.substring(str.length() / 2);
    return a.substring(a.length() - 1) + b.substring(0, 2);
}

/*
hasBad
Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
Note: use .equals() to compare 2 strings.
*/

public boolean hasBad(String str) {
    if (str.length() >= 3 && str.substring(0, 3).equals("bad") ||
        (str.length() > 3 && str.substring(1, 4).equals("bad"))) return true;
    return false;
}

/*
atFirst
Given a string, return a string length 2 made of its first 2 chars.
If the string length is less than 2, use '@' for the missing chars.
*/

public String atFirst(String str) {
    if (str.length() == 0) str = "@";
    if (str.length() < 2) return str + "@";
    return str.substring(0, 2);
}

/*
lastChars
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
*/

public String lastChars(String a, String b) {
    if (a.length() == 0) a = "@";
    if (b.length() == 0) b = "@";
    return a.substring(0, 1) + b.substring(b.length() -1);
}

/*
conCat
Given two strings, append them together (known as "concatenation") and return the result. However,
if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
*/

public String conCat(String a, String b) {
    String front = a.length() > 0 ? a.substring(a.length() -1) : a;
    String back = b.length() > 0 ? b.substring(0, 1) : b;
    if (front.equals(back)) {
        return a.substring(0, a.length() -1) + b;
    }
    return a + b;
}