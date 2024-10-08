package com.facebook.rsys.videorender.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C22179Xwp;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

public class VideoRenderItem {
    public static 2LV CONVERTER = new C22179Xwp(20);
    public static long sMcfTypeId;
    public final int preferredQuality;
    public final StreamInfo streamInfo;
    public final String userId;
    public final VideoRenderFrameCallback videoFrameCallback;

    public class Builder {
        public int preferredQuality;
        public StreamInfo streamInfo;
        public String userId;
        public VideoRenderFrameCallback videoFrameCallback;

        public VideoRenderItem build() {
            return new VideoRenderItem(this);
        }
    }

    public static native VideoRenderItem createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoRenderItem)) {
            return false;
        }
        VideoRenderItem videoRenderItem = (VideoRenderItem) obj;
        return this.userId.equals(videoRenderItem.userId) && this.streamInfo.equals(videoRenderItem.streamInfo) && this.preferredQuality == videoRenderItem.preferredQuality && this.videoFrameCallback.equals(videoRenderItem.videoFrameCallback);
    }

    public int hashCode() {
        int A06 = C66583MXo.A06(this.userId);
        return AnonymousClass7TE.A0N(this.videoFrameCallback, (AnonymousClass7TF.A07(this.streamInfo, A06) + this.preferredQuality) * 31);
    }

    public VideoRenderItem(Builder builder) {
        builder.userId.getClass();
        builder.streamInfo.getClass();
        builder.videoFrameCallback.getClass();
        this.userId = builder.userId;
        this.streamInfo = builder.streamInfo;
        this.preferredQuality = builder.preferredQuality;
        this.videoFrameCallback = builder.videoFrameCallback;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoRenderItem{userId=");
        A1A.append(this.userId);
        A1A.append(",streamInfo=");
        A1A.append(this.streamInfo);
        A1A.append(",preferredQuality=");
        A1A.append(this.preferredQuality);
        A1A.append(",videoFrameCallback=");
        return C66582MXn.A0v(this.videoFrameCallback, A1A);
    }
}
