package com.instagram.autoplay.models;

import X.AnonymousClass7TF;
import java.util.ArrayList;
import java.util.List;

public abstract class AutoplayWhichVideosSequentialToNextKt {
    public static final List filterLoopedVideos(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        for (Object next : list) {
            if (((AutoplayWhichVideoMetadata) next).playbackHistory.currentState == AutoplayPlaybackState.PLAYING_AND_LOOPED_ONCE) {
                A0q.add(next);
            }
        }
        return A0q;
    }
}
