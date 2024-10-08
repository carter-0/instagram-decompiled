package com.facebook.rsys.videosubscriptions.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22179Xwp;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class VideoSubscriptions {
    public static 2LV CONVERTER = new C22179Xwp(22);
    public static long sMcfTypeId;
    public final boolean dominantIncludeSelf;
    public final int dominantStreamQuality;
    public final Map subscriptionsMap;
    public final int videoSubscriptionsMode;

    public class Builder {
        public boolean dominantIncludeSelf;
        public int dominantStreamQuality;
        public Map subscriptionsMap;
        public int videoSubscriptionsMode;

        public VideoSubscriptions build() {
            return new VideoSubscriptions(this);
        }
    }

    public VideoSubscriptions(Map map) {
        map.getClass();
        this.videoSubscriptionsMode = 2;
        this.subscriptionsMap = map;
        this.dominantStreamQuality = 1;
        this.dominantIncludeSelf = true;
    }

    public static native VideoSubscriptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSubscriptions)) {
            return false;
        }
        VideoSubscriptions videoSubscriptions = (VideoSubscriptions) obj;
        return this.videoSubscriptionsMode == videoSubscriptions.videoSubscriptionsMode && this.subscriptionsMap.equals(videoSubscriptions.subscriptionsMap) && this.dominantStreamQuality == videoSubscriptions.dominantStreamQuality && this.dominantIncludeSelf == videoSubscriptions.dominantIncludeSelf;
    }

    public int hashCode() {
        return ((((C66583MXo.A01(this.videoSubscriptionsMode) + this.subscriptionsMap.hashCode()) * 31) + this.dominantStreamQuality) * 31) + (this.dominantIncludeSelf ? 1 : 0);
    }

    public VideoSubscriptions(Builder builder) {
        builder.subscriptionsMap.getClass();
        this.videoSubscriptionsMode = builder.videoSubscriptionsMode;
        this.subscriptionsMap = builder.subscriptionsMap;
        this.dominantStreamQuality = builder.dominantStreamQuality;
        this.dominantIncludeSelf = builder.dominantIncludeSelf;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoSubscriptions{videoSubscriptionsMode=");
        A1A.append(this.videoSubscriptionsMode);
        A1A.append(",subscriptionsMap=");
        A1A.append(this.subscriptionsMap);
        A1A.append(",dominantStreamQuality=");
        A1A.append(this.dominantStreamQuality);
        A1A.append(",dominantIncludeSelf=");
        return C66584MXp.A0b(A1A, this.dominantIncludeSelf);
    }
}
