package com.instagram.ui.animation.timeline.linear;

import X.C58041IkZ;

public final class TimelineNotStartedException extends C58041IkZ {
    public static final TimelineNotStartedException A00 = new Throwable();

    public final String getMessage() {
        return "Timeline is not started yet... Start timeline first!";
    }
}
