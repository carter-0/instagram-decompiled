package com.facebook.rsys.netobject.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C51968G9o;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class NetObjectSessionCreationConfig {
    public static 2LV CONVERTER = C22181Xwr.A00(21);
    public static long sMcfTypeId;
    public final long autoPublishIntervalMs;
    public final String clientVersion;
    public final boolean notifyOnLocalChanges;

    public static native NetObjectSessionCreationConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof NetObjectSessionCreationConfig)) {
                return false;
            }
            NetObjectSessionCreationConfig netObjectSessionCreationConfig = (NetObjectSessionCreationConfig) obj;
            if (this.autoPublishIntervalMs != netObjectSessionCreationConfig.autoPublishIntervalMs) {
                return false;
            }
            String str = this.clientVersion;
            String str2 = netObjectSessionCreationConfig.clientVersion;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return this.notifyOnLocalChanges == netObjectSessionCreationConfig.notifyOnLocalChanges;
        }
    }

    public int hashCode() {
        return ((C66583MXo.A01(C51968G9o.A03(this.autoPublishIntervalMs)) + AnonymousClass7TG.A0E(this.clientVersion)) * 31) + (this.notifyOnLocalChanges ? 1 : 0);
    }

    public NetObjectSessionCreationConfig(long j, String str, boolean z) {
        this.autoPublishIntervalMs = j;
        this.clientVersion = str;
        this.notifyOnLocalChanges = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NetObjectSessionCreationConfig{autoPublishIntervalMs=");
        A1A.append(this.autoPublishIntervalMs);
        A1A.append(",clientVersion=");
        A1A.append(this.clientVersion);
        A1A.append(",notifyOnLocalChanges=");
        return C66584MXp.A0b(A1A, this.notifyOnLocalChanges);
    }
}
