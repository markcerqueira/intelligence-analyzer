import models.Result;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Result> sResultsArrayList = new ArrayList<Result>();

    public static void main(String[] args) {
        loadResultsFromDisk(false /* load all results, even those without breakdowns */);

        System.out.println("main - sResultsArrayList contains " + sResultsArrayList.size() + " results");
    }

    public static void loadResultsFromDisk(boolean loadOnlyCompleteResults) {
        final File folder = new File("resources/intelligence-json");

        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.getName().contains(".json")) {
                loadResultsFile(fileEntry, loadOnlyCompleteResults);
            }
        }
    }

    public static void loadResultsFile(File file, boolean loadOnlyCompleteResults) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader  = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }

            Result result = JsonUtils.parseJson(stringBuilder.toString(), Result.class);

            if(loadOnlyCompleteResults) {
                if(result.unchangedVote != -1) {
                    sResultsArrayList.add(result);
                }
            } else {
                sResultsArrayList.add(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // System.out.println(stringBuilder.toString());
    }
}

