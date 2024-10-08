package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class P9J implements C333037Xk, C333077Xo {
    public final UserSession A00;
    public final Context A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final OT9 A04;
    public final C273434mZ A05;
    public final C62320sa A06;

    public P9J(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, OT9 ot9, C273434mZ r6, C62320sa r7) {
        0qQ.A0B(fragment, 3);
        AnonymousClass7TG.A1S(r6, ot9);
        this.A00 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = fragment;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = ot9;
        this.A01 = fragmentActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r1 == 29) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void De1(android.graphics.RectF r19, X.28D r20, com.instagram.creation.cameraconfiguration.CameraConfiguration r21, java.lang.String r22, java.lang.String r23) {
        /*
            r18 = this;
            r5 = 0
            r13 = r20
            r3 = r22
            boolean r2 = X.AnonymousClass7TG.A1Z(r3, r13)
            r11 = r18
            X.OT9 r1 = r11.A04
            java.lang.String r0 = "onReplyWithExpiringMediaCamera"
            X.3su r2 = X.OT9.A00(r1, r3, r0, r2)
            if (r2 == 0) goto L_0x0062
            X.0sa r0 = r11.A06
            X.7Zg r0 = X.C66580MXl.A0W(r0)
            if (r0 == 0) goto L_0x0062
            X.7SD r0 = X.C66581MXm.A0Z(r0)
            int r1 = r0.A08
            boolean r0 = X.AnonymousClass48O.A01(r1)
            if (r0 != 0) goto L_0x002f
            r0 = 29
            r17 = 0
            if (r1 != r0) goto L_0x0031
        L_0x002f:
            r17 = 1
        L_0x0031:
            java.lang.String r4 = r2.A0g()
            java.lang.String r6 = r2.A0f()
            if (r4 == 0) goto L_0x0065
            if (r6 == 0) goto L_0x0065
            X.2FW r1 = r2.A10
            X.2FW r0 = X.2FW.A0q
            if (r1 != r0) goto L_0x0063
            X.4ik r3 = r2.A0e
        L_0x0045:
            java.lang.String r7 = r2.A1u
            java.lang.String r8 = "thread_view_camera_reply_shortcut"
            boolean r10 = r2.A1S()
            X.2FW r2 = r2.A0z
            X.OU1 r0 = new X.OU1
            r9 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.3tI r15 = new X.3tI
            r15.<init>(r0)
            r12 = r19
            r14 = r5
            r16 = r5
            r11.Cpd(r12, r13, r14, r15, r16, r17)
        L_0x0062:
            return
        L_0x0063:
            r3 = 0
            goto L_0x0045
        L_0x0065:
            java.lang.String r0 = "Message ID and client context cannot be null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9J.De1(android.graphics.RectF, X.28D, com.instagram.creation.cameraconfiguration.CameraConfiguration, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (X.182.A06(X.0Tu.A05, r2.A00, 36325742468412596L) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (X.182.A06(X.0Tu.A05, r2.A00, 36325742468281522L) == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cpd(android.graphics.RectF r18, X.28D r19, com.instagram.creation.cameraconfiguration.CameraConfiguration r20, X.C254933tI r21, java.lang.String r22, boolean r23) {
        /*
            r17 = this;
            r2 = r17
            X.0sa r0 = r2.A06
            java.lang.Object r0 = r0.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            if (r0 == 0) goto L_0x0075
            X.7S7 r1 = r0.C6l()
            int r4 = X.C66580MXl.A05(r1)
            r8 = 1
            r3 = 1012(0x3f4, float:1.418E-42)
            if (r4 != r3) goto L_0x003b
            java.util.List r3 = r1.BRZ()
            java.lang.Object r3 = X.00k.A0J(r3)
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            if (r3 == 0) goto L_0x003b
            boolean r3 = r3.A1X()
            if (r3 == 0) goto L_0x003b
            com.instagram.common.session.UserSession r6 = r2.A00
            X.0Tu r5 = X.0Tu.A05
            r3 = 36325742468281522(0x810e12000634b2, double:3.035884036740989E-306)
            boolean r3 = X.182.A06(r5, r6, r3)
            r7 = 1
            if (r3 != 0) goto L_0x003c
        L_0x003b:
            r7 = 0
        L_0x003c:
            int r4 = X.C66580MXl.A05(r1)
            r3 = 1014(0x3f6, float:1.421E-42)
            if (r4 != r3) goto L_0x0054
            com.instagram.common.session.UserSession r6 = r2.A00
            X.0Tu r5 = X.0Tu.A05
            r3 = 36325742468412596(0x810e12000834b4, double:3.035884036823881E-306)
            boolean r4 = X.182.A06(r5, r6, r3)
            r3 = 1
            if (r4 != 0) goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            if (r7 != 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            r8 = 0
        L_0x005a:
            com.instagram.direct.capabilities.Capabilities r4 = r1.AlE()
            X.9Gx r3 = X.C376179Gx.RAVEN_VISUAL_MESSAGING
            boolean r3 = r4.A00(r3)
            if (r3 != 0) goto L_0x0068
            if (r8 == 0) goto L_0x0075
        L_0x0068:
            boolean r3 = r1.CdE()
            if (r3 != 0) goto L_0x0076
            java.lang.String r1 = "DirectThreadFragment.openExpiringMediaCamera"
            java.lang.String r0 = "mThread is null"
            X.0wb.A03(r1, r0)
        L_0x0075:
            return
        L_0x0076:
            boolean r3 = r0 instanceof X.C333507Zf
            r9 = r21
            if (r3 == 0) goto L_0x00de
            com.instagram.common.session.UserSession r7 = r2.A00
            android.content.Context r5 = r2.A01
            r3 = r0
            X.7Zf r3 = (X.C333507Zf) r3
            X.7S6 r4 = r3.A02
            X.2Ep r3 = r4.A07
            r3.getClass()
            java.lang.String r14 = r4.C6C()
            r15 = 7
            if (r21 != 0) goto L_0x0092
            r15 = 0
        L_0x0092:
            r10 = r5
            r11 = r7
            r12 = r9
            r13 = r3
            com.instagram.model.direct.camera.DirectCameraViewModel r11 = X.C71046OaO.A01(r10, r11, r12, r13, r14, r15)
        L_0x009a:
            X.0qQ.A0A(r11)
            androidx.fragment.app.FragmentActivity r5 = r2.A03
            androidx.fragment.app.Fragment r4 = r2.A02
            r15 = 0
            X.4mZ r10 = r2.A05
            X.3sy r12 = r1.B8S()
            if (r8 != 0) goto L_0x00c9
            boolean r0 = r0 instanceof X.P27
            if (r0 != 0) goto L_0x00dc
            int r0 = X.C66580MXl.A05(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.AnonymousClass48O.A06(r0)
            if (r0 != 0) goto L_0x00dc
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325742468347059(0x810e12000734b3, double:3.035884036782435E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00dc
        L_0x00c9:
            r0 = 1
        L_0x00ca:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            java.lang.String r14 = "direct_quick_reply_camera_fragment"
            r3 = r18
            r6 = r19
            r8 = r20
            r16 = r22
            X.C70033NwB.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x00dc:
            r0 = 0
            goto L_0x00ca
        L_0x00de:
            boolean r3 = r0 instanceof X.P27
            com.instagram.common.session.UserSession r7 = r2.A00
            r14 = r23
            if (r3 == 0) goto L_0x00fe
            r3 = r0
            X.P27 r3 = (X.P27) r3
            X.7Rg r4 = r3.A04
            android.content.Context r3 = r2.A01
            com.instagram.model.direct.DirectShareTarget r12 = r4.C6Z(r3)
            X.7SD r3 = r4.A0C
            boolean r3 = r3.A0x
            r13 = 0
            r10 = r7
            r11 = r9
            r15 = r3
        L_0x00f9:
            com.instagram.model.direct.camera.DirectCameraViewModel r11 = X.C71046OaO.A02(r10, r11, r12, r13, r14, r15)
            goto L_0x009a
        L_0x00fe:
            android.content.Context r3 = r2.A01
            com.instagram.model.direct.DirectShareTarget r12 = r1.C6Z(r3)
            X.7SD r3 = X.C66580MXl.A0Z(r1)
            java.lang.Long r13 = X.C330007Lb.A00(r3)
            r15 = 0
            r10 = r7
            r11 = r9
            goto L_0x00f9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9J.Cpd(android.graphics.RectF, X.28D, com.instagram.creation.cameraconfiguration.CameraConfiguration, X.3tI, java.lang.String, boolean):void");
    }
}
