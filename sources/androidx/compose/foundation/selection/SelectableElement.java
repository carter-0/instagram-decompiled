package androidx.compose.foundation.selection;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5WH;
import X.AnonymousClass5WI;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C267794cD;
import X.C287085Yy;
import X.C287605aT;
import X.C287625aV;
import X.C51965G9l;
import X.C51971G9r;
import X.C52883GeJ;
import X.C62320sa;

public final class SelectableElement extends AnonymousClass5QP {
    public final C287085Yy A00;
    public final C287605aT A01;
    public final C287625aV A02;
    public final C62320sa A03;
    public final boolean A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ void A01(C267794cD r10) {
        C52883GeJ geJ = (C52883GeJ) r10;
        boolean z = this.A05;
        C287605aT r4 = this.A01;
        C287085Yy r3 = this.A00;
        boolean z2 = this.A04;
        C287625aV r5 = this.A02;
        C62320sa r7 = this.A03;
        if (geJ.A00 != z) {
            geJ.A00 = z;
            AnonymousClass5WH.A02(geJ).A0M();
        }
        geJ.A0L(r3, r4, r5, (String) null, r7, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                SelectableElement selectableElement = (SelectableElement) obj;
                if (this.A05 != selectableElement.A05 || !0qQ.A0K(this.A01, selectableElement.A01) || !0qQ.A0K(this.A00, selectableElement.A00) || this.A04 != selectableElement.A04 || !0qQ.A0K(this.A02, selectableElement.A02) || this.A03 != selectableElement.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.4cD, X.GeJ, X.5WI] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        boolean z = this.A05;
        C287605aT r3 = this.A01;
        ? r1 = new AnonymousClass5WI(this.A00, r3, this.A02, (String) null, this.A03, this.A04);
        r1.A00 = z;
        return r1;
    }

    public final int hashCode() {
        int A052 = C51965G9l.A05(this.A05);
        int i = 0;
        int A09 = AnonymousClass7TF.A09(this.A04, (((A052 + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A00)) * 31);
        C287625aV r1 = this.A02;
        if (r1 != null) {
            i = r1.A00;
        }
        return AnonymousClass7TE.A0N(this.A03, (A09 + i) * 31);
    }

    public SelectableElement(C287085Yy r1, C287605aT r2, C287625aV r3, C62320sa r4, boolean z, boolean z2) {
        this.A05 = z;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = z2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
