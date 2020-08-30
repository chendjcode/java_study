package com.study;

import java.util.Objects;

public class DataKey {
    private String name;
    private int id;

    DataKey(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataKey dataKey = (DataKey) o;
        return id == dataKey.id &&
                Objects.equals(name, dataKey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "DataKey{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
