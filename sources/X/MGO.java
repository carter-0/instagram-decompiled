package X;

public final class MGO extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, AnonymousClass4D7 r8, int i) {
        super(2, r8);
        this.A01 = i;
        this.A06 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
        this.A00 = obj6;
    }

    public static C3723790p A00(C63881LAk lAk) {
        C3723790p r1 = new C3723790p(lAk.A00);
        r1.A0A = lAk.A03;
        r1.A0E = lAk.A06;
        r1.A0J = lAk.A07;
        r1.A0C = lAk.A04;
        r1.A09 = lAk.A02;
        String str = lAk.A05;
        r1.A0D = str;
        if (str != null) {
            r1.A07 = AnonymousClass000.A00(3020);
        }
        return r1;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.MGO, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ac, code lost:
        r2 = new X.MGO(r3, r4, r5, r6, r7, r8, r9);
        r2.A00 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b4, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        return new X.MGO(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            int r1 = r10.A01
            r8 = r12
            switch(r1) {
                case 0: goto L_0x001a;
                case 1: goto L_0x0028;
                case 2: goto L_0x0070;
                case 3: goto L_0x0036;
                case 4: goto L_0x007c;
                case 5: goto L_0x0088;
                case 6: goto L_0x0094;
                case 7: goto L_0x0044;
                case 8: goto L_0x0052;
                case 9: goto L_0x00a0;
                case 10: goto L_0x0061;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r2 = r10.A06
            java.lang.Object r4 = r10.A04
            java.lang.Object r3 = r10.A05
            java.lang.Object r6 = r10.A03
            java.lang.Object r5 = r10.A02
            java.lang.Object r7 = r10.A00
            r9 = 11
        L_0x0014:
            X.MGO r1 = new X.MGO
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L_0x001a:
            java.lang.Object r2 = r10.A06
            java.lang.Object r3 = r10.A05
            java.lang.Object r4 = r10.A04
            java.lang.Object r5 = r10.A02
            java.lang.Object r6 = r10.A03
            java.lang.Object r7 = r10.A00
            r9 = 0
            goto L_0x0014
        L_0x0028:
            java.lang.Object r6 = r10.A03
            java.lang.Object r4 = r10.A04
            java.lang.Object r5 = r10.A02
            java.lang.Object r2 = r10.A06
            java.lang.Object r3 = r10.A05
            java.lang.Object r7 = r10.A00
            r9 = 1
            goto L_0x0014
        L_0x0036:
            java.lang.Object r3 = r10.A05
            java.lang.Object r2 = r10.A06
            java.lang.Object r7 = r10.A00
            java.lang.Object r5 = r10.A02
            java.lang.Object r6 = r10.A03
            java.lang.Object r4 = r10.A04
            r9 = 3
            goto L_0x0014
        L_0x0044:
            java.lang.Object r5 = r10.A02
            java.lang.Object r4 = r10.A04
            java.lang.Object r3 = r10.A05
            java.lang.Object r6 = r10.A03
            java.lang.Object r2 = r10.A06
            java.lang.Object r7 = r10.A00
            r9 = 7
            goto L_0x0014
        L_0x0052:
            java.lang.Object r2 = r10.A06
            java.lang.Object r3 = r10.A05
            java.lang.Object r5 = r10.A02
            java.lang.Object r7 = r10.A00
            java.lang.Object r4 = r10.A04
            java.lang.Object r6 = r10.A03
            r9 = 8
            goto L_0x0014
        L_0x0061:
            java.lang.Object r3 = r10.A05
            java.lang.Object r7 = r10.A00
            java.lang.Object r4 = r10.A04
            java.lang.Object r5 = r10.A02
            java.lang.Object r2 = r10.A06
            java.lang.Object r6 = r10.A03
            r9 = 10
            goto L_0x0014
        L_0x0070:
            java.lang.Object r3 = r10.A05
            java.lang.Object r4 = r10.A04
            java.lang.Object r5 = r10.A06
            java.lang.Object r6 = r10.A02
            java.lang.Object r7 = r10.A03
            r9 = 2
            goto L_0x00ac
        L_0x007c:
            java.lang.Object r3 = r10.A05
            java.lang.Object r5 = r10.A06
            java.lang.Object r4 = r10.A04
            java.lang.Object r7 = r10.A03
            java.lang.Object r6 = r10.A02
            r9 = 4
            goto L_0x00ac
        L_0x0088:
            java.lang.Object r5 = r10.A06
            java.lang.Object r6 = r10.A02
            java.lang.Object r7 = r10.A03
            java.lang.Object r4 = r10.A04
            java.lang.Object r3 = r10.A05
            r9 = 5
            goto L_0x00ac
        L_0x0094:
            java.lang.Object r5 = r10.A06
            java.lang.Object r6 = r10.A02
            java.lang.Object r7 = r10.A03
            java.lang.Object r4 = r10.A04
            java.lang.Object r3 = r10.A05
            r9 = 6
            goto L_0x00ac
        L_0x00a0:
            java.lang.Object r5 = r10.A06
            java.lang.Object r6 = r10.A02
            java.lang.Object r7 = r10.A03
            java.lang.Object r4 = r10.A04
            java.lang.Object r3 = r10.A05
            r9 = 9
        L_0x00ac:
            X.MGO r1 = new X.MGO
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.A00 = r11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGO.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:242:0x08aa, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01ca, code lost:
        if (r6 == X.AnonymousClass55S.A08) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0346, code lost:
        if (r7 != null) goto L_0x034c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x037f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            r35 = this;
            r0 = r35
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x07e7;
                case 1: goto L_0x0769;
                case 2: goto L_0x0714;
                case 3: goto L_0x05aa;
                case 4: goto L_0x04a3;
                case 5: goto L_0x03cd;
                case 6: goto L_0x024c;
                case 7: goto L_0x01a3;
                case 8: goto L_0x009f;
                case 9: goto L_0x0059;
                case 10: goto L_0x0031;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.0eS.A00(r36)
            java.lang.Object r3 = r0.A04
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r6 = r0.A05
            X.3Ym r6 = (X.C243373Ym) r6
            java.lang.Object r4 = r0.A03
            X.4DU r4 = (X.AnonymousClass4DU) r4
            java.lang.Object r1 = r0.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r0.A00
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            android.app.Activity r0 = X.C61270mF.A00(r1)
            r5 = 0
            r12 = 0
            r14 = -1
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r13 = r12
            com.instagram.save.api.SaveApiUtil.A04(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x002e:
            X.0gF r7 = X.C60340gF.A00
        L_0x0030:
            return r7
        L_0x0031:
            X.0eS.A00(r36)
            java.lang.Object r4 = r0.A05
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r7 = r0.A00
            X.3Ym r7 = (X.C243373Ym) r7
            java.lang.Object r5 = r0.A04
            X.4DU r5 = (X.AnonymousClass4DU) r5
            java.lang.Object r1 = r0.A02
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r3 = r0.A06
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r6 = 0
            java.lang.Object r2 = r0.A03
            android.content.Context r2 = (android.content.Context) r2
            r13 = 0
            r15 = -1
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r14 = r13
            com.instagram.save.api.SaveApiUtil.A04(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x002e
        L_0x0059:
            X.0eS.A00(r36)
            java.lang.Object r5 = r0.A00
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r4 = r0.A06
            X.H1G r4 = (X.H1G) r4
            X.GgD r1 = r4.A00
            java.lang.String r7 = "viewModel"
            r13 = 0
            if (r1 == 0) goto L_0x083b
            X.0r6 r6 = r1.A04
            java.lang.Object r10 = r0.A02
            X.U94 r10 = (X.U94) r10
            r3 = 12
            r2 = 42
            X.MGf r1 = new X.MGf
            r1.<init>((java.lang.Object) r10, (X.AnonymousClass4D7) r13, (int) r3, (int) r2)
            X.C51968G9o.A1P(r1, r5, r6)
            X.0r6 r1 = r10.A02
            java.lang.Object r11 = r0.A03
            com.instagram.ui.emptystaterow.EmptyStateView r11 = (com.instagram.ui.emptystaterow.EmptyStateView) r11
            java.lang.Object r9 = r0.A04
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            java.lang.Object r12 = r0.A05
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r12 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r12
            X.MGM r8 = new X.MGM
            r8.<init>(r9, r10, r11, r12, r13)
            X.C51968G9o.A1P(r8, r5, r1)
            X.GgD r0 = r4.A00
            if (r0 == 0) goto L_0x083b
            X.0r6 r1 = r0.A05
            r0 = 35
            X.C66185MGw.A01(r4, r5, r1, r0)
            goto L_0x002e
        L_0x009f:
            X.0eS.A00(r36)
            java.lang.Object r6 = r0.A06
            X.HDf r6 = (X.C54432HDf) r6
            X.4Z9 r1 = r6.A01
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r2 = r0.A02
            X.1P0 r2 = (X.1P0) r2
            java.lang.Object r3 = r0.A00
            X.4D6 r3 = (X.AnonymousClass4D6) r3
            X.AnonymousClass7TG.A1O(r2, r3)
            X.4Z9 r1 = r6.A01
            if (r1 == 0) goto L_0x0102
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r6.A02 = r0
            X.H4w r0 = new X.H4w
            r0.<init>(r2, r6)
            X.4Zb r2 = new X.4Zb
            r2.<init>(r0, r1)
        L_0x00c7:
            r3.schedule(r2)
            goto L_0x002e
        L_0x00cc:
            java.lang.Object r1 = r0.A04
            X.HQT r1 = (X.HQT) r1
            boolean r5 = r1.A00
            if (r5 != 0) goto L_0x010b
            com.instagram.common.session.UserSession r4 = r6.A05
            X.4Za r3 = r6.A00
            java.lang.Object r2 = r0.A05
            X.LAk r2 = (X.C63881LAk) r2
            X.L70 r1 = r6.A06
            boolean r1 = X.C55103HcC.A00(r3, r4, r1, r2)
            if (r1 == 0) goto L_0x010b
            java.lang.Object r2 = r0.A02
            X.1P0 r2 = (X.1P0) r2
            java.lang.Object r3 = r0.A00
            X.4D6 r3 = (X.AnonymousClass4D6) r3
            X.AnonymousClass7TG.A1O(r2, r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r6.A02 = r0
            X.4Za r1 = r6.A00
            if (r1 == 0) goto L_0x002e
            X.H4w r0 = new X.H4w
            r0.<init>(r2, r6)
            X.6ph r2 = new X.6ph
            r2.<init>(r0, r1)
            goto L_0x00c7
        L_0x0102:
            java.lang.String r1 = "PrefetchableRepository"
            java.lang.String r0 = "Tried to connect when no request is in progress"
            X.0wb.A03(r1, r0)
            goto L_0x002e
        L_0x010b:
            X.I0U r2 = X.I0U.A00
            com.instagram.common.session.UserSession r1 = r6.A05
            java.lang.Object r8 = r0.A05
            X.LAk r8 = (X.C63881LAk) r8
            X.L70 r9 = r6.A06
            boolean r2 = r2.A00(r1, r9, r8)
            r1 = 1287(0x507, float:1.803E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r1)
            if (r2 == 0) goto L_0x017a
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.Object r1 = r0.A03
            X.Hj0 r1 = (X.C55518Hj0) r1
            r11 = 1
            X.90p r7 = A00(r8)
            android.content.Context r1 = r1.A00
            r7.A01 = r1
            long r1 = r9.A00
            r7.A00 = r1
            java.lang.Integer r1 = r9.A01
            r7.A04 = r1
            java.lang.String r1 = r8.A01
            r7.A08 = r1
            X.1OC r8 = r7.A02()
        L_0x0140:
            java.lang.Object r1 = r0.A02
            X.1P0 r1 = (X.1P0) r1
            java.lang.Object r7 = r0.A00
            X.4D6 r7 = (X.AnonymousClass4D6) r7
            X.AnonymousClass7TF.A1B(r8, r11, r1)
            r10 = 3
            r0 = 5
            X.0qQ.A0B(r7, r0)
            r6.A02 = r3
            r6.A04 = r5
            X.H4w r3 = new X.H4w
            r3.<init>(r1, r6)
            r8.A00 = r3
            X.0nO r2 = X.0nY.A00()
            X.0qQ.A07(r2)
            r1 = 0
            X.4Z9 r0 = new X.4Z9
            r0.<init>(r1, r8, r2)
            r0.A00(r3)
            r6.A01 = r0
            r6.A03 = r4
            if (r5 == 0) goto L_0x019e
            r9 = 1765100087(0x69354a37, float:1.3697878E25)
            r12 = r11
            r7.schedule(r8, r9, r10, r11, r12)
            goto L_0x002e
        L_0x017a:
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            java.lang.Object r1 = r0.A03
            X.Hj0 r1 = (X.C55518Hj0) r1
            r11 = 1
            X.90p r7 = A00(r8)
            android.content.Context r1 = r1.A00
            r7.A01 = r1
            r1 = 4500(0x1194, double:2.2233E-320)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7.A05 = r1
            java.lang.Integer r1 = r9.A02
            r7.A04 = r1
            java.lang.String r1 = r8.A01
            r7.A08 = r1
            X.1OC r8 = r7.A01()
            goto L_0x0140
        L_0x019e:
            r7.schedule(r8)
            goto L_0x002e
        L_0x01a3:
            X.0eS.A00(r36)
            java.lang.Object r5 = r0.A02
            X.55U r5 = (X.AnonymousClass55U) r5
            r2 = 1
            if (r5 == 0) goto L_0x020f
            java.lang.Object r8 = r0.A05
            X.3Q2 r8 = (X.AnonymousClass3Q2) r8
            java.lang.Object r7 = r0.A03
            X.37k r7 = (X.C2373837k) r7
            java.lang.Object r4 = r0.A06
            com.instagram.pendingmedia.service.impl.PendingMediaWorker r4 = (com.instagram.pendingmedia.service.impl.PendingMediaWorker) r4
            java.lang.Object r1 = r0.A04
            X.JvL r1 = (X.C61021JvL) r1
            java.lang.Object r3 = r0.A00
            X.0lg r3 = (X.0lg) r3
            X.55S r6 = r5.A01
            X.55S r0 = X.AnonymousClass55S.A0T
            if (r6 == r0) goto L_0x01cc
            X.55S r5 = X.AnonymousClass55S.A08
            r0 = 0
            if (r6 != r5) goto L_0x01cd
        L_0x01cc:
            r0 = 1
        L_0x01cd:
            if (r0 == 0) goto L_0x083f
            X.C63385Kw6.A00(r8, r7)
            X.1ud r6 = X.1ua.A0G
            X.0eM r0 = r4.A03
            java.lang.Object r5 = r0.getValue()
            X.385 r5 = (X.AnonymousClass385) r5
            r3 = 0
            androidx.work.WorkerParameters r0 = r4.mWorkerParams
            int r7 = r0.A01
            int r0 = r1.A00
            int r0 = r0 + 1
            int r14 = java.lang.Math.max(r7, r0)
            java.lang.String r11 = r1.A06
            java.lang.String r12 = r1.A04
            X.1iA r9 = r1.A02
            com.instagram.pendingmedia.model.constants.ShareType r10 = r1.A03
            X.28D r8 = r1.A01
            java.lang.String r13 = r1.A05
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.DbZ.A0t(r2, r12, r9, r10)
            r0 = 5
            X.0qQ.A0B(r13, r0)
            X.JvL r7 = new X.JvL
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r6.A02(r5, r7)
            java.lang.String r0 = "Network Error"
            X.5Fh r7 = com.instagram.pendingmedia.service.impl.PendingMediaWorker.A00(r1, r4, r0, r3)
            return r7
        L_0x020f:
            java.lang.Object r1 = r0.A04
            X.JvL r1 = (X.C61021JvL) r1
            X.3tw r1 = r1.A00()
            X.5G1 r7 = new X.5G1
            r7.<init>(r1)
            java.lang.Object r6 = r0.A06
            com.instagram.pendingmedia.service.impl.PendingMediaWorker r6 = (com.instagram.pendingmedia.service.impl.PendingMediaWorker) r6
            java.lang.Object r5 = r0.A00
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.OI4 r4 = r6.A01
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0030
            X.Mqx r3 = X.C67625Mqx.A00
            com.instagram.pendingmedia.model.constants.ShareType r1 = r4.A04
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            if (r1 == r0) goto L_0x023e
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            if (r1 == r0) goto L_0x023e
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
            if (r1 != r0) goto L_0x024a
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x024a
        L_0x023e:
            r0 = 1
        L_0x023f:
            if (r0 != 0) goto L_0x0030
            android.content.Context r0 = r6.mAppContext
            X.0qQ.A07(r0)
            r3.A02(r0, r5, r4, r2)
            return r7
        L_0x024a:
            r0 = 0
            goto L_0x023f
        L_0x024c:
            X.0eS.A00(r36)
            java.lang.Object r1 = r0.A00
            X.0eP r1 = (X.0eP) r1
            java.lang.Object r15 = r1.A00
            X.KVs r15 = (X.C62019KVs) r15
            java.lang.Object r1 = r1.A01
            X.55U r1 = (X.AnonymousClass55U) r1
            java.lang.Object r14 = r0.A06
            com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor r14 = (com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor) r14
            java.lang.Object r3 = r0.A02
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r8 = r0.A03
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r5 = r0.A04
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r2 = r0.A05
            java.util.Map r2 = (java.util.Map) r2
            X.3Q2 r13 = r15.A02
            java.lang.String r0 = r13.A35
            r5.remove(r0)
            java.lang.String r0 = r13.A35
            java.lang.Object r0 = r2.remove(r0)
            X.4Co r0 = (X.C262204Co) r0
            r9 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0285
            r0.AG7(r6)
        L_0x0285:
            java.lang.String r0 = r13.A35
            java.lang.Object r7 = r8.get(r0)
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            if (r7 == 0) goto L_0x0292
            r7.remove(r15)
        L_0x0292:
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            if (r7 == 0) goto L_0x029d
            java.util.Iterator r6 = r7.iterator()
        L_0x029d:
            r4 = 0
            if (r6 == 0) goto L_0x02b7
            boolean r0 = r6.hasNext()
            if (r0 != r9) goto L_0x02b7
            java.lang.Object r4 = X.AnonymousClass7TF.A0a(r6)
            X.KVs r4 = (X.C62019KVs) r4
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x029d
            r11.add(r4)
            r6.remove()
            goto L_0x029d
        L_0x02b7:
            boolean r12 = r13.A14()
            if (r12 == 0) goto L_0x02c5
            if (r7 == 0) goto L_0x02c5
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x02c8
        L_0x02c5:
            r13.A0l(r4)
        L_0x02c8:
            X.37r r10 = r14.A06
            if (r10 == 0) goto L_0x0311
            r13.A0P()
            X.3QD r6 = r13.A1f
            X.3QD r0 = r13.A6J
            if (r6 == r0) goto L_0x0301
            X.3QD r6 = r13.A6J
            X.3QD r0 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r6 == r0) goto L_0x0301
            X.1ua r0 = r10.A00
            X.37k r9 = r0.A02
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "PendingMedia status "
            r6.append(r0)
            X.3QD r0 = r13.A1f
            r6.append(r0)
            java.lang.String r0 = " does not match target status "
            r6.append(r0)
            X.3QD r0 = r13.A6J
            java.lang.String r6 = X.AnonymousClass7TF.A0i(r0, r6)
            r0 = 640(0x280, float:8.97E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.Cjn(r13, r0, r6)
        L_0x0301:
            X.1ua r9 = r10.A00
            X.0eM r0 = r9.A08
            android.os.Handler r6 = X.JTO.A0E(r0)
            X.M7n r0 = new X.M7n
            r0.<init>(r13, r9)
            r6.post(r0)
        L_0x0311:
            X.3Ns r0 = r15.A04
            r0.A0T(r1)
            java.util.Iterator r6 = r11.iterator()
        L_0x031a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x032c
            java.lang.Object r0 = r6.next()
            X.KVs r0 = (X.C62019KVs) r0
            X.3Ns r0 = r0.A04
            r0.A0T(r1)
            goto L_0x031a
        L_0x032c:
            if (r12 != 0) goto L_0x0346
            if (r7 == 0) goto L_0x0376
            java.util.Iterator r6 = r7.iterator()
        L_0x0334:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0349
            java.lang.Object r0 = r6.next()
            X.KVs r0 = (X.C62019KVs) r0
            X.3Ns r0 = r0.A04
            r0.A0T(r1)
            goto L_0x0334
        L_0x0346:
            if (r7 == 0) goto L_0x0376
            goto L_0x034c
        L_0x0349:
            r7.clear()
        L_0x034c:
            java.lang.Object r7 = X.00k.A0J(r7)
            X.KVs r7 = (X.C62019KVs) r7
            if (r7 == 0) goto L_0x0376
            X.3Q2 r0 = r7.A02
            java.lang.String r6 = r0.A35
            java.util.concurrent.atomic.AtomicInteger r0 = r14.A09
            r0.incrementAndGet()
            X.4Cq r4 = r7.A05
            if (r4 != 0) goto L_0x0362
            r4 = r3
        L_0x0362:
            X.0nV r3 = r14.A04
            r2 = 0
            r0 = 6
            X.9KE r1 = new X.9KE
            r1.<init>(r14, r7, r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Er r0 = X.1Eo.A03(r0, r3, r1, r4)
            r5.put(r6, r0)
            goto L_0x002e
        L_0x0376:
            java.lang.String r0 = r13.A35
            r8.remove(r0)
            boolean r0 = r15.A06
            if (r0 == 0) goto L_0x002e
            r16 = 0
            if (r1 == 0) goto L_0x03aa
            X.55S r1 = r1.A01
        L_0x0385:
            X.55S r0 = X.AnonymousClass55S.A0T
            if (r1 == r0) goto L_0x03ad
            X.55S r0 = X.AnonymousClass55S.A08
            if (r1 == r0) goto L_0x03ad
            boolean r0 = r13.A13()
            if (r0 == 0) goto L_0x002e
            int r1 = r15.A01
            r0 = 2
            if (r1 != r0) goto L_0x002e
            X.MH5 r12 = new X.MH5
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            X.1Er r1 = X.C51966G9m.A1L(r12, r3)
            java.lang.String r0 = r13.A35
            r2.put(r0, r1)
            goto L_0x002e
        L_0x03aa:
            r1 = r16
            goto L_0x0385
        L_0x03ad:
            X.37k r0 = r14.A05
            X.C63385Kw6.A00(r13, r0)
            X.1ud r5 = X.1ua.A0G
            X.0eM r0 = r14.A0A
            java.lang.Object r4 = r0.getValue()
            X.385 r4 = (X.AnonymousClass385) r4
            com.instagram.common.session.UserSession r0 = r14.A02
            java.lang.String r3 = r0.A05
            java.lang.String r2 = "SINGULAR_PENDING_MEDIA_UPLOAD"
            r1 = -1
            X.JvL r0 = new X.JvL
            r0.<init>(r13, r3, r2, r1)
            r5.A02(r4, r0)
            goto L_0x002e
        L_0x03cd:
            X.0eS.A00(r36)
            java.lang.Object r3 = r0.A00
            X.KnL r3 = (X.C62845KnL) r3
            boolean r1 = r3 instanceof X.C62019KVs
            if (r1 == 0) goto L_0x045a
            java.lang.Object r5 = r0.A06
            com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor r5 = (com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor) r5
            java.lang.Object r2 = r0.A02
            X.4Cq r2 = (X.C262224Cq) r2
            X.KVs r3 = (X.C62019KVs) r3
            X.3Q2 r11 = r3.A02
            java.lang.String r12 = r3.A03
            int r15 = r3.A01
            X.3Ns r13 = r3.A04
            X.4Cq r14 = r3.A05
            boolean r1 = r3.A06
            X.C51974G9v.A1K(r11, r12, r13)
            X.KVs r10 = new X.KVs
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.Object r9 = r0.A03
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r6 = r0.A04
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r1 = r0.A05
            java.util.Map r1 = (java.util.Map) r1
            X.3Q2 r8 = r10.A02
            java.lang.String r0 = r8.A35
            java.lang.Object r0 = r1.remove(r0)
            X.4Co r0 = (X.C262204Co) r0
            r4 = 1
            X.4D7 r7 = X.C51975G9x.A0t(r0)
            java.lang.String r3 = r8.A35
            java.lang.Object r1 = r9.get(r3)
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            if (r1 == 0) goto L_0x0420
            r1.size()
        L_0x0420:
            if (r1 == 0) goto L_0x042d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x042d
            r1.add(r10)
            goto L_0x002e
        L_0x042d:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r0.add(r10)
            r9.put(r3, r0)
            r8.A0l(r4)
            java.lang.String r4 = r8.A35
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A09
            r0.incrementAndGet()
            X.4Cq r3 = r10.A05
            if (r3 != 0) goto L_0x0447
            r3 = r2
        L_0x0447:
            X.0nV r2 = r5.A04
            r0 = 6
            X.9KE r1 = new X.9KE
            r1.<init>(r5, r10, r7, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Er r0 = X.1Eo.A03(r0, r2, r1, r3)
            r6.put(r4, r0)
            goto L_0x002e
        L_0x045a:
            boolean r1 = r3 instanceof X.C62018KVr
            if (r1 == 0) goto L_0x089e
            X.KVr r3 = (X.C62018KVr) r3
            java.lang.Object r1 = r0.A03
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r5 = r0.A04
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r0 = r0.A05
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r4 = r3.A00
            java.lang.Object r0 = r0.remove(r4)
            X.4Co r0 = (X.C262204Co) r0
            r3 = 0
            if (r0 == 0) goto L_0x047a
            r0.AG7(r3)
        L_0x047a:
            java.lang.Object r0 = r1.get(r4)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            if (r0 == 0) goto L_0x0496
            java.util.Iterator r2 = r0.iterator()
        L_0x0486:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0496
            java.lang.Object r1 = r2.next()
            X.KVs r1 = (X.C62019KVs) r1
            r0 = 1
            r1.A00 = r0
            goto L_0x0486
        L_0x0496:
            java.lang.Object r0 = r5.remove(r4)
            X.4Co r0 = (X.C262204Co) r0
            if (r0 == 0) goto L_0x002e
            r0.AG7(r3)
            goto L_0x002e
        L_0x04a3:
            X.0eS.A00(r36)
            java.lang.Object r11 = r0.A00
            X.MQV r11 = (X.MQV) r11
            boolean r1 = r11 instanceof X.C61199Jys
            if (r1 == 0) goto L_0x04bd
            java.lang.Object r3 = r0.A05
            X.7b2 r3 = (X.C334297b2) r3
            r1 = r11
            X.Jys r1 = (X.C61199Jys) r1
            java.util.List r2 = r1.A03
            r1 = 0
            X.0qQ.A0B(r2, r1)
            r3.A01 = r2
        L_0x04bd:
            java.lang.Object r1 = r0.A06
            X.K6q r1 = (X.C61419K6q) r1
            X.0eM r2 = r1.A06
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            X.0eM r5 = r1.A07
            java.lang.Object r10 = r5.getValue()
            X.JjH r10 = (X.C60314JjH) r10
            X.0eM r2 = r1.A02
            java.lang.Object r9 = r2.getValue()
            X.OLz r9 = (X.C70804OLz) r9
            X.L9j r2 = r1.A00
            java.lang.String r4 = "themeHelper"
            if (r2 == 0) goto L_0x08a3
            X.7L2 r12 = r2.A00
            java.lang.Object r3 = r0.A04
            com.facebook.litho.LithoView r3 = (com.facebook.litho.LithoView) r3
            java.lang.Object r13 = r0.A03
            X.K6q r13 = (X.C61419K6q) r13
            java.lang.Object r7 = r0.A05
            X.7b2 r7 = (X.C334297b2) r7
            X.AnonymousClass7TG.A1N(r3, r11)
            r2 = 2
            X.C51974G9v.A0d(r2, r9, r8, r10, r13)
            r2 = 7
            X.0qQ.A0B(r7, r2)
            X.Gw7 r6 = new X.Gw7
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r3.setComponentAsync(r6)
            java.lang.Object r10 = r0.A02
            X.LZa r10 = (X.C64300LZa) r10
            java.lang.Object r11 = r5.getValue()
            X.JjH r11 = (X.C60314JjH) r11
            X.L9j r0 = r1.A00
            if (r0 == 0) goto L_0x08a3
            X.7L2 r13 = r0.A00
            r0 = 1
            X.0qQ.A0B(r11, r0)
            X.7L0 r7 = r13.A07
            X.L9i r3 = r10.A03
            android.view.ViewGroup r9 = r3.A00
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r9)
            int r0 = r7.A0E
            android.view.ContextThemeWrapper r8 = new android.view.ContextThemeWrapper
            r8.<init>(r5, r0)
            int r4 = r7.A04
            android.graphics.drawable.Drawable r2 = r7.A0F
            boolean r0 = r2 instanceof android.graphics.drawable.GradientDrawable
            r14 = 0
            if (r0 == 0) goto L_0x05a8
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            if (r2 == 0) goto L_0x0533
            r2.setColor(r4)
        L_0x0533:
            r6 = 0
            if (r2 == 0) goto L_0x0539
            r2.setStroke(r6, r6)
        L_0x0539:
            r9.setBackground(r2)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = r3.A03
            r0 = 2132017861(0x7f1402c5, float:1.9674012E38)
            r2.setTextAppearance(r8, r0)
            int r0 = r7.A0B
            if (r0 == 0) goto L_0x054b
            r2.setHintTextColor(r0)
        L_0x054b:
            android.widget.TextView r4 = r3.A01
            android.text.TextPaint r0 = r4.getPaint()
            r0.setShader(r14)
            int[] r2 = r7.A0K
            int r0 = r2.length
            if (r0 != 0) goto L_0x05a2
            int r0 = X.2Yu.A0D(r5)
            android.content.res.ColorStateList r0 = X.02K.A02(r5, r0)
            r4.setTextColor(r0)
        L_0x0564:
            r4.invalidate()
            X.0Ud r0 = r11.A0F
            java.lang.Object r5 = r0.getValue()
            X.7ac r5 = (X.C334067ac) r5
            X.OLz r4 = r11.A09
            com.facebook.litho.LithoView r3 = r3.A02
            X.JjH r2 = r10.A05
            X.4DU r0 = r10.A06
            X.Gtw r15 = new X.Gtw
            r17 = r4
            r18 = r2
            r19 = r13
            r20 = r0
            r16 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            r3.setComponent(r15)
            r3.setVisibility(r6)
            X.07U r9 = X.07U.A05
            X.07Z r12 = r1.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r12)
            r15 = 35
            X.JUk r8 = new X.JUk
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (X.AnonymousClass4D7) r14, (int) r15)
            X.AnonymousClass7TE.A1Z(r8, r0)
            goto L_0x002e
        L_0x05a2:
            r0 = r2[r6]
            r4.setTextColor(r0)
            goto L_0x0564
        L_0x05a8:
            r2 = r14
            goto L_0x0533
        L_0x05aa:
            X.0eS.A00(r36)
            java.lang.Object r4 = r0.A05     // Catch:{ NotFoundException -> 0x070c }
            X.1Av r4 = (X.1Av) r4     // Catch:{ NotFoundException -> 0x070c }
            java.lang.Object r2 = r0.A06     // Catch:{ NotFoundException -> 0x070c }
            X.7jJ r2 = (X.C339257jJ) r2     // Catch:{ NotFoundException -> 0x070c }
            java.lang.Object r3 = r0.A00     // Catch:{ NotFoundException -> 0x070c }
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3     // Catch:{ NotFoundException -> 0x070c }
            java.lang.Object r1 = r0.A02     // Catch:{ NotFoundException -> 0x070c }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ NotFoundException -> 0x070c }
            java.lang.Object r5 = r0.A03     // Catch:{ NotFoundException -> 0x070c }
            X.4Cq r5 = (X.C262224Cq) r5     // Catch:{ NotFoundException -> 0x070c }
            java.lang.Object r0 = r0.A04     // Catch:{ NotFoundException -> 0x070c }
            boolean r6 = r4.A1m()     // Catch:{ NotFoundException -> 0x070c }
            if (r6 == 0) goto L_0x0641
            boolean r6 = r4.A1n()     // Catch:{ NotFoundException -> 0x070c }
            if (r6 != 0) goto L_0x002e
            r9 = 1
            X.0s0 r8 = r4.A2W     // Catch:{ NotFoundException -> 0x070c }
            X.0YZ[] r7 = X.1Av.A8a     // Catch:{ NotFoundException -> 0x070c }
            r6 = 382(0x17e, float:5.35E-43)
            X.AnonymousClass7TF.A1J(r4, r8, r7, r6, r9)     // Catch:{ NotFoundException -> 0x070c }
            r8 = 0
            r4 = 2131237547(0x7f081aab, float:1.8091348E38)
            com.instagram.ui.primer.TitleIcon r7 = new com.instagram.ui.primer.TitleIcon     // Catch:{ NotFoundException -> 0x070c }
            r7.<init>(r8, r4)     // Catch:{ NotFoundException -> 0x070c }
            r6 = 2131974013(0x7f13577d, float:1.9585078E38)
            r4 = 2131974014(0x7f13577e, float:1.958508E38)
            java.util.List r19 = X.C339257jJ.A01(r1, r6, r4)     // Catch:{ NotFoundException -> 0x070c }
            r4 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r1, r4)     // Catch:{ NotFoundException -> 0x070c }
            java.lang.String r15 = "amg_albums_camera_roll_access_confirmation_nux"
            java.lang.String r17 = ""
            r20 = 2131974020(0x7f135784, float:1.9585092E38)
            r21 = 0
            com.instagram.ui.primer.PrimerBottomSheetConfig r6 = new com.instagram.ui.primer.PrimerBottomSheetConfig     // Catch:{ NotFoundException -> 0x070c }
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r18 = r8
            r22 = r21
            r23 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ NotFoundException -> 0x070c }
            X.LOZ r4 = new X.LOZ     // Catch:{ NotFoundException -> 0x070c }
            r9 = r4
            r10 = r3
            r11 = r6
            r13 = r21
            r14 = r13
            r15 = r13
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ NotFoundException -> 0x070c }
            r10 = 2
            X.LXf r3 = new X.LXf     // Catch:{ NotFoundException -> 0x070c }
            r9 = r3
            r11 = r1
            r12 = r0
            r13 = r5
            r14 = r2
            r15 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ NotFoundException -> 0x070c }
            r4.A00 = r3     // Catch:{ NotFoundException -> 0x070c }
            r2.A00 = r4     // Catch:{ NotFoundException -> 0x070c }
            X.0eM r0 = r2.A01     // Catch:{ NotFoundException -> 0x070c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ NotFoundException -> 0x070c }
            X.12V r0 = (X.AnonymousClass12V) r0     // Catch:{ NotFoundException -> 0x070c }
            X.12U r0 = (X.AnonymousClass12U) r0     // Catch:{ NotFoundException -> 0x070c }
            X.4CZ r3 = r0.A04     // Catch:{ NotFoundException -> 0x070c }
            r0 = 29
            X.MGa r2 = new X.MGa     // Catch:{ NotFoundException -> 0x070c }
            r2.<init>(r1, r4, r8, r0)     // Catch:{ NotFoundException -> 0x070c }
        L_0x063c:
            X.1Eo.A05(r3, r2, r5)     // Catch:{ NotFoundException -> 0x070c }
            goto L_0x002e
        L_0x0641:
            X.0s0 r10 = r4.A27     // Catch:{ NotFoundException -> 0x070c }
            X.0YZ[] r9 = X.1Av.A8a     // Catch:{ NotFoundException -> 0x070c }
            r7 = 380(0x17c, float:5.32E-43)
            boolean r6 = X.AnonymousClass7TG.A1a(r4, r10, r9, r7)     // Catch:{ NotFoundException -> 0x070c }
            if (r6 != 0) goto L_0x002e
            r28 = 1
            r6 = r9[r7]     // Catch:{ NotFoundException -> 0x070c }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r28)     // Catch:{ NotFoundException -> 0x070c }
            r10.Epx(r4, r8, r6)     // Catch:{ NotFoundException -> 0x070c }
            X.0s0 r7 = r4.A2W     // Catch:{ NotFoundException -> 0x070c }
            r6 = 382(0x17e, float:5.35E-43)
            X.DbS.A1a(r4, r8, r7, r9, r6)     // Catch:{ NotFoundException -> 0x070c }
            r12 = 0
            r6 = 2131237547(0x7f081aab, float:1.8091348E38)
            com.instagram.ui.primer.TitleIcon r11 = new com.instagram.ui.primer.TitleIcon     // Catch:{ NotFoundException -> 0x070c }
            r11.<init>(r12, r6)     // Catch:{ NotFoundException -> 0x070c }
            r7 = 2131974015(0x7f13577f, float:1.9585082E38)
            r6 = 2131974017(0x7f135781, float:1.9585086E38)
            java.util.List r23 = X.C339257jJ.A01(r1, r7, r6)     // Catch:{ NotFoundException -> 0x070c }
            r6 = 2131974022(0x7f135786, float:1.9585096E38)
            java.lang.String r20 = X.AnonymousClass7TE.A16(r1, r6)     // Catch:{ NotFoundException -> 0x070c }
            r6 = 2131968513(0x7f134201, float:1.9573923E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r1, r6)     // Catch:{ NotFoundException -> 0x070c }
            java.lang.String r19 = "amg_albums_camera_roll_access_consent_nux"
            r24 = 2131974023(0x7f135787, float:1.9585098E38)
            r25 = 0
            com.instagram.ui.primer.PrimerBottomSheetConfig r10 = new com.instagram.ui.primer.PrimerBottomSheetConfig     // Catch:{ NotFoundException -> 0x070c }
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r22 = r12
            r26 = r25
            r27 = r25
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ NotFoundException -> 0x070c }
            int r7 = X.DbV.A02(r1)     // Catch:{ NotFoundException -> 0x070c }
            r6 = 7
            X.ESw r9 = new X.ESw     // Catch:{ NotFoundException -> 0x070c }
            r9.<init>((android.content.Context) r1, (com.instagram.common.session.UserSession) r3, (int) r7, (int) r6)     // Catch:{ NotFoundException -> 0x070c }
            r6 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r1, r6)     // Catch:{ NotFoundException -> 0x070c }
            r7 = 2131974021(0x7f135785, float:1.9585094E38)
            java.lang.Object[] r6 = new java.lang.Object[]{r8}     // Catch:{ NotFoundException -> 0x070c }
            java.lang.String r6 = r1.getString(r7, r6)     // Catch:{ NotFoundException -> 0x070c }
            android.text.SpannableStringBuilder r7 = X.DbS.A0C(r6)     // Catch:{ NotFoundException -> 0x070c }
            X.AnonymousClass7AV.A05(r7, r9, r8)     // Catch:{ NotFoundException -> 0x070c }
            X.LOZ r6 = new X.LOZ     // Catch:{ NotFoundException -> 0x070c }
            r13 = r6
            r14 = r3
            r15 = r10
            r16 = r7
            r17 = r25
            r18 = r25
            r19 = r25
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ NotFoundException -> 0x070c }
            X.LXh r3 = new X.LXh     // Catch:{ NotFoundException -> 0x070c }
            r27 = r3
            r29 = r1
            r30 = r2
            r31 = r5
            r32 = r4
            r33 = r0
            r34 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)     // Catch:{ NotFoundException -> 0x070c }
            r6.A00 = r3     // Catch:{ NotFoundException -> 0x070c }
            r14 = 3
            X.LXf r0 = new X.LXf     // Catch:{ NotFoundException -> 0x070c }
            r13 = r0
            r15 = r1
            r16 = r6
            r17 = r5
            r18 = r2
            r19 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ NotFoundException -> 0x070c }
            r6.A01 = r0     // Catch:{ NotFoundException -> 0x070c }
            r2.A00 = r6     // Catch:{ NotFoundException -> 0x070c }
            X.0eM r0 = r2.A01     // Catch:{ NotFoundException -> 0x070c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ NotFoundException -> 0x070c }
            X.12V r0 = (X.AnonymousClass12V) r0     // Catch:{ NotFoundException -> 0x070c }
            X.12U r0 = (X.AnonymousClass12U) r0     // Catch:{ NotFoundException -> 0x070c }
            X.4CZ r3 = r0.A04     // Catch:{ NotFoundException -> 0x070c }
            r0 = 30
            X.MGa r2 = new X.MGa     // Catch:{ NotFoundException -> 0x070c }
            r2.<init>(r1, r6, r12, r0)     // Catch:{ NotFoundException -> 0x070c }
            goto L_0x063c
        L_0x070c:
            r1 = move-exception
            java.lang.String r0 = "Unable to load resource"
            X.JTP.A1U(r0, r1)
            goto L_0x002e
        L_0x0714:
            X.0eS.A00(r36)
            java.lang.Object r8 = r0.A00
            X.7aa r8 = (X.C334047aa) r8
            boolean r1 = r8 instanceof X.C334947c8
            if (r1 == 0) goto L_0x072e
            java.lang.Object r3 = r0.A05
            X.7b2 r3 = (X.C334297b2) r3
            r1 = r8
            X.7c8 r1 = (X.C334947c8) r1
            java.util.List r2 = r1.A09
            r1 = 0
            X.0qQ.A0B(r2, r1)
            r3.A01 = r2
        L_0x072e:
            java.lang.Object r3 = r0.A04
            com.facebook.litho.LithoView r3 = (com.facebook.litho.LithoView) r3
            java.lang.Object r1 = r0.A06
            X.GT9 r1 = (X.GT9) r1
            com.instagram.common.session.UserSession r9 = r1.A05()
            X.GgO r7 = r1.A04()
            java.lang.Object r6 = r0.A05
            X.7b2 r6 = (X.C334297b2) r6
            java.lang.Object r11 = r0.A02
            X.2nK r11 = (X.C229402nK) r11
            java.lang.Object r2 = r0.A03
            X.AnonymousClass7TG.A1N(r3, r8)
            X.C51974G9v.A1S(r9, r7, r6, r11, r2)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r3)
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.content.Context r5 = X.C334957c9.A00(r1, r0)
            android.app.Activity r5 = (android.app.Activity) r5
            X.7cA r10 = new X.7cA
            r10.<init>(r9, r2)
            X.7cB r4 = new X.7cB
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.setComponentAsync(r4)
            goto L_0x002e
        L_0x0769:
            X.0eS.A00(r36)
            java.lang.Object r2 = r0.A03
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r1 = r2.A00
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r0.A04
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r1 = r1.A00
            if (r1 == 0) goto L_0x002e
            int r9 = X.AnonymousClass7TE.A0M(r1)
            r8 = 0
            if (r9 >= r8) goto L_0x0784
            r9 = 0
        L_0x0784:
            java.lang.Object r1 = r2.A00
            int r7 = X.AnonymousClass7TE.A0M(r1)
            java.lang.Object r6 = r0.A02
            java.util.List r6 = (java.util.List) r6
            int r2 = r6.size()
            r1 = 1
            int r2 = r2 - r1
            if (r7 <= r2) goto L_0x0797
            r7 = r2
        L_0x0797:
            java.util.LinkedHashSet r5 = X.DbS.A0y()
            r4 = 0
            if (r9 > r7) goto L_0x07d2
        L_0x079e:
            java.lang.Object r1 = r6.get(r9)
            X.Hqi r1 = (X.C55977Hqi) r1
            com.instagram.model.reels.Reel r3 = r1.A02
            java.lang.String r2 = X.JTP.A0r(r3)
            java.lang.String r1 = "placeholder"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x07b3
            r4 = 1
        L_0x07b3:
            java.lang.Object r1 = r0.A06
            java.lang.Object r1 = X.C51966G9m.A18(r1)
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            boolean r1 = r3.A0z(r1)
            if (r1 != 0) goto L_0x07c4
            r5.add(r2)
        L_0x07c4:
            if (r9 == r7) goto L_0x07c9
            int r9 = r9 + 1
            goto L_0x079e
        L_0x07c9:
            if (r4 == 0) goto L_0x07d2
            java.lang.Object r1 = r0.A05
            X.0sP r1 = (X.0sP) r1
            X.C51968G9o.A1O(r1, r8)
        L_0x07d2:
            boolean r1 = r5.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r0.A00
            X.0sP r1 = (X.0sP) r1
            X.YCQ r0 = X.AnonymousClass62Q.A02(r5)
            r1.invoke(r0)
            goto L_0x002e
        L_0x07e7:
            X.0eS.A00(r36)
            java.lang.Object r1 = r0.A06
            X.Qcf r1 = (X.C7909Qcf) r1
            com.facebook.smartcapture.logging.SmartCaptureLogger r2 = r1.A01
            if (r2 == 0) goto L_0x07f7
            java.lang.String r1 = "docupload_success"
            r2.logEvent(r1)
        L_0x07f7:
            java.lang.Object r1 = r0.A05
            X.SJe r1 = (X.C11286SJe) r1
            java.lang.String r1 = r1.A03
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r1)
            java.lang.String r1 = "h"
            java.lang.String r2 = r2.optString(r1)
            if (r2 == 0) goto L_0x082d
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x082d
            java.util.List r1 = X.AnonymousClass7TE.A1I(r2)
            X.6Tm r3 = new X.6Tm
            r3.<init>(r1)
            java.lang.Object r2 = r0.A04
        L_0x081b:
            X.4uI r2 = (X.C277014uI) r2
            java.lang.Object r1 = r0.A02
            X.6Rx r1 = (X.C307896Rx) r1
            X.C299275ur.A00(r1, r3, r2)
            java.lang.Object r0 = r0.A00
            java.io.File r0 = (java.io.File) r0
            X.JTR.A1O(r0)
            goto L_0x002e
        L_0x082d:
            java.lang.String r1 = "unexpected return value"
            java.util.List r1 = X.AnonymousClass7TE.A1I(r1)
            X.6Tm r3 = new X.6Tm
            r3.<init>(r1)
            java.lang.Object r2 = r0.A03
            goto L_0x081b
        L_0x083b:
            X.0qQ.A0F(r7)
            goto L_0x08a6
        L_0x083f:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0892
            boolean r0 = r8.A13()
            if (r0 == 0) goto L_0x0896
            androidx.work.WorkerParameters r0 = r4.mWorkerParams
            int r0 = r0.A01
            int r5 = r1.A00
            if (r0 >= r5) goto L_0x088c
            X.1ud r13 = X.1ua.A0G
            X.0eM r0 = r4.A03
            java.lang.Object r14 = r0.getValue()
            X.385 r14 = (X.AnonymousClass385) r14
            int r12 = r5 + 1
            java.lang.String r9 = r1.A06
            java.lang.String r10 = r1.A04
            X.1iA r7 = r1.A02
            com.instagram.pendingmedia.model.constants.ShareType r8 = r1.A03
            X.28D r6 = r1.A01
            java.lang.String r11 = r1.A05
            r4 = 0
            X.0qQ.A0B(r9, r4)
            X.DbZ.A0t(r2, r10, r7, r8)
            r0 = 5
            X.0qQ.A0B(r11, r0)
            X.JvL r5 = new X.JvL
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317500425901248(0x810693000414c0, double:3.030671735951663E-306)
            boolean r17 = X.182.A06(r2, r3, r0)
            r15 = r5
            r18 = r4
            r13.A03(r14, r15, r16, r17, r18)
        L_0x088c:
            X.5G2 r7 = new X.5G2
            r7.<init>()
            return r7
        L_0x0892:
            r2 = 0
            java.lang.String r0 = "Terminal error, no more auto retries"
            goto L_0x0899
        L_0x0896:
            r2 = 0
            java.lang.String r0 = "Reached max number of retries"
        L_0x0899:
            X.5Fh r7 = com.instagram.pendingmedia.service.impl.PendingMediaWorker.A00(r1, r4, r0, r2)
            return r7
        L_0x089e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x08a3:
            X.0qQ.A0F(r4)
        L_0x08a6:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGO) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A01 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
    }
}
