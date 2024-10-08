package com.instagram.urlhandlers.interappidentityswitch;

import X.AnonymousClass08W;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import com.instagram.base.activity.IgFragmentActivity;

public final class InterAppIdentitySwitchUrlHandlerActivity extends IgFragmentActivity implements AnonymousClass0iw, AnonymousClass08W {
    public AnonymousClass0wW A00;

    public final String getModuleName() {
        return "inter_app_identity_switch";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: X.0wW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: X.0wW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: X.0wW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: X.0wW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: X.0wW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v1, resolved type: X.0wW} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f3, code lost:
        if ("instagram".equals(r4) != false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010c, code lost:
        if (r4.contains(r7) == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02d7, code lost:
        if (r7 == false) goto L_0x02d9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r53) {
        /*
            r52 = this;
            r0 = -1922710390(0xffffffff8d65c48a, float:-7.080265E-31)
            int r9 = X.AnonymousClass0fD.A00(r0)
            r0 = r52
            r1 = r53
            super.onCreate(r1)
            android.content.Intent r7 = r0.getIntent()
            X.0xm r5 = X.DbS.A0e()
            android.os.Bundle r10 = X.DbT.A0A(r7)
            if (r10 != 0) goto L_0x0026
            r0.finish()
            r0 = -79065308(0xfffffffffb498f24, float:-1.0465549E36)
        L_0x0022:
            X.AnonymousClass0fD.A07(r0, r9)
            return
        L_0x0026:
            X.08y r6 = X.09i.A0A
            X.0wW r1 = r6.A04(r10)
            r0.A00 = r1
            java.lang.String r19 = X.AnonymousClass7TG.A0j()
            java.lang.String r8 = X.DbS.A0m(r10)
            java.lang.String r12 = "Required value was null."
            if (r8 == 0) goto L_0x0356
            r45 = 0
            android.net.Uri r4 = X.DbT.A09(r8)
            java.lang.String r2 = "initiator_app"
            java.lang.String r33 = r4.getQueryParameter(r2)
            java.lang.String r2 = "start_time"
            java.lang.String r18 = r4.getQueryParameter(r2)
            java.lang.String r2 = "account_id"
            java.lang.String r2 = r7.getStringExtra(r2)
            java.lang.String r3 = X.Dbe.A01()
            java.lang.String r3 = r7.getStringExtra(r3)
            if (r3 == 0) goto L_0x006a
            X.0BQ r2 = X.AnonymousClass0BO.A00(r1)
            com.instagram.user.model.User r2 = r2.BNx(r3)
            if (r2 == 0) goto L_0x0351
            java.lang.String r2 = r2.getId()
        L_0x006a:
            java.lang.String r3 = "inter_app_identity_switch"
            java.lang.String r41 = r4.getQueryParameter(r3)
            java.lang.String r3 = "xapp_session_id"
            java.lang.String r35 = r4.getQueryParameter(r3)
            boolean r3 = r1 instanceof com.instagram.common.session.UserSession
            if (r3 != 0) goto L_0x00aa
            X.FFQ.A01(r0, r10, r1)
            if (r18 == 0) goto L_0x00a2
            if (r33 == 0) goto L_0x00a2
            if (r2 == 0) goto L_0x00a7
            java.lang.Long r37 = X.AnonymousClass7TE.A10(r2)
        L_0x0087:
            double r46 = java.lang.Double.parseDouble(r18)
            java.lang.String r39 = "inter_app"
            java.lang.String r43 = "logged_out"
            r48 = 0
            r49 = 1
            r36 = r1
            r38 = r37
            r40 = r19
            r50 = r48
            r42 = r33
            r44 = r35
            X.C46400DeN.A03(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49, r50)
        L_0x00a2:
            r0 = 1488333835(0x58b62c0b, float:1.60240223E15)
            goto L_0x0022
        L_0x00a7:
            r37 = r45
            goto L_0x0087
        L_0x00aa:
            java.lang.String r3 = "destination_url"
            java.lang.String r7 = r7.getStringExtra(r3)
            r11 = 3
            r17 = 1
            java.lang.CharSequence[] r10 = new java.lang.CharSequence[]{r8, r7, r2}
            r8 = 0
        L_0x00b8:
            r3 = r10[r8]
            boolean r3 = X.C296675qS.A03(r3)
            if (r3 == 0) goto L_0x00c8
            r0.finish()
            r0 = -1795868486(0xffffffff94f538ba, float:-2.4761053E-26)
            goto L_0x0022
        L_0x00c8:
            int r8 = r8 + 1
            if (r8 < r11) goto L_0x00b8
            java.lang.String r15 = "InterAppRedirect"
            if (r7 == 0) goto L_0x0327
            java.lang.String r3 = "UTF-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r7, r3)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r3 == 0) goto L_0x031f
            android.net.Uri r10 = X.DbT.A09(r3)     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r4 = r4.getScheme()     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r7 = r10.getScheme()     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r3 = "https"
            boolean r3 = r3.equals(r4)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r3 != 0) goto L_0x00f5
            java.lang.String r3 = "instagram"
            boolean r3 = r3.equals(r4)     // Catch:{ IOException | SecurityException -> 0x033f }
            r8 = 0
            if (r3 == 0) goto L_0x00f6
        L_0x00f5:
            r8 = 1
        L_0x00f6:
            if (r7 == 0) goto L_0x010e
            int r3 = r7.length()     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r3 == 0) goto L_0x010e
            java.util.HashSet r4 = X.AnonymousClass7TE.A1F()     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r3 = "instagram"
            r4.add(r3)     // Catch:{ IOException | SecurityException -> 0x033f }
            boolean r4 = r4.contains(r7)     // Catch:{ IOException | SecurityException -> 0x033f }
            r3 = 1
            if (r4 != 0) goto L_0x010f
        L_0x010e:
            r3 = 0
        L_0x010f:
            if (r8 == 0) goto L_0x0315
            if (r3 == 0) goto L_0x0315
            X.0xa r4 = r5.A00     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r3 = "auth_login_should_show_snackbar_fb_switcher"
            r13 = 0
            boolean r3 = r4.getBoolean(r3, r13)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r3 == 0) goto L_0x012c
            X.0xY r5 = r4.AR4()     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r4 = "is_routed_by_inter_app_identity_switch_url_handler"
            r3 = r17
            r5.E5T(r4, r3)     // Catch:{ IOException | SecurityException -> 0x033f }
            r5.apply()     // Catch:{ IOException | SecurityException -> 0x033f }
        L_0x012c:
            X.0aP r24 = r6.A03(r0)     // Catch:{ IOException | SecurityException -> 0x033f }
            r4 = r1
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r2 == 0) goto L_0x032f
            if (r41 != 0) goto L_0x0139
            java.lang.String r41 = ""
        L_0x0139:
            java.lang.Long r30 = X.AnonymousClass7TE.A10(r2)     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r3 = r4.A06     // Catch:{ IOException | SecurityException -> 0x033f }
            boolean r3 = r2.equals(r3)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r3 == 0) goto L_0x017f
            android.content.Intent r2 = X.DbX.A08(r0)     // Catch:{ IOException | SecurityException -> 0x033f }
            r2.setData(r10)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.0kR.A09(r0, r2)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r18 == 0) goto L_0x0174
            if (r33 == 0) goto L_0x0174
            double r31 = java.lang.Double.parseDouble(r18)     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r24 = "inter_app"
            java.lang.String r28 = "active_session"
            r21 = r1
            r22 = r30
            r23 = r30
            r25 = r19
            r26 = r41
            r27 = r33
            r29 = r35
            r30 = r45
            r33 = r17
            r34 = r17
            r35 = r17
            X.C46400DeN.A03(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35)     // Catch:{ IOException | SecurityException -> 0x033f }
        L_0x0174:
            boolean r1 = r0.isTaskRoot()     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r1 == 0) goto L_0x00a2
            r0.finish()     // Catch:{ IOException | SecurityException -> 0x033f }
            goto L_0x00a2
        L_0x017f:
            android.content.Intent r5 = X.DbX.A08(r0)     // Catch:{ IOException | SecurityException -> 0x033f }
            r5.setData(r10)     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r6 = "event_session_id"
            r3 = r19
            r5.putExtra(r6, r3)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.0BQ r3 = X.AnonymousClass0BO.A00(r4)     // Catch:{ IOException | SecurityException -> 0x033f }
            boolean r6 = r3.CO7(r2)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r6 == 0) goto L_0x0218
            com.instagram.user.model.User r6 = r3.BNw(r2)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r6 == 0) goto L_0x033a
            java.lang.String r12 = r6.getUsername()     // Catch:{ IOException | SecurityException -> 0x033f }
            boolean r2 = r3.AG1(r0, r4, r6)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r2 == 0) goto L_0x02d9
            android.content.res.Resources r8 = r0.getResources()     // Catch:{ IOException | SecurityException -> 0x033f }
            r7 = 2131962883(0x7f132c03, float:1.9562504E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r12}     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r8 = r8.getString(r7, r2)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.0qQ.A07(r8)     // Catch:{ IOException | SecurityException -> 0x033f }
            android.content.res.Resources r10 = r0.getResources()     // Catch:{ IOException | SecurityException -> 0x033f }
            r7 = 2131962882(0x7f132c02, float:1.9562502E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r12}     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r7 = r10.getString(r7, r2)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.0qQ.A07(r7)     // Catch:{ IOException | SecurityException -> 0x033f }
            r21 = 6
            X.FIh r2 = new X.FIh     // Catch:{ IOException | SecurityException -> 0x033f }
            r20 = r2
            r22 = r6
            r23 = r3
            r24 = r0
            r25 = r5
            r26 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ IOException | SecurityException -> 0x033f }
            r3 = 40
            X.FJg r4 = X.C50021FJg.A00(r0, r3)     // Catch:{ IOException | SecurityException -> 0x033f }
            r3 = 2131956481(0x7f131301, float:1.9549519E38)
            X.8ab r0 = X.DbX.A0g(r0, r7, r8)     // Catch:{ IOException | SecurityException -> 0x033f }
            r0.A0I(r2, r3)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.DbX.A16(r4, r0)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r18 == 0) goto L_0x00a2
            if (r33 == 0) goto L_0x00a2
            double r31 = java.lang.Double.parseDouble(r18)     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r24 = "inter_app"
            java.lang.String r28 = "inactive_session"
            r21 = r1
            r22 = r30
            r23 = r30
            r25 = r19
            r26 = r41
            r27 = r33
            r29 = r35
            r30 = r45
            r33 = r17
            r34 = r17
            r35 = r17
            X.C46400DeN.A03(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35)     // Catch:{ IOException | SecurityException -> 0x033f }
            goto L_0x00a2
        L_0x0218:
            X.6qt r5 = X.C319606qt.A01(r4)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.0qQ.A07(r5)     // Catch:{ IOException | SecurityException -> 0x033f }
            java.util.ArrayList r6 = r5.A06(r1)     // Catch:{ IOException | SecurityException -> 0x033f }
            boolean r6 = X.DbT.A1b(r6)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r6 == 0) goto L_0x02d9
            r7 = 0
            java.util.ArrayList r5 = r5.A05()     // Catch:{ IOException | SecurityException -> 0x033f }
            java.util.Iterator r16 = r5.iterator()     // Catch:{ IOException | SecurityException -> 0x033f }
        L_0x0232:
            boolean r5 = r16.hasNext()     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r5 == 0) goto L_0x02d7
            java.lang.Object r6 = r16.next()     // Catch:{ IOException | SecurityException -> 0x033f }
            X.6qx r6 = (X.C319646qx) r6     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r5 = r6.A06     // Catch:{ IOException | SecurityException -> 0x033f }
            boolean r5 = X.0qQ.A0K(r5, r2)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r5 == 0) goto L_0x0232
            java.lang.String r14 = r6.A07     // Catch:{ IOException | SecurityException -> 0x033f }
            X.Fdb r5 = new X.Fdb     // Catch:{ IOException | SecurityException -> 0x033f }
            r5.<init>(r0)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.DiE r29 = X.C46634DiE.A0p     // Catch:{ IOException | SecurityException -> 0x033f }
            X.EMZ r20 = new X.EMZ     // Catch:{ IOException | SecurityException -> 0x033f }
            r23 = r0
            r26 = r4
            r27 = r5
            r28 = r3
            r31 = r14
            r32 = r2
            r34 = r19
            r21 = r10
            r22 = r0
            r25 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.0qQ.A0A(r14)     // Catch:{ IOException | SecurityException -> 0x033f }
            android.content.res.Resources r8 = r0.getResources()     // Catch:{ IOException | SecurityException -> 0x033f }
            r7 = 2131962883(0x7f132c03, float:1.9562504E38)
            java.lang.Object[] r5 = new java.lang.Object[]{r14}     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r12 = r8.getString(r7, r5)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.0qQ.A07(r12)     // Catch:{ IOException | SecurityException -> 0x033f }
            android.content.res.Resources r8 = r0.getResources()     // Catch:{ IOException | SecurityException -> 0x033f }
            r7 = 2131962882(0x7f132c02, float:1.9562502E38)
            java.lang.Object[] r5 = new java.lang.Object[]{r14}     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r7 = r8.getString(r7, r5)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.0qQ.A07(r7)     // Catch:{ IOException | SecurityException -> 0x033f }
            r47 = 14
            X.FJj r5 = new X.FJj     // Catch:{ IOException | SecurityException -> 0x033f }
            r46 = r5
            r48 = r20
            r49 = r6
            r50 = r0
            r51 = r24
            r46.<init>((int) r47, (java.lang.Object) r48, (java.lang.Object) r49, (java.lang.Object) r50, (java.lang.Object) r51)     // Catch:{ IOException | SecurityException -> 0x033f }
            r6 = 41
            X.FJg r8 = X.C50021FJg.A00(r0, r6)     // Catch:{ IOException | SecurityException -> 0x033f }
            r6 = 2131956481(0x7f131301, float:1.9549519E38)
            X.8ab r7 = X.DbX.A0g(r0, r7, r12)     // Catch:{ IOException | SecurityException -> 0x033f }
            r7.A0I(r5, r6)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.DbX.A16(r8, r7)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r18 == 0) goto L_0x02d4
            if (r33 == 0) goto L_0x02d4
            double r46 = java.lang.Double.parseDouble(r18)     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r39 = "inter_app"
            java.lang.String r43 = "logged_out"
            r36 = r1
            r37 = r30
            r38 = r30
            r40 = r19
            r42 = r33
            r44 = r35
            r48 = r13
            r49 = r17
            r50 = r17
            X.C46400DeN.A03(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49, r50)     // Catch:{ IOException | SecurityException -> 0x033f }
        L_0x02d4:
            r7 = 1
            goto L_0x0232
        L_0x02d7:
            if (r7 != 0) goto L_0x00a2
        L_0x02d9:
            X.0qQ.A0B(r1, r11)     // Catch:{ IOException | SecurityException -> 0x033f }
            if (r18 == 0) goto L_0x0301
            if (r33 == 0) goto L_0x0301
            double r31 = java.lang.Double.parseDouble(r18)     // Catch:{ IOException | SecurityException -> 0x033f }
            java.lang.String r24 = "inter_app"
            java.lang.String r28 = "logged_out"
            r21 = r1
            r22 = r30
            r23 = r30
            r25 = r19
            r26 = r41
            r27 = r33
            r29 = r35
            r30 = r45
            r33 = r13
            r34 = r17
            r35 = r13
            X.C46400DeN.A03(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35)     // Catch:{ IOException | SecurityException -> 0x033f }
        L_0x0301:
            r1 = r3
            r2 = r0
            r3 = r45
            r5 = r3
            r6 = r13
            X.0B7 r1 = r1.AEO(r2, r3, r4, r5, r6)     // Catch:{ IOException | SecurityException -> 0x033f }
            X.FFQ.A00()     // Catch:{ IOException | SecurityException -> 0x033f }
            android.os.Bundle r1 = r1.A00     // Catch:{ IOException | SecurityException -> 0x033f }
            X.C48974EnC.A00(r0, r1, r4, r13)     // Catch:{ IOException | SecurityException -> 0x033f }
            goto L_0x00a2
        L_0x0315:
            r0.finish()     // Catch:{ IOException | SecurityException -> 0x033f }
            r0 = 2014347974(0x781082c6, float:1.1724112E34)
            X.AnonymousClass0fD.A07(r0, r9)     // Catch:{ IOException | SecurityException -> 0x033f }
            goto L_0x0355
        L_0x031f:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r12)     // Catch:{ IOException | SecurityException -> 0x033f }
            r0 = -1939245562(0xffffffff8c697606, float:-1.7985183E-31)
            goto L_0x0336
        L_0x0327:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r12)     // Catch:{ IOException | SecurityException -> 0x033f }
            r0 = 713249368(0x2a835258, float:2.3327412E-13)
            goto L_0x0336
        L_0x032f:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r12)     // Catch:{ IOException | SecurityException -> 0x033f }
            r0 = 8559396(0x829b24, float:1.1994268E-38)
        L_0x0336:
            X.AnonymousClass0fD.A07(r0, r9)     // Catch:{ IOException | SecurityException -> 0x033f }
            goto L_0x033e
        L_0x033a:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r12)     // Catch:{ IOException | SecurityException -> 0x033f }
        L_0x033e:
            throw r1     // Catch:{ IOException | SecurityException -> 0x033f }
        L_0x033f:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x00a2
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00a2
            X.0wb.A03(r15, r1)
            goto L_0x00a2
        L_0x0351:
            r2 = r45
            goto L_0x006a
        L_0x0355:
            return
        L_0x0356:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r12)
            r0 = -1690962391(0xffffffff9b35f629, float:-1.5051508E-22)
            X.AnonymousClass0fD.A07(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.interappidentityswitch.InterAppIdentitySwitchUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
