package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    @JsonProperty("url") public String url;
    @JsonProperty("image-url") public String imageUrl;
    @JsonProperty("date") public String date;
    @JsonProperty("day") public String day;
    @JsonProperty("topic") public String topic;
    @JsonProperty("moderator") public String moderator;
    @JsonProperty("winner") public String winner;
    @JsonProperty("unchanged-vote") public int unchangedVote = -1; // default to -1 because this is not available for all results
    @JsonProperty("changed-vote") public int changedVote = -1; // default to -1 because this is not available for all results

    @JsonProperty("pre-debate") public VotingResult preDebateResults;
    @JsonProperty("post-debate") public VotingResult postDebateResults;
    @JsonProperty("unchanged") public VotingResult unchangedVoteBreakdown;
    @JsonProperty("changed") public VotingChange changedVoteBreakdown;

    @JsonProperty("note") public String note; // miscellaneous information

    @SuppressWarnings("Jackson JSON parser requires a default constructor")
    public Result() {

    }
}

