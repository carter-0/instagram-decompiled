package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.6GL  reason: invalid class name */
public final class AnonymousClass6GL extends C267794cD implements C268434dO, C267954cW, C267814cG {
    public int A00;
    public int A01;
    public int A02;
    public C39790A9k A03;
    public C286025Tq A04;
    public AnonymousClass5Z4 A05;
    public C286305Uu A06;
    public List A07;
    public 0sP A08;
    public 0sP A09;
    public 0sP A0A;
    public 0sP A0B;
    public boolean A0C;
    public AnonymousClass6GO A0D;
    public Map A0E;

    public final boolean Bu0() {
        return true;
    }

    public final /* synthetic */ void DPk() {
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.6GO, java.lang.Object] */
    public static final AnonymousClass6GO A00(AnonymousClass6GL r9) {
        AnonymousClass6GO r8 = r9.A0D;
        if (r8 != null) {
            return r8;
        }
        C286025Tq r7 = r9.A04;
        AnonymousClass5Z4 r6 = r9.A05;
        C286305Uu r5 = r9.A06;
        int i = r9.A02;
        boolean z = r9.A0C;
        int i2 = r9.A00;
        int i3 = r9.A01;
        List list = r9.A07;
        ? obj = new Object();
        obj.A07 = r7;
        obj.A0A = r6;
        obj.A0B = r5;
        obj.A04 = i;
        obj.A0E = z;
        obj.A02 = i2;
        obj.A03 = i3;
        obj.A0D = list;
        obj.A05 = C291675hh.A00;
        obj.A01 = -1;
        obj.A00 = -1;
        r9.A0D = obj;
        return obj;
    }

