package com.shopify.checkout.models.errors;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C20540WtL;
import X.C20867X1t;
import X.C255463uA;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class CheckoutErrorPayload implements C20867X1t {
    public static final Companion Companion = new Object();
    public final CheckoutErrorType A00;
    public final ErrorGroup A01;
    public final String A02;
    public final String A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20540WtL.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutErrorPayload) {
                CheckoutErrorPayload checkoutErrorPayload = (CheckoutErrorPayload) obj;
                if (!0qQ.A0K(this.A02, checkoutErrorPayload.A02) || this.A00 != checkoutErrorPayload.A00 || !0qQ.A0K(this.A03, checkoutErrorPayload.A03) || this.A01 != checkoutErrorPayload.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CheckoutErrorPayload(CheckoutErrorType checkoutErrorType, ErrorGroup errorGroup, String str, String str2, int i) {
        if (15 != (i & 15)) {
            VJ6.A00(C20540WtL.A01, i, 15);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = str;
        this.A00 = checkoutErrorType;
        this.A03 = str2;
        this.A01 = errorGroup;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return AnonymousClass7TE.A0N(this.A01, (AnonymousClass7TF.A07(this.A00, A0O) + AnonymousClass7TG.A0E(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder A0m = C13991Tnr.A0m();
        A0m.append(this.A01);
        A0m.append("\n            Type: ");
        C13990Tnq.A1U(A0m, this.A00);
        A0m.append(this.A03);
        return AnonymousClass7TF.A0l("\n        ", A0m);
    }
}
