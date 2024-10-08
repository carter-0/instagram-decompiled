package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Fm  reason: invalid class name */
public final class AnonymousClass3Fm extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass2MB A01;

    public AnonymousClass3Fm(UserSession userSession, AnonymousClass2MB r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        if (r13 != null) goto L_0x0095;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0181 A[SYNTHETIC, Splitter:B:67:0x0181] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r16) {
        /*
            r15 = this;
            r2 = r16
            r0 = -1617019081(0xffffffff9f9e3f37, float:-6.702018E-20)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.3JC r2 = (X.AnonymousClass3JC) r2
            r0 = -681617736(0xffffffffd75f56b8, float:-2.45563547E14)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.2MB r0 = r15.A01
            X.2M1 r5 = r0.A00
            com.instagram.common.session.UserSession r8 = r15.A00
            monitor-enter(r5)
            boolean r0 = r8.A07()     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x01b0
            java.lang.Integer r0 = r8.A07     // Catch:{ all -> 0x01c1 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x01c1 }
            r0 = 2
            if (r1 == r0) goto L_0x01b0
            java.lang.Integer r0 = r8.A07     // Catch:{ all -> 0x01c1 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x01c1 }
            r0 = 3
            if (r1 == r0) goto L_0x01b0
            boolean r0 = r5.A05(r8)     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x01b0
            if (r2 == 0) goto L_0x01b0
            java.lang.Object r11 = r2.A01     // Catch:{ all -> 0x01c1 }
            if (r11 == 0) goto L_0x01b0
            X.3FY r11 = (X.AnonymousClass3FY) r11     // Catch:{ all -> 0x01c1 }
            java.lang.Class<X.3JE> r10 = X.AnonymousClass3JE.class
            java.lang.String r9 = "me"
            X.3FZ r0 = r11.A00(r10, r9)     // Catch:{ all -> 0x01c1 }
            X.3JE r0 = (X.AnonymousClass3JE) r0     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x01b0
            X.3FZ r0 = r11.A00(r10, r9)     // Catch:{ all -> 0x01c1 }
            X.3JE r0 = (X.AnonymousClass3JE) r0     // Catch:{ all -> 0x01c1 }
            java.lang.Class<X.3JF> r4 = X.AnonymousClass3JF.class
            java.lang.String r2 = "privacy_flow_trigger"
            X.3FZ r0 = r0.A00(r4, r2)     // Catch:{ all -> 0x01c1 }
            X.3JF r0 = (X.AnonymousClass3JF) r0     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x01b0
            X.0Tu r3 = X.0Tu.A05     // Catch:{ all -> 0x01c1 }
            r0 = 36312075882267530(0x8101a40005038a, double:3.027241232714816E-306)
            boolean r0 = X.182.A06(r3, r8, r0)     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x00c7
            X.3FZ r1 = r11.A00(r10, r9)     // Catch:{ all -> 0x01c1 }
            X.3JE r1 = (X.AnonymousClass3JE) r1     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "id"
            java.lang.String r14 = r1.A05(r0)     // Catch:{ all -> 0x01c1 }
            if (r14 == 0) goto L_0x00c7
            java.lang.String r1 = ""
            X.09i r0 = X.08y.A00()     // Catch:{ Exception -> 0x0094 }
            X.0Ic r0 = r0.A05     // Catch:{ Exception -> 0x0094 }
            com.instagram.common.session.UserSession r0 = r0.A00     // Catch:{ Exception -> 0x0094 }
            if (r0 == 0) goto L_0x0094
            X.0t1 r0 = X.0eE.A00(r0)     // Catch:{ Exception -> 0x0094 }
            com.instagram.user.model.User r0 = r0.A00()     // Catch:{ Exception -> 0x0094 }
            X.4Cl r0 = r0.A03     // Catch:{ Exception -> 0x0094 }
            java.lang.String r13 = r0.getFbidV2()     // Catch:{ Exception -> 0x0094 }
            if (r13 != 0) goto L_0x0095
        L_0x0094:
            r13 = r1
        L_0x0095:
            boolean r0 = r14.equalsIgnoreCase(r13)     // Catch:{ all -> 0x01c1 }
            if (r0 != 0) goto L_0x00c7
            X.0wc r12 = X.AnonymousClass0kN.A01(r5, r8)     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = "User ID mismatch - GraphQL:"
            java.lang.String r0 = " loggedInUser:"
            java.lang.String r13 = X.002.A0u(r1, r14, r0, r13)     // Catch:{ all -> 0x01c1 }
            X.1Ln r12 = X.1Ln.A0L(r12)     // Catch:{ all -> 0x01c1 }
            X.3FX r1 = X.AnonymousClass3FX.CLIENT_ERROR     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "trigger_event"
            r12.A0M(r1, r0)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "trigger_error"
            r12.A0R(r0, r13)     // Catch:{ all -> 0x01c1 }
            r12.Cgf()     // Catch:{ all -> 0x01c1 }
            r0 = 36312075882333067(0x8101a40006038b, double:3.027241232756262E-306)
            boolean r0 = X.182.A06(r3, r8, r0)     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x00c7
            goto L_0x01b0
        L_0x00c7:
            X.3FZ r0 = r11.A00(r10, r9)     // Catch:{ all -> 0x01c1 }
            X.3JE r0 = (X.AnonymousClass3JE) r0     // Catch:{ all -> 0x01c1 }
            X.3FZ r1 = r0.A00(r4, r2)     // Catch:{ all -> 0x01c1 }
            X.3JF r1 = (X.AnonymousClass3JF) r1     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "mobile_deeplink"
            java.lang.String r3 = r1.A05(r0)     // Catch:{ all -> 0x01c1 }
            X.3FZ r0 = r11.A00(r10, r9)     // Catch:{ all -> 0x01c1 }
            X.3JE r0 = (X.AnonymousClass3JE) r0     // Catch:{ all -> 0x01c1 }
            X.3FZ r0 = r0.A00(r4, r2)     // Catch:{ all -> 0x01c1 }
            X.3JF r0 = (X.AnonymousClass3JF) r0     // Catch:{ all -> 0x01c1 }
            java.lang.String r10 = "ttl"
            org.json.JSONObject r0 = r0.A00     // Catch:{ all -> 0x01c1 }
            int r9 = r0.optInt(r10)     // Catch:{ all -> 0x01c1 }
            if (r3 == 0) goto L_0x0191
            X.2MD r0 = X.2MD.A01()     // Catch:{ all -> 0x01c1 }
            boolean r0 = r0.A0A()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x0191
            X.0wc r4 = X.AnonymousClass0kN.A01(r5, r8)     // Catch:{ all -> 0x01c1 }
            android.net.Uri r2 = X.0cp.A03(r3)     // Catch:{ Exception -> 0x014d }
            r0 = 2918(0xb66, float:4.089E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x014d }
            boolean r0 = r3.contains(r0)     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = "params"
            java.lang.String r1 = r2.getQueryParameter(r0)     // Catch:{ Exception -> 0x014d }
            if (r1 == 0) goto L_0x0154
            X.0c5 r0 = X.0c9.A04     // Catch:{ Exception -> 0x014d }
            X.0c9 r0 = r0.A01(r8, r1)     // Catch:{ Exception -> 0x014d }
            java.util.HashMap r0 = X.F5I.A00(r0)     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0154
            java.lang.String r1 = "flow_name"
            boolean r0 = r0.containsKey(r1)     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0154
            java.lang.String r12 = r2.getQueryParameter(r1)     // Catch:{ Exception -> 0x014d }
            if (r12 != 0) goto L_0x015a
            java.lang.String r0 = "flow_name_missing:"
            java.lang.String r12 = X.002.A0R(r0, r3)     // Catch:{ Exception -> 0x014d }
            goto L_0x015a
        L_0x0136:
            java.lang.String r0 = "consent-launcher"
            boolean r0 = r3.contains(r0)     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = "flow_name"
            java.lang.String r12 = r2.getQueryParameter(r0)     // Catch:{ Exception -> 0x014d }
            if (r12 != 0) goto L_0x015a
            java.lang.String r0 = "flow_name_missing:"
            java.lang.String r12 = X.002.A0R(r0, r3)     // Catch:{ Exception -> 0x014d }
            goto L_0x015a
        L_0x014d:
            java.lang.String r0 = "parse_error:"
            java.lang.String r12 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x01c1 }
            goto L_0x015a
        L_0x0154:
            java.lang.String r0 = "bad_url:"
            java.lang.String r12 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x01c1 }
        L_0x015a:
            long r0 = (long) r9     // Catch:{ all -> 0x01c1 }
            r2 = 0
            X.0qQ.A0B(r12, r2)     // Catch:{ all -> 0x01c1 }
            X.1Ln r11 = X.1Ln.A0L(r4)     // Catch:{ all -> 0x01c1 }
            X.3FX r4 = X.AnonymousClass3FX.CLIENT_FLOW_LAUNCH     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = "trigger_event"
            r11.A0M(r4, r2)     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = "flow_name"
            r11.A0R(r2, r12)     // Catch:{ all -> 0x01c1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01c1 }
            r11.A0Q(r10, r0)     // Catch:{ all -> 0x01c1 }
            r11.Cgf()     // Catch:{ all -> 0x01c1 }
            X.2ZQ r2 = X.C71172bH.A00()     // Catch:{  }
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2     // Catch:{  }
            if (r2 == 0) goto L_0x01ab
            X.14B r1 = X.AnonymousClass14B.A00()     // Catch:{ all -> 0x01c1 }
            android.net.Uri r0 = X.0cp.A03(r3)     // Catch:{ all -> 0x01c1 }
            android.content.Intent r0 = r1.A04(r2, r0)     // Catch:{ all -> 0x01c1 }
            X.0kR.A0B(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01ab }
            goto L_0x01ab
        L_0x0191:
            X.0wc r0 = X.AnonymousClass0kN.A01(r5, r8)     // Catch:{ all -> 0x01c1 }
            long r3 = (long) r9     // Catch:{ all -> 0x01c1 }
            X.1Ln r2 = X.1Ln.A0L(r0)     // Catch:{ all -> 0x01c1 }
            X.3FX r1 = X.AnonymousClass3FX.CLIENT_RECEIVE_RESPONSE_NULL     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "trigger_event"
            r2.A0M(r1, r0)     // Catch:{ all -> 0x01c1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01c1 }
            r2.A0Q(r10, r0)     // Catch:{ all -> 0x01c1 }
            r2.Cgf()     // Catch:{ all -> 0x01c1 }
        L_0x01ab:
            java.lang.String r0 = r8.A06     // Catch:{ all -> 0x01c1 }
            r5.A04(r0, r9)     // Catch:{ all -> 0x01c1 }
        L_0x01b0:
            monitor-exit(r5)
            r0 = 0
            r5.A04 = r0
            r0 = -529751321(0xffffffffe06ca2e7, float:-6.820578E19)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 14331052(0xdaacac, float:2.0082081E-38)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x01c1:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Fm.onSuccessInBackground(java.lang.Object):void");
    }

    public final void onFailInBackground(C268654dm r8) {
        int A03 = AnonymousClass0fD.A03(171546862);
        2M1 r5 = this.A01.A00;
        1Ln A0L = 1Ln.A0L(AnonymousClass0kN.A01(r5, this.A00));
        A0L.A0M(AnonymousClass3FX.CLIENT_ERROR, "trigger_event");
        A0L.A0R("trigger_error", "GraphQL Failure");
        A0L.Cgf();
        r5.A04 = false;
        0wb.A03("PRIVACY_FLOW", AnonymousClass000.A00(446));
        AnonymousClass0fD.A0A(-2085576466, A03);
    }
}
