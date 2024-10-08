package X;

public final class GOE extends C267894cP implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARNING: type inference failed for: r13v0, types: [X.GOE, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A[Catch:{ TSe -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[Catch:{ TSe -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067 A[Catch:{ TSe -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r9 = r14
            int r0 = r13.A02
            switch(r0) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x0084;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r13.A00
            r6 = 3
            r8 = 2
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0027
            if (r0 == r7) goto L_0x003b
            if (r0 == r8) goto L_0x001f
            X.0eS.A00(r14)
        L_0x0017:
            java.lang.Object r0 = r13.A04
            X.DbS.A1U(r0)
        L_0x001c:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x001f:
            java.lang.Object r4 = r13.A01
            X.6GK r4 = (X.AnonymousClass6GK) r4
            X.0eS.A00(r14)     // Catch:{ TSe -> 0x0072 }
            goto L_0x005f
        L_0x0027:
            X.0eS.A00(r14)
            java.lang.Object r4 = r13.A01
            X.6GK r4 = (X.AnonymousClass6GK) r4
            r13.A01 = r4
            r13.A00 = r7
            X.GWN r0 = X.GWN.Main
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r4, r0, r13, r7)
            if (r0 != r3) goto L_0x0041
            return r3
        L_0x003b:
            java.lang.Object r0 = r13.A01
            X.6GK r4 = X.C51965G9l.A0O(r0, r14)
        L_0x0041:
            java.lang.Object r0 = r13.A03
            X.DbS.A1U(r0)
            X.5RG r0 = r4.CEf()     // Catch:{ TSe -> 0x0072 }
            long r1 = r0.BOW()     // Catch:{ TSe -> 0x0072 }
            X.IlA r0 = new X.IlA     // Catch:{ TSe -> 0x0072 }
            r0.<init>(r7, r5)     // Catch:{ TSe -> 0x0072 }
            r13.A01 = r4     // Catch:{ TSe -> 0x0072 }
            r13.A00 = r8     // Catch:{ TSe -> 0x0072 }
            java.lang.Object r9 = r4.FNY(r13, r0, r1)     // Catch:{ TSe -> 0x0072 }
            if (r9 != r3) goto L_0x005f
            goto L_0x015a
        L_0x005f:
            if (r9 != 0) goto L_0x0067
            java.lang.Object r0 = r13.A04     // Catch:{ TSe -> 0x0072 }
            X.DbS.A1U(r0)     // Catch:{ TSe -> 0x0072 }
            goto L_0x001c
        L_0x0067:
            java.lang.Object r0 = r13.A06     // Catch:{ TSe -> 0x0072 }
            X.DbS.A1U(r0)     // Catch:{ TSe -> 0x0072 }
            java.lang.Object r0 = r13.A04     // Catch:{ TSe -> 0x0072 }
            X.DbS.A1U(r0)     // Catch:{ TSe -> 0x0072 }
            goto L_0x001c
        L_0x0072:
            java.lang.Object r0 = r13.A05
            X.DbS.A1U(r0)
            r13.A01 = r5
            r13.A00 = r6
            X.GWN r0 = X.GWN.Main
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(r4, r0, r13)
            if (r0 != r3) goto L_0x0017
            return r3
        L_0x0084:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r13.A00
            r5 = 1
            if (r0 == 0) goto L_0x0091
            if (r0 != r5) goto L_0x015b
            X.0eS.A00(r14)     // Catch:{ CancellationException -> 0x00ae }
            goto L_0x00ba
        L_0x0091:
            X.0eS.A00(r14)
            java.lang.Object r4 = r13.A01
            X.6GK r4 = (X.AnonymousClass6GK) r4
            java.lang.Object r2 = r13.A05     // Catch:{ CancellationException -> 0x00ae }
            X.4gU r2 = (X.C270284gU) r2     // Catch:{ CancellationException -> 0x00ae }
            java.lang.Object r1 = r13.A04     // Catch:{ CancellationException -> 0x00ae }
            X.3ju r1 = (X.C249513ju) r1     // Catch:{ CancellationException -> 0x00ae }
            java.lang.Object r0 = r13.A06     // Catch:{ CancellationException -> 0x00ae }
            X.4gU r0 = (X.C270284gU) r0     // Catch:{ CancellationException -> 0x00ae }
            r13.A00 = r5     // Catch:{ CancellationException -> 0x00ae }
            java.lang.Object r0 = com.instagram.barcelona.feed.mediaviewer.ui.Transformable150Kt.A00(r2, r0, r4, r13, r1)     // Catch:{ CancellationException -> 0x00ae }
            if (r0 != r3) goto L_0x00ba
            goto L_0x0160
        L_0x00ae:
            r1 = move-exception
            java.lang.Object r0 = r13.A03     // Catch:{ all -> 0x0161 }
            X.4Cq r0 = (X.C262224Cq) r0     // Catch:{ all -> 0x0161 }
            boolean r0 = X.19E.A07(r0)     // Catch:{ all -> 0x0161 }
            if (r0 != 0) goto L_0x00ba
            throw r1     // Catch:{ all -> 0x0161 }
        L_0x00ba:
            java.lang.Object r1 = r13.A04
            X.3jv r1 = (X.C249523jv) r1
            X.GzB r0 = X.C54087GzB.A00
            r1.FIG(r0)
            goto L_0x001c
        L_0x00c5:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r13.A00
            r4 = 2
            r2 = 1
            r10 = 0
            if (r0 == 0) goto L_0x00ea
            if (r0 == r2) goto L_0x010d
            if (r0 != r4) goto L_0x016c
            X.0eS.A00(r14)
        L_0x00d5:
            X.GPU r9 = (X.GPU) r9
            if (r9 != 0) goto L_0x013e
            java.lang.Object r3 = r13.A03
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r13.A06
            r1 = 0
            X.JUv r0 = new X.JUv
            r0.<init>(r2, r10, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x001c
        L_0x00ea:
            X.0eS.A00(r14)
            java.lang.Object r1 = r13.A01
            X.6GK r1 = (X.AnonymousClass6GK) r1
            java.lang.Object r7 = r13.A03
            X.4Cq r7 = (X.C262224Cq) r7
            java.lang.Object r6 = r13.A06
            r5 = 4
            X.JTh r0 = new X.JTh
            r0.<init>((java.lang.Object) r6, (X.AnonymousClass4D7) r10, (int) r5)
            X.AnonymousClass7TE.A1Z(r0, r7)
            r13.A01 = r1
            r13.A00 = r2
            X.GWN r0 = X.GWN.Main
            java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r1, r0, r13, r2)
            if (r9 != r3) goto L_0x0113
            return r3
        L_0x010d:
            java.lang.Object r0 = r13.A01
            X.6GK r1 = X.C51965G9l.A0O(r0, r14)
        L_0x0113:
            X.GPU r9 = (X.GPU) r9
            r9.A01()
            java.lang.Object r11 = r13.A04
            X.0sK r11 = (X.0sK) r11
            X.0sK r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            if (r11 == r0) goto L_0x0131
            java.lang.Object r0 = r13.A03
            X.4Cq r0 = (X.C262224Cq) r0
            java.lang.Object r8 = r13.A06
            androidx.compose.foundation.gestures.PressGestureScopeImpl r8 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r8
            r12 = 5
            X.MHP r7 = new X.MHP
            r7.<init>((androidx.compose.foundation.gestures.PressGestureScopeImpl) r8, (X.GPU) r9, (X.AnonymousClass4D7) r10, (X.0sK) r11, (int) r12)
            X.AnonymousClass7TE.A1Z(r7, r0)
        L_0x0131:
            r13.A01 = r10
            r13.A00 = r4
            X.GWN r0 = X.GWN.Main
            java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(r1, r0, r13)
            if (r9 != r3) goto L_0x00d5
            return r3
        L_0x013e:
            r9.A01()
            java.lang.Object r3 = r13.A03
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r1 = r13.A06
            X.JUv r0 = new X.JUv
            r0.<init>(r1, r10, r2)
            X.AnonymousClass7TE.A1Z(r0, r3)
            java.lang.Object r0 = r13.A05
            X.0sP r0 = (X.0sP) r0
            if (r0 == 0) goto L_0x001c
            X.GPU.A00(r9, r0)
            goto L_0x001c
        L_0x015a:
            return r3
        L_0x015b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0160:
            return r3
        L_0x0161:
            r2 = move-exception
            java.lang.Object r1 = r13.A04
            X.3jv r1 = (X.C249523jv) r1
            X.GzB r0 = X.C54087GzB.A00
            r1.FIG(r0)
            throw r2
        L_0x016c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GOE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GOE(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A02 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.GOE, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        AnonymousClass4D7 r5 = r9;
        switch (this.A02) {
            case 0:
                obj5 = this.A03;
                obj3 = this.A04;
                obj2 = this.A05;
                obj4 = this.A06;
                i = 0;
                break;
            case 1:
                obj2 = this.A05;
                obj3 = this.A04;
                obj4 = this.A06;
                obj5 = this.A03;
                i = 1;
                break;
            default:
                obj5 = this.A03;
                obj3 = this.A04;
                obj4 = this.A06;
                obj2 = this.A05;
                i = 2;
                break;
        }
        ? goe = new GOE(obj2, obj3, obj4, obj5, r5, i);
        goe.A01 = obj;
        return goe;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GOE) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
