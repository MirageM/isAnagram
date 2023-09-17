def isAnagram(word1, word2):
    dict1 = {}
    dict2 = {}
    for char in word1:
        dict1[char] = dict1.get(char, 0) + 1
    for char in word2:
        dict2[char] = dict2.get(char, 0) + 1
    return dict1 == dict2

print(isAnagram("listen", "silent"))


"""
l: 1
i: 1
s: 1
t: 1
e: 1
n: 1

s: 1
i: 1
l: 1
e: 1
n: 1
t: 1

"""