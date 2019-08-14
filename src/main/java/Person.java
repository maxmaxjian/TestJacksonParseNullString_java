import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

@AutoValue
@JsonDeserialize(builder = AutoValue_Person.Builder.class)
abstract class Person {

    abstract String name();

    abstract int age();

    public static Builder builder() {
        return new AutoValue_Person.Builder();
    }

    @AutoValue.Builder
    static abstract class Builder {

        @JsonProperty("name")
        abstract Builder name(String name);

        @JsonProperty("age")
        abstract Builder age(int age);

        abstract Person build();
    }
}
