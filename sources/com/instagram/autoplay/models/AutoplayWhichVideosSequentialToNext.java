package com.instagram.autoplay.models;

import X.00k;
import X.0qQ;
import X.0sP;
import X.AnonymousClass7TG;
import X.C51966G9m;
import X.Pxf;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.util.ArrayList;
import java.util.List;

public final class AutoplayWhichVideosSequentialToNext implements AutoplayWhichVideos {
    public AutoplayWhichVideoMetadata chooseNextVideoToPlay(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        int i = 0;
        0qQ.A0B(list, 0);
        List<AutoplayWhichVideoMetadata> combine = combine(list, autoplayWhichVideoMetadata);
        0qQ.A0B(combine, 0);
        int indexOf = combine.indexOf(autoplayWhichVideoMetadata);
        ArrayList A0r = AnonymousClass7TG.A0r(combine);
        for (AutoplayWhichVideoMetadata autoplayWhichVideoMetadata2 : combine) {
            AutoplayScreenItemWithoutMetadata autoplayScreenItemWithoutMetadata = autoplayWhichVideoMetadata2.screenItem;
            0qQ.A0C(autoplayScreenItemWithoutMetadata, "null cannot be cast to non-null type com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata");
            AutoplayOnScreenItemWithMetadata autoplayOnScreenItemWithMetadata = (AutoplayOnScreenItemWithMetadata) autoplayScreenItemWithoutMetadata;
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(autoplayOnScreenItemWithMetadata.x);
            sb.append(", ");
            sb.append(autoplayOnScreenItemWithMetadata.y);
            sb.append("): ");
            sb.append(autoplayWhichVideoMetadata2.media.getId());
            A0r.add(sb.toString());
        }
        00k.A0P("\t", "", "", A0r, (0sP) null);
        if (indexOf != C51966G9m.A06(combine)) {
            i = indexOf + 1;
        }
        return (AutoplayWhichVideoMetadata) combine.get(i);
    }

    public List chooseNextVideosToPause(List list) {
        0qQ.A0B(list, 0);
        return 00k.A0S(AutoplayWhichVideosSequentialToNextKt.filterLoopedVideos(list), AutoplayWhichVideos.CC.$default$chooseNextVideosToPause(this, list));
    }

    public /* synthetic */ List combine(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        return AutoplayWhichVideos.CC.$default$combine(this, list, autoplayWhichVideoMetadata);
    }

    public String toString() {
        return "SequentialToNext";
    }

    public /* synthetic */ boolean hasMinimumVisibility(float f) {
        return Pxf.A1R((f > 0.2f ? 1 : (f == 0.2f ? 0 : -1)));
    }
}
