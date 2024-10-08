package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C20528Wt9;
import X.C255463uA;
import X.C41845B3m;
import X.C51975G9x;
import X.Pxd;
import kotlinx.serialization.Serializable;

@Serializable
public final class DeliveryDetails {
    public static final Companion Companion = new Object();
    public final Address A00;
    public final String A01;
    public final String A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20528Wt9.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryDetails) {
                DeliveryDetails deliveryDetails = (DeliveryDetails) obj;
                if (!0qQ.A0K(this.A02, deliveryDetails.A02) || !0qQ.A0K(this.A00, deliveryDetails.A00) || !0qQ.A0K(this.A01, deliveryDetails.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeliveryDetails(name=");
        sb.append(this.A02);
        sb.append(", location=");
        sb.append(this.A00);
        sb.append(Pxd.A00(307));
        return C51975G9x.A0i(this.A01, sb);
    }

    public /* synthetic */ DeliveryDetails(Address address, String str, String str2, int i) {
        if ((i & 1) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str;
        }
        if ((i & 2) == 0) {
            this.A00 = null;
        } else {
            this.A00 = address;
        }
        if ((i & 4) == 0) {
            this.A01 = null;
        } else {
            this.A01 = str2;
        }
    }

    public DeliveryDetails() {
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
    }
}
