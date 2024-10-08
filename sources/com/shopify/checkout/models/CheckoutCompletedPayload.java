package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C20524Wt5;
import X.C255463uA;
import X.C41845B3m;
import X.C51975G9x;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class CheckoutCompletedPayload {
    public static final Companion Companion = new Object();
    public final CartInfo A00;
    public final OrderDetails A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final class Companion {
        public final C255463uA serializer() {
            return C20524Wt5.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutCompletedPayload) {
                CheckoutCompletedPayload checkoutCompletedPayload = (CheckoutCompletedPayload) obj;
                if (!0qQ.A0K(this.A03, checkoutCompletedPayload.A03) || !0qQ.A0K(this.A01, checkoutCompletedPayload.A01) || !0qQ.A0K(this.A02, checkoutCompletedPayload.A02) || !0qQ.A0K(this.A04, checkoutCompletedPayload.A04) || !0qQ.A0K(this.A00, checkoutCompletedPayload.A00) || !0qQ.A0K(this.A05, checkoutCompletedPayload.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CheckoutCompletedPayload(CartInfo cartInfo, OrderDetails orderDetails, String str, String str2, String str3, String str4, int i) {
        if (63 != (i & 63)) {
            VJ6.A00(C20524Wt5.A01, i, 63);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = str;
        this.A01 = orderDetails;
        this.A02 = str2;
        this.A04 = str3;
        this.A00 = cartInfo;
        this.A05 = str4;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A05, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A03))))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CheckoutCompletedPayload(flowType=");
        sb.append(this.A03);
        sb.append(", orderDetails=");
        sb.append(this.A01);
        sb.append(", confirmationURL=");
        sb.append(this.A02);
        sb.append(", orderId=");
        sb.append(this.A04);
        sb.append(", cart=");
        sb.append(this.A00);
        sb.append(", thankYouPageUrl=");
        return C51975G9x.A0i(this.A05, sb);
    }
}
