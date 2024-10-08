package com.shopify.checkout.models.errors;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C20541WtM;
import X.C20867X1t;
import X.C255463uA;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class DefaultsErrorPayload implements C20867X1t {
    public static final Companion Companion = new Object();
    public final DefaultsErrorCode A00;
    public final ErrorGroup A01;
    public final String A02;
    public final String A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20541WtM.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DefaultsErrorPayload) {
                DefaultsErrorPayload defaultsErrorPayload = (DefaultsErrorPayload) obj;
                if (!0qQ.A0K(this.A02, defaultsErrorPayload.A02) || this.A00 != defaultsErrorPayload.A00 || !0qQ.A0K(this.A03, defaultsErrorPayload.A03) || this.A01 != defaultsErrorPayload.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ DefaultsErrorPayload(DefaultsErrorCode defaultsErrorCode, ErrorGroup errorGroup, String str, String str2, int i) {
        if (11 != (i & 11)) {
            VJ6.A00(C20541WtM.A01, i, 11);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = str;
        this.A00 = defaultsErrorCode;
        if ((i & 4) != 0) {
            this.A03 = str2;
        }
        this.A01 = errorGroup;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return AnonymousClass7TE.A0N(this.A01, (AnonymousClass7TF.A07(this.A00, A0O) + AnonymousClass7TG.A0E(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder A0m = C13991Tnr.A0m();
        C13990Tnq.A1U(A0m, this.A01);
        A0m.append(this.A03);
        A0m.append("\n            Code: ");
        A0m.append(this.A00);
        return AnonymousClass7TF.A0l("\n        ", A0m);
    }
}
