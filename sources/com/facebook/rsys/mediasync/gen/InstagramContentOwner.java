package com.facebook.rsys.mediasync.gen;

import X.002;
import X.2LV;
import X.AnonymousClass7TF;
import X.C41845B3m;
import X.C66581MXm;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class InstagramContentOwner {
    public static 2LV CONVERTER = C71546Omh.A00(54);
    public static long sMcfTypeId;
    public final String avatarUrl;
    public final String userId;
    public final String username;

    public static native InstagramContentOwner createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstagramContentOwner)) {
            return false;
        }
        InstagramContentOwner instagramContentOwner = (InstagramContentOwner) obj;
        return this.userId.equals(instagramContentOwner.userId) && this.username.equals(instagramContentOwner.username) && this.avatarUrl.equals(instagramContentOwner.avatarUrl);
    }

    public int hashCode() {
        return C41845B3m.A01(this.avatarUrl, AnonymousClass7TF.A08(this.username, C66583MXo.A06(this.userId)));
    }

    public String toString() {
        return 002.A15("InstagramContentOwner{userId=", this.userId, ",username=", this.username, ",avatarUrl=", this.avatarUrl, "}");
    }

    public InstagramContentOwner(String str, String str2, String str3) {
        C66581MXm.A1R(str, str2, str3);
        this.userId = str;
        this.username = str2;
        this.avatarUrl = str3;
    }
}
