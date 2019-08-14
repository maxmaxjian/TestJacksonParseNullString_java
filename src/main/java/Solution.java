import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Solution {

    public static void main(String[] args) {
        String json = "{\"name\": \"Jonh\", \"age\" : 10}";
//        json = null;

        ObjectMapper mapper = new ObjectMapper();
        try {
            Person person = mapper.readValue(json, Person.class);
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        }


        String js = "{\"company\": \"GOOGLE\", \"position\": \"SDE\"}";
        try {
            Job job = mapper.readValue(js, Job.class);
            System.out.println(job);
            String out = mapper.writeValueAsString(job);
            System.out.println(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
