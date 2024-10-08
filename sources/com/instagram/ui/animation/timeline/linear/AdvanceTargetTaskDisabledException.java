package com.instagram.ui.animation.timeline.linear;

import X.C58041IkZ;

public final class AdvanceTargetTaskDisabledException extends C58041IkZ {
    public static final AdvanceTargetTaskDisabledException A00 = new Throwable();

    public final String getMessage() {
        return "The target task for the timeline advance is already disabled... Ignoring the advance!";
    }
}
