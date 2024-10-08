package X;

/* renamed from: X.7mQ  reason: invalid class name and case insensitive filesystem */
public final class C341157mQ extends C344317rf implements C343687qd {
    public final C344767sO A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C341157mQ(X.C343837qt r20) {
        /*
            r19 = this;
            r2 = r19
            r3 = r20
            r2.<init>(r3)
            X.7qb r0 = X.C343767ql.A00
            X.7qt r4 = r2.A00
            java.lang.Object r1 = r4.Apu(r0)
            X.7sO r1 = (X.C344767sO) r1
            if (r1 != 0) goto L_0x0093
            android.os.Handler r6 = X.C344427rq.A00(r3)
            android.content.Context r5 = r4.getContext()
            X.7r3 r0 = X.C343927r2.A00
            X.7r1 r10 = r4.Apf(r0)
            X.7r2 r10 = (X.C343927r2) r10
            X.7r3 r0 = X.C344037rD.A00
            X.7r1 r9 = r4.Apf(r0)
            X.7rD r9 = (X.C344037rD) r9
            r7 = 0
            r11 = 1
            X.0qQ.A0B(r5, r11)
            r0 = 2
            X.0qQ.A0B(r10, r0)
            r0 = 3
            X.0qQ.A0B(r9, r0)
            X.7qb r0 = X.C343687qd.A00
            r12 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.Object r0 = r4.Apu(r0)
            if (r0 == 0) goto L_0x0046
            r1 = r0
        L_0x0046:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r18 = r1.booleanValue()
            r8 = r7
            r13 = r12
            r14 = r12
            r15 = r11
            r16 = r12
            r17 = r12
            X.7sO r0 = X.C344787sQ.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.A00 = r0
        L_0x005a:
            X.7qb r3 = X.C343767ql.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r4.Apu(r3)
            if (r0 == 0) goto L_0x0069
            r1 = r0
        L_0x0069:
            java.lang.Number r1 = (java.lang.Number) r1
            float r4 = r1.floatValue()
            r3 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a2
            X.7sO r2 = r2.A00
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            X.7ro r1 = r2.A0N
            X.8td r0 = X.C368978td.GL_PROCESSOR_GRAPH_0_SCALE_FACTOR
            r1.A00(r0)
        L_0x0081:
            r2.A00 = r4
            X.7sT r2 = r2.A0M
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0090
            X.7ro r1 = r2.A05
            X.8td r0 = X.C368978td.GL_RENDER_CHAIN_0_SCALE_FACTOR
            r1.A00(r0)
        L_0x0090:
            r2.A00 = r4
            return
        L_0x0093:
            X.7r3 r0 = X.C344037rD.A00
            X.7r1 r0 = r4.Apf(r0)
            X.7rD r0 = (X.C344037rD) r0
            if (r0 == 0) goto L_0x009f
            r1.A05 = r0
        L_0x009f:
            r2.A00 = r1
            goto L_0x005a
        L_0x00a2:
            java.lang.String r1 = "scaleFactor cannot be 0"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341157mQ.<init>(X.7qt):void");
    }

    public final C343717qg BJt() {
        return C343687qd.A01;
    }

    public final C344737sL BQ6() {
        return this.A00;
    }

    public static C343717qg A00(ATD atd, C343697qe r3, C343717qg r4) {
        atd.A01(r3, r4);
        atd.A01(new C341157mQ(atd), C343687qd.A01);
        C343717qg r1 = C345167t2.A01;
        atd.A01(new C345157t1(atd), r1);
        return r1;
    }

    public static void A01(C343697qe r0, C343837qt r1, C344297rd r2) {
        r2.A00(r0);
        r2.A00(new C341157mQ(r1));
        r2.A00(new C345157t1(r1));
    }
}
