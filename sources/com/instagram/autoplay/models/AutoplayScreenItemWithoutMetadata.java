package com.instagram.autoplay.models;

import X.0qQ;
import X.1Xj;

public class AutoplayScreenItemWithoutMetadata {
    public final 1Xj media;
    public final long timeAddedToScreen;
    public long timeSinceAddedToScreen;

    public AutoplayScreenItemWithoutMetadata(1Xj r2, long j) {
        0qQ.A0B(r2, 1);
        this.media = r2;
        this.timeAddedToScreen = j;
    }

    public final 1Xj getMedia() {
        return this.media;
    }

    public final long getTimeAddedToScreen() {
        return this.timeAddedToScreen;
    }

    public final long getTimeSinceAddedToScreen() {
        return this.timeSinceAddedToScreen;
    }

    public final boolean isOnScreen() {
        return this instanceof AutoplayOnScreenItemWithMetadata;
    }

    public final void setTimeSinceAddedToScreen(long j) {
        this.timeSinceAddedToScreen = j;
    }
}
