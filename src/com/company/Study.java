package com.company;

public enum Study {
    PHYSICS("Физика"), LITERATURE("Литература");

    private String displayName;

    Study(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
