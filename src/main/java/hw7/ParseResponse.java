package hw7;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("object")

public class ParseResponse {
    @JsonProperty("Headline")
    private String city;
    @JsonProperty("Minimum")
    private String temp;
    @JsonProperty("Value")
    private String descrption;

    public ParseResponse(String city, String temp, String descrption) {
        this.city = city;
        this.temp = temp;
        this.descrption = descrption;
    }

    public ParseResponse() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    @Override
    public String toString() {
        return "ParseResponse{" +
                "город - " + city + '\'' +
                ", температура - " + temp + '\'' +
                ", описание - " + descrption + '\'' +
                '}';
    }
}
