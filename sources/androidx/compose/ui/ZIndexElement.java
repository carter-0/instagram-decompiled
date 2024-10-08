package androidx.compose.ui;

import X.002;
import X.AnonymousClass5QP;
import X.C267794cD;
import X.C52909Gej;

public final class ZIndexElement extends AnonymousClass5QP {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ZIndexElement) && Float.compare(this.A00, ((ZIndexElement) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return 002.A0F("ZIndexElement(zIndex=", ')', this.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.Gej] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        float f = this.A00;
        ? r0 = new C267794cD();
        r0.A00 = f;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        ((C52909Gej) r2).A00 = this.A00;
    }

    public ZIndexElement(float f) {
        this.A00 = f;
    }
}
