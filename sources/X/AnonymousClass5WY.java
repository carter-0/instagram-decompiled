package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.5WY  reason: invalid class name */
public final class AnonymousClass5WY extends AnonymousClass5WK {
    public C56151Htd A00;
    public C56152Hte A01;
    public JL2 A02;
    public C55959HqQ A03;
    public C55959HqQ A04;
    public C55959HqQ A05;
    public C56606I4f A06;
    public Alignment A07;
    public C62320sa A08;
    public long A09 = AnonymousClass6C8.A00;
    public final 0sP A0A;
    public final 0sP A0B;

    public final void A0E() {
        this.A09 = AnonymousClass6C8.A00;
    }

    public final Alignment A0H() {
        C56115Ht2 ht2;
        C56560I1o i1o;
        if (this.A06.A03().CdX(HL0.PreEnter, HL0.Visible)) {
            ht2 = ((C52879GeF) this.A00).A00.A00;
            if (ht2 == null) {
                i1o = ((C52880GeG) this.A01).A00;
            }
            return ht2.A01;
        }
        ht2 = ((C52880GeG) this.A01).A00.A00;
        if (ht2 == null) {
            i1o = ((C52879GeF) this.A00).A00;
        }
        return ht2.A01;
        ht2 = i1o.A00;
        if (ht2 == null) {
            return null;
        }
        return ht2.A01;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C289145d6 Cny(X.C268074ci r21, X.C268004cb r22, long r23) {
        /*
            r20 = this;
            r7 = r20
            X.I4f r0 = r7.A06
            java.lang.Object r2 = r0.A04()
            X.I4f r0 = r7.A06
            X.5Oz r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            r0 = 0
            if (r2 == r1) goto L_0x001f
            androidx.compose.ui.Alignment r0 = r7.A07
            if (r0 != 0) goto L_0x0021
            androidx.compose.ui.Alignment r0 = r7.A0H()
            if (r0 != 0) goto L_0x001f
            androidx.compose.ui.Alignment r0 = X.C287215Zl.A0E
        L_0x001f:
            r7.A07 = r0
        L_0x0021:
            r6 = r22
            boolean r0 = r6.CWf()
            r10 = r21
            r4 = r23
            if (r0 == 0) goto L_0x0054
            X.4cY r5 = r10.Cnz(r4)
            int r1 = r5.A01
            int r0 = r5.A00
            long r3 = X.C289155d7.A00(r1, r0)
            r7.A09 = r3
            r0 = 32
            long r0 = r3 >> r0
            int r2 = (int) r0
            int r1 = X.C289005cr.A00(r3)
            r0 = 12
        L_0x0046:
            X.J6G r11 = new X.J6G
            r11.<init>(r5, r0)
        L_0x004b:
            X.0sm r0 = X.0Yt.A0E()
            X.5d6 r0 = r6.Cfi(r0, r11, r2, r1)
            return r0
        L_0x0054:
            X.0sa r0 = r7.A08
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x017b
            X.JL2 r0 = r7.A02
            X.IEN r0 = (X.IEN) r0
            X.HqQ r3 = r0.A02
            X.HqQ r14 = r0.A03
            X.I4f r13 = r0.A05
            X.Htd r12 = r0.A00
            X.Hte r11 = r0.A01
            X.HqQ r8 = r0.A04
            r9 = 0
            if (r3 == 0) goto L_0x0178
            r0 = 2
            X.J6U r2 = new X.J6U
            r2.<init>(r0, r12, r11)
            r1 = 3
            X.J6U r0 = new X.J6U
            r0.<init>(r1, r12, r11)
            X.IFn r3 = r3.A00(r2, r0)
        L_0x0085:
            if (r14 == 0) goto L_0x0175
            r0 = 4
            X.J6U r2 = new X.J6U
            r2.<init>(r0, r12, r11)
            r1 = 5
            X.J6U r0 = new X.J6U
            r0.<init>(r1, r12, r11)
            X.IFn r2 = r14.A00(r2, r0)
        L_0x0097:
            java.lang.Object r1 = r13.A04()
            X.HL0 r0 = X.HL0.PreEnter
            if (r1 != r0) goto L_0x0157
            r0 = r12
            X.GeF r0 = (X.C52879GeF) r0
            X.I1o r0 = r0.A00
            X.Hsm r0 = r0.A02
            if (r0 != 0) goto L_0x00b1
            r0 = r11
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
            X.Hsm r0 = r0.A02
            if (r0 == 0) goto L_0x0172
        L_0x00b1:
            long r0 = r0.A01
            X.5Ry r13 = new X.5Ry
            r13.<init>(r0)
        L_0x00b8:
            if (r8 == 0) goto L_0x00c6
            X.Iyg r9 = X.C58855Iyg.A00
            r1 = 3
            X.Iwy r0 = new X.Iwy
            r0.<init>(r1, r12, r13, r11)
            X.IFn r9 = r8.A00(r9, r0)
        L_0x00c6:
            r8 = 2
            X.Iwy r13 = new X.Iwy
            r13.<init>(r8, r3, r9, r2)
            X.4cY r12 = r10.Cnz(r4)
            int r1 = r12.A01
            int r0 = r12.A00
            long r2 = X.C289155d7.A00(r1, r0)
            long r0 = r7.A09
            long r10 = X.AnonymousClass6C8.A00
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x00e1
            r0 = r2
        L_0x00e1:
            X.HqQ r10 = r7.A04
            if (r10 == 0) goto L_0x00f9
            X.0sP r9 = r7.A0A
            r3 = 0
            X.Iwh r2 = new X.Iwh
            r2.<init>(r0, r7, r3)
            X.IFn r2 = r10.A00(r9, r2)
            java.lang.Object r2 = r2.getValue()
            X.5cr r2 = (X.C289005cr) r2
            long r2 = r2.A00
        L_0x00f9:
            long r18 = X.AnonymousClass5SF.A07(r4, r2)
            X.HqQ r5 = r7.A03
            if (r5 == 0) goto L_0x0154
            X.Iyn r4 = X.C58862Iyn.A00
            r3 = 1
            X.Iwh r2 = new X.Iwh
            r2.<init>(r0, r7, r3)
            X.IFn r2 = r5.A00(r4, r2)
            java.lang.Object r2 = r2.getValue()
            X.5d8 r2 = (X.C289165d8) r2
            long r4 = r2.A00
        L_0x0115:
            X.HqQ r9 = r7.A05
            if (r9 == 0) goto L_0x0151
            X.0sP r3 = r7.A0B
            X.Iwh r2 = new X.Iwh
            r2.<init>(r0, r7, r8)
            X.IFn r2 = r9.A00(r3, r2)
            java.lang.Object r2 = r2.getValue()
            X.5d8 r2 = (X.C289165d8) r2
            long r2 = r2.A00
        L_0x012c:
            androidx.compose.ui.Alignment r14 = r7.A07
            if (r14 == 0) goto L_0x014e
            X.5Q8 r15 = X.AnonymousClass5Q8.Ltr
            r16 = r0
            long r0 = r14.AB3(r15, r16, r18)
        L_0x0138:
            long r14 = X.C289165d8.A01(r0, r2)
            r0 = 32
            long r0 = r18 >> r0
            int r2 = (int) r0
            int r1 = X.C289005cr.A00(r18)
            X.Iwn r11 = new X.Iwn
            r16 = r4
            r11.<init>(r12, r13, r14, r16)
            goto L_0x004b
        L_0x014e:
            r0 = 0
            goto L_0x0138
        L_0x0151:
            r2 = 0
            goto L_0x012c
        L_0x0154:
            r4 = 0
            goto L_0x0115
        L_0x0157:
            r0 = r11
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
            X.Hsm r0 = r0.A02
            if (r0 != 0) goto L_0x0169
            r0 = r12
            X.GeF r0 = (X.C52879GeF) r0
            X.I1o r0 = r0.A00
            X.Hsm r0 = r0.A02
            if (r0 == 0) goto L_0x0172
        L_0x0169:
            long r0 = r0.A01
            X.5Ry r13 = new X.5Ry
            r13.<init>(r0)
            goto L_0x00b8
        L_0x0172:
            r13 = r9
            goto L_0x00b8
        L_0x0175:
            r2 = r9
            goto L_0x0097
        L_0x0178:
            r3 = r9
            goto L_0x0085
        L_0x017b:
            X.4cY r5 = r10.Cnz(r4)
            int r2 = r5.A01
            int r1 = r5.A00
            r0 = 13
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5WY.Cny(X.4ci, X.4cb, long):X.5d6");
    }

    public AnonymousClass5WY(C56151Htd htd, C56152Hte hte, JL2 jl2, C55959HqQ hqQ, C55959HqQ hqQ2, C55959HqQ hqQ3, C56606I4f i4f, C62320sa r10) {
        this.A06 = i4f;
        this.A04 = hqQ;
        this.A03 = hqQ2;
        this.A05 = hqQ3;
        this.A00 = htd;
        this.A01 = hte;
        this.A08 = r10;
        this.A02 = jl2;
        AnonymousClass5SF.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.A0A = new AnonymousClass9L6(this, 0);
        this.A0B = new AnonymousClass9L6(this, 1);
    }
}
