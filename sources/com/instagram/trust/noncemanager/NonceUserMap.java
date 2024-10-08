package com.instagram.trust.noncemanager;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.C279684z5;
import X.VJ6;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class NonceUserMap extends AnonymousClass0T0 {
    public static final C255463uA[] A01;
    public static final Companion Companion = new Object();
    public final Map A00;

    public final class Companion {
        public final C255463uA serializer() {
            return C279684z5.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NonceUserMap) && 0qQ.A0K(this.A00, ((NonceUserMap) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NonceUserMap(nonceUserMap=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.trust.noncemanager.NonceUserMap$Companion, java.lang.Object] */
    static {
        C255453u9 r1 = C255453u9.A01;
        A01 = new C255463uA[]{new C258613zM(r1, r1)};
    }

    public NonceUserMap(Map map) {
        this.A00 = map;
    }

    public /* synthetic */ NonceUserMap(Map map, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C279684z5.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = map;
        }
    }
}
