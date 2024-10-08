package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20537WtI;
import X.C255463uA;
import X.C51974G9v;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class PaymentMethod {
    public static final Companion Companion = new Object();
    public final Address A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final class Companion {
        public final C255463uA serializer() {
            return C20537WtI.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaymentMethod) {
                PaymentMethod paymentMethod = (PaymentMethod) obj;
                if (!0qQ.A0K(this.A05, paymentMethod.A05) || !0qQ.A0K(this.A01, paymentMethod.A01) || !0qQ.A0K(this.A04, paymentMethod.A04) || !0qQ.A0K(this.A02, paymentMethod.A02) || !0qQ.A0K(this.A03, paymentMethod.A03) || !0qQ.A0K(this.A00, paymentMethod.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A05))))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentMethod(referenceId=");
        sb.append(this.A05);
        sb.append(", cardType=");
        sb.append(this.A01);
        sb.append(", lastFourDigits=");
        sb.append(this.A04);
        sb.append(", expirationMonth=");
        sb.append(this.A02);
        sb.append(", expirationYear=");
        sb.append(this.A03);
        sb.append(", billingAddress=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }

    public PaymentMethod(Address address, String str, String str2, String str3, String str4, String str5) {
        C51974G9v.A1P(str, str2, str3, str4);
        0qQ.A0B(str5, 5);
        this.A05 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A03 = str5;
        this.A00 = address;
    }

    public /* synthetic */ PaymentMethod(Address address, String str, String str2, String str3, String str4, String str5, int i) {
        if (63 != (i & 63)) {
            VJ6.A00(C20537WtI.A01, i, 63);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A05 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A03 = str5;
        this.A00 = address;
    }
}
