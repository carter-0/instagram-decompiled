package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass409;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C20530WtB;
import X.C20538WtJ;
import X.C255463uA;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class Price {
    public static final C255463uA[] A06 = {null, null, null, null, null, new AnonymousClass409(C20530WtB.A00)};
    public static final Companion Companion = new Object();
    public final Money A00;
    public final Money A01;
    public final Money A02;
    public final Money A03;
    public final Boolean A04;
    public final List A05;

    public final class Companion {
        public final C255463uA serializer() {
            return C20538WtJ.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Price) {
                Price price = (Price) obj;
                if (!0qQ.A0K(this.A03, price.A03) || !0qQ.A0K(this.A01, price.A01) || !0qQ.A0K(this.A02, price.A02) || !0qQ.A0K(this.A04, price.A04) || !0qQ.A0K(this.A00, price.A00) || !0qQ.A0K(this.A05, price.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Price(total=");
        sb.append(this.A03);
        sb.append(", subtotal=");
        sb.append(this.A01);
        sb.append(", taxes=");
        sb.append(this.A02);
        sb.append(", taxesIncluded=");
        sb.append(this.A04);
        sb.append(", shipping=");
        sb.append(this.A00);
        sb.append(", discounts=");
        return AnonymousClass7TG.A0n(this.A05, sb);
    }

    public /* synthetic */ Price(Money money, Money money2, Money money3, Money money4, Boolean bool, List list, int i) {
        if ((i & 1) == 0) {
            this.A03 = null;
        } else {
            this.A03 = money;
        }
        if ((i & 2) == 0) {
            this.A01 = null;
        } else {
            this.A01 = money2;
        }
        if ((i & 4) == 0) {
            this.A02 = null;
        } else {
            this.A02 = money3;
        }
        if ((i & 8) == 0) {
            this.A04 = null;
        } else {
            this.A04 = bool;
        }
        if ((i & 16) == 0) {
            this.A00 = null;
        } else {
            this.A00 = money4;
        }
        if ((i & 32) == 0) {
            this.A05 = null;
        } else {
            this.A05 = list;
        }
    }

    public Price() {
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A00 = null;
        this.A05 = null;
    }
}
