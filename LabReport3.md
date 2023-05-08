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

---

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

---

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
grep -n "9" Cohenetal_Cost_Function.txt

Output:
54:is 74 cents versus the actual value of 79 cents. It must be pointed
56:range of volume. U.S. volume per capita in 1999 was 739 pieces
108:To create a total cost function, we use FY 1999 U.S. Postal
143:Transportation = 0.0200V + 0.92P Window Service = 0.0092V + 4.64P
144:All Other costs = 0.0241V + 24.41P Total costs = 0.2089V + 74.31P
147:in the U.S. for FY 1999 was 20.89 cents per piece plus $74.31 per
152:Average Unit Cost = 0.2089 + (74.31 P / V). This can be restated
154:Average Unit Cost = 0.2089 + (74.31 / ppc).
164:Table 1: FY 1999 USPS Percent of Total Cost and Elasticity (with
182:Total Cost for country "i" = (0.2089 Pi)(V/Pi) + 74.31 Pi,
184:0.2089Pi = slope
342:For delivery percentages, the trend line is y=46.943e-0.0004x with
344:y=10.869Ln(x) - 38.407 with an R2 of 0.69.
370:using OECD's PPP for 1999.
372:per Piece for 1999
375:Canada 43 41 Finland 34 39 France 38b 40b Germany 50 57 Italy 90
376:79c Portugal 62 54
407:Appendix: FY 1999 USPS Operational Statistics
465:PRC Docket No. R2000-1 USPS LR-I-481, FY 1999 and TY Mail
467:LR-I-81 & 464 Provided in Response to POR No. 116) Using FY 99
```
As previously mentioned, the grep -n command prints the line number of the line that matches the pattern. In both examples, the file is Post_Rate_Comm, located in stringsearch-data/technical/government/Post_Rate_Comm. In the first example, it printed the line numbers that contains "not". In the second example, it printed the line numbers that contained "9". This command option is useful when you need to know the exact line number that matches a pattern. 

---

grep -L: This command prints the files that doesn't contain the matching lines.

[Source](https://www.oreilly.com/library/view/linux-pocket-guide/9780596806347/re52.html)

First example:
```
grep -L "Government" *

Output:
Cohenetal_comparison.txt
Cohenetal_Cost_Function.txt
Cohenetal_CreamSkimming.txt
Cohenetal_DeliveryCost.txt
Cohenetal_RuralDelivery.txt
Cohenetal_Scale.txt
Gleiman_EMASpeech.txt
Gleiman_gca2000.txt
Mitchell_spyros-first-class.txt
Redacted_Study.txt
WolakSpeech_usps.txt
```

Second example:
```
grep -L "because" *

Output:
Cohenetal_RuralDelivery.txt
WolakSpeech_usps.txt
```
As previously mentioned, the grep -L command prints the name of the files that doesn't contain the matching lines. In both examples, the directory is Post_Rate_Comm. In the first example, the command printed the name of the files that contained "Government". In the second example, it printed the name of files that contained "because". This command option is useful if you want to find specific files that doesn't contain a specific character, word, etc...
