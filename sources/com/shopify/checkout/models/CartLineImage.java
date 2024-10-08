package com.shopify.checkout.models;

import X.002;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20523Wt4;
import X.C255463uA;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class CartLineImage {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20523Wt4.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CartLineImage) {
                CartLineImage cartLineImage = (CartLineImage) obj;
                if (!0qQ.A0K(this.A03, cartLineImage.A03) || !0qQ.A0K(this.A02, cartLineImage.A02) || !0qQ.A0K(this.A01, cartLineImage.A01) || !0qQ.A0K(this.A00, cartLineImage.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A17("CartLineImage(sm=", this.A03, ", md=", this.A02, ", lg=", this.A01, ", altText=", this.A00, ')');
    }

    public /* synthetic */ CartLineImage(String str, String str2, String str3, String str4, int i) {
        if (7 != (i & 7)) {
            VJ6.A00(C20523Wt4.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        if ((i & 8) != 0) {
            this.A00 = str4;
        }
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A03))) + AnonymousClass7TG.A0E(this.A00);
    }
}
