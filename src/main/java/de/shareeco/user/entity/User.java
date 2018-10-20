package de.shareeco.user.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class User {
    @Getter
    private final String username;
    @Getter
    private final String position;
    @Getter
    private final String company;


}
