package X;

/* renamed from: X.9M0  reason: invalid class name */
public final class AnonymousClass9M0 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9M0(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00a5: MOVE  (r0v275 X.0lf) = (r8v9 X.0lf)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r21 = this;
            r3 = r21
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0811;
                case 1: goto L_0x07f1;
                case 2: goto L_0x07a4;
                case 3: goto L_0x0798;
                case 4: goto L_0x070e;
                case 5: goto L_0x06cd;
                case 6: goto L_0x06a1;
                case 7: goto L_0x05f5;
                case 8: goto L_0x05e1;
                case 9: goto L_0x05cb;
                case 10: goto L_0x05b5;
                case 11: goto L_0x059f;
                case 12: goto L_0x0589;
                case 13: goto L_0x0541;
                case 14: goto L_0x0537;
                case 15: goto L_0x052a;
                case 16: goto L_0x0512;
                case 17: goto L_0x0202;
                case 18: goto L_0x04e9;
                case 19: goto L_0x04cf;
                case 20: goto L_0x04c2;
                case 21: goto L_0x04c2;
                case 22: goto L_0x04b8;
                case 23: goto L_0x046e;
                case 24: goto L_0x0461;
                case 25: goto L_0x0448;
                case 26: goto L_0x043f;
                case 27: goto L_0x0431;
                case 28: goto L_0x0417;
                case 29: goto L_0x03ed;
                case 30: goto L_0x03df;
                case 31: goto L_0x03cd;
                case 32: goto L_0x036d;
                case 33: goto L_0x035a;
                case 34: goto L_0x034a;
                case 35: goto L_0x032a;
                case 36: goto L_0x0311;
                case 37: goto L_0x0303;
                case 38: goto L_0x02ec;
                case 39: goto L_0x0135;
                case 40: goto L_0x0068;
                case 41: goto L_0x02d8;
                case 42: goto L_0x02ca;
                case 43: goto L_0x02b4;
                case 44: goto L_0x024f;
                case 45: goto L_0x0053;
                case 46: goto L_0x0007;
                case 47: goto L_0x0007;
                case 48: goto L_0x0232;
                case 49: goto L_0x0020;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r9 = r0.invoke()
            if (r9 != 0) goto L_0x001f
        L_0x0013:
            java.lang.Object r0 = r3.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.2YQ r9 = r0.getDefaultViewModelCreationExtras()
        L_0x001f:
            return r9
        L_0x0020:
            java.lang.Object r4 = r3.A02
            X.7fH r4 = (X.C336847fH) r4
            java.lang.Long r0 = r4.A05
            if (r0 == 0) goto L_0x0825
            java.lang.Object r3 = r3.A01
            X.3Y5 r3 = (X.AnonymousClass3Y5) r3
            long r1 = r0.longValue()
            X.2V1 r0 = r3.A05
            android.content.Context r0 = r0.A0C
            X.0qQ.A07(r0)
            java.lang.String r9 = X.1G0.A07(r0, r1)
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x001f
            r0 = 2131961520(0x7f1326b0, float:1.955974E38)
            java.lang.String r1 = X.C244013aV.A0E(r3, r0)
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x0824
            java.lang.String r0 = " · "
            java.lang.String r9 = X.002.A0g(r9, r0, r1)
            return r9
        L_0x0053:
            java.lang.Object r0 = r3.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x005f
            java.lang.Object r9 = r0.invoke()
            if (r9 != 0) goto L_0x001f
        L_0x005f:
            java.lang.Object r0 = r3.A02
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            X.2YQ r9 = r0.getDefaultViewModelCreationExtras()
            return r9
        L_0x0068:
            java.lang.Object r6 = r3.A02
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            androidx.fragment.app.FragmentActivity r8 = r6.getActivity()
            java.lang.String r2 = "Session token not in fragment arguments to "
            java.lang.String r5 = "IgSessionManager.SESSION_TOKEN_KEY"
            java.lang.String r4 = "SESSION_UTIL"
            if (r8 != 0) goto L_0x009f
            java.lang.String r1 = X.C227642jf.A00(r6)
            java.lang.String r0 = " is not attached to an Activity"
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0wb.A03(r4, r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = r1.getString(r5)
            if (r0 != 0) goto L_0x0854
            java.lang.String r1 = X.C227642jf.A00(r1)
            r0 = 46
            java.lang.String r1 = X.002.A0S(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x009f:
            boolean r0 = r8 instanceof X.AnonymousClass0lf
            r9 = 0
            if (r0 == 0) goto L_0x0827
            r0 = r8
            X.0lf r0 = (X.AnonymousClass0lf) r0
            if (r0 == 0) goto L_0x0827
            X.0lg r7 = r0.getSession()
            if (r7 != 0) goto L_0x00da
            java.lang.String r7 = X.C227642jf.A00(r8)
            java.lang.String r1 = " returned a null session to "
            java.lang.String r0 = X.C227642jf.A00(r6)
            java.lang.String r0 = X.002.A0g(r7, r1, r0)
            X.0wb.A03(r4, r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = r1.getString(r5)
            if (r0 != 0) goto L_0x0854
            java.lang.String r1 = X.C227642jf.A00(r1)
            r0 = 46
            java.lang.String r1 = X.002.A0S(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00da:
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x00df
            r9 = r7
        L_0x00df:
            if (r9 != 0) goto L_0x001f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.C227642jf.A00(r8)
            r1.append(r0)
            java.lang.String r0 = " return "
            r1.append(r0)
            java.lang.String r0 = X.C227642jf.A00(r7)
            r1.append(r0)
            java.lang.String r0 = " to "
            r1.append(r0)
            java.lang.String r0 = X.C227642jf.A00(r6)
            r1.append(r0)
            java.lang.String r0 = ", but "
            r1.append(r0)
            java.lang.Class<com.instagram.common.session.UserSession> r0 = com.instagram.common.session.UserSession.class
            r1.append(r0)
            java.lang.String r0 = " was expected"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.0wb.A03(r4, r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = r1.getString(r5)
            if (r0 != 0) goto L_0x0854
            java.lang.String r1 = X.C227642jf.A00(r1)
            r0 = 46
            java.lang.String r1 = X.002.A0S(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0135:
            java.lang.Object r6 = r3.A02
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            androidx.fragment.app.FragmentActivity r8 = r6.getActivity()
            java.lang.String r2 = "Session token not in fragment arguments to "
            java.lang.String r5 = "IgSessionManager.SESSION_TOKEN_KEY"
            java.lang.String r4 = "SESSION_UTIL"
            if (r8 != 0) goto L_0x016c
            java.lang.String r1 = X.C227642jf.A00(r6)
            java.lang.String r0 = " is not attached to an Activity"
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0wb.A03(r4, r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = r1.getString(r5)
            if (r0 != 0) goto L_0x088a
            java.lang.String r1 = X.C227642jf.A00(r1)
            r0 = 46
            java.lang.String r1 = X.002.A0S(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x016c:
            boolean r0 = r8 instanceof X.AnonymousClass0lf
            r9 = 0
            if (r0 == 0) goto L_0x085d
            r0 = r8
            X.0lf r0 = (X.AnonymousClass0lf) r0
            if (r0 == 0) goto L_0x085d
            X.0lg r7 = r0.getSession()
            if (r7 != 0) goto L_0x01a7
            java.lang.String r7 = X.C227642jf.A00(r8)
            java.lang.String r1 = " returned a null session to "
            java.lang.String r0 = X.C227642jf.A00(r6)
            java.lang.String r0 = X.002.A0g(r7, r1, r0)
            X.0wb.A03(r4, r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = r1.getString(r5)
            if (r0 != 0) goto L_0x088a
            java.lang.String r1 = X.C227642jf.A00(r1)
            r0 = 46
            java.lang.String r1 = X.002.A0S(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01a7:
            boolean r0 = r7 instanceof X.AnonymousClass0wW
            if (r0 == 0) goto L_0x01ac
            r9 = r7
        L_0x01ac:
            if (r9 != 0) goto L_0x001f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.C227642jf.A00(r8)
            r1.append(r0)
            java.lang.String r0 = " return "
            r1.append(r0)
            java.lang.String r0 = X.C227642jf.A00(r7)
            r1.append(r0)
            java.lang.String r0 = " to "
            r1.append(r0)
            java.lang.String r0 = X.C227642jf.A00(r6)
            r1.append(r0)
            java.lang.String r0 = ", but "
            r1.append(r0)
            java.lang.Class<X.0wW> r0 = X.AnonymousClass0wW.class
            r1.append(r0)
            java.lang.String r0 = " was expected"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.0wb.A03(r4, r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = r1.getString(r5)
            if (r0 != 0) goto L_0x088a
            java.lang.String r1 = X.C227642jf.A00(r1)
            r0 = 46
            java.lang.String r1 = X.002.A0S(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0202:
            java.lang.Object r4 = r3.A02
            X.1vy r4 = (X.1vy) r4
            X.0eM r2 = r4.A02
            r9 = 0
            if (r2 == 0) goto L_0x001f
            java.lang.Object r1 = r3.A01
            X.0eM r1 = (X.AnonymousClass0eM) r1
            X.3qO r0 = com.facebook.pando.PandoGraphQLServiceJNI.Companion
            if (r1 == 0) goto L_0x0219
            java.lang.Object r9 = r1.getValue()
            com.facebook.pando.PandoPrimaryExecution r9 = (com.facebook.pando.PandoPrimaryExecution) r9
        L_0x0219:
            java.lang.Object r10 = r2.getValue()
            com.facebook.pando.PandoGraphQLConsistencyJNI r10 = (com.facebook.pando.PandoGraphQLConsistencyJNI) r10
            X.1vx r0 = r4.A00
            if (r0 == 0) goto L_0x022f
            boolean r12 = r0.A01
            boolean r13 = r0.A02
        L_0x0227:
            r14 = 0
            r11 = 1
            com.facebook.pando.PandoGraphQLServiceJNI r8 = new com.facebook.pando.PandoGraphQLServiceJNI
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x022f:
            r12 = 1
            r13 = 0
            goto L_0x0227
        L_0x0232:
            java.lang.Object r0 = r3.A02
            X.7fH r0 = (X.C336847fH) r0
            java.lang.Long r1 = r0.A05
            if (r1 == 0) goto L_0x0825
            java.lang.Object r0 = r3.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            long r3 = r1.longValue()
            X.2V1 r0 = r0.A05
            android.content.Context r2 = r0.A0C
            X.0qQ.A07(r2)
            double r0 = (double) r3
            java.lang.String r9 = X.1G0.A03(r2, r0)
            return r9
        L_0x024f:
            java.lang.Object r11 = r3.A02
            com.instagram.common.session.UserSession r11 = (com.instagram.common.session.UserSession) r11
            X.2MY r6 = com.instagram.creation.persistence.CreationDatabase.A00
            java.lang.Class<com.instagram.creation.persistence.CreationDatabase> r5 = com.instagram.creation.persistence.CreationDatabase.class
            java.lang.Object r0 = r11.A00(r5)
            com.instagram.roomdb.IgRoomDatabase r0 = (com.instagram.roomdb.IgRoomDatabase) r0
            if (r0 != 0) goto L_0x0290
            monitor-enter(r6)
            java.lang.Object r0 = r11.A00(r5)     // Catch:{ all -> 0x028c }
            com.instagram.roomdb.IgRoomDatabase r0 = (com.instagram.roomdb.IgRoomDatabase) r0     // Catch:{ all -> 0x028c }
            if (r0 != 0) goto L_0x028f
            android.content.Context r1 = X.C60960kU.A00     // Catch:{ all -> 0x028c }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x028c }
            java.lang.String r0 = X.1V8.A00(r11, r6)     // Catch:{ all -> 0x028c }
            X.1VA r4 = X.1V9.A00(r1, r5, r0)     // Catch:{ all -> 0x028c }
            r2 = 1702658258(0x657c80d2, float:7.452579E22)
            r1 = 1401021912(0x5381e5d8, float:1.11581384E12)
            r0 = 1
            X.1VC.A00(r4, r2, r1, r0)     // Catch:{ all -> 0x028c }
            r6.A00(r4)     // Catch:{ all -> 0x028c }
            X.3oI r0 = r4.A00()     // Catch:{ all -> 0x028c }
            com.instagram.roomdb.IgRoomDatabase r0 = (com.instagram.roomdb.IgRoomDatabase) r0     // Catch:{ all -> 0x028c }
            r11.A04(r5, r0)     // Catch:{ all -> 0x028c }
            goto L_0x028f
        L_0x028c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x028f:
            monitor-exit(r6)
        L_0x0290:
            com.instagram.creation.persistence.CreationDatabase r0 = (com.instagram.creation.persistence.CreationDatabase) r0
            X.2NP r1 = r0.A00()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.clips.drafts.model.datasource.ClipsDraftDaoWithSoftFail r12 = new com.instagram.clips.drafts.model.datasource.ClipsDraftDaoWithSoftFail
            r12.<init>(r11, r1)
            com.instagram.pendingmedia.store.PendingMediaStore r13 = X.28K.A00(r11)
            java.lang.Object r10 = r3.A01
            android.content.Context r10 = (android.content.Context) r10
            X.0qQ.A0B(r10, r0)
            X.2Nn r14 = X.2Nm.A00(r10, r11)
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r9 = new com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x02b4:
            java.lang.Object r4 = r3.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r2 = r3.A01
            android.content.Context r2 = (android.content.Context) r2
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r1 = X.2MV.A00(r2, r4)
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r4)
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r9 = new com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository
            r9.<init>(r2, r1, r4, r0)
            return r9
        L_0x02ca:
            java.lang.Object r1 = r3.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            com.instagram.casper.IgSignalsCasper r9 = new com.instagram.casper.IgSignalsCasper
            r9.<init>(r0, r1)
            return r9
        L_0x02d8:
            X.6Tl r1 = new X.6Tl
            r1.<init>()
            java.lang.Object r0 = r3.A02
            r1.A01(r0)
            java.lang.Object r0 = r3.A01
            r1.A02(r0)
            X.6Tm r9 = r1.A00()
            return r9
        L_0x02ec:
            java.lang.Object r0 = r3.A01
            X.5V6 r0 = (X.AnonymousClass5V6) r0
            X.5V5 r0 = (X.AnonymousClass5V5) r0
            r1 = 0
            android.view.View r0 = r0.A00
            r0.performHapticFeedback(r1)
            java.lang.Object r0 = r3.A02
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0821
            r0.invoke()
            goto L_0x0821
        L_0x0303:
            java.lang.Object r1 = r3.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r3.A01
            X.5vK r0 = (X.C299515vK) r0
            X.9JJ r0 = (X.AnonymousClass9JJ) r0
            java.lang.String r0 = r0.A08
            goto L_0x07a0
        L_0x0311:
            java.lang.Object r0 = r3.A02
            X.5vQ r0 = (X.C299575vQ) r0
            X.5vP r0 = (X.C299565vP) r0
            java.lang.String r2 = r0.A0C
            if (r2 == 0) goto L_0x0821
            java.lang.Object r1 = r3.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r0 = r0.A0B
            boolean r0 = r2.equals(r0)
            r1.DZT(r2, r0)
            goto L_0x0821
        L_0x032a:
            java.lang.Object r1 = r3.A02
            X.5vQ r1 = (X.C299575vQ) r1
            r0 = r1
            X.5vP r0 = (X.C299565vP) r0
            java.lang.Long r0 = r0.A09
            if (r0 == 0) goto L_0x0821
            java.lang.Object r4 = r3.A01
            X.5vd r4 = (X.C299665vd) r4
            long r2 = r0.longValue()
            X.5vJ r0 = r1.Be5()
            java.lang.String r1 = r0.A03
            java.lang.String r0 = r0.A04
            r4.D6N(r1, r0, r2)
            goto L_0x0821
        L_0x034a:
            java.lang.Object r0 = r3.A02
            com.instagram.banyan.BanyanCoordinator r0 = (com.instagram.banyan.BanyanCoordinator) r0
            X.5fq r1 = r0.A08
            java.lang.Object r0 = r3.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.A61 r9 = new X.A61
            r9.<init>(r1, r0)
            return r9
        L_0x035a:
            java.lang.Object r2 = r3.A01
            android.content.Context r2 = (android.content.Context) r2
            X.0qQ.A0A(r2)
            java.lang.Object r1 = r3.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.2jK r0 = X.C227442jK.A00
            X.2jI r9 = new X.2jI
            r9.<init>(r2, r1, r0)
            return r9
        L_0x036d:
            java.lang.Object r2 = r3.A01
            android.content.Context r2 = (android.content.Context) r2
            X.0qQ.A0A(r2)
            X.9Cn r9 = new X.9Cn
            r9.<init>(r2)
            X.0qQ.A0A(r2)
            java.lang.Object r3 = r3.A02
            r0 = 760(0x2f8, float:1.065E-42)
            java.lang.String r4 = X.Pxd.A00(r0)
            r14 = 0
            X.0qQ.A0B(r2, r14)
            r5 = 1
            r0 = 2
            X.0qQ.A0B(r3, r0)
            X.1GL r10 = X.1GK.A06
            X.TN4 r11 = new X.TN4
            r11.<init>(r5)
            r12 = 531(0x213, float:7.44E-43)
            r13 = 3
            r15 = r14
            X.1GN r15 = r10.A00(r11, r12, r13, r14, r15)
            r1 = 0
            X.1QY r0 = new X.1QY
            r0.<init>(r1)
            r17 = 532(0x214, float:7.45E-43)
            r18 = r13
            r19 = r5
            r20 = r14
            r16 = r0
            X.3Fj r5 = r15.A02(r16, r17, r18, r19, r20)
            X.9Cz r1 = X.C375289Cz.A00
            r0 = 533(0x215, float:7.47E-43)
            X.3Fj r1 = r5.A01(r1, r0, r13)
            r0 = 359(0x167, float:5.03E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.1OC r1 = X.AnonymousClass9D0.A01(r1, r0, r4)
            X.9iy r0 = new X.9iy
            r0.<init>(r14, r2, r3)
            r1.A00 = r0
            X.1ES.A03(r1)
            return r9
        L_0x03cd:
            java.lang.Object r1 = r3.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            X.1wD r9 = new X.1wD
            r9.<init>(r1, r0)
            return r9
        L_0x03df:
            java.lang.Object r1 = r3.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r3.A01
            X.6wo r0 = (X.C323026wo) r0
            com.instagram.archive.data.HighlightsSettingsRepository r9 = new com.instagram.archive.data.HighlightsSettingsRepository
            r9.<init>(r0, r1)
            return r9
        L_0x03ed:
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r4 = r0.getApplicationContext()
            X.0qQ.A07(r4)
            java.lang.Object r1 = r3.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            com.instagram.ar.core.effectcollection.EffectCollectionService r3 = X.C311766dD.A00(r0, r1)
            X.12T r0 = X.AnonymousClass12T.A00
            X.6dq r2 = new X.6dq
            r2.<init>(r0, r1)
            r1 = 0
            X.1HY r0 = new X.1HY
            r0.<init>(r1)
            X.19S r0 = X.19E.A02(r0)
            X.6dC r9 = new X.6dC
            r9.<init>(r4, r3, r2, r0)
            return r9
        L_0x0417:
            java.lang.Object r2 = r3.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r1 = new com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository
            r1.<init>(r2)
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r0 = r0.getApplicationContext()
            X.0qQ.A07(r0)
            com.instagram.ar.core.effectcollection.EffectCollectionService r9 = new com.instagram.ar.core.effectcollection.EffectCollectionService
            r9.<init>(r0, r1, r2)
            return r9
        L_0x0431:
            java.lang.Object r1 = r3.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            X.215 r9 = new X.215
            r9.<init>(r1, r0)
            return r9
        L_0x043f:
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            X.13w.A00(r0)
            goto L_0x0821
        L_0x0448:
            java.lang.Object r4 = r3.A02
            X.3kZ r4 = (X.C249913kZ) r4
            java.lang.Object r0 = r3.A01
            X.9IM r0 = (X.AnonymousClass9IM) r0
            X.AnonymousClass9M0.super.onResponse(r0)
            X.1SA r2 = r4.A03     // Catch:{ IOException -> 0x0821 }
            r1 = 15
            X.MP6 r0 = new X.MP6     // Catch:{ IOException -> 0x0821 }
            r0.<init>(r4, r1)     // Catch:{ IOException -> 0x0821 }
            r2.A00(r0)     // Catch:{ IOException -> 0x0821 }
            goto L_0x0821
        L_0x0461:
            java.lang.Object r1 = r3.A02
            X.3kZ r1 = (X.C249913kZ) r1
            java.lang.Object r0 = r3.A01
            X.3Iu r0 = (X.C239923Iu) r0
            X.AnonymousClass9M0.super.onEOM(r0)
            goto L_0x0821
        L_0x046e:
            java.lang.Object r0 = r3.A01
            X.1GM r0 = (X.1GM) r0
            X.1FZ r2 = r0.A00
            java.lang.String r1 = r2.A0E
            r0 = 4769(0x12a1, float:6.683E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x04ac
            X.0wX r0 = X.C61170le.A00
            X.18g r0 = X.C638918c.A01(r0)
            X.1Jv r0 = r0.A05
            if (r0 != 0) goto L_0x0490
            int r0 = X.AnonymousClass1HP.A00
            if (r0 != 0) goto L_0x04a6
        L_0x0490:
            X.0lg r4 = r2.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36612543204170077(0x8212ea0002195d, double:3.2172579769707796E-306)
            long r4 = X.182.A01(r2, r4, r0)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04a6
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x04a6 }
        L_0x04a6:
            int r0 = X.AnonymousClass1HP.A00
            int r0 = r0 + 1
            X.AnonymousClass1HP.A00 = r0
        L_0x04ac:
            java.lang.Object r1 = r3.A02
            X.1Fa r1 = (X.1Fa) r1
            r0 = 1
            r1.A0S = r0
            X.1QV r9 = r1.A01()
            return r9
        L_0x04b8:
            java.lang.Object r0 = r3.A01
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = (com.facebook.quicklog.LightweightQuickPerformanceLogger) r0
            X.1CY r9 = new X.1CY
            r9.<init>(r0)
            return r9
        L_0x04c2:
            java.lang.Object r1 = r3.A02
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            java.lang.Object r0 = r3.A01
            java.lang.Class r0 = (java.lang.Class) r0
            com.facebook.pando.TreeJNI r9 = r1.reinterpret(r0)
            return r9
        L_0x04cf:
            X.3qO r0 = com.facebook.pando.PandoGraphQLServiceJNI.Companion
            java.lang.Object r0 = r3.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            r11 = 0
            if (r0 == 0) goto L_0x04e7
            java.lang.Object r10 = r0.getValue()
            com.facebook.pando.PandoPrimaryExecution r10 = (com.facebook.pando.PandoPrimaryExecution) r10
        L_0x04de:
            java.lang.Object r0 = r3.A02
            X.1vy r0 = (X.1vy) r0
            X.0eM r0 = r0.A02
            if (r0 == 0) goto L_0x0506
            goto L_0x0500
        L_0x04e7:
            r10 = r11
            goto L_0x04de
        L_0x04e9:
            X.3qO r0 = com.facebook.pando.PandoGraphQLServiceJNI.Companion
            java.lang.Object r0 = r3.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            r11 = 0
            if (r0 == 0) goto L_0x0510
            java.lang.Object r10 = r0.getValue()
            com.facebook.pando.PandoPrimaryExecution r10 = (com.facebook.pando.PandoPrimaryExecution) r10
        L_0x04f8:
            java.lang.Object r0 = r3.A02
            X.1vy r0 = (X.1vy) r0
            X.0eM r0 = r0.A02
            if (r0 == 0) goto L_0x0506
        L_0x0500:
            java.lang.Object r11 = r0.getValue()
            com.facebook.pando.PandoGraphQLConsistencyJNI r11 = (com.facebook.pando.PandoGraphQLConsistencyJNI) r11
        L_0x0506:
            r15 = 0
            r12 = 0
            r13 = 1
            com.facebook.pando.PandoGraphQLServiceJNI r9 = new com.facebook.pando.PandoGraphQLServiceJNI
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x0510:
            r10 = r11
            goto L_0x04f8
        L_0x0512:
            java.lang.Object r1 = r3.A02
            X.7qt r1 = (X.C343837qt) r1
            X.7qb r0 = X.C343677qc.A00
            java.lang.Object r1 = r1.Apu(r0)
            X.0lg r1 = (X.0lg) r1
            X.0qQ.A0A(r1)
            java.lang.Object r0 = r3.A01
            X.0xG r0 = (X.0xG) r0
            X.0wc r9 = X.AnonymousClass0kN.A01(r0, r1)
            return r9
        L_0x052a:
            java.lang.Object r1 = r3.A02
            X.0lg r1 = (X.0lg) r1
            java.lang.Object r0 = r3.A01
            X.0xG r0 = (X.0xG) r0
            X.0wc r9 = X.AnonymousClass0kN.A01(r0, r1)
            return r9
        L_0x0537:
            java.lang.Object r0 = r3.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3zj r9 = new X.3zj
            r9.<init>(r0)
            return r9
        L_0x0541:
            java.lang.Object r5 = r3.A02
            X.45c r5 = (X.C2603045c) r5
            X.3m2 r0 = r5.A0C
            if (r0 != 0) goto L_0x0821
            X.0sa r0 = r5.A0A
            java.lang.Object r4 = r0.invoke()
            X.3m2 r4 = (X.C250773m2) r4
            java.lang.Object r3 = r3.A01
            android.content.Context r3 = (android.content.Context) r3
            com.facebook.mqtt.service.ConnectionConfig r2 = r5.A01
            if (r2 != 0) goto L_0x0563
            java.lang.String r0 = "config"
        L_0x055b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0563:
            X.45g r1 = r5.A03
            if (r1 != 0) goto L_0x056a
            java.lang.String r0 = "callback"
            goto L_0x055b
        L_0x056a:
            com.facebook.mqtt.service.MqttSubscribeListener r0 = r5.A02
            boolean r0 = r4.start(r3, r2, r1, r0)
            if (r0 == 0) goto L_0x0580
            r5.A0C = r4
            X.44t r0 = r5.A05
            r0.A02(r4)
            X.44u r0 = r5.A06
            r0.A01(r4)
            goto L_0x0821
        L_0x0580:
            java.lang.String r1 = "MqttDozeAwareClientWrapper"
            java.lang.String r0 = "Error creating client. Will retry again later"
            X.0KC.A0D(r1, r0)
            goto L_0x0821
        L_0x0589:
            java.lang.Object r0 = r3.A02
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r0 = r0.A03
            X.9OP r0 = (X.AnonymousClass9OP) r0
            X.3j2 r2 = r0.A00
            java.lang.Object r1 = r3.A01
            X.0eL r1 = (X.AnonymousClass0eL) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A00 = r1
            r9 = 0
            return r9
        L_0x059f:
            java.lang.Object r0 = r3.A02
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r0 = r0.A03
            X.Aub r0 = (X.C41477Aub) r0
            X.3j2 r2 = r0.A00
            java.lang.Object r1 = r3.A01
            X.0eL r1 = (X.AnonymousClass0eL) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A00 = r1
            r9 = 0
            return r9
        L_0x05b5:
            java.lang.Object r0 = r3.A02
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r0 = r0.A03
            X.3j5 r0 = (X.C249073j5) r0
            X.3j2 r2 = r0.A00
            java.lang.Object r1 = r3.A01
            X.0eL r1 = (X.AnonymousClass0eL) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A00 = r1
            r9 = 0
            return r9
        L_0x05cb:
            java.lang.Object r0 = r3.A02
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r0 = r0.A03
            X.9OD r0 = (X.AnonymousClass9OD) r0
            X.3j2 r2 = r0.A00
            java.lang.Object r1 = r3.A01
            X.0eL r1 = (X.AnonymousClass0eL) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A00 = r1
            r9 = 0
            return r9
        L_0x05e1:
            java.lang.Object r2 = r3.A02
            X.26N r2 = (X.26N) r2
            long r4 = r2.A00
            r0 = 1
            long r4 = r4 + r0
            r2.A00 = r4
            java.lang.Object r0 = r3.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0821
        L_0x05f5:
            java.lang.Object r6 = r3.A01
            X.9Om r6 = (X.C378099Om) r6
            X.6IQ r5 = r6.A00
            X.6IQ r4 = r6.A01
            java.lang.Float r1 = r6.A02
            java.lang.Float r8 = r6.A03
            r7 = 0
            if (r5 == 0) goto L_0x069e
            if (r1 == 0) goto L_0x069e
            X.0sa r0 = r5.A01
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r2 = r0.floatValue()
            float r0 = r1.floatValue()
            float r2 = r2 - r0
        L_0x0617:
            if (r4 == 0) goto L_0x069c
            if (r8 == 0) goto L_0x069c
            X.0sa r0 = r4.A01
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            float r0 = r8.floatValue()
            float r1 = r1 - r0
        L_0x062c:
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x064e
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x064e
        L_0x0634:
            if (r5 == 0) goto L_0x0640
            X.0sa r0 = r5.A01
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r6.A02 = r0
        L_0x0640:
            if (r4 == 0) goto L_0x0821
            X.0sa r0 = r4.A01
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r6.A03 = r0
            goto L_0x0821
        L_0x064e:
            java.lang.Object r3 = r3.A02
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r3
            int r0 = r6.A04
            int r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r3, r0)
            X.01O r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r3)
            int r0 = r3.A01
            java.lang.Object r1 = r1.A03(r0)
            X.5ex r1 = (X.C290215ex) r1
            if (r1 == 0) goto L_0x0673
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r3.A0C     // Catch:{ IllegalStateException -> 0x0673 }
            if (r0 == 0) goto L_0x0673
            android.graphics.Rect r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A03(r3, r1)     // Catch:{ IllegalStateException -> 0x0673 }
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.mInfo     // Catch:{ IllegalStateException -> 0x0673 }
            r0.setBoundsInScreen(r1)     // Catch:{ IllegalStateException -> 0x0673 }
        L_0x0673:
            androidx.compose.ui.platform.AndroidComposeView r0 = r3.A0R
            r0.invalidate()
            X.01O r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r3)
            java.lang.Object r0 = r0.A03(r2)
            X.5ex r0 = (X.C290215ex) r0
            if (r0 == 0) goto L_0x0634
            X.5SX r0 = r0.A01
            X.5R6 r1 = r0.A04
            if (r1 == 0) goto L_0x0634
            if (r5 == 0) goto L_0x0691
            X.0yC r0 = r3.A0P
            r0.A08(r2, r5)
        L_0x0691:
            if (r4 == 0) goto L_0x0698
            X.0yC r0 = r3.A0Q
            r0.A08(r2, r4)
        L_0x0698:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0F(r1, r3)
            goto L_0x0634
        L_0x069c:
            r1 = 0
            goto L_0x062c
        L_0x069e:
            r2 = 0
            goto L_0x0617
        L_0x06a1:
            java.lang.Object r1 = r3.A02
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.ui.platform.AndroidComposeView) r1
            X.6Gd r0 = r1.getAndroidViewsHandler$ui_release()
            java.lang.Object r3 = r3.A01
            android.view.View r3 = (android.view.View) r3
            r0.removeViewInLayout(r3)
            X.6Gd r0 = r1.getAndroidViewsHandler$ui_release()
            java.util.HashMap r2 = r0.A01
            X.6Gd r0 = r1.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.A00
            java.lang.Object r1 = r0.remove(r3)
            java.util.Map r0 = X.0u4.A03(r2)
            r0.remove(r1)
            r0 = 0
            r3.setImportantForAccessibility(r0)
            goto L_0x0821
        L_0x06cd:
            java.lang.Object r0 = r3.A01
            X.5SI r0 = (X.AnonymousClass5SI) r0
            X.5R6 r1 = r0.A0I
            X.5RP r0 = r1.A0W
            X.4cg r4 = r0.A04
            X.4cg r0 = r4.A07
            if (r0 == 0) goto L_0x06df
            X.4cl r2 = r0.A05
            if (r2 != 0) goto L_0x06e8
        L_0x06df:
            X.4co r0 = X.AnonymousClass5RJ.A00(r1)
            X.4cm r2 = new X.4cm
            r2.<init>(r0)
        L_0x06e8:
            java.lang.Object r0 = r3.A02
            X.5SJ r0 = (X.AnonymousClass5SJ) r0
            X.0sP r10 = r0.A0C
            androidx.compose.ui.graphics.layer.GraphicsLayer r3 = r0.A08
            long r6 = r0.A06
            if (r3 == 0) goto L_0x06fb
            float r5 = r0.A01
            r2.A03(r3, r4, r5, r6)
            goto L_0x0821
        L_0x06fb:
            if (r10 != 0) goto L_0x0704
            float r0 = r0.A01
            r2.A06(r4, r0, r6)
            goto L_0x0821
        L_0x0704:
            float r11 = r0.A01
            r8 = r2
            r9 = r4
            r12 = r6
            r8.A0A(r9, r10, r11, r12)
            goto L_0x0821
        L_0x070e:
            java.lang.Object r0 = r3.A02
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            X.5RP r1 = r0.A0W
            java.lang.Object r6 = r3.A01
            X.0rm r6 = (X.0rm) r6
            X.4cD r0 = r1.A02
            int r0 = r0.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0821
            X.4cD r5 = r1.A05
        L_0x0722:
            if (r5 == 0) goto L_0x0821
            int r0 = r5.A01
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0795
            r8 = 0
            r4 = r5
            r0 = r8
        L_0x072d:
            boolean r1 = r4 instanceof X.C267954cW
            r7 = 1
            if (r1 == 0) goto L_0x075d
            X.4cW r4 = (X.C267954cW) r4
            boolean r1 = r4.Bu0()
            if (r1 == 0) goto L_0x0743
            X.5SV r1 = new X.5SV
            r1.<init>()
            r6.A00 = r1
            r1.A00 = r7
        L_0x0743:
            boolean r1 = r4.BuF()
            if (r1 == 0) goto L_0x074f
            java.lang.Object r1 = r6.A00
            X.5SV r1 = (X.AnonymousClass5SV) r1
            r1.A01 = r7
        L_0x074f:
            java.lang.Object r1 = r6.A00
            X.5SV r1 = (X.AnonymousClass5SV) r1
            r4.AC5(r1)
        L_0x0756:
            X.4cD r4 = X.AnonymousClass5WH.A00(r0)
        L_0x075a:
            if (r4 == 0) goto L_0x0795
            goto L_0x072d
        L_0x075d:
            int r1 = r4.A01
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0756
            boolean r1 = r4 instanceof X.C267944cV
            if (r1 == 0) goto L_0x0756
            r1 = r4
            X.4cV r1 = (X.C267944cV) r1
            X.4cD r3 = r1.A00
            r2 = 0
        L_0x076d:
            if (r3 == 0) goto L_0x0792
            int r1 = r3.A01
            r1 = r1 & 8
            if (r1 == 0) goto L_0x077a
            int r2 = r2 + 1
            if (r2 != r7) goto L_0x077d
            r4 = r3
        L_0x077a:
            X.4cD r3 = r3.A02
            goto L_0x076d
        L_0x077d:
            if (r0 != 0) goto L_0x0788
            r0 = 16
            X.4cD[] r1 = new X.C267794cD[r0]
            X.5Pl r0 = new X.5Pl
            r0.<init>(r1)
        L_0x0788:
            if (r4 == 0) goto L_0x078e
            r0.A09(r4)
            r4 = r8
        L_0x078e:
            r0.A09(r3)
            goto L_0x077a
        L_0x0792:
            if (r2 != r7) goto L_0x0756
            goto L_0x075a
        L_0x0795:
            X.4cD r5 = r5.A04
            goto L_0x0722
        L_0x0798:
            java.lang.Object r0 = r3.A02
            X.6FS r0 = (X.AnonymousClass6FS) r0
            X.0sP r1 = r0.A01
            java.lang.Object r0 = r3.A01
        L_0x07a0:
            r1.invoke(r0)
            goto L_0x0821
        L_0x07a4:
            java.lang.Object r0 = r3.A02
            X.01p r0 = (X.01p) r0
            java.lang.Object r12 = r3.A01
            X.5Pj r12 = (X.C285025Pj) r12
            java.lang.Object[] r11 = r0.A03
            long[] r10 = r0.A02
            int r0 = r10.length
            int r9 = r0 + -2
            if (r9 < 0) goto L_0x0821
            r8 = 0
        L_0x07b6:
            r13 = r10[r8]
            r3 = -1
            long r3 = r3 ^ r13
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r13
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07ec
            int r0 = r8 - r9
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L_0x07d3:
            if (r5 >= r6) goto L_0x07ea
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x07e6
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]
            r12.EAz(r0)
        L_0x07e6:
            long r13 = r13 >> r7
            int r5 = r5 + 1
            goto L_0x07d3
        L_0x07ea:
            if (r6 != r7) goto L_0x0821
        L_0x07ec:
            if (r8 == r9) goto L_0x0821
            int r8 = r8 + 1
            goto L_0x07b6
        L_0x07f1:
            java.lang.Object r1 = r3.A02
            X.5WU r1 = (X.AnonymousClass5WU) r1
            X.AnonymousClass5WH.A02(r1)
            X.5dh r0 = r1.A07
            r0.BI6()
            X.5dh r0 = r1.A06
            int r0 = r0.BI6()
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = X.AnonymousClass1GB.A01(r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            return r9
        L_0x0811:
            java.lang.Object r2 = r3.A01
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r1 = r3.A02
            X.5cM r1 = (X.C288715cM) r1
            X.4bM r0 = X.AnonymousClass6JI.A00
            java.lang.Object r0 = X.C288795cU.A00(r0, r1)
            r2.A00 = r0
        L_0x0821:
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x0824:
            return r1
        L_0x0825:
            r9 = 0
            return r9
        L_0x0827:
            java.lang.String r8 = X.C227642jf.A00(r8)
            java.lang.String r7 = " attached to "
            java.lang.String r1 = X.C227642jf.A00(r6)
            java.lang.String r0 = " is not a session provider"
            java.lang.String r0 = X.002.A0u(r8, r7, r1, r0)
            X.0wb.A03(r4, r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = r1.getString(r5)
            if (r0 != 0) goto L_0x0854
            java.lang.String r1 = X.C227642jf.A00(r1)
            r0 = 46
            java.lang.String r1 = X.002.A0S(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0854:
            java.lang.Object r0 = r3.A01
            X.08y r0 = (X.08y) r0
            com.instagram.common.session.UserSession r9 = r0.A06(r1)
            return r9
        L_0x085d:
            java.lang.String r8 = X.C227642jf.A00(r8)
            java.lang.String r7 = " attached to "
            java.lang.String r1 = X.C227642jf.A00(r6)
            java.lang.String r0 = " is not a session provider"
            java.lang.String r0 = X.002.A0u(r8, r7, r1, r0)
            X.0wb.A03(r4, r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = r1.getString(r5)
            if (r0 != 0) goto L_0x088a
            java.lang.String r1 = X.C227642jf.A00(r1)
            r0 = 46
            java.lang.String r1 = X.002.A0S(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x088a:
            java.lang.Object r0 = r3.A01
            X.08y r0 = (X.08y) r0
            X.0wW r9 = r0.A04(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9M0.invoke():java.lang.Object");
    }
}
