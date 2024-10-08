package androidx.compose.foundation.relocation;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5WR;
import X.C267794cD;
import X.MRL;

public final class BringIntoViewRequesterElement extends AnonymousClass5QP {
    public final MRL A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.5WR] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        MRL mrl = this.A00;
        ? r0 = new C267794cD();
        r0.A00 = mrl;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        ((AnonymousClass5WR) r2).A0H(this.A00);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BringIntoViewRequesterElement) || !0qQ.A0K(this.A00, ((BringIntoViewRequesterElement) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public BringIntoViewRequesterElement(MRL mrl) {
        this.A00 = mrl;
    }
}
