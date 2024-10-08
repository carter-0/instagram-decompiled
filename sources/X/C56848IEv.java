package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.IEv  reason: case insensitive filesystem */
public final class C56848IEv implements C289525dk, C59661JSg {
    public final long A00;
    public final C268024cd A01;
    public final /* synthetic */ C289515dj A02 = C289515dj.A00;

    public final Modifier AAz(Alignment alignment, Modifier modifier) {
        return this.A02.AAz(alignment, modifier);
    }

    public final Modifier CmS(Modifier modifier) {
        return this.A02.CmS(modifier);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56848IEv) {
                C56848IEv iEv = (C56848IEv) obj;
                if (!0qQ.A0K(this.A01, iEv.A01) || this.A00 != iEv.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + C51968G9o.A03(this.A00);
    }

    public C56848IEv(C268024cd r2, long j) {
        this.A01 = r2;
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BoxWithConstraintsScopeImpl(density=");
        A1A.append(this.A01);
        A1A.append(Pxd.A00(113));
        return AnonymousClass7TG.A0n(Constraints.A05(this.A00), A1A);
    }
}
