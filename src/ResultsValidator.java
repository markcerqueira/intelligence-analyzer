import models.Result;

import java.util.ArrayList;
import java.util.HashSet;

public class ResultsValidator {
    private final ArrayList<Result> mResultsList;

    public ResultsValidator(ArrayList<Result> resultsList) {
        mResultsList = resultsList;
    }

    public void run() {
        HashSet<String> urlSet = new HashSet<String>();
        HashSet<String> imageUrlSet = new HashSet<String>();
        HashSet<String> datesSet = new HashSet<String>();

        for(Result result : mResultsList) {
            System.out.println(result.topic + "; " + result.winner);

            if(urlSet.contains(result.url)) {
                System.out.println("ResultsValidator - run - url: " + result.url + " already seen.");
            }

            if(imageUrlSet.contains(result.imageUrl)) {
                System.out.println("ResultsValidator - run - imageUrl: " + result.imageUrl + " already seen.");
            }

            if(datesSet.contains(result.date)) {
                System.out.println("ResultsValidator - run - date: " + result.date + " already seen.");
            }

            urlSet.add(result.url);
            imageUrlSet.add(result.imageUrl);
            datesSet.add(result.date);

            int forDelta = result.changeInForVotes();
            int againstDelta = result.changeInAgainstVotes();

            if (forDelta != againstDelta) {
                if (forDelta > againstDelta) {
                    if (!result.winner.equalsIgnoreCase("for")) {
                        System.out.println("ResultsValidator - run - winner for " + result.date + " may be incorrect");
                    }
                } else {
                    if (!result.winner.equalsIgnoreCase("against")) {
                        System.out.println("ResultsValidator - run - winner for " + result.date + " may be incorrect");
                    }
                }
            } else {
                System.out.println("ResultsValidator - " + result.date + " - tie found on topic " + result.topic);
            }
        }
    }
}
