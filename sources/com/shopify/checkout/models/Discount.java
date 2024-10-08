package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20530WtB;
import X.C255463uA;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class Discount {
    public static final Companion Companion = new Object();
    public final Money A00;
    public final Float A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final class Companion {
        public final C255463uA serializer() {
            return C20530WtB.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Discount) {
                Discount discount = (Discount) obj;
                if (!0qQ.A0K(this.A03, discount.A03) || !0qQ.A0K(this.A00, discount.A00) || !0qQ.A0K(this.A02, discount.A02) || !0qQ.A0K(this.A04, discount.A04) || !0qQ.A0K(this.A01, discount.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ Discount(Money money, Float f, String str, String str2, String str3, int i) {
        if (7 != (i & 7)) {
            VJ6.A00(C20530WtB.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = str;
        this.A00 = money;
        this.A02 = str2;
        if ((i & 8) != 0) {
            this.A04 = str3;
        }
        if ((i & 16) != 0) {
            this.A01 = f;
        }
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A03))) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Discount(title=");
        sb.append(this.A03);
        sb.append(AnonymousClass000.A00(1996));
        sb.append(this.A00);
        sb.append(", applicationType=");
        sb.append(this.A02);
        sb.append(", valueType=");
        sb.append(this.A04);
        sb.append(", value=");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }
}
