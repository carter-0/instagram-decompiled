package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C20520Wt0;
import X.C255463uA;
import X.C41845B3m;
import X.C51975G9x;
import X.Pxd;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class Authentication {
    public static final Companion Companion = new Object();
    public final AuthenticationVersion A00;
    public final String A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20520Wt0.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Authentication) {
                Authentication authentication = (Authentication) obj;
                if (this.A00 != authentication.A00 || !0qQ.A0K(this.A01, authentication.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ Authentication(AuthenticationVersion authenticationVersion, String str, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20520Wt0.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = authenticationVersion;
        this.A01 = str;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Authentication(version=");
        sb.append(this.A00);
        sb.append(Pxd.A00(26));
        return C51975G9x.A0i(this.A01, sb);
    }

    public Authentication(AuthenticationVersion authenticationVersion, String str) {
        0qQ.A0B(str, 2);
        this.A00 = authenticationVersion;
        this.A01 = str;
    }
}
