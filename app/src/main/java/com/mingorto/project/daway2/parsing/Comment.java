
package com.mingorto.project.daway2.parsing;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "commenterName",
    "description",
    "likes",
    "dislikes"
})
public class Comment {

    @JsonProperty("commenterName")
    private String commenterName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("commentatorImage")
    private String commentatorImage;
    @JsonProperty("likes")
    private int likes;
    @JsonProperty("dislikes")
    private int dislikes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("commenterName")
    public String getCommenterName() {
        return commenterName;
    }

    @JsonProperty("commenterName")
    public void setCommenterName(String commenterName) {
        this.commenterName = commenterName;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommentatorImage() {
        return commentatorImage;
    }

    public void setCommentatorImage(String commentatorImage) {
        this.commentatorImage = commentatorImage;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("likes")
    public int getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(int likes) {
        this.likes = likes;
    }

    @JsonProperty("dislikes")
    public int getDislikes() {
        return dislikes;
    }

    @JsonProperty("dislikes")
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
