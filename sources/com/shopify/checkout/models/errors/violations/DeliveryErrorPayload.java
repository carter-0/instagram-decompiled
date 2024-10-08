package com.shopify.checkout.models.errors.violations;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C20545WtQ;
import X.C20867X1t;
import X.C255463uA;
import X.VJ6;
import com.shopify.checkout.models.errors.ErrorGroup;
import kotlinx.serialization.Serializable;

@Serializable
public final class DeliveryErrorPayload implements C20867X1t {
    public static final Companion Companion = new Object();
    public final ErrorGroup A00;
    public final DeliveryErrorCode A01;
    public final ViolationErrorType A02;
    public final String A03;
    public final String A04;

    public final class Companion {
        public final C255463uA serializer() {
            return C20545WtQ.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryErrorPayload) {
                DeliveryErrorPayload deliveryErrorPayload = (DeliveryErrorPayload) obj;
                if (!(0qQ.A0K(this.A03, deliveryErrorPayload.A03) && this.A01 == deliveryErrorPayload.A01 && 0qQ.A0K(this.A04, deliveryErrorPayload.A04) && this.A00 == deliveryErrorPayload.A00 && this.A02 == deliveryErrorPayload.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ DeliveryErrorPayload(ErrorGroup errorGroup, DeliveryErrorCode deliveryErrorCode, ViolationErrorType violationErrorType, String str, String str2, int i) {
        if (27 != (i & 27)) {
            VJ6.A00(C20545WtQ.A01, i, 27);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = str;
        this.A01 = deliveryErrorCode;
        if ((i & 4) != 0) {
            this.A04 = str2;
        }
        this.A00 = errorGroup;
        this.A02 = violationErrorType;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, (AnonymousClass7TF.A07(this.A01, A0O) + AnonymousClass7TG.A0E(this.A04)) * 31));
    }

    public final String toString() {
        StringBuilder A0m = C13991Tnr.A0m();
        C13990Tnq.A1U(A0m, this.A00);
        A0m.append(this.A04);
        A0m.append("\n            Code: ");
        A0m.append(this.A01);
        return AnonymousClass7TF.A0l("\n        ", A0m);
    }
}
