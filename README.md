# AGH_Questions

## Question 1
### Initial thought :
1. If all the digits in a given number are in descending order for instance *5432* then there would be no next greater number possible.
2. If all the digits are in ascending order then swapping last two digits will do the job for instance *123*
3. for all the other edge cases we need to start finding the digit from the rightmost side to find smallest of all greater possible numbers.

### Psuedo Algorithm:
1. We should start traversing from the right side and should stop when we find some digit which is smaller than the digit previously visited.
2. After that we should make sure that the previously visited digit is smaller than all the visited digits from the right side before we get our criteria in step number 1
3. After that we should swap those two digits.
4. And lastly sort all the digits traversed on the right side to get the smallest possible number.
---
## Question 2

### Initial thought
1. Clicked on the given api url and formatted the json data that I got in the browser using [Json Editor](https://jsoneditoronline.org)
2. Carefully read the extracted Json nested array.
3. Narrowed three different ways to ping request to the given api url to get the response
  - Synchronous 
  - Async
  - Promise
  
 Selected Async approach and created object for XMLHttp
 4. Captured the JSON data in an event handler and parsed it to store in a variable.
 5. Looped through the data to get the image source of each image one by one.
 6. Dyanmically created img element and passed the obtained img src to it.
 
 ### Possible Improvements:
 1. Can store the image seen in a memory to display it again after it reaches its threshold count.
 2. Can add a navigation carousel to move forward or backward in seeing the images.
 
 ---
 
 ### Thank you for giving me this opportunity, it was a wonderful experience with this take home assignment and I got to learn new tricks after this coding assignment.
