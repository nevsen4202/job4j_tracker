package ru.job4j;

import java.time.LocalDateTime;

public class Item {
    private LocalDateTime created = LocalDateTime.now();

    public LocalDateTime getCreated() {
        return created;
    }
}
