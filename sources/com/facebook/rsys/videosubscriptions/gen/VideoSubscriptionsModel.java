package com.facebook.rsys.videosubscriptions.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C21056XCh;
import X.C22179Xwp;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class VideoSubscriptionsModel {
    public static 2LV CONVERTER = new C22179Xwp(23);
    public static long sMcfTypeId;
    public final Map renderSubscriptionsMap;
    public final Map streamIdToQuality;
    public final VideoSubscriptions videoSubscriptions;

    public class Builder {
        public Map renderSubscriptionsMap;
        public Map streamIdToQuality;
        public VideoSubscriptions videoSubscriptions;

        public VideoSubscriptionsModel build() {
            return new VideoSubscriptionsModel(this);
        }
    }

    public static native VideoSubscriptionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSubscriptionsModel)) {
            return false;
        }
        VideoSubscriptionsModel videoSubscriptionsModel = (VideoSubscriptionsModel) obj;
        return this.videoSubscriptions.equals(videoSubscriptionsModel.videoSubscriptions) && this.renderSubscriptionsMap.equals(videoSubscriptionsModel.renderSubscriptionsMap) && this.streamIdToQuality.equals(videoSubscriptionsModel.streamIdToQuality);
    }

    public int hashCode() {
        return ((C21056XCh.A01(this.videoSubscriptions) + this.renderSubscriptionsMap.hashCode()) * 31) + this.streamIdToQuality.hashCode();
    }

    public VideoSubscriptionsModel(Builder builder) {
        builder.videoSubscriptions.getClass();
        builder.renderSubscriptionsMap.getClass();
        builder.streamIdToQuality.getClass();
        this.videoSubscriptions = builder.videoSubscriptions;
        this.renderSubscriptionsMap = builder.renderSubscriptionsMap;
        this.streamIdToQuality = builder.streamIdToQuality;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoSubscriptionsModel{videoSubscriptions=");
        A1A.append(this.videoSubscriptions);
        A1A.append(",renderSubscriptionsMap=");
        A1A.append(this.renderSubscriptionsMap);
        A1A.append(",streamIdToQuality=");
        return C66582MXn.A0v(this.streamIdToQuality, A1A);
    }
}
