package com.instagram.autoplay.models;

import X.00k;
import X.0qQ;
import X.AnonymousClass7TF;
import X.C51966G9m;
import X.Pxf;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AutoplayWhichVideosFocused implements AutoplayWhichVideos {
    public static final Companion Companion = new Object();
    public static final float FOCUSED_MINIMUM_VISIBILITY = 0.9f;

    public AutoplayWhichVideoMetadata chooseNextVideoToPlay(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        Object obj;
        0qQ.A0B(list, 0);
        List combine = combine(list, autoplayWhichVideoMetadata);
        0qQ.A0B(combine, 0);
        int indexOf = combine.indexOf(autoplayWhichVideoMetadata);
        if (indexOf == -1) {
            obj = combine.get(C51966G9m.A06(combine) / 2);
        } else if (indexOf != 0) {
            obj = 00k.A0I(combine);
        } else {
            obj = 00k.A0K(combine);
        }
        return (AutoplayWhichVideoMetadata) obj;
    }

    public List chooseNextVideosToPause(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        for (Object next : list) {
            AutoplayOnScreenItemWithMetadata onScreenMetadata = ((AutoplayWhichVideoMetadata) next).getOnScreenMetadata();
            if (onScreenMetadata != null && onScreenMetadata.percentageVisible <= 0.9f) {
                A0q.add(next);
            }
        }
        return A0q;
    }

    public /* synthetic */ List combine(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        return AutoplayWhichVideos.CC.$default$combine(this, list, autoplayWhichVideoMetadata);
    }

    public String toString() {
        return "Focused";
    }

    public boolean hasMinimumVisibility(float f) {
        return Pxf.A1R((f > 0.9f ? 1 : (f == 0.9f ? 0 : -1)));
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
