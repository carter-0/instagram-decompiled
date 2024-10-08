package com.shopify.checkout.models.errors;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C20542WtN;
import X.C20867X1t;
import X.C255463uA;
import X.C41845B3m;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class ParsableInternalErrorPayload implements C20867X1t {
    public static final C255463uA[] A04 = {(C255463uA) ParsableInternalErrorCode.A00.getValue(), null, null, null};
    public static final Companion Companion = new Object();
    public final ErrorGroup A00;
    public final ParsableInternalErrorCode A01;
    public final String A02;
    public final String A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20542WtN.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ParsableInternalErrorPayload) {
                ParsableInternalErrorPayload parsableInternalErrorPayload = (ParsableInternalErrorPayload) obj;
                if (this.A01 != parsableInternalErrorPayload.A01 || !0qQ.A0K(this.A03, parsableInternalErrorPayload.A03) || !0qQ.A0K(this.A02, parsableInternalErrorPayload.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public ParsableInternalErrorPayload(ParsableInternalErrorCode parsableInternalErrorCode, String str) {
        this.A01 = parsableInternalErrorCode;
        this.A03 = str;
        this.A02 = "meta_parsable_internal_error";
        this.A00 = ErrorGroup.Internal;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A02);
    }

    public final String toString() {
        StringBuilder A0m = C13991Tnr.A0m();
        C13990Tnq.A1U(A0m, this.A00);
        A0m.append(this.A02);
        A0m.append("\n            Code: ");
        A0m.append(this.A01);
        A0m.append("\n            Underlying Error: ");
        A0m.append(this.A03);
        return AnonymousClass7TF.A0l("\n        ", A0m);
    }

    public /* synthetic */ ParsableInternalErrorPayload(ErrorGroup errorGroup, ParsableInternalErrorCode parsableInternalErrorCode, String str, String str2, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20542WtN.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = parsableInternalErrorCode;
        if ((i & 2) == 0) {
            this.A03 = null;
        } else {
            this.A03 = str;
        }
        if ((i & 4) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str2;
        }
        if ((i & 8) == 0) {
            this.A00 = ErrorGroup.Internal;
        } else {
            this.A00 = errorGroup;
        }
    }
}