    private final AnonymousClass6GO A01(C268024cd r3) {
        AnonymousClass6GO A002;
        C39790A9k a9k = this.A03;
        if (a9k == null || !a9k.A02 || (A002 = a9k.A00) == null) {
            A002 = A00(this);
        }
        A002.A03(r3);
        return A002;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.9L6, X.0eL] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.9L6, X.0eL] */
    public final void AC5(AnonymousClass5SW r6) {
        0sP r4 = this.A0B;
        if (r4 == null) {
            r4 = new AnonymousClass9L6(this, 26);
            this.A0B = r4;
        }
        C286025Tq r0 = this.A04;
        C285635Sb r1 = AnonymousClass5SZ.A0R;
        List singletonList = Collections.singletonList(r0);
        0qQ.A07(singletonList);
        r6.ENH(r1, singletonList);
        C39790A9k a9k = this.A03;
        if (a9k != null) {
            r6.ENH(AnonymousClass5SZ.A0T, a9k.A01);
            r6.ENH(AnonymousClass5SZ.A0F, Boolean.valueOf(a9k.A02));
        }
        r6.ENH(C290125en.A0P, new C290145ep((String) null, new AnonymousClass9L6(this, 27)));
        r6.ENH(C290125en.A0Q, new C290145ep((String) null, new AnonymousClass9L6(this, 28)));
        r6.ENH(C290125en.A00, new C290145ep((String) null, new AnonymousClass9L8(this, 15)));
        r6.ENH(C290125en.A08, new C290145ep((String) null, r4));
    }

    public final void AQM(AnonymousClass5Q4 r24) {
        boolean z;
        List list;
        if (this.A08) {
            AnonymousClass5Q4 r6 = r24;
            AnonymousClass5QA r11 = ((AnonymousClass5QC) r6.Ayw()).A02.A02.A01;
            C3022462f r2 = A01(r6).A09;
            if (r2 != null) {
                C3022262d r14 = r2.A03;
                if (!r2.A0A() || this.A02 == 3) {
                    z = false;
                } else {
                    z = true;
                    long j = r2.A02;
                    AnonymousClass5VN A012 = C289285dL.A01(0, C288015bE.A00((float) ((int) (j >> 32)), (float) C289005cr.A00(j)));
                    r11.EJt();
                    r11.AHy(A012, 1);
                }
                try {
                    AnonymousClass5ZB r0 = this.A05.A02;
                    C291795ht r15 = r0.A0B;
                    if (r15 == null) {
                        r15 = C291795ht.A02;
                    }
                    C291805hu r12 = r0.A03;
                    if (r12 == null) {
                        r12 = C291805hu.A03;
                    }
                    C289645dx r13 = r0.A04;
                    if (r13 == null) {
                        r13 = C289635dw.A00;
                    }
                    AnonymousClass5ZA r3 = r0.A0C;
                    C304786Ff AiJ = r3.AiJ();
                    if (AiJ != null) {
                        C54757HRp.A00(AiJ, r11, r12, r13, r14, r15, r3.AbF());
                    } else {
                        long j2 = AnonymousClass5RW.A08;
                        if (j2 == 16) {
                            if (r3.Aoz() != 16) {
                                j2 = r3.Aoz();
                            } else {
                                j2 = AnonymousClass5RW.A01;
                            }
                        }
                        r14.A0A(r11, r12, r13, r15, j2);
                    }
                    C39790A9k a9k = this.A03;
                    if (((a9k == null || !a9k.A02) && AnonymousClass6GB.A00(this.A04)) || ((list = this.A07) != null && !list.isEmpty())) {
                        r6.AQW();
                    }
                } finally {
                    if (z) {
                        r11.EIm();
                    }
                }
            } else {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
        }
    }

    public final /* synthetic */ boolean BuF() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C289145d6 Cny(X.C268074ci r30, X.C268004cb r31, long r32) {
        /*
            r29 = this;
            r8 = r31
            r2 = r32
            r9 = r29
            X.6GO r7 = r9.A01(r8)
            X.5Q8 r4 = r8.getLayoutDirection()
            int r0 = r7.A03
            r6 = 1
            if (r0 <= r6) goto L_0x002a
            X.Hr3 r10 = r7.A06
            X.5Z4 r5 = r7.A0A
            X.4cd r1 = r7.A0C
            X.0qQ.A0A(r1)
            X.5Uu r0 = r7.A0B
            X.Hr3 r1 = X.HRA.A00(r10, r5, r0, r1, r4)
            r7.A06 = r1
            int r0 = r7.A03
            long r2 = r1.A00(r2, r0)
        L_0x002a:
            X.62f r1 = r7.A09
            if (r1 == 0) goto L_0x005d
            X.62d r10 = r1.A03
            X.62Z r0 = r10.A03
            boolean r0 = r0.BC8()
            if (r0 != 0) goto L_0x005d
            X.62Y r1 = r1.A04
            X.5Q8 r0 = r1.A07
            if (r4 != r0) goto L_0x005d
            long r0 = r1.A02
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x012c
            int r5 = androidx.compose.ui.unit.Constraints.A01(r2)
            int r0 = androidx.compose.ui.unit.Constraints.A01(r0)
            if (r5 != r0) goto L_0x005d
            int r0 = androidx.compose.ui.unit.Constraints.A00(r2)
            float r1 = (float) r0
            float r0 = r10.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x005d
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x012c
        L_0x005d:
            X.62d r1 = X.AnonymousClass6GO.A00(r7, r4, r2)
        L_0x0061:
            X.62Z r0 = r1.A03
            float r5 = r0.BP9()
            float r0 = r1.A01
            float r16 = java.lang.Math.min(r5, r0)
            X.5Tq r0 = r7.A07
            r18 = r0
            X.5Z4 r15 = r7.A0A
            java.util.List r14 = r7.A0D
            if (r14 != 0) goto L_0x0079
            X.0sn r14 = X.0sn.A00
        L_0x0079:
            int r13 = r7.A02
            boolean r12 = r7.A0E
            int r11 = r7.A04
            X.4cd r5 = r7.A0C
            X.0qQ.A0A(r5)
            X.5Uu r0 = r7.A0B
            X.62Y r10 = new X.62Y
            r26 = r2
            r28 = r12
            r25 = r11
            r23 = r14
            r24 = r13
            r21 = r5
            r22 = r4
            r19 = r15
            r20 = r0
            r17 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            int r4 = X.AnonymousClass5iI.A00(r16)
            float r0 = r1.A00
            int r0 = X.AnonymousClass5iI.A00(r0)
            long r4 = X.C289155d7.A00(r4, r0)
            long r2 = X.AnonymousClass5SF.A07(r2, r4)
            X.62f r0 = new X.62f
            r0.<init>(r1, r10, r2)
            r7.A09 = r0
        L_0x00b8:
            X.62f r3 = r7.A09
            if (r3 == 0) goto L_0x0145
            X.62d r0 = r3.A03
            X.62Z r0 = r0.A03
            r0.BC8()
            if (r6 == 0) goto L_0x00fd
            r1 = 2
            X.4cg r0 = X.AnonymousClass5WH.A04(r9, r1)
            r0.A0c()
            X.0sP r0 = r9.A0A
            if (r0 == 0) goto L_0x00d4
            r0.invoke(r3)
        L_0x00d4:
            java.util.Map r2 = r9.A0E
            if (r2 != 0) goto L_0x00dd
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
        L_0x00dd:
            X.5iZ r1 = X.C292185iX.A00
            float r0 = r3.A00
            int r0 = java.lang.Math.round(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
            X.5iZ r1 = X.C292185iX.A01
            float r0 = r3.A01
            int r0 = java.lang.Math.round(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
            r9.A0E = r2
        L_0x00fd:
            X.0sP r1 = r9.A08
            if (r1 == 0) goto L_0x0106
            java.util.List r0 = r3.A05
            r1.invoke(r0)
        L_0x0106:
            long r2 = r3.A02
            r0 = 32
            long r0 = r2 >> r0
            int r5 = (int) r0
            int r4 = X.C289005cr.A00(r2)
            long r0 = X.C288985co.A04(r5, r5, r4, r4)
            r2 = r30
            X.4cY r3 = r2.Cnz(r0)
            java.util.Map r2 = r9.A0E
            X.0qQ.A0A(r2)
            r1 = 29
            X.9L6 r0 = new X.9L6
            r0.<init>(r3, r1)
            X.5d6 r0 = r8.Cfi(r2, r0, r5, r4)
            return r0
        L_0x012c:
            X.62f r0 = r7.A09
            X.0qQ.A0A(r0)
            X.62Y r0 = r0.A04
            long r0 = r0.A02
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x013c
            r6 = 0
            goto L_0x00b8
        L_0x013c:
            X.62f r0 = r7.A09
            X.0qQ.A0A(r0)
            X.62d r1 = r0.A03
            goto L_0x0061
        L_0x0145:
            java.lang.String r1 = "You must call layoutWithConstraints first"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6GL.Cny(X.4ci, X.4cb, long):X.5d6");
    }

    public static final void A02(AnonymousClass6GL r1) {
        AnonymousClass5WH.A02(r1).A0M();
        AnonymousClass5WH.A02(r1).A0L();
        C288785cT.A00(r1);
    }

    public final int CmX(C268084cj r3, C268014cc r4, int i) {
        return A01(r4).A02(r4.getLayoutDirection(), i);
    }

    public final int Cma(C268084cj r3, C268014cc r4, int i) {
        return AnonymousClass5iI.A00(AnonymousClass6GO.A01(A01(r4), r4.getLayoutDirection()).BP9());
    }

    public final int CoQ(C268084cj r3, C268014cc r4, int i) {
        return A01(r4).A02(r4.getLayoutDirection(), i);
    }

    public final int CoT(C268084cj r3, C268014cc r4, int i) {
        return AnonymousClass5iI.A00(AnonymousClass6GO.A01(A01(r4), r4.getLayoutDirection()).BT7());
    }
}
