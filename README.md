# HashAT8

This is my first ever hash algorithm.<br />

# About:
HashAT8 gives a hash for a string in hexadecimal number system, capped at size of 8 bytes.<br />
Language used: Java<br />

# Description:
This algorithm meets almost all the properties of a hash function:<br />
-One way: You cannot trace back what the content is using the hash<br />
-Deterministic: It will give the exactly same hash for same content<br />
-Avalanche Effect: If you take the same string/content and edit the content with even a small change, the hash will change.<br />

# Example Test Case:

If you enter "Hello" as the input string, you get the hash '5759'.<br />
Next if you enter "Hello2", the hash will change to '5B9C'.
