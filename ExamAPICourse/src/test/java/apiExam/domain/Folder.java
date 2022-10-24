package apiExam.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Folder {

    @JsonProperty("name")
    private String name;

    @JsonProperty("folderId")
    private String folderId;

    public void setName(String name) {
        this.name = name;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getName() {
        return name;
    }

    public String getFolderId() {
        return folderId;
    }

}
