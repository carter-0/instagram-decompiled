package com.facebook.rsys.ended.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C21056XCh;
import X.C22180Xwq;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;

public class VideoQuality {
    public static 2LV CONVERTER = C22180Xwq.A00(45);
    public static long sMcfTypeId;
    public final VideoStats receiverVideoQuality;
    public final VideoStats senderVideoQuality;

    public static native VideoQuality createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoQuality)) {
            return false;
        }
        VideoQuality videoQuality = (VideoQuality) obj;
        return this.senderVideoQuality.equals(videoQuality.senderVideoQuality) && this.receiverVideoQuality.equals(videoQuality.receiverVideoQuality);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.receiverVideoQuality, C21056XCh.A01(this.senderVideoQuality));
    }

    public VideoQuality(VideoStats videoStats, VideoStats videoStats2) {
        videoStats.getClass();
        videoStats2.getClass();
        this.senderVideoQuality = videoStats;
        this.receiverVideoQuality = videoStats2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoQuality{senderVideoQuality=");
        A1A.append(this.senderVideoQuality);
        A1A.append(",receiverVideoQuality=");
        return C66582MXn.A0v(this.receiverVideoQuality, A1A);
    }
}
