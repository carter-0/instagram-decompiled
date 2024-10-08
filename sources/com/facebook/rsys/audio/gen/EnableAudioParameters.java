package com.facebook.rsys.audio.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class EnableAudioParameters {
    public static 2LV CONVERTER = C71546Omh.A00(9);
    public static long sMcfTypeId;
    public final boolean enable;
    public final int streamType;
    public final String userID;

    public static native EnableAudioParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EnableAudioParameters)) {
                return false;
            }
            EnableAudioParameters enableAudioParameters = (EnableAudioParameters) obj;
            String str = this.userID;
            String str2 = enableAudioParameters.userID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!(this.streamType == enableAudioParameters.streamType && this.enable == enableAudioParameters.enable)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((C66583MXo.A01(AnonymousClass7TG.A0E(this.userID)) + this.streamType) * 31) + (this.enable ? 1 : 0);
    }

    public EnableAudioParameters(String str, int i, boolean z) {
        this.userID = str;
        this.streamType = i;
        this.enable = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EnableAudioParameters{userID=");
        A1A.append(this.userID);
        A1A.append(",streamType=");
        A1A.append(this.streamType);
        A1A.append(",enable=");
        return C66584MXp.A0b(A1A, this.enable);
    }
}
