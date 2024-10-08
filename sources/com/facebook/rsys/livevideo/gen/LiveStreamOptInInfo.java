package com.facebook.rsys.livevideo.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class LiveStreamOptInInfo {
    public static 2LV CONVERTER = C22180Xwq.A00(57);
    public static long sMcfTypeId;
    public final int audience;
    public final String hostId;
    public final int target;
    public final String targetName;

    public static native LiveStreamOptInInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveStreamOptInInfo)) {
                return false;
            }
            LiveStreamOptInInfo liveStreamOptInInfo = (LiveStreamOptInInfo) obj;
            if (this.audience != liveStreamOptInInfo.audience || this.target != liveStreamOptInInfo.target) {
                return false;
            }
            String str = this.targetName;
            String str2 = liveStreamOptInInfo.targetName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.hostId;
            String str4 = liveStreamOptInInfo.hostId;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((C66583MXo.A01(this.audience) + this.target) * 31) + AnonymousClass7TG.A0E(this.targetName)) * 31) + C41845B3m.A00(this.hostId);
    }

    public LiveStreamOptInInfo(int i, int i2, String str, String str2) {
        this.audience = i;
        this.target = i2;
        this.targetName = str;
        this.hostId = str2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LiveStreamOptInInfo{audience=");
        A1A.append(this.audience);
        A1A.append(",target=");
        A1A.append(this.target);
        A1A.append(",targetName=");
        A1A.append(this.targetName);
        A1A.append(",hostId=");
        return C66584MXp.A0a(this.hostId, A1A);
    }
}
