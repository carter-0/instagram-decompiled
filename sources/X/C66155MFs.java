package X;

import java.util.List;

/* renamed from: X.MFs  reason: case insensitive filesystem */
public final class C66155MFs extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final float A05;
    public final float A06;
    public final int A07 = 1;
    public final Object A08;
    public final Object A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66155MFs(C284945Oz r2, C55812Hns hns, AnonymousClass4D7 r4, C62320sa r5, C62320sa r6, C62320sa r7, float f, float f2) {
        super(2, r4);
        this.A08 = hns;
        this.A05 = f;
        this.A06 = f2;
        this.A03 = r5;
        this.A01 = r6;
        this.A02 = r7;
        this.A09 = r2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MFs, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        AnonymousClass4D7 r5 = r15;
        if (this.A07 != 0) {
            float f = this.A05;
            float f2 = this.A06;
            ? mFs = new C66155MFs((C284945Oz) this.A09, (C55812Hns) this.A08, r5, (C62320sa) this.A03, (C62320sa) this.A01, (C62320sa) this.A02, f, f2);
            mFs.A04 = obj;
            return mFs;
        }
        float f3 = this.A06;
        C66155MFs mFs2 = new C66155MFs((LOG) this.A04, (List) this.A08, (List) this.A09, r15, f3, this.A05);
        mFs2.A01 = obj;
        return mFs2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.MFs, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.UOk, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0177, code lost:
        if (X.LQE.A01(r0) == false) goto L_0x0179;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r3 = r19
            r1 = r18
            int r0 = r1.A07
            if (r0 == 0) goto L_0x0059
            X.1Hj r0 = X.1Hj.A02
            int r2 = r1.A00
            r4 = 1
            if (r2 == 0) goto L_0x0017
            if (r2 != r4) goto L_0x0215
            X.0eS.A00(r3)
        L_0x0014:
            X.0gF r0 = X.C60340gF.A00
        L_0x0016:
            return r0
        L_0x0017:
            X.0eS.A00(r3)
            java.lang.Object r2 = r1.A04
            X.6FR r2 = (X.AnonymousClass6FR) r2
            java.lang.Object r7 = r1.A08
            X.Hns r7 = (X.C55812Hns) r7
            r3 = 28
            X.AwU r13 = new X.AwU
            r13.<init>(r7, r3)
            float r11 = r1.A05
            float r12 = r1.A06
            java.lang.Object r8 = r1.A03
            X.0sa r8 = (X.C62320sa) r8
            java.lang.Object r9 = r1.A01
            X.0sa r9 = (X.C62320sa) r9
            java.lang.Object r10 = r1.A02
            X.0sa r10 = (X.C62320sa) r10
            java.lang.Object r6 = r1.A09
            X.5Oz r6 = (X.C284945Oz) r6
            X.J91 r5 = new X.J91
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.A00 = r4
            X.MN4 r15 = X.MN4.A00
            X.MJY r14 = X.MJY.A00
            r12 = 0
            r17 = 0
            X.IlF r11 = new X.IlF
            r16 = r5
            r11.<init>((X.AnonymousClass4D7) r12, (X.C62320sa) r13, (X.C62320sa) r14, (X.0sP) r15, (X.0sL) r16, (int) r17)
            java.lang.Object r1 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r2, r1, r11)
            if (r1 != r0) goto L_0x0014
            return r0
        L_0x0059:
            X.1Hj r7 = X.1Hj.A02
            int r2 = r1.A00
            r6 = 2
            r0 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0094
            java.lang.Object r9 = r1.A03
            java.util.Iterator r9 = (java.util.Iterator) r9
            if (r2 == r10) goto L_0x00c9
            java.lang.Object r5 = r1.A02
            java.lang.Object r2 = r1.A01
            X.4Cq r8 = X.JTO.A1D(r2, r3)
        L_0x0070:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00df
            java.lang.Object r4 = r9.next()
            r3 = 39
            X.MH1 r2 = new X.MH1
            r2.<init>(r4, r5, r0, r3)
            X.2Q8 r2 = X.JTO.A1E(r2, r8)
            r1.A01 = r8
            r1.A02 = r5
            r1.A03 = r9
            r1.A00 = r6
            java.lang.Object r2 = r2.A0E(r1)
            if (r2 != r7) goto L_0x0070
            return r7
        L_0x0094:
            X.0eS.A00(r3)
            java.lang.Object r8 = r1.A01
            X.4Cq r8 = (X.C262224Cq) r8
            java.lang.Object r2 = r1.A08
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r1.A04
            java.util.Iterator r9 = r2.iterator()
        L_0x00a5:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00d4
            java.lang.Object r4 = r9.next()
            r3 = 38
            X.MH1 r2 = new X.MH1
            r2.<init>(r4, r5, r0, r3)
            X.2Q8 r2 = X.JTO.A1E(r2, r8)
            r1.A01 = r8
            r1.A02 = r5
            r1.A03 = r9
            r1.A00 = r10
            java.lang.Object r3 = r2.A0E(r1)
            if (r3 != r7) goto L_0x00d1
            return r7
        L_0x00c9:
            java.lang.Object r5 = r1.A02
            java.lang.Object r2 = r1.A01
            X.4Cq r8 = X.JTO.A1D(r2, r3)
        L_0x00d1:
            if (r3 != 0) goto L_0x00a5
            return r0
        L_0x00d4:
            java.lang.Object r2 = r1.A09
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r1.A04
            java.util.Iterator r9 = r2.iterator()
            goto L_0x0070
        L_0x00df:
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()
            java.lang.Object r3 = r1.A09
            java.util.List r3 = (java.util.List) r3
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            r2 = 0
            if (r0 == 0) goto L_0x01a3
            float r0 = r1.A06
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a3
            java.lang.Object r12 = r1.A04
            X.LOG r12 = (X.LOG) r12
            java.util.Map r11 = r12.A06
            r0 = 0
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0q(r11, r0)
            java.util.Iterator r15 = r3.iterator()
        L_0x0107:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x019c
            java.lang.Object r9 = r15.next()
            X.M1Y r9 = (X.M1Y) r9
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            int r7 = r9.A03
            java.lang.Object r0 = r11.get(r9)
            X.JwF r0 = (X.C61077JwF) r0
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0195
            java.util.Iterator r3 = r0.iterator()
        L_0x012b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0193
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.GNY r0 = (X.GNY) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = X.G9w.A1b(r0)
            if (r0 == 0) goto L_0x012b
        L_0x0140:
            X.GNY r2 = (X.GNY) r2
            if (r2 == 0) goto L_0x0195
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0195
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0152:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0197
            java.lang.Object r3 = r14.next()
            X.UOk r3 = (X.C15092UOk) r3
            r3.A03 = r7
            java.util.Map r13 = r12.A04
            java.lang.String r0 = r3.A05
            boolean r0 = r13.containsKey(r0)
            if (r0 == 0) goto L_0x0179
            java.lang.String r0 = r3.A05
            java.lang.String r0 = X.DbT.A11(r0, r13)
            if (r0 == 0) goto L_0x0179
            boolean r0 = X.LQE.A01(r0)
            r2 = 1
            if (r0 != 0) goto L_0x017a
        L_0x0179:
            r2 = 0
        L_0x017a:
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = r3.A05
            boolean r0 = r13.containsKey(r0)
            if (r0 != 0) goto L_0x0190
        L_0x0186:
            X.JTU.A1B(r3, r8)
        L_0x0189:
            r4.put(r9, r8)
            r6.add(r3)
            goto L_0x0152
        L_0x0190:
            if (r2 == 0) goto L_0x0189
            goto L_0x0186
        L_0x0193:
            r2 = 0
            goto L_0x0140
        L_0x0195:
            X.0sn r6 = X.0sn.A00
        L_0x0197:
            X.018.A16(r6, r10)
            goto L_0x0107
        L_0x019c:
            r0 = 8
            java.util.List r2 = X.MAY.A00(r10, r0)
            goto L_0x01b7
        L_0x01a3:
            float r0 = r1.A05
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0212
            java.lang.Object r3 = r1.A04
            X.LOG r3 = (X.LOG) r3
            java.util.Map r2 = r3.A05
            java.lang.Object r0 = r1.A08
            java.util.List r0 = (java.util.List) r0
            java.util.List r2 = r3.A01(r0, r2, r5)
        L_0x01b7:
            java.lang.Object r0 = r1.A04
            X.LOG r0 = (X.LOG) r0
            X.2Fj r1 = r0.A01
            X.83F r0 = new X.83F
            r0.<init>(r5, r4)
            r1.A0A(r0)
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r10 = r2.iterator()
        L_0x01cd:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r2 = r10.next()
            X.UOk r2 = (X.C15092UOk) r2
            boolean r1 = r2.A07
            java.lang.String r9 = r2.A06
            if (r1 == 0) goto L_0x01e7
            int r1 = X.DbX.A05(r9)
            java.lang.String r9 = X.LQE.A00(r1)
        L_0x01e7:
            float r8 = r2.A00
            int r7 = r2.A04
            int r6 = r2.A02
            boolean r5 = r2.A07
            int r4 = r2.A03
            float r3 = r2.A01
            java.lang.String r2 = r2.A05
            r1 = 0
            X.AnonymousClass7TF.A1E(r9, r1, r2)
            X.UOk r1 = new X.UOk
            r1.<init>()
            r1.A06 = r9
            r1.A00 = r8
            r1.A04 = r7
            r1.A02 = r6
            r1.A07 = r5
            r1.A03 = r4
            r1.A01 = r3
            r1.A05 = r2
            r0.add(r1)
            goto L_0x01cd
        L_0x0212:
            X.0sn r2 = X.0sn.A00
            goto L_0x01b7
        L_0x0215:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66155MFs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66155MFs) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66155MFs(LOG log, List list, List list2, AnonymousClass4D7 r5, float f, float f2) {
        super(2, r5);
        this.A08 = list;
        this.A09 = list2;
        this.A06 = f;
        this.A04 = log;
        this.A05 = f2;
    }
}
