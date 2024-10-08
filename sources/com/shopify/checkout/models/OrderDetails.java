package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20529WtA;
import X.C20535WtG;
import X.C20536WtH;
import X.C255463uA;
import X.VJ6;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class OrderDetails {
    public static final C255463uA[] A08 = {null, null, null, null, null, new AnonymousClass409(C20536WtH.A00), new AnonymousClass409(C20529WtA.A00), null};
    public static final Companion Companion = new Object();
    public final Address A00;
    public final Address A01;
    public final CartInfo A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public final class Companion {
        public final C255463uA serializer() {
            return C20535WtG.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OrderDetails) {
                OrderDetails orderDetails = (OrderDetails) obj;
                if (!0qQ.A0K(this.A04, orderDetails.A04) || !0qQ.A0K(this.A03, orderDetails.A03) || !0qQ.A0K(this.A05, orderDetails.A05) || !0qQ.A0K(this.A02, orderDetails.A02) || !0qQ.A0K(this.A00, orderDetails.A00) || !0qQ.A0K(this.A07, orderDetails.A07) || !0qQ.A0K(this.A06, orderDetails.A06) || !0qQ.A0K(this.A01, orderDetails.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ OrderDetails(Address address, Address address2, CartInfo cartInfo, String str, String str2, String str3, List list, List list2, int i) {
        if (41 != (i & 41)) {
            VJ6.A00(C20535WtG.A01, i, 41);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A04 = str;
        if ((i & 2) != 0) {
            this.A03 = str2;
        }
        if ((i & 4) != 0) {
            this.A05 = str3;
        }
        this.A02 = cartInfo;
        if ((i & 16) != 0) {
            this.A00 = address;
        }
        this.A07 = list;
        if ((i & 64) != 0) {
            this.A06 = list2;
        }
        if ((i & 128) != 0) {
            this.A01 = address2;
        }
    }

    public final int hashCode() {
        CartInfo cartInfo = this.A02;
        return ((AnonymousClass7TF.A07(this.A07, (AnonymousClass7TF.A07(cartInfo, (((AnonymousClass7TE.A0O(this.A04) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderDetails(id=");
        sb.append(this.A04);
        sb.append(", email=");
        sb.append(this.A03);
        sb.append(", phone=");
        sb.append(this.A05);
        sb.append(", cart=");
        sb.append(this.A02);
        sb.append(", billingAddress=");
        sb.append(this.A00);
        sb.append(", paymentMethods=");
        sb.append(this.A07);
        sb.append(", deliveries=");
        sb.append(this.A06);
        sb.append(", shippingAddress=");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }
}
