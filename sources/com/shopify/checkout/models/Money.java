package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass00P;
import X.C20533WtE;
import X.C255463uA;
import X.C41845B3m;
import X.C51975G9x;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class Money {
    public static final Companion Companion = new Object();
    public final float A00;
    public final String A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20533WtE.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Money) {
                Money money = (Money) obj;
                if (Float.compare(this.A00, money.A00) != 0 || !0qQ.A0K(this.A01, money.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ Money(String str, int i, float f) {
        if (3 != (i & 3)) {
            VJ6.A00(C20533WtE.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = f;
        this.A01 = str;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, Float.floatToIntBits(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Money(amount=");
        sb.append(this.A00);
        sb.append(", currencyCode=");
        return C51975G9x.A0i(this.A01, sb);
    }
}
