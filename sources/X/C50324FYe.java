package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FYe  reason: case insensitive filesystem */
public final class C50324FYe implements AnonymousClass0lh {
    public final UserSession A00;
    public final 1wW A01;

    public C50324FYe(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 1wB.A00(userSession);
    }

    /* JADX WARNING: type inference failed for: r33v0, types: [java.lang.Object, X.FGw] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Object, X.3zD, java.lang.Runnable] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a3 A[Catch:{ all -> 0x01e2 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.facebook.common.callercontext.CallerContext r39, com.instagram.common.session.UserSession r40) {
        /*
            r38 = this;
            java.lang.String r6 = "fx_company_identity_switcher_linking_cache"
            r36 = 0
            r17 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)
            if (r0 == 0) goto L_0x0014
            r1 = -1939123609(0xffffffff8c6b5267, float:-1.8128539E-31)
            java.lang.String r0 = "FxIgCrossAppAccountLoginStatusCheckUtil.fetchFBLoginStatusAndUpdateAccountsForSwitcher"
            X.0fS.A01(r0, r1)
        L_0x0014:
            r8 = r40
            X.0wX r0 = r8.A03     // Catch:{ all -> 0x01e2 }
            android.content.Context r31 = r0.A06()     // Catch:{ all -> 0x01e2 }
            X.8s5 r4 = X.C368108s5.A03     // Catch:{ all -> 0x01e2 }
            r37 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x002e
            r1 = -89121187(0xfffffffffab01e5d, float:-4.5723004E35)
            java.lang.String r0 = "FxIgCrossAppAccountLoginStatusCheckUtil.fetchLinkedAccountsActiveStatus"
            X.0fS.A01(r0, r1)     // Catch:{ all -> 0x01e2 }
        L_0x002e:
            r5 = r38
            X.1wW r7 = r5.A01     // Catch:{ all -> 0x01d4 }
            r2 = r7
            X.1wM r2 = (X.1wM) r2     // Catch:{ all -> 0x01d4 }
            X.1wg r1 = r2.A07     // Catch:{ all -> 0x01d4 }
            r3 = r39
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x01d4 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x01d4 }
            r1.A01(r6, r0)     // Catch:{ all -> 0x01d4 }
            boolean r9 = r7.A0I(r3, r6)     // Catch:{ all -> 0x01d4 }
            if (r9 != 0) goto L_0x0071
            r1.A00(r6, r0)     // Catch:{ all -> 0x01d4 }
            X.0sn r12 = X.0sn.A00     // Catch:{ all -> 0x01d4 }
        L_0x004c:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01d4 }
            java.util.Iterator r9 = r12.iterator()     // Catch:{ all -> 0x01d4 }
        L_0x0054:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x01d4 }
            if (r1 == 0) goto L_0x00eb
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x01d4 }
            r1 = r7
            fxcache.model.FxCalAccount r1 = (fxcache.model.FxCalAccount) r1     // Catch:{ all -> 0x01d4 }
            java.lang.String r6 = r1.A04     // Catch:{ all -> 0x01d4 }
            java.lang.String r1 = "FACEBOOK"
            if (r6 == 0) goto L_0x0054
            boolean r1 = r6.equalsIgnoreCase(r1)     // Catch:{ all -> 0x01d4 }
            if (r1 == 0) goto L_0x0054
            r2.add(r7)     // Catch:{ all -> 0x01d4 }
            goto L_0x0054
        L_0x0071:
            r7.A07()     // Catch:{ all -> 0x01d4 }
            r7.A08()     // Catch:{ all -> 0x01d4 }
            r7.A09()     // Catch:{ all -> 0x01d4 }
            java.util.Map r9 = r7.A06()     // Catch:{ all -> 0x01d4 }
            r7.A0H(r6, r9)     // Catch:{ all -> 0x01d4 }
            java.util.Map r11 = r7.A06()     // Catch:{ all -> 0x01d4 }
            com.instagram.common.session.UserSession r9 = r2.A06     // Catch:{ all -> 0x01d4 }
            boolean r15 = X.1xW.A02(r9)     // Catch:{ all -> 0x01d4 }
            boolean r16 = r7.A0C()     // Catch:{ all -> 0x01d4 }
            double r13 = r7.A0D()     // Catch:{ all -> 0x01d4 }
            java.util.LinkedHashMap r12 = r7.A0F()     // Catch:{ all -> 0x01d4 }
            r9 = r1
            r10 = r6
            r9.A05(r10, r11, r12, r13, r15, r16)     // Catch:{ all -> 0x01d4 }
            fxcache.model.FxCalAccountLinkageInfo r1 = r2.A01     // Catch:{ all -> 0x01d4 }
            java.util.List r1 = r1.A02     // Catch:{ all -> 0x01d4 }
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r1)     // Catch:{ all -> 0x01d4 }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ all -> 0x01d4 }
        L_0x00a8:
            boolean r1 = r16.hasNext()     // Catch:{ all -> 0x01d4 }
            if (r1 == 0) goto L_0x004c
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x01d4 }
            fxcache.model.FxCalAccount r1 = (fxcache.model.FxCalAccount) r1     // Catch:{ all -> 0x01d4 }
            java.lang.String r2 = r1.A03     // Catch:{ all -> 0x01d4 }
            r20 = r2
            java.lang.String r2 = r1.A05     // Catch:{ all -> 0x01d4 }
            r21 = r2
            java.lang.String r15 = r1.A04     // Catch:{ all -> 0x01d4 }
            java.lang.String r14 = r1.A06     // Catch:{ all -> 0x01d4 }
            java.lang.String r13 = r1.A08     // Catch:{ all -> 0x01d4 }
            java.lang.String r11 = r1.A0A     // Catch:{ all -> 0x01d4 }
            java.lang.String r10 = r1.A07     // Catch:{ all -> 0x01d4 }
            int r9 = r1.A00     // Catch:{ all -> 0x01d4 }
            int r7 = r1.A02     // Catch:{ all -> 0x01d4 }
            int r6 = r1.A01     // Catch:{ all -> 0x01d4 }
            java.lang.String r2 = r1.A09     // Catch:{ all -> 0x01d4 }
            fxcache.model.FxCalAccount r1 = new fxcache.model.FxCalAccount     // Catch:{ all -> 0x01d4 }
            r24 = r13
            r25 = r11
            r26 = r10
            r27 = r2
            r28 = r9
            r29 = r7
            r30 = r6
            r19 = r1
            r22 = r15
            r23 = r14
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x01d4 }
            r12.add(r1)     // Catch:{ all -> 0x01d4 }
            goto L_0x00a8
        L_0x00eb:
            X.FGw r33 = new X.FGw     // Catch:{ all -> 0x01d4 }
            r33.<init>()     // Catch:{ all -> 0x01d4 }
            com.instagram.common.session.UserSession r7 = r5.A00     // Catch:{ all -> 0x01d4 }
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r2)     // Catch:{ all -> 0x01d4 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x01d4 }
        L_0x00fa:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x01d4 }
            if (r1 == 0) goto L_0x0114
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x01d4 }
            fxcache.model.FxCalAccount r1 = (fxcache.model.FxCalAccount) r1     // Catch:{ all -> 0x01d4 }
            java.lang.String r6 = r1.A03     // Catch:{ all -> 0x01d4 }
            X.8sI r5 = X.C368238sI.ACTIVE_ACCOUNT     // Catch:{ all -> 0x01d4 }
            r2 = 0
            X.FAQ r1 = new X.FAQ     // Catch:{ all -> 0x01d4 }
            r1.<init>(r6, r2, r4, r5)     // Catch:{ all -> 0x01d4 }
            r9.add(r1)     // Catch:{ all -> 0x01d4 }
            goto L_0x00fa
        L_0x0114:
            java.util.Set r9 = X.00k.A0k(r9)     // Catch:{ all -> 0x01d4 }
            java.lang.String r5 = "fx_android_access_library_internal_settings"
            java.lang.String r6 = "3.0"
            r4 = 2
            boolean r1 = com.facebook.systrace.Systrace.A0E(r17)     // Catch:{ all -> 0x01d4 }
            if (r1 == 0) goto L_0x012b
            r2 = 494063978(0x1d72d16a, float:3.2136698E-21)
            java.lang.String r1 = "FXAccessLibrary.fetchAccountsInfo"
            X.0fS.A01(r1, r2)     // Catch:{ all -> 0x01d4 }
        L_0x012b:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01c6 }
            boolean r0 = X.C49963FGw.A07(r7, r5, r0)     // Catch:{ all -> 0x01c6 }
            if (r0 != 0) goto L_0x0144
            X.1Ks r5 = new X.1Ks     // Catch:{ all -> 0x01c6 }
            r5.<init>(r1)     // Catch:{ all -> 0x01c6 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x019d
            r0 = -397025201(0xffffffffe855e04f, float:-4.0400073E24)
            goto L_0x019a
        L_0x0144:
            X.8sF r5 = new X.8sF     // Catch:{ all -> 0x01c6 }
            r5.<init>(r7)     // Catch:{ all -> 0x01c6 }
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01c6 }
            java.util.List r0 = X.00k.A0a(r9)     // Catch:{ all -> 0x01c6 }
            r2.addAll(r0)     // Catch:{ all -> 0x01c6 }
            X.Evf r1 = new X.Evf     // Catch:{ all -> 0x01c6 }
            r1.<init>(r2)     // Catch:{ all -> 0x01c6 }
            r5.A01 = r6     // Catch:{ all -> 0x01c6 }
            X.2LA r0 = X.AnonymousClass2LA.A02     // Catch:{ all -> 0x01c6 }
            X.2LC r0 = r0.A00()     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x0165
            r0.A00 = r6     // Catch:{ all -> 0x01c6 }
        L_0x0165:
            X.FTH r2 = new X.FTH     // Catch:{ all -> 0x01c6 }
            r30 = r2
            r32 = r5
            r34 = r0
            r35 = r1
            r30.<init>(r31, r32, r33, r34, r35)     // Catch:{ all -> 0x01c6 }
            X.0nO r33 = X.0nY.A00()     // Catch:{ all -> 0x01c6 }
            r34 = 583345440(0x22c52520, float:5.3436265E-18)
            X.0nQ r1 = new X.0nQ     // Catch:{ all -> 0x01c6 }
            r32 = r1
            r35 = r4
            r32.<init>(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x01c6 }
            X.3zD r5 = new X.3zD     // Catch:{ all -> 0x01c6 }
            r5.<init>()     // Catch:{ all -> 0x01c6 }
            X.6OO r0 = new X.6OO     // Catch:{ all -> 0x01c6 }
            r0.<init>(r2, r5)     // Catch:{ all -> 0x01c6 }
            r5.A00 = r0     // Catch:{ all -> 0x01c6 }
            r1.execute(r5)     // Catch:{ all -> 0x01c6 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x019d
            r0 = -263121415(0xfffffffff05115f9, float:-2.5883572E29)
        L_0x019a:
            X.0fS.A00(r0)     // Catch:{ all -> 0x01d4 }
        L_0x019d:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x01a9
            r0 = 9387161(0x8f3c99, float:1.3154214E-38)
            X.0fS.A00(r0)     // Catch:{ all -> 0x01e2 }
        L_0x01a9:
            X.FTO r2 = new X.FTO     // Catch:{ all -> 0x01e2 }
            r2.<init>(r4, r3, r8)     // Catch:{ all -> 0x01e2 }
            r1 = 193346370(0xb863b42, float:5.1704084E-32)
            X.0nX r0 = new X.0nX     // Catch:{ all -> 0x01e2 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e2 }
            X.C255183ti.A04(r2, r5, r0)     // Catch:{ all -> 0x01e2 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)
            if (r0 == 0) goto L_0x01c5
            r0 = -92754708(0xfffffffffa78acec, float:-3.2279922E35)
            X.0fS.A00(r0)
        L_0x01c5:
            return
        L_0x01c6:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x01d3
            r0 = -1058395982(0xffffffffc0ea28b2, float:-7.3174677)
            X.0fS.A00(r0)     // Catch:{ all -> 0x01d4 }
        L_0x01d3:
            throw r1     // Catch:{ all -> 0x01d4 }
        L_0x01d4:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x01e1
            r0 = 481685610(0x1cb5f06a, float:1.2039721E-21)
            X.0fS.A00(r0)     // Catch:{ all -> 0x01e2 }
        L_0x01e1:
            throw r1     // Catch:{ all -> 0x01e2 }
        L_0x01e2:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)
            if (r0 == 0) goto L_0x01ef
            r0 = -1161815957(0xffffffffbac0186b, float:-0.0014655715)
            X.0fS.A00(r0)
        L_0x01ef:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50324FYe.A00(com.facebook.common.callercontext.CallerContext, com.instagram.common.session.UserSession):void");
    }

    public final void onSessionWillEnd() {
        this.A00.A03(C50324FYe.class);
    }
}
