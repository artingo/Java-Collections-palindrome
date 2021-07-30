# Check if a sentence is a "palindrome"

## Overview:
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backwards and forwards.

## Task
Write a function that checks if a word or sentence is a palindrome. Follow these steps: 
1. Remove the whitespace.
2. Split the sentence into its characters.  
3. Push all the characters onto a stack and a deque.
4. Compare each character from stack and deque. Return 'false' if the first different character appears.

### Input / Output:
"Racecar" --> true
"King are you glad you are king" --> false
"Murder for a jar of red rum" --> true
"Was it a car or a cat I saw" --> true
"Yo, banana boy!" --> false
