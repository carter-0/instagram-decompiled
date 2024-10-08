package androidx.compose.foundation.selection;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass5WH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C267794cD;
import X.C287085Yy;
import X.C287605aT;
import X.C287625aV;
import X.C51965G9l;
import X.C51971G9r;
import X.C52884GeK;

public final class ToggleableElement extends AnonymousClass5QP {
    public final C287085Yy A00;
    public final C287605aT A01;
    public final C287625aV A02;
    public final 0sP A03;
    public final boolean A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ void A01(C267794cD r11) {
        C52884GeK geK = (C52884GeK) r11;
        boolean z = this.A05;
        C287605aT r5 = this.A01;
        C287085Yy r4 = this.A00;
        boolean z2 = this.A04;
        C287625aV r6 = this.A02;
        0sP r1 = this.A03;
        if (geK.A01 != z) {
            geK.A01 = z;
            AnonymousClass5WH.A02(geK).A0M();
        }
        geK.A00 = r1;
        geK.A0L(r4, r5, r6, (String) null, geK.A02, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ToggleableElement toggleableElement = (ToggleableElement) obj;
                if (this.A05 != toggleableElement.A05 || !0qQ.A0K(this.A01, toggleableElement.A01) || !0qQ.A0K(this.A00, toggleableElement.A00) || this.A04 != toggleableElement.A04 || !0qQ.A0K(this.A02, toggleableElement.A02) || this.A03 != toggleableElement.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        boolean z = this.A05;
        C287605aT r2 = this.A01;
        return new C52884GeK(this.A00, r2, this.A02, this.A03, z, this.A04);
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

    public ToggleableElement(C287085Yy r1, C287605aT r2, C287625aV r3, 0sP r4, boolean z, boolean z2) {
        this.A05 = z;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = z2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
