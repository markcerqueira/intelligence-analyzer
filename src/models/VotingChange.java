package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VotingChange {
    @JsonProperty("for-to-against") public int forToAgainst;
    @JsonProperty("for-to-undecided") public int forToUndecided;
    @JsonProperty("against-to-for") public int againstToFor;
    @JsonProperty("against-to-undecided") public int againstToUndecided;
    @JsonProperty("undecided-to-for") public int undecidedToFor;
    @JsonProperty("undecided-to-against") public int undecidedToAgainst;

    @SuppressWarnings("Jackson JSON parser requires a default constructor")
    public VotingChange() {

    }
}
