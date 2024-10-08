package com.facebook.rsys.video.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C66583MXo;
import X.C66584MXp;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.video.VideoSource;

public class VideoStream {
    public static 2LV CONVERTER = new C71545Omg(12);
    public static long sMcfTypeId;
    public final boolean isFrozen;
    public final boolean isSuppressedByUser;
    public final String streamId;
    public final StreamInfo streamInfo;
    public final int streamState;
    public final VideoSource videoSource;

    public static native VideoStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoStream)) {
                return false;
            }
            VideoStream videoStream = (VideoStream) obj;
            if (!this.videoSource.equals(videoStream.videoSource) || this.isFrozen != videoStream.isFrozen || !this.streamInfo.equals(videoStream.streamInfo)) {
                return false;
            }
            String str = this.streamId;
            String str2 = videoStream.streamId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!(this.streamState == videoStream.streamState && this.isSuppressedByUser == videoStream.isSuppressedByUser)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass7TF.A07(this.streamInfo, (C66583MXo.A01(this.videoSource.hashCode()) + (this.isFrozen ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.streamId)) * 31) + this.streamState) * 31) + (this.isSuppressedByUser ? 1 : 0);
    }

    public VideoStream(VideoSource videoSource2, boolean z, StreamInfo streamInfo2, String str, int i, boolean z2) {
        videoSource2.getClass();
        streamInfo2.getClass();
        this.videoSource = videoSource2;
        this.isFrozen = z;
        this.streamInfo = streamInfo2;
        this.streamId = str;
        this.streamState = i;
        this.isSuppressedByUser = z2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoStream{videoSource=");
        A1A.append(this.videoSource);
        A1A.append(",isFrozen=");
        A1A.append(this.isFrozen);
        A1A.append(",streamInfo=");
        A1A.append(this.streamInfo);
        A1A.append(",streamId=");
        A1A.append(this.streamId);
        A1A.append(",streamState=");
        A1A.append(this.streamState);
        A1A.append(",isSuppressedByUser=");
        return C66584MXp.A0b(A1A, this.isSuppressedByUser);
    }
}
