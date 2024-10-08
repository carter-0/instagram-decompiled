package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20526Wt7;
import X.C20529WtA;
import X.C255463uA;
import X.VJ6;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class CheckoutStatePayload {
    public static final C255463uA[] A04 = {null, null, null, new AnonymousClass409(C20529WtA.A00)};
    public static final Companion Companion = new Object();
    public final BuyerInfo A00;
    public final CartInfo A01;
    public final String A02;
    public final List A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20526Wt7.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutStatePayload) {
                CheckoutStatePayload checkoutStatePayload = (CheckoutStatePayload) obj;
                if (!0qQ.A0K(this.A02, checkoutStatePayload.A02) || !0qQ.A0K(this.A01, checkoutStatePayload.A01) || !0qQ.A0K(this.A00, checkoutStatePayload.A00) || !0qQ.A0K(this.A03, checkoutStatePayload.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CheckoutStatePayload(BuyerInfo buyerInfo, CartInfo cartInfo, String str, List list, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20526Wt7.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = str;
        this.A01 = cartInfo;
        if ((i & 4) != 0) {
            this.A00 = buyerInfo;
        }
        if ((i & 8) != 0) {
            this.A03 = list;
        }
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A02)) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CheckoutStatePayload(flowType=");
        sb.append(this.A02);
        sb.append(", cart=");
        sb.append(this.A01);
        sb.append(", buyer=");
        sb.append(this.A00);
        sb.append(", deliveries=");
        return AnonymousClass7TG.A0n(this.A03, sb);
    }
}
