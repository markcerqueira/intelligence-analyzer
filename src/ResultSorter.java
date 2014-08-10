import models.Result;
import models.ResultComparators;

import java.util.ArrayList;
import java.util.Collections;

public class ResultSorter {
    private final ArrayList<Result> mResultsList;

    public ResultSorter(ArrayList<Result> resultsList) {
        mResultsList = resultsList;
    }

    public void run() {
        Collections.sort(mResultsList, new ResultComparators.ResultComparatorByChangeInAgainstVotes());
        System.out.println("ResultSorter - ResultComparatorByChangeInAgainstVotes - " + mResultsList.get(0).toString());

        Collections.sort(mResultsList, new ResultComparators.ResultComparatorByChangeInForVotes());
        System.out.println("ResultSorter - ResultComparatorByChangeInForVotes - " + mResultsList.get(0).toString());

        Collections.sort(mResultsList, new ResultComparators.ResultComparatorByChangeInUndecidedVotes());
        System.out.println("ResultSorter - ResultComparatorByChangeInUndecidedVotes - " + mResultsList.get(0).toString());

        Collections.sort(mResultsList, new ResultComparators.ResultComparatorByPostUndecidedVoters());
        System.out.println("ResultSorter - ResultComparatorByPostUndecidedVoters - " + mResultsList.get(0).toString());
    }
}
