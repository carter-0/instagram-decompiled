package com.facebook.rsys.livevideo.gen;

import X.002;
import X.2LV;
import X.C22180Xwq;
import X.C51968G9o;
import com.facebook.djinni.msys.infra.McfReference;

public class LiveVideoMetadata {
    public static 2LV CONVERTER = C22180Xwq.A00(62);
    public static long sMcfTypeId;
    public final long viewerCount;

    public static native LiveVideoMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveVideoMetadata) && this.viewerCount == ((LiveVideoMetadata) obj).viewerCount;
        }
        return true;
    }

    public int hashCode() {
        return 527 + C51968G9o.A03(this.viewerCount);
    }

    public String toString() {
        return 002.A0e("LiveVideoMetadata{viewerCount=", "}", this.viewerCount);
    }

    public LiveVideoMetadata(long j) {
        this.viewerCount = j;
    }
}
