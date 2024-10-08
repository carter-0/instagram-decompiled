package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5cQ  reason: invalid class name and case insensitive filesystem */
public final class C288755cQ extends C267794cD implements C268434dO, C267814cG {
    public float A00;
    public Alignment A01;
    public C288195bW A02;
    public AnonymousClass2DO A03;
    public C288095bM A04;
    public boolean A05;

    public final boolean A0G() {
        return false;
    }

    public final /* synthetic */ void DPk() {
    }

    private final boolean A01() {
        if (!this.A05 || this.A03.A03() == 9205357640488583168L) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public final void AQM(AnonymousClass5Q4 r21) {
        float A022;
        long j;
        long A032 = this.A03.A03();
        AnonymousClass5Q4 r10 = r21;
        if (A03(A032)) {
            A022 = C288025bF.A02(A032);
        } else {
            A022 = C288025bF.A02(r10.Bwg());
        }
        if (!A02(A032)) {
            A032 = r10.Bwg();
        }
        long A002 = C288015bE.A00(A022, C288025bF.A00(A032));
        long Bwg = r10.Bwg();
        if (C288025bF.A02(Bwg) == 0.0f || C288025bF.A00(Bwg) == 0.0f) {
            j = 0;
        } else {
            long AIn = this.A04.AIn(A002, Bwg);
            j = C288015bE.A00(C288025bF.A02(A002) * C289125d3.A00(AIn), C288025bF.A00(A002) * C289125d3.A01(AIn));
        }
        long AB3 = this.A01.AB3(r10.getLayoutDirection(), C289155d7.A00(Math.round(C288025bF.A02(j)), Math.round(C288025bF.A00(j))), C289155d7.A00(Math.round(C288025bF.A02(Bwg)), Math.round(C288025bF.A00(Bwg))));
        float f = (float) ((int) (AB3 >> 32));
        float f2 = (float) ((int) (AB3 & 4294967295L));
        AnonymousClass5QF r4 = ((AnonymousClass5QC) r10.Ayw()).A01;
        r4.FHv(f, f2);
        try {
            this.A03.A01(this.A02, r10, this.A00, j);
            r4.FHv(-f, -f2);
            r10.AQW();
        } catch (Throwable th) {
            r4.FHv(-f, -f2);
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PainterModifier(painter=");
        sb.append(this.A03);
        sb.append(", sizeToIntrinsics=");
        sb.append(this.A05);
        sb.append(", alignment=");
        sb.append(this.A01);
        sb.append(", alpha=");
        sb.append(this.A00);
        sb.append(", colorFilter=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (androidx.compose.ui.unit.Constraints.A06(r9) == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long A00(long r9) {
        /*
            r8 = this;
            boolean r0 = androidx.compose.ui.unit.Constraints.A07(r9)
            r2 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = androidx.compose.ui.unit.Constraints.A06(r9)
            r1 = 1
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            boolean r0 = androidx.compose.ui.unit.Constraints.A09(r9)
            if (r0 == 0) goto L_0x00ff
            boolean r0 = androidx.compose.ui.unit.Constraints.A08(r9)
            if (r0 == 0) goto L_0x00ff
        L_0x001b:
            boolean r0 = r8.A01()
            if (r0 != 0) goto L_0x0023
            if (r1 != 0) goto L_0x00f6
        L_0x0023:
            if (r2 != 0) goto L_0x00f6
            X.2DO r0 = r8.A03
            long r2 = r0.A03()
            boolean r0 = A03(r2)
            if (r0 == 0) goto L_0x00f0
            float r0 = X.C288025bF.A02(r2)
            int r1 = java.lang.Math.round(r0)
        L_0x0039:
            boolean r0 = A02(r2)
            if (r0 == 0) goto L_0x00ea
            float r0 = X.C288025bF.A00(r2)
            int r0 = java.lang.Math.round(r0)
        L_0x0047:
            int r1 = X.AnonymousClass5SF.A03(r9, r1)
            int r0 = X.AnonymousClass5SF.A02(r9, r0)
            float r1 = (float) r1
            float r0 = (float) r0
            long r2 = X.C288015bE.A00(r1, r0)
            boolean r0 = r8.A01()
            if (r0 == 0) goto L_0x00ac
            X.2DO r0 = r8.A03
            long r0 = r0.A03()
            boolean r0 = A03(r0)
            if (r0 != 0) goto L_0x00df
            float r4 = X.C288025bF.A02(r2)
        L_0x006b:
            X.2DO r0 = r8.A03
            long r0 = r0.A03()
            boolean r0 = A02(r0)
            if (r0 != 0) goto L_0x00d4
            float r0 = X.C288025bF.A00(r2)
        L_0x007b:
            long r4 = X.C288015bE.A00(r4, r0)
            float r0 = X.C288025bF.A02(r2)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d1
            float r0 = X.C288025bF.A00(r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d1
            X.5bM r0 = r8.A04
            long r6 = r0.AIn(r4, r2)
            float r2 = X.C288025bF.A02(r4)
            float r0 = X.C289125d3.A00(r6)
            float r2 = r2 * r0
            float r1 = X.C288025bF.A00(r4)
            float r0 = X.C289125d3.A01(r6)
            float r1 = r1 * r0
            long r2 = X.C288015bE.A00(r2, r1)
        L_0x00ac:
            float r0 = X.C288025bF.A02(r2)
            int r0 = java.lang.Math.round(r0)
            int r4 = X.AnonymousClass5SF.A03(r9, r0)
            float r0 = X.C288025bF.A00(r2)
            int r0 = java.lang.Math.round(r0)
            int r2 = X.AnonymousClass5SF.A02(r9, r0)
        L_0x00c4:
            int r1 = androidx.compose.ui.unit.Constraints.A01(r9)
            int r0 = androidx.compose.ui.unit.Constraints.A00(r9)
            long r0 = androidx.compose.ui.unit.Constraints.A04(r4, r1, r2, r0)
            return r0
        L_0x00d1:
            r2 = 0
            goto L_0x00ac
        L_0x00d4:
            X.2DO r0 = r8.A03
            long r0 = r0.A03()
            float r0 = X.C288025bF.A00(r0)
            goto L_0x007b
        L_0x00df:
            X.2DO r0 = r8.A03
            long r0 = r0.A03()
            float r4 = X.C288025bF.A02(r0)
            goto L_0x006b
        L_0x00ea:
            int r0 = androidx.compose.ui.unit.Constraints.A02(r9)
            goto L_0x0047
        L_0x00f0:
            int r1 = androidx.compose.ui.unit.Constraints.A03(r9)
            goto L_0x0039
        L_0x00f6:
            int r4 = androidx.compose.ui.unit.Constraints.A01(r9)
            int r2 = androidx.compose.ui.unit.Constraints.A00(r9)
            goto L_0x00c4
        L_0x00ff:
            r2 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C288755cQ.A00(long):long");
    }

    public final int CmX(C268084cj r5, C268014cc r6, int i) {
        if (!A01()) {
            return r5.CmV(i);
        }
        long A002 = A00(AnonymousClass5SF.A04(0, i, 0, Integer.MAX_VALUE));
        return Math.max(Constraints.A02(A002), r5.CmV(i));
    }

    public final int Cma(C268084cj r5, C268014cc r6, int i) {
        if (!A01()) {
            return r5.CmY(i);
        }
        long A002 = A00(AnonymousClass5SF.A04(0, Integer.MAX_VALUE, 0, i));
        return Math.max(Constraints.A03(A002), r5.CmY(i));
    }

    public final C289145d6 Cny(C268074ci r6, C268004cb r7, long j) {
        C267974cY Cnz = r6.Cnz(A00(j));
        int i = Cnz.A01;
        int i2 = Cnz.A00;
        return r7.Cfi(0Yt.A0E(), new AnonymousClass9L6(Cnz, 42), i, i2);
    }

    public final int CoQ(C268084cj r5, C268014cc r6, int i) {
        if (!A01()) {
            return r5.CoO(i);
        }
        long A002 = A00(AnonymousClass5SF.A04(0, i, 0, Integer.MAX_VALUE));
        return Math.max(Constraints.A02(A002), r5.CoO(i));
    }

    public final int CoT(C268084cj r5, C268014cc r6, int i) {
        if (!A01()) {
            return r5.CoR(i);
        }
        long A002 = A00(AnonymousClass5SF.A04(0, Integer.MAX_VALUE, 0, i));
        return Math.max(Constraints.A03(A002), r5.CoR(i));
    }

    public static final boolean A02(long j) {
        if (j == 9205357640488583168L) {
            return false;
        }
        float A002 = C288025bF.A00(j);
        if (Float.isInfinite(A002) || Float.isNaN(A002)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(long j) {
        if (j == 9205357640488583168L) {
            return false;
        }
        float A022 = C288025bF.A02(j);
        if (Float.isInfinite(A022) || Float.isNaN(A022)) {
            return false;
        }
        return true;
    }
}
