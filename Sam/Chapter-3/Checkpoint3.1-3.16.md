/*
Checkpoint 3.1-3.7


3.1 List six relational operators

<  
<=
>=
==
!=

3.2 Assuming that x is 1, show the result of the following 
Boolean expressions:

(x > 0) True
(x < 0) False
(x != 0) True
(x >= 0) True
(x != 1) False

3.3 Can the following conversions involving casting
be allowed? Write a test program to verify your answer.

boolean b = true;
i =(int)b;

int i = 1;
boolean b = (boolean)i;


No, Boolean values cannot be cast to other types.

3.4 Write an if statement that asssigns 1 to (x) if y
is greater than 0


if (y>0)
    x=1;

3.5 Write an if statement that increases pay 3%
if score is great than 90

if (score > 90)
pay = pay + pay * 0.03;

or 

if (score > 90);{
pay *= 1.03;
}


3.7 What is the output of the code in (a) and (b)
if the number is 30? What number is 35?


(a) 30 is even 30 is odd
(b) 30 is even if number is 35
(a) 35 is odd
(b) 35 is odd

Checkpoint 3.8-3.10


3.8 Suppose x = 3 and y = 2;
Show the input if any of the following code.
What is the output if x = 2 and y = 2.
Draw a flow chart of the code.

x = 3 an y = 2
no output

if z is 7
x = 3 and y = 4

x = 2 and y = 2
x is 2


3.9 Suppose x = 2 and y = 3. Show the output, if any
of the following code. What is the output if x = 3 and
y = 2? What is the output if x = 3 and y = 3?

x = 2 and y = 3
no output 

x = 3 and y = 2
x is 3

x = 3 and y = 3
z is 6


no output if x = 2 and y = 3

output is x is 3 if x = 3
and y = 2

output is z is 6
 if x = 3 and y = 3


3.10 What is wrong with the following code?
Score 90, "D"

3.11 Which of the following statements are equivalent?
Which ones are indented correctly?

a, c, d Equivalent

c, b Correctly Indented

3.12 Rewrite the following statement using a Boolean Expression:

if (count % 10 == 0)
 newLine = true;
else
 newLine = false;

newLine = (Count % 10 == 0);


3.13 Are the following statements correct? Which one is better?

B is    if
	else


3.14 What is the output of the following code if number
is 14, 15, or 30?

(a) if number is 14, the output is 14 is even

If number is 15, the output is 
15 is multiple of 5

if number is 30 the output is 
30 is even 
30 is a multiple of 5

for (b) if number is 14, the output is 
14 is even

If number is 15, the output is 
15 is a multiple of 5

if number is 30, the output is 
30 is even

Checkpoint 3.15-16

3.15 Which of the following is a possible 
output from invoking Math.random()
0.5, 0.0, 0.234
Because functions return a floating point
number in the range 0 to less than 1 (Inclusive 0 but not to 1)

3.16 How do you generate a random integer
i such that 0 < i < 20?

(a) (int)(Math.random() * 20)

How do you generate a random integer i such that
10 < i < 20?

(b) (int)Math.random() * 10

How do you generate a random integer i  
such that 10 < i < 50?            

(c) 10 + (int)(Math.random()*41)

Write an expression that returns 0 or 1 randomly.

(d) (int)(Math.random()*2)
/*
