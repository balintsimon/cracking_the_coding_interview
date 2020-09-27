package com.example;

/* Question 6.1 - The Heavy Pill
    You have 20 bottles of pills. 19 bottles have 1.0 gram pills, but one has pills of weight 1.1 grams.
    Given a scale that provides an exact measurement, how would you find the heavy bottle?
    You can only use the scale once.
 */

/* Notes
    Our problem constraint is that we can only make one measurement. So the usual "division of bottles" solution
    will not work. However, if we presume that each bottle has at least 20 pills, we could number the bottles and
    take as many pills from the bottles as the number of the bottle. That means we take 1+2+3+...+18+19+20 pills,
    which is 10*21 pills in total. We presume that each normal pill would be 1.0 grams, so the total weight of the
    "pile" of pills should be 210.0 grams. However, our problem states that one bottle's pills are 1.1 grams heavy.
    This means that our deviation from 210.0 grams divided by the 0.1 grams difference of the odd-one-out pills
    would give us the number of the bottle (as bottle 1 would mean that the pile is 0.1 grams heavier, bottle 2 would
    mean that the pile is 0.2 grams heavier, etc.).

    So we substract the 210 grams weight from the measured weight and divide it with the odd-one-out pills' delta
    from the "normal" pills (every weight is in grams):

    bottle_number = (measured_weight - 210) / 0.1

    N.B.:
    It's not part of the logic problem, but now that we found the bottle, we'd have to put back all the pills to the
    original bottles. Unfortunately, if we took care of the bottle numbers with some form of code on the pills, that
    would interfere with our measurement (you cannot put ink on the pills or itch them without modifying their measured
    weight), so even though we found the heavier bottle, we may have taken all the pills inside it.
 */
public class Main {

}