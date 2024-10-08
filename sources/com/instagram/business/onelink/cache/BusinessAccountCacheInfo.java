package com.instagram.business.onelink.cache;

import X.002;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C20506Wsm;
import X.C255463uA;
import X.C41845B3m;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class BusinessAccountCacheInfo extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20506Wsm.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BusinessAccountCacheInfo) {
                BusinessAccountCacheInfo businessAccountCacheInfo = (BusinessAccountCacheInfo) obj;
                if (!0qQ.A0K(this.A01, businessAccountCacheInfo.A01) || !0qQ.A0K(this.A00, businessAccountCacheInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("BusinessAccountCacheInfo(businessName=", this.A01, ", businessId=", this.A00, ')');
    }

    public /* synthetic */ BusinessAccountCacheInfo(String str, String str2, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20506Wsm.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + C41845B3m.A00(this.A00);
    }

    public BusinessAccountCacheInfo(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
