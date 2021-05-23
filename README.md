# Steganography-Cryptography__Java
article links: https://www.dreamincode.net/forums/topic/27950-steganography/
               https://www.javatpoint.com/java-swing
               ►How to read and write image file in Java
               https://rb.gy/mx4oux
               ►How to get and set pixel value in Java
               https://rb.gy/ygkb39
               ►Java Swing – JOptionPane showOptionDialog example
               https://rb.gy/nucczh
               ►How to choose the file in Java?
               https://rb.gy/k9xqdg
               
Concept: For making things more easier, Lets suppose that these 3 colors (RGB) have the range of 0-99 and
for more simplicity just take one color e.g. Red to discuss the concept of steganography. Lets suppose there are two pixels one having Red Value=34 and other Red Value=72
Think if I remove the non-zero from one’s place in 34 then I have 30 and it is not a big change in
the picture. No one can see this change with their naked eye. And now I done this same step with
another red value which gives me 70. Now I have two values 30 and 70. Now if I want to hide
second image having value = 70 in the image having value 30. I can shift the 7 of tenth’s place in
one’s place by dividing it by 10 (70/10=7) and add it in the first image which means 30+7=37 now
37 is the pixel of the secret picture. Now if we want to take the hidden image from this secret
message having value 37 then we simply do a modulus to get reminder (37%10=7) and then
multiply it by 10 (7x10 =70) then simply we can easily reveal the orig
