
package BenaSPACE.Envoy_Prog_Tracker;

import java.util.*;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "bits",
    "current",
    "max",
    "done",
    "unlocked"
})
@Generated("jsonschema2pojo")
public class EnvoyArmorI {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("bits")
    private List<Object> bits = new ArrayList<Object>();
    @JsonProperty("current")
    private Integer current;
    @JsonProperty("max")
    private Integer max;
    @JsonProperty("done")
    private Boolean done;
    @JsonProperty("unlocked")
    private Boolean unlocked;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public EnvoyArmorI withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("bits")
    public List<Object> getBits() {
        return bits;
    }

    @JsonProperty("bits")
    public void setBits(List<Object> bits) {
        this.bits = bits;
    }

    public EnvoyArmorI withBits(List<Object> bits) {
        this.bits = bits;
        return this;
    }

    @JsonProperty("current")
    public Integer getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(Integer current) {
        this.current = current;
    }

    public EnvoyArmorI withCurrent(Integer current) {
        this.current = current;
        return this;
    }

    @JsonProperty("max")
    public Integer getMax() {
        return max;
    }

    @JsonProperty("max")
    public void setMax(Integer max) {
        this.max = max;
    }

    public EnvoyArmorI withMax(Integer max) {
        this.max = max;
        return this;
    }

    @JsonProperty("done")
    public Boolean getDone() {
        return done;
    }

    @JsonProperty("done")
    public void setDone(Boolean done) {
        this.done = done;
    }

    public EnvoyArmorI withDone(Boolean done) {
        this.done = done;
        return this;
    }

    @JsonProperty("unlocked")
    public Boolean getUnlocked() {
        return unlocked;
    }

    @JsonProperty("unlocked")
    public void setUnlocked(Boolean unlocked) {
        this.unlocked = unlocked;
    }

    public EnvoyArmorI withUnlocked(Boolean unlocked) {
        this.unlocked = unlocked;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public EnvoyArmorI withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnvoyArmorI.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("bits");
        sb.append('=');
        sb.append(((this.bits == null)?"<null>":this.bits));
        sb.append(',');
        sb.append("current");
        sb.append('=');
        sb.append(((this.current == null)?"<null>":this.current));
        sb.append(',');
        sb.append("max");
        sb.append('=');
        sb.append(((this.max == null)?"<null>":this.max));
        sb.append(',');
        sb.append("done");
        sb.append('=');
        sb.append(((this.done == null)?"<null>":this.done));
        sb.append(',');
        sb.append("unlocked");
        sb.append('=');
        sb.append(((this.unlocked == null)?"<null>":this.unlocked));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.current == null)? 0 :this.current.hashCode()));
        result = ((result* 31)+((this.max == null)? 0 :this.max.hashCode()));
        result = ((result* 31)+((this.bits == null)? 0 :this.bits.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.done == null)? 0 :this.done.hashCode()));
        result = ((result* 31)+((this.unlocked == null)? 0 :this.unlocked.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvoyArmorI) == false) {
            return false;
        }
        EnvoyArmorI rhs = ((EnvoyArmorI) other);
        return ((((((((this.current == rhs.current)||((this.current!= null)&&this.current.equals(rhs.current)))&&((this.max == rhs.max)||((this.max!= null)&&this.max.equals(rhs.max))))&&((this.bits == rhs.bits)||((this.bits!= null)&&this.bits.equals(rhs.bits))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.done == rhs.done)||((this.done!= null)&&this.done.equals(rhs.done))))&&((this.unlocked == rhs.unlocked)||((this.unlocked!= null)&&this.unlocked.equals(rhs.unlocked))));
    }

}
