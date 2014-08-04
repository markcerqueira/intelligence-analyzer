package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VotingResult {
    @JsonProperty("for") public int forPercentage;
    @JsonProperty("against") public int againstPercentage;
    @JsonProperty("undecided") public int undecidedPercentage;

    @SuppressWarnings("Jackson JSON parser requires a default constructor")
    public VotingResult() {

    }
}
