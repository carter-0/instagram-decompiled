package X;

/* renamed from: X.IlG  reason: case insensitive filesystem */
public final class C58080IlG extends C267894cP implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05 = 3;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58080IlG(GZF gzf, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A01 = gzf;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.IlG, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.IlG, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.IlG, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.IlG, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        switch (this.A05) {
            case 0:
                ? ilG = new C58080IlG((GZF) this.A01, r6);
                ilG.A02 = obj;
                return ilG;
            case 1:
                ? ilG2 = new C58080IlG((C52937GfB) this.A04, r6);
                ilG2.A01 = obj;
                return ilG2;
            case 2:
                C55693Hlq hlq = (C55693Hlq) this.A01;
                ? ilG3 = new C58080IlG((C59629JQx) this.A03, hlq, (JLM) this.A02, r6);
                ilG3.A04 = obj;
                return ilG3;
            default:
                ? ilG4 = new C58080IlG(r6, (2SP) this.A01, (AnonymousClass2U7) this.A02);
                ilG4.A03 = obj;
                return ilG4;
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.IlG, X.4D7] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0090 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r9 = r18
            r2 = r19
            int r0 = r9.A05
            X.1Hj r8 = X.1Hj.A02
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x00f0;
                case 2: goto L_0x0232;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r0 = r9.A00
            r5 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r5) goto L_0x005a
            java.lang.Object r4 = r9.A04
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r1 = r9.A03
            X.4qd r1 = (X.C275614qd) r1
            X.0eS.A00(r2)
        L_0x001d:
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x023e
            java.lang.Object r2 = r9.A01
            X.2SP r2 = (X.2SP) r2
            int r0 = r4.size()
            int r3 = r2.A05(r0)
            java.lang.Object r2 = X.018.A14(r4)
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x003d
            java.lang.Object r2 = r4.set(r3, r2)
        L_0x003d:
            r9.A03 = r1
            r9.A04 = r4
            r9.A00 = r5
            X.1Hj r0 = r1.A02(r2, r9)
            if (r0 != r8) goto L_0x001d
            return r8
        L_0x004a:
            X.0eS.A00(r2)
            java.lang.Object r1 = r9.A03
            X.4qd r1 = (X.C275614qd) r1
            java.lang.Object r0 = r9.A02
            X.2U7 r0 = (X.AnonymousClass2U7) r0
            java.util.List r4 = X.C242173Sx.A08(r0)
            goto L_0x001d
        L_0x005a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x005f:
            int r0 = r9.A00
            r7 = 2
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L_0x00ad
            if (r0 == r1) goto L_0x00c1
            if (r0 != r7) goto L_0x00eb
            java.lang.Object r10 = r9.A04
            X.GPU r10 = (X.GPU) r10
            java.lang.Object r11 = r9.A03
            X.GPU r11 = (X.GPU) r11
            java.lang.Object r0 = r9.A02
            X.6GK r5 = X.C51965G9l.A0O(r0, r2)
        L_0x0078:
            X.6Ft r2 = (X.C304926Ft) r2
            java.util.List r3 = r2.A03
            int r2 = r3.size()
            r1 = 0
        L_0x0081:
            if (r1 >= r2) goto L_0x0090
            X.GPU r0 = X.C51965G9l.A0P(r3, r1)
            boolean r0 = X.GPS.A01(r0)
            if (r0 == 0) goto L_0x0094
            int r1 = r1 + 1
            goto L_0x0081
        L_0x0090:
            X.GPU r10 = X.C51965G9l.A0P(r3, r6)
        L_0x0094:
            if (r10 == 0) goto L_0x00da
            java.lang.Object r4 = r9.A01
            X.GZF r4 = (X.GZF) r4
            long r2 = r10.A06
            long r0 = r11.A06
            long r2 = X.C289295dM.A06(r2, r0)
            X.5Oz r1 = r4.A0X
            X.5dM r0 = X.C51965G9l.A0M(r2)
            r1.Epw(r0)
            goto L_0x023e
        L_0x00ad:
            X.0eS.A00(r2)
            java.lang.Object r5 = r9.A02
            X.6GK r5 = (X.AnonymousClass6GK) r5
            X.GWN r0 = X.GWN.Initial
            r9.A02 = r5
            r9.A00 = r1
            java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r5, r0, r9, r6)
            if (r2 != r8) goto L_0x00c7
            return r8
        L_0x00c1:
            java.lang.Object r0 = r9.A02
            X.6GK r5 = X.C51965G9l.A0O(r0, r2)
        L_0x00c7:
            X.GPU r2 = (X.GPU) r2
            r10 = 0
            java.lang.Object r0 = r9.A01
            X.GZF r0 = (X.GZF) r0
            r3 = 0
            X.5Oz r1 = r0.A0X
            X.5dM r0 = X.C51965G9l.A0M(r3)
            r1.Epw(r0)
            r11 = r2
        L_0x00da:
            X.GWN r0 = X.GWN.Initial
            r9.A02 = r5
            r9.A03 = r11
            r9.A04 = r10
            r9.A00 = r7
            java.lang.Object r2 = r5.AD0(r0, r9)
            if (r2 != r8) goto L_0x0078
            return r8
        L_0x00eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00f0:
            int r0 = r9.A00
            r11 = 3
            r10 = 2
            r17 = 0
            r1 = 1
            if (r0 == 0) goto L_0x014b
            if (r0 == r1) goto L_0x015f
            if (r0 == r10) goto L_0x01b8
            java.lang.Object r5 = r9.A02
            X.GPU r5 = (X.GPU) r5
            java.lang.Object r0 = r9.A01
            X.6GK r7 = X.C51965G9l.A0O(r0, r2)
        L_0x0107:
            X.6Ft r2 = (X.C304926Ft) r2
            java.util.List r13 = r2.A03
            int r12 = r13.size()
            r10 = 0
        L_0x0110:
            if (r10 >= r12) goto L_0x0148
            java.lang.Object r6 = r13.get(r10)
            r14 = r6
            X.GPU r14 = (X.GPU) r14
            boolean r0 = r14.A02()
            if (r0 != 0) goto L_0x0145
            long r2 = r14.A05
            long r0 = r5.A05
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0145
            boolean r0 = r14.A0B
            if (r0 == 0) goto L_0x0145
        L_0x012b:
            X.GPU r6 = (X.GPU) r6
            if (r6 == 0) goto L_0x023e
            r6.A01()
        L_0x0132:
            X.GWN r1 = X.GWN.Initial
            r9.A01 = r7
            r9.A02 = r5
            r0 = r17
            r9.A03 = r0
            r9.A00 = r11
            java.lang.Object r2 = r7.AD0(r1, r9)
            if (r2 != r8) goto L_0x0107
            return r8
        L_0x0145:
            int r10 = r10 + 1
            goto L_0x0110
        L_0x0148:
            r6 = r17
            goto L_0x012b
        L_0x014b:
            X.0eS.A00(r2)
            java.lang.Object r7 = r9.A01
            X.6GK r7 = (X.AnonymousClass6GK) r7
            X.GWN r0 = X.GWN.Initial
            r9.A01 = r7
            r9.A00 = r1
            java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r7, r0, r9, r1)
            if (r2 != r8) goto L_0x0165
            return r8
        L_0x015f:
            java.lang.Object r0 = r9.A01
            X.6GK r7 = X.C51965G9l.A0O(r0, r2)
        L_0x0165:
            r5 = r2
            X.GPU r5 = (X.GPU) r5
            int r1 = r5.A04
            if (r1 == r11) goto L_0x016f
            r0 = 4
            if (r1 != r0) goto L_0x023e
        L_0x016f:
            long r2 = r5.A06
            float r12 = X.C289295dM.A01(r2)
            r6 = 0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x019c
            r0 = r7
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.6FP r0 = r0.A04
            long r0 = r0.A00
            int r4 = X.C51965G9l.A04(r0)
            float r4 = (float) r4
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x019c
            float r3 = X.C289295dM.A02(r2)
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x019c
            int r0 = X.C289005cr.A00(r0)
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r1 = 1
            if (r0 < 0) goto L_0x019d
        L_0x019c:
            r1 = 0
        L_0x019d:
            java.lang.Object r0 = r9.A04
            X.GfB r0 = (X.C52937GfB) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x022e
            if (r1 != 0) goto L_0x022e
            X.GWN r6 = X.GWN.Main
        L_0x01a9:
            r9.A01 = r7
            r9.A02 = r5
            r9.A03 = r6
            r9.A00 = r10
            java.lang.Object r2 = r7.AD0(r6, r9)
            if (r2 != r8) goto L_0x01c6
            return r8
        L_0x01b8:
            java.lang.Object r6 = r9.A03
            X.GWN r6 = (X.GWN) r6
            java.lang.Object r5 = r9.A02
            X.GPU r5 = (X.GPU) r5
            java.lang.Object r0 = r9.A01
            X.6GK r7 = X.C51965G9l.A0O(r0, r2)
        L_0x01c6:
            X.6Ft r2 = (X.C304926Ft) r2
            java.util.List r14 = r2.A03
            int r13 = r14.size()
            r12 = 0
        L_0x01cf:
            if (r12 >= r13) goto L_0x022b
            java.lang.Object r4 = r14.get(r12)
            r15 = r4
            X.GPU r15 = (X.GPU) r15
            boolean r0 = r15.A02()
            if (r0 != 0) goto L_0x0228
            long r2 = r15.A05
            long r0 = r5.A05
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x0228
            boolean r0 = r15.A0B
            if (r0 == 0) goto L_0x0228
        L_0x01ea:
            X.GPU r4 = (X.GPU) r4
            if (r4 == 0) goto L_0x023e
            long r2 = r4.A0A
            long r0 = r5.A0A
            long r2 = r2 - r0
            X.5RG r0 = r7.CEf()
            long r12 = r0.BOW()
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x023e
            long r2 = r4.A06
            long r0 = r5.A06
            long r0 = X.C289295dM.A06(r2, r0)
            float r1 = X.C289295dM.A00(r0)
            X.5RG r0 = r7.CEf()
            float r0 = r0.BAP()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a9
            java.lang.Object r0 = r9.A04
            X.GfB r0 = (X.C52937GfB) r0
            X.0sa r0 = r0.A00
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 == 0) goto L_0x023e
            r4.A01()
            goto L_0x0132
        L_0x0228:
            int r12 = r12 + 1
            goto L_0x01cf
        L_0x022b:
            r4 = r17
            goto L_0x01ea
        L_0x022e:
            X.GWN r6 = X.GWN.Initial
            goto L_0x01a9
        L_0x0232:
            int r1 = r9.A00
            r10 = 3
            r7 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0241
            if (r1 == r0) goto L_0x0253
            X.0eS.A00(r2)
        L_0x023e:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x0241:
            X.0eS.A00(r2)
            java.lang.Object r6 = r9.A04
            X.6GK r6 = (X.AnonymousClass6GK) r6
            r9.A04 = r6
            r9.A00 = r0
            java.lang.Object r2 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A02(r6, r9)
            if (r2 != r8) goto L_0x0259
            return r8
        L_0x0253:
            java.lang.Object r0 = r9.A04
            X.6GK r6 = X.C51965G9l.A0O(r0, r2)
        L_0x0259:
            X.6Ft r2 = (X.C304926Ft) r2
            boolean r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A03(r2)
            r5 = 0
            if (r0 == 0) goto L_0x0280
            int r0 = r2.A01
            r0 = r0 & 33
            if (r0 == 0) goto L_0x0280
            java.util.List r4 = r2.A03
            int r3 = r4.size()
            r1 = 0
        L_0x026f:
            if (r1 >= r3) goto L_0x0293
            X.GPU r0 = X.C51965G9l.A0P(r4, r1)
            boolean r0 = r0.A02()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0280
            int r1 = r1 + 1
            goto L_0x026f
        L_0x0280:
            boolean r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A03(r2)
            if (r0 != 0) goto L_0x023e
            java.lang.Object r0 = r9.A03
            X.JQx r0 = (X.C59629JQx) r0
            r9.A04 = r5
            r9.A00 = r10
            java.lang.Object r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A00(r0, r6, r2, r9)
            goto L_0x02a3
        L_0x0293:
            java.lang.Object r1 = r9.A02
            X.JLM r1 = (X.JLM) r1
            java.lang.Object r0 = r9.A01
            X.Hlq r0 = (X.C55693Hlq) r0
            r9.A04 = r5
            r9.A00 = r7
            java.lang.Object r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A01(r0, r1, r6, r2, r9)
        L_0x02a3:
            if (r0 != r8) goto L_0x023e
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58080IlG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58080IlG) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58080IlG(C59629JQx jQx, C55693Hlq hlq, JLM jlm, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A02 = jlm;
        this.A01 = hlq;
        this.A03 = jQx;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58080IlG(AnonymousClass4D7 r2, 2SP r3, AnonymousClass2U7 r4) {
        super(2, r2);
        this.A02 = r4;
        this.A01 = r3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58080IlG(C52937GfB gfB, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A04 = gfB;
    }
}
