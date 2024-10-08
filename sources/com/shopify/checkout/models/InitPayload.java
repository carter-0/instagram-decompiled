package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass00P;
import X.C20531WtC;
import X.C255463uA;
import X.G9w;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class InitPayload {
    public static final Companion Companion = new Object();
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return C20531WtC.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof InitPayload) && 0qQ.A0K(this.A00, ((InitPayload) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public /* synthetic */ InitPayload(String str, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20531WtC.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = str;
        }
    }

    public final String toString() {
        return G9w.A0k("InitPayload(paymentUrl=", this.A00);
    }
}
