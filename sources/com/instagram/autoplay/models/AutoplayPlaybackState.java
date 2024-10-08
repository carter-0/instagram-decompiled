package com.instagram.autoplay.models;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum AutoplayPlaybackState {
    UNKNOWN,
    PLAYBACK_REQUESTED,
    PLAYING,
    PLAYING_AND_LOOPED_ONCE,
    BUFFERING,
    PAUSED,
    FAILURE;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        AutoplayPlaybackState[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final boolean isPlaying() {
        if (this == PLAYING || this == PLAYING_AND_LOOPED_ONCE) {
            return true;
        }
        return false;
    }
}
