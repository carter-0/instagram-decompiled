package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C20529WtA;
import X.C255463uA;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class DeliveryInfo {
    public static final Companion Companion = new Object();
    public final DeliveryDetails A00;
    public final DeliveryMethod A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20529WtA.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryInfo) {
                DeliveryInfo deliveryInfo = (DeliveryInfo) obj;
                if (this.A01 != deliveryInfo.A01 || !0qQ.A0K(this.A00, deliveryInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ DeliveryInfo(DeliveryDetails deliveryDetails, DeliveryMethod deliveryMethod, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20529WtA.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = deliveryMethod;
        this.A00 = deliveryDetails;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeliveryInfo(method=");
        sb.append(this.A01);
        sb.append(", details=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
