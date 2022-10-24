package apiExam.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Board {

    @JsonProperty("name")
    private String name;

    @JsonProperty("boardId")
    private String boardId;

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoardId() {
        return boardId;
    }

    public String getName() {
        return name;
    }

}
