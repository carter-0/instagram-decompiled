package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.9Jw  reason: invalid class name and case insensitive filesystem */
public final class C376929Jw extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376929Jw(LazyListState lazyListState, AnonymousClass4D7 r3, int i, int i2) {
        super(2, r3);
        this.A01 = 0;
        this.A03 = lazyListState;
        this.A02 = i;
        this.A00 = i2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.9Jw] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.9Jw] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.4D7, X.9Jw] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        Object obj2;
        int i;
        int i2;
        switch (this.A01) {
            case 0:
                return new C376929Jw((LazyListState) this.A03, r6, this.A02, this.A00);
            case 1:
                return new C376929Jw(this.A03, r6, this.A02, 1);
            case 2:
                obj2 = this.A03;
                i = this.A02;
                i2 = 2;
                break;
            default:
                obj2 = this.A03;
                i = this.A02;
                i2 = 3;
                break;
        }
        return new C376929Jw(obj2, r6, i, i2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C376929Jw) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        if (r0 != r6) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c1, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c2, code lost:
        X.0eS.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c7, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x002e;
                case 1: goto L_0x003e;
                case 2: goto L_0x0095;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A00
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 != r2) goto L_0x0026
            X.0eS.A00(r9)
        L_0x0011:
            return r9
        L_0x0012:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A03
            X.2N1 r0 = (X.AnonymousClass2N1) r0
            X.2NP r1 = r0.A00
            int r0 = r8.A02
            r8.A00 = r2
            java.lang.Object r9 = r1.A01(r0, r8)
            if (r9 != r6) goto L_0x0011
            return r6
        L_0x0026:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002e:
            X.0eS.A00(r9)
            java.lang.Object r2 = r8.A03
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            int r1 = r8.A02
            int r0 = r8.A00
            r2.A05(r1, r0)
            goto L_0x00c5
        L_0x003e:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A00
            r7 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 == r7) goto L_0x00c2
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x004f:
            X.0eS.A00(r9)
            X.0rm r5 = new X.0rm
            r5.<init>()
            int r0 = r8.A02
            long r0 = (long) r0
            java.lang.String r1 = android.text.format.DateUtils.formatElapsedTime(r0)
            r5.A00 = r1
            java.lang.String r3 = "00:"
            X.0qQ.A06(r1)
            r4 = 0
            r0 = 0
            boolean r0 = X.00p.A0k(r1, r3, r0)
            if (r0 == 0) goto L_0x0081
            java.lang.Object r2 = r5.A00
            X.0qQ.A06(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            X.11S r1 = new X.11S
            r1.<init>(r3)
            java.lang.String r0 = "0:"
            java.lang.String r0 = r1.A01(r2, r0)
            r5.A00 = r0
        L_0x0081:
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r3 = r0.A04
            java.lang.Object r2 = r8.A03
            r1 = 40
            X.MGV r0 = new X.MGV
            r0.<init>(r5, r2, r4, r1)
            r8.A00 = r7
            java.lang.Object r0 = X.1Eo.A00(r8, r3, r0)
            goto L_0x00bf
        L_0x0095:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x00a6
            if (r0 == r5) goto L_0x00c2
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00a6:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A03
            X.8Lv r0 = (X.C354388Lv) r0
            X.05G r4 = r0.A07
            int r3 = r8.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r1 = 0
            X.8Lw r0 = new X.8Lw
            r0.<init>(r2, r1, r3, r3)
            r8.A00 = r5
            java.lang.Object r0 = r4.emit(r0, r8)
        L_0x00bf:
            if (r0 != r6) goto L_0x00c5
            return r6
        L_0x00c2:
            X.0eS.A00(r9)
        L_0x00c5:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376929Jw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376929Jw(Object obj, AnonymousClass4D7 r3, int i, int i2) {
        super(2, r3);
        this.A01 = i2;
        this.A02 = i;
        this.A03 = obj;
    }
}
