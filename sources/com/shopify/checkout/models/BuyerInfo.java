package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20521Wt1;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable
public final class BuyerInfo {
    public static final Companion Companion = new Object();
    public final Address A00;
    public final PaymentMethod A01;
    public final String A02;
    public final boolean A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20521Wt1.A00;
        }
    }

    public /* synthetic */ BuyerInfo(Address address, PaymentMethod paymentMethod, String str, int i, boolean z) {
        if ((i & 1) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str;
        }
        if ((i & 2) == 0) {
            this.A03 = false;
        } else {
            this.A03 = z;
        }
        if ((i & 4) == 0) {
            this.A01 = null;
        } else {
            this.A01 = paymentMethod;
        }
        if ((i & 8) == 0) {
            this.A00 = null;
        } else {
            this.A00 = address;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BuyerInfo) {
                BuyerInfo buyerInfo = (BuyerInfo) obj;
                if (!0qQ.A0K(this.A02, buyerInfo.A02) || this.A03 != buyerInfo.A03 || !0qQ.A0K(this.A01, buyerInfo.A01) || !0qQ.A0K(this.A00, buyerInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A03, AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BuyerInfo(email=");
        sb.append(this.A02);
        sb.append(", acceptsMarketing=");
        sb.append(this.A03);
        sb.append(", selectedPaymentMethod=");
        sb.append(this.A01);
        sb.append(", selectedShippingAddress=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }

    public BuyerInfo() {
        this.A02 = null;
        this.A03 = false;
        this.A01 = null;
        this.A00 = null;
    }
}
