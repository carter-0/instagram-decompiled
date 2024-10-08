package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.5hf  reason: invalid class name and case insensitive filesystem */
public final class C291655hf extends C267794cD implements C268434dO, C267954cW, C267814cG {
    public int A00;
    public int A01;
    public int A02;
    public C39791A9l A03;
    public AnonymousClass5Z4 A04;
    public C286305Uu A05;
    public String A06;
    public 0sP A07;
    public boolean A08;
    public C291665hg A09;
    public Map A0A;

    public final /* synthetic */ void DPk() {
    }

    public static final C291665hg A00(C291655hf r8) {
        C291665hg r0 = r8.A09;
        if (r0 != null) {
            return r0;
        }
        String str = r8.A06;
        C291665hg r02 = new C291665hg(r8.A04, r8.A05, str, r8.A02, r8.A00, r8.A01, r8.A08);
        r8.A09 = r02;
        return r02;
    }

    private final C291665hg A01(C268024cd r3) {
        C291665hg A002;
        C39791A9l a9l = this.A03;
        if (a9l == null || !a9l.A02 || (A002 = a9l.A00) == null) {
            A002 = A00(this);
        }
        A002.A04(r3);
        return A002;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.9L6, X.0eL] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.9L6, X.0eL] */
    public final void AC5(AnonymousClass5SW r7) {
        0sP r4 = this.A07;
        if (r4 == null) {
            r4 = new AnonymousClass9L6(this, 30);
            this.A07 = r4;
        }
        String str = this.A06;
        0sn r5 = 0sn.A00;
        C286025Tq r0 = new C286025Tq(r5, r5, str);
        C285635Sb r1 = AnonymousClass5SZ.A0R;
        List singletonList = Collections.singletonList(r0);
        0qQ.A07(singletonList);
        r7.ENH(r1, singletonList);
        C39791A9l a9l = this.A03;
        if (a9l != null) {
            r7.ENH(AnonymousClass5SZ.A0F, Boolean.valueOf(a9l.A02));
            r7.ENH(AnonymousClass5SZ.A0T, new C286025Tq(r5, r5, a9l.A01));
        }
        r7.ENH(C290125en.A0P, new C290145ep((String) null, new AnonymousClass9L6(this, 31)));
        r7.ENH(C290125en.A0Q, new C290145ep((String) null, new AnonymousClass9L6(this, 32)));
        r7.ENH(C290125en.A00, new C290145ep((String) null, new AnonymousClass9L8(this, 16)));
        r7.ENH(C290125en.A08, new C290145ep((String) null, r4));
    }

    public final void AQM(AnonymousClass5Q4 r17) {
        if (this.A08) {
            AnonymousClass5Q4 r0 = r17;
            C291665hg A012 = A01(r0);
            C292055iK r8 = A012.A06;
            if (r8 != null) {
                AnonymousClass5QA r10 = ((AnonymousClass5QC) r0.Ayw()).A02.A02.A01;
                boolean z = A012.A0D;
                if (z) {
                    long j = A012.A03;
                    r10.EJt();
                    r10.AHx(1, 0.0f, 0.0f, (float) ((int) (j >> 32)), (float) C289005cr.A00(j));
                }
                try {
                    AnonymousClass5ZB r02 = this.A04.A02;
                    C291795ht r13 = r02.A0B;
                    if (r13 == null) {
                        r13 = C291795ht.A02;
                    }
                    C291805hu r11 = r02.A03;
                    if (r11 == null) {
                        r11 = C291805hu.A03;
                    }
                    C289645dx r12 = r02.A04;
                    if (r12 == null) {
                        r12 = C289635dw.A00;
                    }
                    AnonymousClass5ZA r7 = r02.A0C;
                    C304786Ff AiJ = r7.AiJ();
                    if (AiJ != null) {
                        r8.E1c(AiJ, r10, r11, r12, r13, r7.AbF(), 3);
                    } else {
                        long j2 = AnonymousClass5RW.A08;
                        if (j2 == 16) {
                            if (r7.Aoz() != 16) {
                                j2 = r7.Aoz();
                            } else {
                                j2 = AnonymousClass5RW.A01;
                            }
                        }
                        C292045iJ r82 = (C292045iJ) r8;
                        C291855hz r4 = r82.A02.A05;
                        int i = r4.A00;
                        r4.A02(j2);
                        r4.A04(r11);
                        r4.A06(r13);
                        r4.A05(r12);
                        r4.A01(3);
                        C292045iJ.A00(r10, r82);
                        r4.A01(i);
                    }
                } finally {
                    if (z) {
                        r10.EIm();
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("no paragraph (layoutCache=");
                sb.append(this.A09);
                sb.append(", textSubstitution=");
                sb.append(this.A03);
                sb.append(')');
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public final /* synthetic */ boolean Bu0() {
        return false;
    }

    public final /* synthetic */ boolean BuF() {
        return false;
    }

    public static final void A02(C291655hf r1) {
        AnonymousClass5WH.A02(r1).A0M();
        AnonymousClass5WH.A02(r1).A0L();
        C288785cT.A00(r1);
    }

    public final int CmX(C268084cj r3, C268014cc r4, int i) {
        return A01(r4).A03(r4.getLayoutDirection(), i);
    }

    public final int Cma(C268084cj r3, C268014cc r4, int i) {
        return AnonymousClass5iI.A00(C291665hg.A01(A01(r4), r4.getLayoutDirection()).BP9());
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C289145d6 Cny(X.C268074ci r10, X.C268004cb r11, long r12) {
        /*
            r9 = this;
            X.5hg r4 = r9.A01(r11)
            X.5Q8 r2 = r11.getLayoutDirection()
            int r0 = r4.A01
            r5 = 1
            if (r0 <= r5) goto L_0x0024
            X.Hr3 r6 = r4.A05
            X.5Z4 r3 = r4.A08
            X.4cd r1 = r4.A0A
            X.0qQ.A0A(r1)
            X.5Uu r0 = r4.A09
            X.Hr3 r1 = X.HRA.A00(r6, r3, r0, r1, r2)
            r4.A05 = r1
            int r0 = r4.A01
            long r12 = r1.A00(r12, r0)
        L_0x0024:
            X.5iK r3 = r4.A06
            if (r3 == 0) goto L_0x005b
            X.5hy r0 = r4.A07
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.BC8()
            if (r0 != 0) goto L_0x005b
            X.5Q8 r0 = r4.A0B
            if (r2 != r0) goto L_0x005b
            long r0 = r4.A04
            int r6 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x0111
            int r6 = androidx.compose.ui.unit.Constraints.A01(r12)
            int r0 = androidx.compose.ui.unit.Constraints.A01(r0)
            if (r6 != r0) goto L_0x005b
            int r0 = androidx.compose.ui.unit.Constraints.A00(r12)
            float r1 = (float) r0
            float r0 = r3.BCs()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x005b
            X.5iJ r3 = (X.C292045iJ) r3
            X.5iM r0 = r3.A01
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0111
        L_0x005b:
            r5 = 0
            X.5iJ r6 = X.C291665hg.A00(r4, r2, r12)
            r4.A04 = r12
            long r0 = r6.A00
            int r0 = androidx.compose.ui.unit.Constraints.A01(r0)
            float r7 = (float) r0
            int r1 = X.AnonymousClass5iI.A00(r7)
            float r0 = r6.BCs()
            int r0 = X.AnonymousClass5iI.A00(r0)
            long r0 = X.C289155d7.A00(r1, r0)
            long r2 = X.AnonymousClass5SF.A07(r12, r0)
            r4.A03 = r2
            int r1 = r4.A02
            r0 = 3
            if (r1 == r0) goto L_0x009c
            r0 = 32
            long r0 = r2 >> r0
            int r8 = (int) r0
            float r0 = (float) r8
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x009b
            int r0 = X.C289005cr.A00(r2)
            float r1 = (float) r0
            float r0 = r6.BCs()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
        L_0x009b:
            r5 = 1
        L_0x009c:
            r4.A0D = r5
            r4.A06 = r6
            r1 = 1
        L_0x00a1:
            X.5hy r0 = r4.A07
            if (r0 == 0) goto L_0x00a8
            r0.BC8()
        L_0x00a8:
            X.5iK r6 = r4.A06
            X.0qQ.A0A(r6)
            long r2 = r4.A03
            if (r1 == 0) goto L_0x00ef
            r1 = 2
            X.4cg r0 = X.AnonymousClass5WH.A04(r9, r1)
            r0.A0c()
            java.util.Map r5 = r9.A0A
            if (r5 != 0) goto L_0x00c2
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
        L_0x00c2:
            X.5iZ r1 = X.C292185iX.A00
            X.5iJ r6 = (X.C292045iJ) r6
            r0 = 0
            X.5iM r4 = r6.A01
            float r0 = r4.A00(r0)
            int r0 = java.lang.Math.round(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.put(r1, r0)
            X.5iZ r1 = X.C292185iX.A01
            int r0 = r4.A06
            int r0 = r0 + -1
            float r0 = r4.A00(r0)
            int r0 = java.lang.Math.round(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.put(r1, r0)
            r9.A0A = r5
        L_0x00ef:
            r0 = 32
            long r0 = r2 >> r0
            int r5 = (int) r0
            int r4 = X.C289005cr.A00(r2)
            long r0 = X.C288985co.A04(r5, r5, r4, r4)
            X.4cY r3 = r10.Cnz(r0)
            java.util.Map r2 = r9.A0A
            X.0qQ.A0A(r2)
            r1 = 33
            X.9L6 r0 = new X.9L6
            r0.<init>(r3, r1)
            X.5d6 r0 = r11.Cfi(r2, r0, r5, r4)
            return r0
        L_0x0111:
            long r0 = r4.A04
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0168
            X.5iK r6 = r4.A06
            X.0qQ.A0A(r6)
            r1 = r6
            X.5iJ r1 = (X.C292045iJ) r1
            X.5hx r0 = r1.A02
            X.5iA r0 = r0.A03
            float r2 = r0.A00()
            long r0 = r1.A00
            int r0 = androidx.compose.ui.unit.Constraints.A01(r0)
            float r7 = (float) r0
            float r0 = java.lang.Math.min(r2, r7)
            int r1 = X.AnonymousClass5iI.A00(r0)
            float r0 = r6.BCs()
            int r0 = X.AnonymousClass5iI.A00(r0)
            long r0 = X.C289155d7.A00(r1, r0)
            long r2 = X.AnonymousClass5SF.A07(r12, r0)
            r4.A03 = r2
            int r1 = r4.A02
            r0 = 3
            if (r1 == r0) goto L_0x016b
            r0 = 32
            long r0 = r2 >> r0
            int r8 = (int) r0
            float r0 = (float) r8
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0164
            int r0 = X.C289005cr.A00(r2)
            float r1 = (float) r0
            float r0 = r6.BCs()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x016b
        L_0x0164:
            r4.A0D = r5
            r4.A04 = r12
        L_0x0168:
            r1 = 0
            goto L_0x00a1
        L_0x016b:
            r5 = 0
            goto L_0x0164
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291655hf.Cny(X.4ci, X.4cb, long):X.5d6");
    }

    public final int CoQ(C268084cj r3, C268014cc r4, int i) {
        return A01(r4).A03(r4.getLayoutDirection(), i);
    }

    public final int CoT(C268084cj r3, C268014cc r4, int i) {
        return AnonymousClass5iI.A00(C291665hg.A01(A01(r4), r4.getLayoutDirection()).BT7());
    }
}
