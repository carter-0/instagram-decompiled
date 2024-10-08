package com.instagram.business.onelink.cache;

import X.002;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C20505Wsl;
import X.C255463uA;
import X.C41845B3m;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class AdAccountCacheInfo extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20505Wsl.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdAccountCacheInfo) {
                AdAccountCacheInfo adAccountCacheInfo = (AdAccountCacheInfo) obj;
                if (!0qQ.A0K(this.A01, adAccountCacheInfo.A01) || !0qQ.A0K(this.A00, adAccountCacheInfo.A00) || !0qQ.A0K(this.A02, adAccountCacheInfo.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A14("AdAccountCacheInfo(accountName=", this.A01, ", accountId=", this.A00, ", legacyAccountId=", this.A02, ')');
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }

    public AdAccountCacheInfo(String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public /* synthetic */ AdAccountCacheInfo(String str, String str2, String str3, int i) {
        if (7 != (i & 7)) {
            VJ6.A00(C20505Wsl.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }
}
