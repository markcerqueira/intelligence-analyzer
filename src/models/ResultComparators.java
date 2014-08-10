package models;

import java.util.Comparator;

public class ResultComparators {
    public static class ResultComparatorByChangeInForVotes implements Comparator<Result> {
        @Override
        public int compare(Result r1, Result r2) {
            return r2.changeInForVotes() - r1.changeInForVotes();
        }
    }

    public static class ResultComparatorByChangeInAgainstVotes implements Comparator<Result> {
        @Override
        public int compare(Result r1, Result r2) {
            return r2.changeInAgainstVotes() - r1.changeInAgainstVotes();
        }
    }

    public static class ResultComparatorByChangeInUndecidedVotes implements Comparator<Result> {
        @Override
        public int compare(Result r1, Result r2) {
            return r2.changeInUndecidedVotes() - r1.changeInUndecidedVotes();
        }
    }

    public static class ResultComparatorByPostUndecidedVoters implements Comparator<Result> {
        @Override
        public int compare(Result r1, Result r2) {
            return r2.postDebateResults.undecidedPercentage - r1.postDebateResults.undecidedPercentage;
        }
    }
}
