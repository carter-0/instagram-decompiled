package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.ImG  reason: case insensitive filesystem */
public final class C58094ImG extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public long A01;
    public long A02;
    public final int A03 = 1;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58094ImG(ScrollingLogic scrollingLogic, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A04 = scrollingLogic;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.ImG, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b7 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r8 = r13
            int r0 = r13.A03
            X.1Hj r6 = X.1Hj.A02
            if (r0 == 0) goto L_0x0041
            int r0 = r13.A00
            r5 = 1
            if (r0 == 0) goto L_0x0012
            X.0eS.A00(r14)
        L_0x000f:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0012:
            X.0eS.A00(r14)
            java.lang.Object r0 = r13.A04
            X.I4B r0 = (X.I4B) r0
            X.5b4 r7 = r0.A00
            long r2 = r13.A02
            float r1 = X.C51971G9r.A01(r2)
            float r0 = X.C51972G9s.A00(r2)
            long r3 = X.C289325dP.A00(r1, r0)
            r0 = 0
            X.5b7 r2 = X.C51972G9s.A0K(r0)
            long r0 = r13.A01
            X.5dM r1 = X.C51965G9l.A0M(r0)
            X.5dM r0 = X.C51965G9l.A0M(r3)
            r13.A00 = r5
            java.lang.Object r0 = r7.A03(r2, r1, r0, r13)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0041:
            int r4 = r13.A00
            r5 = 3
            r7 = 2
            r3 = 1
            if (r4 == 0) goto L_0x0065
            if (r4 == r3) goto L_0x007b
            long r2 = r13.A02
            long r0 = r13.A01
            if (r4 == r7) goto L_0x0099
            X.0eS.A00(r14)
        L_0x0053:
            X.GQ9 r14 = (X.GQ9) r14
            long r4 = r14.A00
            long r2 = X.GQ9.A02(r2, r4)
            long r0 = X.GQ9.A02(r0, r2)
            X.GQ9 r6 = new X.GQ9
            r6.<init>(r0)
            return r6
        L_0x0065:
            X.0eS.A00(r14)
            long r0 = r13.A01
            java.lang.Object r2 = r13.A04
            androidx.compose.foundation.gestures.ScrollingLogic r2 = (androidx.compose.foundation.gestures.ScrollingLogic) r2
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = r2.A06
            r13.A01 = r0
            r13.A00 = r3
            java.lang.Object r14 = r2.A01(r13, r0)
            if (r14 != r6) goto L_0x0080
            return r6
        L_0x007b:
            long r0 = r13.A01
            X.0eS.A00(r14)
        L_0x0080:
            X.GQ9 r14 = (X.GQ9) r14
            long r2 = r14.A00
            long r2 = X.GQ9.A02(r0, r2)
            java.lang.Object r4 = r13.A04
            androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
            r13.A01 = r0
            r13.A02 = r2
            r13.A00 = r7
            java.lang.Object r14 = r4.A04(r13, r2)
            if (r14 != r6) goto L_0x009c
            return r6
        L_0x0099:
            X.0eS.A00(r14)
        L_0x009c:
            X.GQ9 r14 = (X.GQ9) r14
            long r11 = r14.A00
            java.lang.Object r4 = r13.A04
            androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r7 = r4.A06
            long r9 = X.GQ9.A02(r2, r11)
            r13.A01 = r0
            r13.A02 = r11
            r13.A00 = r5
            r2 = r11
            java.lang.Object r14 = r7.A02(r8, r9, r11)
            if (r14 != r6) goto L_0x0053
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58094ImG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.ImG, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.ImG, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        AnonymousClass4D7 r4 = r11;
        if (this.A03 != 0) {
            return new C58094ImG((I4B) this.A04, r4, this.A02, this.A01);
        }
        ? imG = new C58094ImG((ScrollingLogic) this.A04, r11);
        imG.A01 = ((GQ9) obj).A00;
        return imG;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass4D7 create;
        if (this.A03 != 0) {
            create = AnonymousClass7TE.A1M(obj2, obj, this);
        } else {
            create = create(new GQ9(((GQ9) obj).A00), (AnonymousClass4D7) obj2);
        }
        return ((C58094ImG) create).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58094ImG(I4B i4b, AnonymousClass4D7 r3, long j, long j2) {
        super(2, r3);
        this.A04 = i4b;
        this.A02 = j;
        this.A01 = j2;
    }
}
