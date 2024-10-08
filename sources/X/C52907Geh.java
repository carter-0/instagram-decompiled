package X;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Geh  reason: case insensitive filesystem */
public final class C52907Geh extends C267794cD implements C268434dO {
    public C56838IEj A00;
    public boolean A01;

    public final int CmX(C268084cj r2, C268014cc r3, int i) {
        if (!this.A01) {
            i = Integer.MAX_VALUE;
        }
        return r2.CmV(i);
    }

    public final int Cma(C268084cj r2, C268014cc r3, int i) {
        if (this.A01) {
            return r2.CmY(Integer.MAX_VALUE);
        }
        return r2.CmY(i);
    }

    /* JADX INFO: finally extract failed */
    public final C289145d6 Cny(C268074ci r10, C268004cb r11, long j) {
        AnonymousClass6Gj r0;
        int A002;
        int i;
        0sP r7;
        boolean z = this.A01;
        if (z) {
            r0 = AnonymousClass6Gj.Vertical;
        } else {
            r0 = AnonymousClass6Gj.Horizontal;
        }
        AnonymousClass6J2.A00(r0, j);
        if (z) {
            A002 = Integer.MAX_VALUE;
            i = Constraints.A01(j);
        } else {
            A002 = Constraints.A00(j);
            i = Integer.MAX_VALUE;
        }
        C267974cY Cnz = r10.Cnz(Constraints.A04(Constraints.A03(j), i, Constraints.A02(j), A002));
        int i2 = Cnz.A01;
        int i3 = i2;
        int A012 = Constraints.A01(j);
        if (i2 > A012) {
            i2 = A012;
        }
        int i4 = Cnz.A00;
        int i5 = i4;
        int A003 = Constraints.A00(j);
        if (i4 > A003) {
            i4 = A003;
        }
        int i6 = i5 - i4;
        int i7 = i3 - i2;
        if (!this.A01) {
            i6 = i7;
        }
        C56838IEj iEj = this.A00;
        iEj.A01.EZz(i6);
        Snapshot A02 = AnonymousClass5PH.A02();
        if (A02 != null) {
            r7 = A02.A05();
        } else {
            r7 = null;
        }
        Snapshot A03 = AnonymousClass5PH.A03(A02);
        try {
            C289495dh r1 = iEj.A03;
            if (r1.BI6() > i6) {
                r1.EZz(i6);
            }
            AnonymousClass5PH.A06(A02, A03, r7);
            C56838IEj iEj2 = this.A00;
            int i8 = i2;
            if (this.A01) {
                i8 = i4;
            }
            iEj2.A04.EZz(i8);
            return C51969G9p.A0a(r11, new J6V(i6, 0, (Object) Cnz, (Object) this), i2, i4);
        } catch (Throwable th) {
            AnonymousClass5PH.A06(A02, A03, r7);
            throw th;
        }
    }

    public final int CoQ(C268084cj r2, C268014cc r3, int i) {
        if (!this.A01) {
            i = Integer.MAX_VALUE;
        }
        return r2.CoO(i);
    }

    public final int CoT(C268084cj r2, C268014cc r3, int i) {
        if (this.A01) {
            return r2.CoR(Integer.MAX_VALUE);
        }
        return r2.CoR(i);
    }
}
