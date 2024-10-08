package com.instagram.autoplay.models;

import X.1Xj;
import X.AnonymousClass7TG;

public final class AutoplayWhichVideoMetadata {
    public final 1Xj media;
    public final AutoplayPlaybackHistory playbackHistory;
    public final AutoplayScreenItemWithoutMetadata screenItem;

    public final 1Xj getMedia() {
        return this.media;
    }

    public final AutoplayOnScreenItemWithMetadata getOnScreenMetadata() {
        AutoplayScreenItemWithoutMetadata autoplayScreenItemWithoutMetadata = this.screenItem;
        if (autoplayScreenItemWithoutMetadata instanceof AutoplayOnScreenItemWithMetadata) {
            return (AutoplayOnScreenItemWithMetadata) autoplayScreenItemWithoutMetadata;
        }
        return null;
    }

    public final AutoplayPlaybackHistory getPlaybackHistory() {
        return this.playbackHistory;
    }

    public final AutoplayScreenItemWithoutMetadata getScreenItem() {
        return this.screenItem;
    }

    public AutoplayWhichVideoMetadata(1Xj r1, AutoplayPlaybackHistory autoplayPlaybackHistory, AutoplayScreenItemWithoutMetadata autoplayScreenItemWithoutMetadata) {
        AnonymousClass7TG.A1U(r1, autoplayPlaybackHistory, autoplayScreenItemWithoutMetadata);
        this.media = r1;
        this.playbackHistory = autoplayPlaybackHistory;
        this.screenItem = autoplayScreenItemWithoutMetadata;
    }
}
