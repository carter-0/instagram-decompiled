package com.facebook.rsys.stream.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C21056XCh;
import X.C22181Xwr;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

public class VideoStreamParams {
    public static 2LV CONVERTER = C22181Xwr.A00(65);
    public static long sMcfTypeId;
    public final int preferredCodec;
    public final StreamCallbacks streamCallbacks;
    public final int syncGroup;
    public final StreamInfo videoStreamInfo;

    public static native VideoStreamParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoStreamParams)) {
                return false;
            }
            VideoStreamParams videoStreamParams = (VideoStreamParams) obj;
            if (!this.videoStreamInfo.equals(videoStreamParams.videoStreamInfo) || this.syncGroup != videoStreamParams.syncGroup || this.preferredCodec != videoStreamParams.preferredCodec) {
                return false;
            }
            StreamCallbacks streamCallbacks2 = this.streamCallbacks;
            StreamCallbacks streamCallbacks3 = videoStreamParams.streamCallbacks;
            if (streamCallbacks2 != null) {
                return streamCallbacks2.equals(streamCallbacks3);
            }
            if (streamCallbacks3 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((C21056XCh.A01(this.videoStreamInfo) + this.syncGroup) * 31) + this.preferredCodec) * 31) + AnonymousClass7TG.A0C(this.streamCallbacks);
    }

    public VideoStreamParams(StreamInfo streamInfo, int i, int i2, StreamCallbacks streamCallbacks2) {
        streamInfo.getClass();
        this.videoStreamInfo = streamInfo;
        this.syncGroup = i;
        this.preferredCodec = i2;
        this.streamCallbacks = streamCallbacks2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoStreamParams{videoStreamInfo=");
        A1A.append(this.videoStreamInfo);
        A1A.append(",syncGroup=");
        A1A.append(this.syncGroup);
        A1A.append(",preferredCodec=");
        A1A.append(this.preferredCodec);
        A1A.append(",streamCallbacks=");
        return C66582MXn.A0v(this.streamCallbacks, A1A);
    }
}
