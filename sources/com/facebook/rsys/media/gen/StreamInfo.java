package com.facebook.rsys.media.gen;

import X.002;
import X.2LV;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class StreamInfo {
    public static 2LV CONVERTER = C22180Xwq.A00(69);
    public static long sMcfTypeId;
    public final String streamName;
    public final int streamType;

    public static native StreamInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StreamInfo)) {
                return false;
            }
            StreamInfo streamInfo = (StreamInfo) obj;
            if (this.streamType != streamInfo.streamType) {
                return false;
            }
            String str = this.streamName;
            String str2 = streamInfo.streamName;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return C66583MXo.A01(this.streamType) + AnonymousClass7TG.A0E(this.streamName);
    }

    public String toString() {
        return 002.A08(this.streamType, "StreamInfo{streamType=", ",streamName=", this.streamName, "}");
    }

    public StreamInfo(int i, String str) {
        this.streamType = i;
        this.streamName = str;
    }
}
