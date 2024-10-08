package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20522Wt2;
import X.C255463uA;
import X.VJ6;
import X.Wt3;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class CartInfo {
    public static final C255463uA[] A03 = {null, new AnonymousClass409(Wt3.A00), null};
    public static final Companion Companion = new Object();
    public final Price A00;
    public final String A01;
    public final List A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20522Wt2.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CartInfo) {
                CartInfo cartInfo = (CartInfo) obj;
                if (!0qQ.A0K(this.A01, cartInfo.A01) || !0qQ.A0K(this.A02, cartInfo.A02) || !0qQ.A0K(this.A00, cartInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CartInfo(Price price, String str, List list, int i) {
        if (7 != (i & 7)) {
            VJ6.A00(C20522Wt2.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        this.A02 = list;
        this.A00 = price;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A01)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CartInfo(token=");
        sb.append(this.A01);
        sb.append(AnonymousClass000.A00(2032));
        sb.append(this.A02);
        sb.append(", price=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
