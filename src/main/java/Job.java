import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Job {

    @JsonProperty("company")
    abstract String getCompany();

    @JsonProperty("position")
    abstract String getPosition();

    @JsonCreator
    public static Job create(@JsonProperty("company") String comp, @JsonProperty("position") String pos) {
        return new AutoValue_Job(comp, pos);
    }
}
