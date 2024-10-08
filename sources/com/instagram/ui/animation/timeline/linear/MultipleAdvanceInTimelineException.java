package com.instagram.ui.animation.timeline.linear;

import X.C58041IkZ;

public final class MultipleAdvanceInTimelineException extends C58041IkZ {
    public static final MultipleAdvanceInTimelineException A00 = new Throwable();

    public final String getMessage() {
        return "Only one advance is permitted in the timeline lifecycle... Ignoring the subsequent advances!";
    }
}
