package androidx.compose.foundation;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C267794cD;
import X.C273654mx;
import X.C51975G9x;
import X.C52914Geo;
import X.C56838IEj;
import X.DbS;
import X.G9t;
import X.G9w;

public final class ScrollSemanticsElement extends AnonymousClass5QP {
    public final C56838IEj A00;
    public final boolean A01 = true;
    public final boolean A02;

    public ScrollSemanticsElement(C56838IEj iEj, boolean z) {
        this.A00 = iEj;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScrollSemanticsElement) {
                ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
                if (!(0qQ.A0K(this.A00, scrollSemanticsElement.A00) && this.A01 == scrollSemanticsElement.A01 && this.A02 == scrollSemanticsElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.Geo] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        C56838IEj iEj = this.A00;
        boolean z = this.A02;
        ? r0 = new C267794cD();
        r0.A00 = iEj;
        r0.A01 = z;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        C52914Geo geo = (C52914Geo) r2;
        geo.A00 = this.A00;
        geo.A01 = this.A02;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A01, G9w.A01(AnonymousClass7TE.A0K(this.A00)) * 31));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ScrollSemanticsElement(state=");
        A1A.append(this.A00);
        C51975G9x.A1G(A1A, C273654mx.A00(1135));
        G9w.A1X(A1A, ", flingBehavior=");
        A1A.append(", isScrollable=");
        A1A.append(this.A01);
        A1A.append(", isVertical=");
        return G9t.A1C(A1A, this.A02);
    }
}
