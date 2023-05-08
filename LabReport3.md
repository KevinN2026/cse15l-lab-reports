The grep command finds all the lines in a file that matches the provided pattern. In my opinion, the following grep options are interesting: -v, -c, -n, and -L.

[Source](https://www.oreilly.com/library/view/linux-pocket-guide/9780596806347/re52.html)

grep -v: This command option only prints out the lines that don't match the pattern.

First example:
```
grep -v -e "the" -e "a" -e "to" -e "in" 1468-6708-3-1.txt

Output:
 Introduction
        elderly [ 9 ] .



          Study




          ] .






      
        Results
        likely.
        under 20.
        groups.
        YOL or YHL.


        Discussion

        

          YHL.





        Conclusion




        CESD Center for Epidemiologic Studies Depression
        poor?

```

Second example:
```
grep -v -e "the" -e "i" 1468-6708-3-1.txt

Output:
most robust health as we age. It has been suggested that
        elderly [ 9 ] .



          Study


          above.


          ] .
          good, or good health (were 'healthy'). YHL ranges from 0
          good health) to 7 years (for persons who were healthy
          been followed only 4 years to date. For those persons,



        
          All analyses were performed separately for men and
          women. We calculated two sets of adjusted values, as



        Results
        to age 73. For example, black women averaged 6.3 YOL, but
        were healthy.
        and 4). For example, YOL for women, adjusted for age, race,
        and 4). Subsequent analyses are adjusted only for age,
        under 20.
        bars to be seen.
        same YOL.
        groups.
        outcome measure.
        make obese women comparable to normal women could be
        YOL or YHL.



          to age [ 6 13 30 ] . Andres
          et al [ 31 ] proposed 27-30 for
        

          YHL.







        None declared


        Scale
        poor?
```

As previously mentioned, the grep -v command prints lines that doesn't match the pattern. Note: -e is not part of the -v command. -e is used to provide multiple patterns. In the first example, grep is used in the file named 1468-6708-3-1.txt located in stringsearch-data/technical/biomed. The command will only print lines that don't contain "the", "a" , "to", and "in". In the second example, grep is used in the same file, but the pattern is different. In this case, grep will print lines that don't contain "the" and "i". This command option is useful when you need to find lines that don't contain a certain word, character, etc...


grep -c: This command prints the number of lines that matches the pattern.
[Source](https://www.oreilly.com/library/view/linux-pocket-guide/9780596806347/re52.html)

First example:
```
grep -c "the" 1468-6708-3-1.txt

Output:
144
```

Second example:
```
grep -c "a" 1468-6708-3-1.txt

Output:
377
```
As previously mentioned, the grep -c command prints the number of lines that matches the pattern. In both examples, the grep command is used in the same file as the one used in the grep -v command, which is 1468-6708-3-1.txt. In the first example, the grep command found 144 lines that contained "the". In the second example, the grep command found 377 lines that contained "a". This command option is useful when you want to know how many lines contain a certain character, word, etc....


grep -n: This command will print the line number of the line matching the pattern.
[Source](https://www.oreilly.com/library/view/linux-pocket-guide/9780596806347/re52.html)

First example:
```
grep -n "not" Cohenetal_Cost_Function.txt

Output:
25:do not necessarilyrepresent the opinions of CTT - Correios de
40:sensitive and will not share them.
78:industrialized countries.3 The hypothesis cannot, however, be
79:directly confirmed because we do not have sufficient cost data on
87:Although the evidence is not conclusive, it confirms the
126:not change as volume drops. As long as coverage is relatively high,
128:delivery costs would not be expected to drop until volume per
136:The results are not very sensitive to this assumption as can be
172:Does not include intra city transportation costs.
211:does not involve predicting unit costs of other posts. It involves
213:and delivery. Thus, labor costs do not need to be adjusted.
248:total cost for La Poste do not include unaddressed mail.
312:acceptance, 15 percent. Nevertheless, the authors cannot explain
320:It appears that other factors, for which adjustments are not
321:made, do not cause significant differences. This could be because
322:these factors do not vary significantly from the U.S., do not drive
362:these adjustments were not available, except for Italy. The
404:with reasonable accuracy. Of course, we would not expect exact
436:Percentage of mail not delivered (i.e. Post Office Box
```

Second example:
```

```
