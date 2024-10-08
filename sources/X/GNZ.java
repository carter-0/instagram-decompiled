package X;

public final class GNZ extends C267894cP implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GNZ(C59629JQx jQx, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A04 = jQx;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.GNZ, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.GNZ, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        if (this.A03 != 0) {
            ? gnz = new GNZ((C59629JQx) this.A04, r5);
            gnz.A01 = obj;
            return gnz;
        }
        ? gnz2 = new GNZ(r5, (C262094Cc) this.A01, (0sL) this.A04);
        gnz2.A02 = obj;
        return gnz2;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.GNZ, java.lang.Object, X.4D7] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A03
            X.1Hj r6 = X.1Hj.A02
            if (r0 == 0) goto L_0x0075
            int r1 = r13.A00
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L_0x004d
            if (r1 == r0) goto L_0x0062
            if (r1 != r4) goto L_0x00e0
            java.lang.Object r10 = r13.A02
            X.GPU r10 = (X.GPU) r10
            java.lang.Object r0 = r13.A01
            X.6GK r3 = X.C51965G9l.A0O(r0, r14)
        L_0x001a:
            X.6Ft r14 = (X.C304926Ft) r14
            java.util.List r12 = r14.A03
            int r11 = r12.size()
            r9 = 0
        L_0x0023:
            if (r9 >= r11) goto L_0x00d6
            java.lang.Object r5 = r12.get(r9)
            X.GPU r5 = (X.GPU) r5
            long r7 = r5.A05
            long r0 = r10.A05
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r0 = 0
            if (r2 != 0) goto L_0x0035
            r0 = 1
        L_0x0035:
            if (r0 == 0) goto L_0x004a
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x004a
        L_0x003b:
            r13.A01 = r3
            r13.A02 = r10
            r13.A00 = r4
            X.GWN r0 = X.GWN.Main
            java.lang.Object r14 = r3.AD0(r0, r13)
            if (r14 != r6) goto L_0x001a
            return r6
        L_0x004a:
            int r9 = r9 + 1
            goto L_0x0023
        L_0x004d:
            X.0eS.A00(r14)
            java.lang.Object r3 = r13.A01
            X.6GK r3 = (X.AnonymousClass6GK) r3
            r13.A01 = r3
            r13.A00 = r0
            r1 = 0
            X.GWN r0 = X.GWN.Main
            java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r3, r0, r13, r1)
            if (r14 != r6) goto L_0x0068
            return r6
        L_0x0062:
            java.lang.Object r0 = r13.A01
            X.6GK r3 = X.C51965G9l.A0O(r0, r14)
        L_0x0068:
            X.GPU r14 = (X.GPU) r14
            java.lang.Object r2 = r13.A04
            X.JQx r2 = (X.C59629JQx) r2
            long r0 = r14.A06
            r2.DAB(r0)
            r10 = r14
            goto L_0x003b
        L_0x0075:
            int r0 = r13.A00
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x00cd
            if (r0 == r3) goto L_0x00a7
            if (r0 == r4) goto L_0x009f
            java.lang.Object r0 = r13.A02
            X.6GK r2 = X.C51965G9l.A0O(r0, r14)
        L_0x0086:
            java.lang.Object r0 = r13.A01
            X.4Cc r0 = (X.C262094Cc) r0
            boolean r0 = X.AnonymousClass5H8.A03(r0)
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r13.A04     // Catch:{ CancellationException -> 0x00b7 }
            X.0sL r0 = (X.0sL) r0     // Catch:{ CancellationException -> 0x00b7 }
            r13.A02 = r2     // Catch:{ CancellationException -> 0x00b7 }
            r13.A00 = r3     // Catch:{ CancellationException -> 0x00b7 }
            java.lang.Object r0 = r0.invoke(r2, r13)     // Catch:{ CancellationException -> 0x00b7 }
            if (r0 != r6) goto L_0x00ae
            goto L_0x00d5
        L_0x009f:
            java.lang.Object r2 = r13.A02
            X.6GK r2 = (X.AnonymousClass6GK) r2
            X.0eS.A00(r14)     // Catch:{ CancellationException -> 0x00b7 }
            goto L_0x0086
        L_0x00a7:
            java.lang.Object r2 = r13.A02
            X.6GK r2 = (X.AnonymousClass6GK) r2
            X.0eS.A00(r14)     // Catch:{ CancellationException -> 0x00b7 }
        L_0x00ae:
            r13.A02 = r2     // Catch:{ CancellationException -> 0x00b7 }
            r13.A00 = r4     // Catch:{ CancellationException -> 0x00b7 }
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A00(r2, r13)     // Catch:{ CancellationException -> 0x00b7 }
            goto L_0x00ca
        L_0x00b7:
            r1 = move-exception
            java.lang.Object r0 = r13.A01
            X.4Cc r0 = (X.C262094Cc) r0
            boolean r0 = X.AnonymousClass5H8.A03(r0)
            if (r0 == 0) goto L_0x00e4
            r13.A02 = r2
            r13.A00 = r5
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A00(r2, r13)
        L_0x00ca:
            if (r0 != r6) goto L_0x0086
            return r6
        L_0x00cd:
            X.0eS.A00(r14)
            java.lang.Object r2 = r13.A02
            X.6GK r2 = (X.AnonymousClass6GK) r2
            goto L_0x0086
        L_0x00d5:
            return r6
        L_0x00d6:
            java.lang.Object r0 = r13.A04
            X.JQx r0 = (X.C59629JQx) r0
            r0.Dv9()
        L_0x00dd:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x00e0:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
        L_0x00e4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GNZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GNZ) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GNZ(AnonymousClass4D7 r2, C262094Cc r3, 0sL r4) {
        super(2, r2);
        this.A01 = r3;
        this.A04 = r4;
    }
}
