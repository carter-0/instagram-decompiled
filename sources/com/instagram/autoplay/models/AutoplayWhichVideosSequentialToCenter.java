package com.instagram.autoplay.models;

import X.00k;
import X.0qQ;
import X.C51966G9m;
import X.Pxd;
import X.Pxf;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.util.List;

public final class AutoplayWhichVideosSequentialToCenter implements AutoplayWhichVideos {
    public AutoplayWhichVideoMetadata chooseNextVideoToPlay(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        int i;
        Object obj;
        0qQ.A0B(list, 0);
        List combine = combine(list, autoplayWhichVideoMetadata);
        0qQ.A0B(combine, 0);
        int indexOf = combine.indexOf(autoplayWhichVideoMetadata);
        if (indexOf == -1) {
            i = Math.max(C51966G9m.A06(combine), 0) / 2;
        } else if (indexOf == C51966G9m.A06(combine)) {
            obj = combine.get(0);
            return (AutoplayWhichVideoMetadata) obj;
        } else {
            i = indexOf + 1;
        }
        obj = combine.get(i);
        return (AutoplayWhichVideoMetadata) obj;
    }

    public List chooseNextVideosToPause(List list) {
        0qQ.A0B(list, 0);
        return 00k.A0S(AutoplayWhichVideosSequentialToNextKt.filterLoopedVideos(list), AutoplayWhichVideos.CC.$default$chooseNextVideosToPause(this, list));
    }

    public /* synthetic */ List combine(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        return AutoplayWhichVideos.CC.$default$combine(this, list, autoplayWhichVideoMetadata);
    }

    public String toString() {
        return Pxd.A00(561);
    }

    public /* synthetic */ boolean hasMinimumVisibility(float f) {
        return Pxf.A1R((f > 0.2f ? 1 : (f == 0.2f ? 0 : -1)));
    }
}
