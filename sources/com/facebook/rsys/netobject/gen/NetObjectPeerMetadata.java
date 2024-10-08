package com.facebook.rsys.netobject.gen;

import X.002;
import X.2LV;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;

public class NetObjectPeerMetadata {
    public static 2LV CONVERTER = C22181Xwr.A00(18);
    public static long sMcfTypeId;
    public final String clientVersion;

    public static native NetObjectPeerMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof NetObjectPeerMetadata)) {
                return false;
            }
            String str = this.clientVersion;
            String str2 = ((NetObjectPeerMetadata) obj).clientVersion;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return 527 + AnonymousClass7TG.A0E(this.clientVersion);
    }

    public String toString() {
        return 002.A0g("NetObjectPeerMetadata{clientVersion=", this.clientVersion, "}");
    }

    public NetObjectPeerMetadata(String str) {
        this.clientVersion = str;
    }
}
