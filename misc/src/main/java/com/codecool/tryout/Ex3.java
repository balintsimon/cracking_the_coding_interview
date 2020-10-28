package com.codecool.tryout;

public class Ex3 {

    /*
     * Complete the 'toolchanger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY tools
     *  2. INTEGER k - index within tools List where the machine is at at the moment
     *  3. STRING q - desired tool's name (can it always be found in the tools?)
     */

    public static int toolchanger(List<String> tools, int k, String q) {
        int toolboxSize = tools.size();
        int minDistance = toolboxSize;
        List<Integer> toolIndexes = getDesiredToolIndexes(tools, q);

        for (int i = 0; i < toolIndexes.size(); i++) {
            int greater = toolIndexes.get(i) > k ? toolIndexes.get(i) : k;
            int lesser = toolIndexes.get(i) < k ? toolIndexes.get(i) : k;

            int distBetween = greater - lesser;
            int distAcross = toolboxSize - greater + lesser;

            int currentMinDistance = distBetween < distAcross ? distBetween : distAcross;

            if (currentMinDistance <= Math.abs(minDistance)) minDistance = currentMinDistance;
        }

        return minDistance;
    }

    private static List<Integer> getDesiredToolIndexes(List<String> tools, String q) {
        List<Integer> toolIndexes = new ArrayList<>();
        for (int i = 0; i < tools.size(); i++) {
            if (q.equals(tools.get(i))) toolIndexes.add(i);
        }
        return toolIndexes;
    }

}
