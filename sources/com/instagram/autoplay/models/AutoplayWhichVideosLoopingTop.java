package com.instagram.autoplay.models;

import X.00k;
import X.0qQ;
import X.Pxf;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.util.List;

public final class AutoplayWhichVideosLoopingTop implements AutoplayWhichVideos {
    public AutoplayWhichVideoMetadata chooseNextVideoToPlay(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        0qQ.A0B(list, 0);
        return (AutoplayWhichVideoMetadata) 00k.A0I(00k.A0g(list, TopLeftComparator.instance));
    }

    public /* synthetic */ List chooseNextVideosToPause(List list) {
        return AutoplayWhichVideos.CC.$default$chooseNextVideosToPause(this, list);
    }

    public /* synthetic */ List combine(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        return AutoplayWhichVideos.CC.$default$combine(this, list, autoplayWhichVideoMetadata);
    }

    public String toString() {
        return "LoopingTop";
    }

    public /* synthetic */ boolean hasMinimumVisibility(float f) {
        return Pxf.A1R((f > 0.2f ? 1 : (f == 0.2f ? 0 : -1)));
    }
}
