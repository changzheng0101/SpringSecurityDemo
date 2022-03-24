package com.example.demo.configuration;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.demo.configuration.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(STUDENT_WRITE, STUDENT_READ, COURSE_READ, COURSE_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
