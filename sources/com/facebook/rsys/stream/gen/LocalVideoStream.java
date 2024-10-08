package com.facebook.rsys.stream.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C21056XCh;
import X.C22181Xwr;
import X.C66579MXk;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

public class LocalVideoStream {
    public static 2LV CONVERTER = C22181Xwr.A00(59);
    public static long sMcfTypeId;
    public final StreamInfo streamInfo;
    public final int streamState;

    public static native LocalVideoStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalVideoStream)) {
            return false;
        }
        LocalVideoStream localVideoStream = (LocalVideoStream) obj;
        return this.streamInfo.equals(localVideoStream.streamInfo) && this.streamState == localVideoStream.streamState;
    }

    public int hashCode() {
        return C21056XCh.A01(this.streamInfo) + this.streamState;
    }

    public LocalVideoStream(StreamInfo streamInfo2, int i) {
        streamInfo2.getClass();
        this.streamInfo = streamInfo2;
        this.streamState = i;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LocalVideoStream{streamInfo=");
        A1A.append(this.streamInfo);
        A1A.append(C66579MXk.A00(456));
        return C21056XCh.A0A(A1A, this.streamState);
    }
}
