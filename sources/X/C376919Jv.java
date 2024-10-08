package X;

/* renamed from: X.9Jv  reason: invalid class name and case insensitive filesystem */
public final class C376919Jv extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public long A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376919Jv(AnonymousClass6IS r2, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A02 = 1;
        this.A03 = r2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9Jv, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.9Jv, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        long j;
        Object obj2;
        int i;
        AnonymousClass4D7 r4 = r10;
        switch (this.A02) {
            case 0:
                obj2 = this.A03;
                j = this.A01;
                i = 0;
                break;
            case 1:
                ? r2 = new C376919Jv((AnonymousClass6IS) this.A03, r10);
                r2.A01 = ((C289295dM) obj).A00;
                return r2;
            case 2:
                j = this.A01;
                obj2 = this.A03;
                i = 2;
                break;
            default:
                obj2 = this.A03;
                j = this.A01;
                i = 3;
                break;
        }
        return new C376919Jv(obj2, r4, i, j);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass4D7 create;
        if (1 - this.A02 != 0) {
            create = create(obj, (AnonymousClass4D7) obj2);
        } else {
            create = create(new C289295dM(((C289295dM) obj).A00), (AnonymousClass4D7) obj2);
        }
        return ((C376919Jv) create).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.9Jv, java.lang.Object, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        X.0eS.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r0 != r6) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ea, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x002e;
                case 1: goto L_0x0089;
                case 2: goto L_0x00b2;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 == r5) goto L_0x003f
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0016:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A03
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r0 = (com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository) r0
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r4 = r0.A01
            long r2 = r8.A01
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 - r0
            r8.A00 = r5
            X.2NP r0 = r4.A01
            java.lang.Object r0 = r0.A0N(r8, r2)
            goto L_0x007c
        L_0x002e:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A00
            r1 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 == r1) goto L_0x003f
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x003f:
            X.0eS.A00(r9)
            goto L_0x00e8
        L_0x0044:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A03
            X.6IS r0 = (X.AnonymousClass6IS) r0
            androidx.compose.foundation.gestures.ScrollingLogic r7 = r0.A09
            long r2 = r8.A01
            r8.A00 = r1
            X.6Gj r5 = r7.A03
            X.6Gj r0 = X.AnonymousClass6Gj.Horizontal
            r4 = 0
            r1 = 2
            if (r5 != r0) goto L_0x005a
            r1 = 1
        L_0x005a:
            r0 = 0
            long r1 = X.GQ9.A01(r4, r4, r1, r2)
            X.ImG r4 = new X.ImG
            r4.<init>(r7, r0)
            X.6Hs r3 = r7.A01
            if (r3 == 0) goto L_0x007f
            X.6Gn r0 = r7.A05
            boolean r0 = r0.AkW()
            if (r0 != 0) goto L_0x0078
            X.6Gn r0 = r7.A05
            boolean r0 = r0.AkV()
            if (r0 == 0) goto L_0x007f
        L_0x0078:
            java.lang.Object r0 = r3.AC9(r8, r4, r1)
        L_0x007c:
            if (r0 != r6) goto L_0x00e8
            return r6
        L_0x007f:
            X.GQ9 r0 = new X.GQ9
            r0.<init>(r1)
            java.lang.Object r0 = r4.invoke(r0, r8)
            goto L_0x007c
        L_0x0089:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            if (r0 == 0) goto L_0x0096
            if (r0 != r3) goto L_0x00aa
            X.0eS.A00(r9)
        L_0x0095:
            return r9
        L_0x0096:
            X.0eS.A00(r9)
            long r1 = r8.A01
            java.lang.Object r0 = r8.A03
            X.6IS r0 = (X.AnonymousClass6IS) r0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r0.A09
            r8.A00 = r3
            java.lang.Object r9 = androidx.compose.foundation.gestures.ScrollableKt.A00(r0, r8, r1)
            if (r9 != r6) goto L_0x0095
            return r6
        L_0x00aa:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00b2:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A00
            r3 = 1
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x00eb
            if (r0 == r2) goto L_0x00fa
            X.0eS.A00(r9)
        L_0x00c1:
            java.lang.Object r0 = r8.A03
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.1IX r4 = r0.A01
            if (r4 == 0) goto L_0x00e8
            long r2 = r8.A01
            r0 = 513(0x201, float:7.19E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = " ms"
            java.lang.String r0 = X.002.A0e(r1, r0, r2)
            X.TSe r1 = new X.TSe
            r1.<init>(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0eQ r0 = new X.0eQ
            r0.<init>(r1)
            r4.resumeWith(r0)
        L_0x00e8:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x00eb:
            X.0eS.A00(r9)
            long r0 = r8.A01
            long r0 = r0 - r3
            r8.A00 = r2
            java.lang.Object r0 = X.C241603Pv.A01(r8, r0)
            if (r0 != r6) goto L_0x00fd
            return r6
        L_0x00fa:
            X.0eS.A00(r9)
        L_0x00fd:
            r8.A00 = r5
            java.lang.Object r0 = X.C241603Pv.A01(r8, r3)
            if (r0 != r6) goto L_0x00c1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376919Jv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376919Jv(Object obj, AnonymousClass4D7 r3, int i, long j) {
        super(2, r3);
        this.A02 = i;
        this.A01 = j;
        this.A03 = obj;
    }
}
