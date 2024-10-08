package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass409;
import X.AnonymousClass7TG;
import X.C20519Wsz;
import X.C20527Wt8;
import X.C20537WtI;
import X.C255463uA;
import X.C41845B3m;
import X.C51975G9x;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class Defaults {
    public static final C255463uA[] A04 = {null, new AnonymousClass409(C20519Wsz.A00), new AnonymousClass409(C20537WtI.A00), null};
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20527Wt8.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Defaults) {
                Defaults defaults = (Defaults) obj;
                if (!0qQ.A0K(this.A00, defaults.A00) || !0qQ.A0K(this.A03, defaults.A03) || !0qQ.A0K(this.A02, defaults.A02) || !0qQ.A0K(this.A01, defaults.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Defaults(email=");
        sb.append(this.A00);
        sb.append(", shippingAddresses=");
        sb.append(this.A03);
        sb.append(", paymentMethods=");
        sb.append(this.A02);
        sb.append(", levelOfPriorConsentGiven=");
        return C51975G9x.A0i(this.A01, sb);
    }

    public Defaults(String str, String str2, List list, List list2) {
        this.A00 = str;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = str2;
    }

    public /* synthetic */ Defaults(String str, String str2, List list, List list2, int i) {
        if ((i & 1) == 0) {
            this.A00 = null;
        } else {
            this.A00 = str;
        }
        if ((i & 2) == 0) {
            this.A03 = null;
        } else {
            this.A03 = list;
        }
        if ((i & 4) == 0) {
            this.A02 = null;
        } else {
            this.A02 = list2;
        }
        if ((i & 8) == 0) {
            this.A01 = null;
        } else {
            this.A01 = str2;
        }
    }

    public Defaults() {
        this((String) null, (String) null, (List) null, (List) null);
    }
}
