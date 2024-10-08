package androidx.compose.foundation.layout;

import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass7TE;
import X.C267794cD;
import X.C52908Gei;
import X.DbS;
import X.G9t;

public final class OffsetPxElement extends AnonymousClass5QP {
    public final 0sP A00;
    public final boolean A01;
    public final 0sP A02;

    public final boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        return offsetPxElement != null && this.A00 == offsetPxElement.A00 && this.A01 == offsetPxElement.A01;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.Gei] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        0sP r2 = this.A00;
        boolean z = this.A01;
        ? r0 = new C267794cD();
        r0.A00 = r2;
        r0.A01 = z;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        C52908Gei gei = (C52908Gei) r2;
        gei.A00 = this.A00;
        gei.A01 = this.A01;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public OffsetPxElement(0sP r1, 0sP r2, boolean z) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = r2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OffsetPxModifier(offset=");
        A1A.append(this.A00);
        A1A.append(", rtlAware=");
        return G9t.A1C(A1A, this.A01);
    }
}
