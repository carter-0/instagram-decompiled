package com.instagram.trust.noncemanager;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.C279684z5;
import X.C279694z6;
import X.VJ6;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class NonceTypeMap extends AnonymousClass0T0 {
    public static final C255463uA[] A01 = {new C258613zM(C255453u9.A01, C279684z5.A00)};
    public static final Companion Companion = new Object();
    public final Map A00;

    public final class Companion {
        public final C255463uA serializer() {
            return C279694z6.A00;
        }
    }

    public NonceTypeMap(Map map) {
        0qQ.A0B(map, 1);
        this.A00 = map;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NonceTypeMap) && 0qQ.A0K(this.A00, ((NonceTypeMap) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NonceTypeMap(nonceTypeMap=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ NonceTypeMap(Map map, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C279694z6.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = map;
        }
    }
}
