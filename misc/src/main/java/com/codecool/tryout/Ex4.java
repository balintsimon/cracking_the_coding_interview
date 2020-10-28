package com.codecool.tryout;

public class Ex4 {
    private static final Scanner scan = new Scanner(System.in);


    public static void main(String args[]) throws Exception {
        // read the string filename
        String filename;
        filename = scan.nextLine();

        int largeResponseThreshold = 5000;

        String[] lines = getLinesFromFile(filename);
        String result = getOccurenceAndSizeCountFromLogList(largeResponseThreshold, lines);
        writeContentToFile(result, filename);
    }

    private static String[] getLinesFromFile(String filename) throws IOException {
        String fileContent = new String(Files.readAllBytes(Paths.get(filename)));
        return fileContent.split("\n");
    }

    private static String getOccurenceAndSizeCountFromLogList(int threshold, String[] lines) {
        int occurenceCount = 0;
        Long sizeCount = 0L;

        for (String line : lines) {
            String[] data = line.split(" ");
            int currentSize = Integer.parseInt(data[data.length - 1]);
            if (currentSize >= threshold) {
                occurenceCount++;
                sizeCount += currentSize;
            }
        }
        return occurenceCount + "\n" + sizeCount;
    }

    private static void writeContentToFile(String content, String filename) throws IOException {
        Files.write(Paths.get("bytes_" + filename), content.getBytes(), StandardOpenOption.CREATE);
    }
}
