package de.gastev.beispiel.dto;

import de.gastev.beispiel.entity.ReleaseInfo;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link ReleaseInfo}
 */
public class ReleaseInfoDto implements Serializable {
    private final Long id;
    private final String name;
    private final String date;

    public ReleaseInfoDto(Long id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReleaseInfoDto entity = (ReleaseInfoDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.date, entity.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "date = " + date + ")";
    }
}