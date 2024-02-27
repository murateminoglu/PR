package de.gastev.beispiel.dto;

import de.gastev.beispiel.entity.PullRequest;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link PullRequest}
 */
public class PullRequestDto implements Serializable {
    private  Long id;
    private  Integer number;
    private  String title;
    private  String createdAt;


    public PullRequestDto(Long id, Integer number, String title, String createdAt) {
        this.id = id;
        this.number = number;
        this.title = title;
        this.createdAt = createdAt;
    }

    public PullRequestDto() {super();

    }

    public Long getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PullRequestDto entity = (PullRequestDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.number, entity.number) &&
                Objects.equals(this.title, entity.title) &&
                Objects.equals(this.createdAt, entity.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, title, createdAt);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "number = " + number + ", " +
                "title = " + title + ", " +
                "createdAt = " + createdAt + ")";
    }
}