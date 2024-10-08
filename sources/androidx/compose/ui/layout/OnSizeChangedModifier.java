package androidx.compose.ui.layout;

import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass972;
import X.C267794cD;
import X.C289155d7;
import X.C52905Gef;

public final class OnSizeChangedModifier extends AnonymousClass5QP {
    public final 0sP A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OnSizeChangedModifier) && this.A00 == ((OnSizeChangedModifier) obj).A00;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4cD, X.Gef] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        0sP r0 = this.A00;
        ? r2 = new C267794cD();
        r2.A01 = r0;
        r2.A00 = C289155d7.A00(AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK);
        return r2;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r3) {
        C52905Gef gef = (C52905Gef) r3;
        gef.A01 = this.A00;
        gef.A00 = C289155d7.A00(AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public OnSizeChangedModifier(0sP r1) {
        this.A00 = r1;
    }
}
