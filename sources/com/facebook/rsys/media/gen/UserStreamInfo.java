package com.facebook.rsys.media.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22180Xwq;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class UserStreamInfo {
    public static 2LV CONVERTER = C22180Xwq.A00(70);
    public static long sMcfTypeId;
    public final StreamInfo streamInfo;
    public final String userId;

    public static native UserStreamInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStreamInfo)) {
            return false;
        }
        UserStreamInfo userStreamInfo = (UserStreamInfo) obj;
        return this.userId.equals(userStreamInfo.userId) && this.streamInfo.equals(userStreamInfo.streamInfo);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.streamInfo, C66583MXo.A06(this.userId));
    }

    public UserStreamInfo(String str, StreamInfo streamInfo2) {
        str.getClass();
        streamInfo2.getClass();
        this.userId = str;
        this.streamInfo = streamInfo2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UserStreamInfo{userId=");
        A1A.append(this.userId);
        A1A.append(",streamInfo=");
        return C66582MXn.A0v(this.streamInfo, A1A);
    }
}
