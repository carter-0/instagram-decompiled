package X;

import androidx.compose.runtime.ParcelableSnapshotMutableLongState;

/* renamed from: X.I4f  reason: case insensitive filesystem */
public final class C56606I4f {
    public long A00;
    public final C56606I4f A01;
    public final C55425HhV A02;
    public final AnonymousClass6G2 A03 = new ParcelableSnapshotMutableLongState(0);
    public final AnonymousClass6G2 A04 = new ParcelableSnapshotMutableLongState(Long.MIN_VALUE);
    public final C284945Oz A05;
    public final C284945Oz A06 = C51969G9p.A0S(new IET(((C52882GeI) this.A02).A00.getValue(), ((C52882GeI) this.A02).A00.getValue()));
    public final C284945Oz A07;
    public final C284945Oz A08;
    public final AnonymousClass6HD A09;
    public final AnonymousClass6HD A0A;
    public final String A0B;
    public final C270284gU A0C;

    public static final long A00(C56606I4f i4f) {
        AnonymousClass6HD r7 = i4f.A09;
        int size = r7.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((C56868IFp) r7.get(i)).A04.BOX());
        }
        AnonymousClass6HD r5 = i4f.A0A;
        int size2 = r5.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, A00((C56606I4f) r5.get(i2)));
        }
        return j;
    }

    private final void A01() {
        AnonymousClass6HD r5 = this.A09;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            ((C56868IFp) r5.get(i)).A03.EWt(-2.0f);
        }
        AnonymousClass6HD r2 = this.A0A;
        int size2 = r2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C56606I4f) r2.get(i2)).A01();
        }
    }

    public final long A02() {
        C56606I4f i4f = this.A01;
        if (i4f != null) {
            return i4f.A02();
        }
        return this.A03.BOX();
    }

    public final JQ8 A03() {
        return (JQ8) this.A06.getValue();
    }

    public final Object A04() {
        return ((C52882GeI) this.A02).A00.getValue();
    }

    public final void A05() {
        this.A04.Ecf(Long.MIN_VALUE);
        C55425HhV hhV = this.A02;
        if (hhV instanceof C52882GeI) {
            ((C52882GeI) hhV).A00.Epw(this.A07.getValue());
        }
        if (this.A01 == null) {
            this.A03.Ecf(0);
        }
        C51967G9n.A16(hhV.A00, false);
        AnonymousClass6HD r2 = this.A0A;
        int size = r2.size();
        for (int i = 0; i < size; i++) {
            ((C56606I4f) r2.get(i)).A05();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
        if (X.C51971G9r.A1W(r1) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(long r11, boolean r13) {
        /*
            r10 = this;
            X.6G2 r6 = r10.A04
            long r3 = r6.BOX()
            r5 = 1
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            r6.Ecf(r11)
            X.HhV r0 = r10.A02
            X.5Oz r1 = r0.A00
        L_0x0014:
            X.C51967G9n.A16(r1, r5)
        L_0x0017:
            r1 = 0
            X.5Oz r0 = r10.A08
            X.C51967G9n.A16(r0, r1)
            X.6HD r6 = r10.A09
            int r4 = r6.size()
            r3 = 0
        L_0x0024:
            if (r3 >= r4) goto L_0x0089
            java.lang.Object r7 = r6.get(r3)
            X.IFp r7 = (X.C56868IFp) r7
            X.5Oz r0 = r7.A07
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 != 0) goto L_0x0072
            r0 = r11
            if (r13 == 0) goto L_0x0043
            X.5Oz r0 = r7.A05
            java.lang.Object r0 = r0.getValue()
            X.64f r0 = (X.C3025864f) r0
            long r0 = r0.AzP()
        L_0x0043:
            X.5Oz r9 = r7.A05
            java.lang.Object r2 = r9.getValue()
            X.64f r2 = (X.C3025864f) r2
            java.lang.Object r8 = r2.CDQ(r0)
            X.5Oz r2 = r7.A09
            r2.Epw(r8)
            java.lang.Object r2 = r9.getValue()
            X.64f r2 = (X.C3025864f) r2
            X.5af r2 = r2.CDf(r0)
            r7.A00 = r2
            java.lang.Object r2 = r9.getValue()
            X.64f r2 = (X.C3025864f) r2
            boolean r0 = r2.CTe(r0)
            if (r0 == 0) goto L_0x0072
            r1 = 1
            X.5Oz r0 = r7.A07
            X.C51967G9n.A16(r0, r1)
        L_0x0072:
            X.5Oz r0 = r7.A07
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 != 0) goto L_0x007b
            r5 = 0
        L_0x007b:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x007e:
            X.HhV r0 = r10.A02
            X.5Oz r1 = r0.A00
            boolean r0 = X.C51971G9r.A1W(r1)
            if (r0 != 0) goto L_0x0017
            goto L_0x0014
        L_0x0089:
            X.6HD r4 = r10.A0A
            int r3 = r4.size()
            r2 = 0
        L_0x0090:
            if (r2 >= r3) goto L_0x00c3
            java.lang.Object r6 = r4.get(r2)
            X.I4f r6 = (X.C56606I4f) r6
            X.5Oz r0 = r6.A07
            java.lang.Object r1 = r0.getValue()
            X.HhV r0 = r6.A02
            X.GeI r0 = (X.C52882GeI) r0
            X.5Oz r0 = r0.A00
            boolean r0 = X.C51969G9p.A1U(r0, r1)
            if (r0 != 0) goto L_0x00ad
            r6.A06(r11, r13)
        L_0x00ad:
            X.5Oz r0 = r6.A07
            java.lang.Object r1 = r0.getValue()
            X.HhV r0 = r6.A02
            X.GeI r0 = (X.C52882GeI) r0
            X.5Oz r0 = r0.A00
            boolean r0 = X.C51969G9p.A1U(r0, r1)
            if (r0 != 0) goto L_0x00c0
            r5 = 0
        L_0x00c0:
            int r2 = r2 + 1
            goto L_0x0090
        L_0x00c3:
            if (r5 == 0) goto L_0x00c8
            r10.A05()
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56606I4f.A06(long, boolean):void");
    }

    public final void A08(Object obj) {
        C284945Oz r2 = this.A07;
        if (!C51969G9p.A1T(r2, obj)) {
            this.A06.Epw(new IET(r2.getValue(), obj));
            C284945Oz r1 = ((C52882GeI) this.A02).A00;
            if (!C51969G9p.A1U(r2, r1.getValue())) {
                r1.Epw(r2.getValue());
            }
            r2.Epw(obj);
            if (this.A04.BOX() == Long.MIN_VALUE) {
                C51967G9n.A16(this.A08, true);
            }
            A01();
        }
    }

    public final void A09(Object obj, long j, Object obj2) {
        this.A04.Ecf(Long.MIN_VALUE);
        C55425HhV hhV = this.A02;
        C51967G9n.A16(hhV.A00, false);
        C284945Oz r2 = this.A05;
        if (!C51971G9r.A1W(r2) || !C51969G9p.A1T(((C52882GeI) hhV).A00, obj) || !C51969G9p.A1T(this.A07, obj2)) {
            C284945Oz r1 = ((C52882GeI) hhV).A00;
            if (!C51969G9p.A1T(r1, obj) && (hhV instanceof C52882GeI)) {
                r1.Epw(obj);
            }
            this.A07.Epw(obj2);
            C51967G9n.A16(r2, true);
            this.A06.Epw(new IET(obj, obj2));
        }
        AnonymousClass6HD r6 = this.A0A;
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            C56606I4f i4f = (C56606I4f) r6.get(i);
            0qQ.A0C(i4f, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (C51971G9r.A1W(i4f.A05)) {
                i4f.A09(((C52882GeI) i4f.A02).A00.getValue(), j, i4f.A07.getValue());
            }
        }
        AnonymousClass6HD r22 = this.A09;
        int size2 = r22.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C56868IFp) r22.get(i2)).A01(j);
        }
        this.A00 = j;
    }

    public final boolean A0A() {
        AnonymousClass6HD r2 = this.A09;
        int size = r2.size();
        for (int i = 0; i < size; i++) {
            r2.get(i);
        }
        AnonymousClass6HD r3 = this.A0A;
        int size2 = r3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((C56606I4f) r3.get(i2)).A0A()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        AnonymousClass6HD r4 = this.A09;
        int size = r4.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            Object obj = r4.get(i);
            StringBuilder A0n = AnonymousClass7TF.A0n(str);
            A0n.append(obj);
            str = AnonymousClass7TF.A0l(", ", A0n);
        }
        return str;
    }

    public C56606I4f(C56606I4f i4f, C55425HhV hhV, String str) {
        this.A02 = hhV;
        this.A01 = i4f;
        this.A0B = str;
        this.A07 = C51970G9q.A0S(((C52882GeI) hhV).A00.getValue());
        Boolean A0u = AnonymousClass7TE.A0u();
        this.A08 = C51969G9p.A0S(A0u);
        this.A09 = new AnonymousClass6HD();
        this.A0A = new AnonymousClass6HD();
        this.A05 = C51969G9p.A0S(A0u);
        this.A0C = C58682Ivr.A00((C284895Os) null, this, 2);
    }

    public final void A07(C286575Wy r7, Object obj, int i) {
        int i2;
        r7.ExV(-1493585151);
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r7, obj, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r7, this);
        }
        if ((i2 & 19) != 18 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1477163447, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)");
            }
            if (!C51971G9r.A1W(this.A05)) {
                r7.ExS(1822507602);
                A08(obj);
                if (!C51969G9p.A1U(((C52882GeI) this.A02).A00, obj) || this.A04.BOX() != Long.MIN_VALUE || C51971G9r.A1W(this.A08)) {
                    Object A0m = C51967G9n.A0m(r7, 1822738893);
                    Object obj2 = AnonymousClass5XT.A00;
                    C262224Cq r2 = ((AnonymousClass6FV) C51974G9v.A0Y(r7, A0m, obj2)).A00;
                    boolean AGw = r7.AGw(r2) | C51972G9s.A1L(i2);
                    Object ECw = r7.ECw();
                    if (AGw || ECw == obj2) {
                        ECw = J6U.A00(r7, r2, this, 7);
                    }
                    C286645Xf.A01(r7, r2, this, (0sP) ECw);
                } else {
                    r7.ExS(1823982427);
                }
                C51965G9l.A1V(r7);
            } else {
                r7.ExS(1823992347);
            }
            if (C51970G9q.A1Z(r7)) {
                0fL.A00(1213182392);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, this, obj, i, 0);
        }
    }
}
