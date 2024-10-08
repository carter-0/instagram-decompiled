package com.instagram.ui.animation.timeline.linear;

import X.C58041IkZ;

public final class TaskNotAvailableException extends C58041IkZ {
    public static final TaskNotAvailableException A00 = new Throwable();

    public final String getMessage() {
        return "Task not available in this timeline yet... Set up timeline with this task first!";
    }
}
