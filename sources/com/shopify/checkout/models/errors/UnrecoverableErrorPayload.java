package com.shopify.checkout.models.errors;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C20543WtO;
import X.C20867X1t;
import X.C255463uA;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class UnrecoverableErrorPayload implements C20867X1t {
    public static final Companion Companion = new Object();
    public final ErrorGroup A00;
    public final UnrecoverableErrorCode A01;
    public final String A02;
    public final String A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20543WtO.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnrecoverableErrorPayload) {
                UnrecoverableErrorPayload unrecoverableErrorPayload = (UnrecoverableErrorPayload) obj;
                if (!0qQ.A0K(this.A02, unrecoverableErrorPayload.A02) || this.A01 != unrecoverableErrorPayload.A01 || !0qQ.A0K(this.A03, unrecoverableErrorPayload.A03) || this.A00 != unrecoverableErrorPayload.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ UnrecoverableErrorPayload(ErrorGroup errorGroup, UnrecoverableErrorCode unrecoverableErrorCode, String str, String str2, int i) {
        if (11 != (i & 11)) {
            VJ6.A00(C20543WtO.A01, i, 11);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = str;
        this.A01 = unrecoverableErrorCode;
        if ((i & 4) != 0) {
            this.A03 = str2;
        }
        this.A00 = errorGroup;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return AnonymousClass7TE.A0N(this.A00, (AnonymousClass7TF.A07(this.A01, A0O) + AnonymousClass7TG.A0E(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder A0m = C13991Tnr.A0m();
        C13990Tnq.A1U(A0m, this.A00);
        A0m.append(this.A03);
        A0m.append("\n            Code: ");
        A0m.append(this.A01);
        A0m.append("\n            Flow Type: ");
        A0m.append(this.A02);
        return AnonymousClass7TF.A0l("\n        ", A0m);
    }
}
