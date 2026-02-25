Andrew Huebner 

2231994

SE 333-501

HW1 

1.)	A, because the On=570 is the last integer that makes the numberOfPoints true, and the Off = 571 is the first integer that makes numberOfPoints false.

2.)	The off points for x==10 would be 9 and 11. Since x == 10 is the condition, the first integer that is immediately greater than or less would be the off points. The only on point is 10.

3.)	Non-English characters would likely fail the test. Special characters/punctuation/spaces/new lines/would be invalid. 

**Part 2**

1.)	NumberUtils.add will return a List<Integer> that contains the sum of left and right where each integer is separated or Null

2a) Individual input 
	Can input any positive int as a List, however for multi-digit numbers they need to be separate elements of the list. Elements MUST be >1 and <9

2b) Comination of input

2c) Output
	The output of the add method is a list of integers that when combined are the sum of the input (left and right)

**Part 3**

Yes, the bug I was able to find was when using the same object or a copy of the same object to add, if the list that is input is 2 digits and the digits are different. This resulted in a backwards output of the correct answer. I believe that this is due to the line that “reverses the numbers so that the least significant digit goes to the left”. The expected behavior would be for the number to add normally would output . For example if we have a list (list1 = [1,2]) and we run it through the add method as both arguments (NumberUtils.add(list1,list1)) we would expect the output to be [2,4] however, the output is [4,2].


