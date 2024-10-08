package X;

public abstract class OPY {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.app.Activity r21, android.content.Context r22, android.graphics.RectF r23, android.graphics.RectF r24, X.28D r25, com.instagram.common.session.UserSession r26, X.C273434mZ r27, com.instagram.model.direct.DirectThreadKey r28, com.instagram.model.direct.camera.DirectCameraViewModel r29, java.lang.String r30, boolean r31) {
        /*
            r1 = r26
            r4 = r30
            X.2Dm r3 = X.1bJ.A00(r1)
            java.lang.String r0 = r29.A00()
            r2 = r22
            r6 = r23
            r8 = r25
            if (r0 == 0) goto L_0x00a2
            X.3U9 r13 = X.C66580MXl.A0d(r3, r0)
            if (r13 == 0) goto L_0x00a2
            if (r31 == 0) goto L_0x00a2
            r5 = r28
            if (r28 == 0) goto L_0x00a2
            com.instagram.model.direct.DirectThreadKey r0 = r13.BJz()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r13.CKx()
            if (r0 != 0) goto L_0x00a2
            com.instagram.model.direct.DirectThreadKey r0 = r13.BJz()
            if (r30 != 0) goto L_0x0038
            java.lang.String r4 = ""
        L_0x0038:
            java.util.List r3 = r3.CFn(r0, r4)
            if (r3 == 0) goto L_0x00a2
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00a2
            java.lang.Object r0 = X.C66582MXn.A0r(r3)
            X.3su r0 = (X.C254703su) r0
            if (r0 == 0) goto L_0x00a2
            java.lang.String r14 = r13.C6C()
            r19 = 0
            r9 = 0
            r10 = r2
            r11 = r1
            r12 = r9
            r15 = r19
            com.instagram.model.direct.camera.DirectCameraViewModel r11 = X.C71046OaO.A01(r10, r11, r12, r13, r14, r15)
            X.1as r3 = X.1as.A04
            X.1aq r5 = r3.A01
            com.instagram.model.direct.DirectThreadKey r12 = r13.BJz()
            java.lang.String r13 = r0.A0g()
            java.lang.String r14 = r0.A0f()
            boolean r4 = r0.A2P
            X.1at r3 = X.C327657Br.A00()
            X.2FW r0 = r0.A10
            X.7Bu r0 = r3.A01(r0)
            java.lang.String r16 = r0.CFp()
            r7 = r6
            r10 = r9
            r15 = r9
            r17 = r9
            r20 = r19
            r18 = r4
            android.os.Bundle r4 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            java.lang.String r0 = "direct_visual_reply_fragment"
        L_0x008d:
            r5 = r21
            X.6W8 r0 = X.AnonymousClass6W8.A02(r5, r4, r1, r3, r0)
            r1 = r27
            if (r27 == 0) goto L_0x009a
            r0.A0E(r1)
        L_0x009a:
            r0.A0C(r2)
            r0 = 0
            r5.overridePendingTransition(r0, r0)
            return
        L_0x00a2:
            android.os.Bundle r4 = X.C66582MXn.A0B(r29)
            r3 = 0
            X.0qQ.A0B(r6, r3)
            r0 = 24
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putParcelable(r0, r6)
            X.0qQ.A0B(r8, r3)
            X.C360908fL.A00(r8)
            java.lang.String r0 = "DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT"
            r4.putSerializable(r0, r8)
            r3 = r24
            if (r24 == 0) goto L_0x00c7
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ON_DIRECT_SEND_SUCCESS_EXIT_BOUNDS"
            r4.putParcelable(r0, r3)
        L_0x00c7:
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            java.lang.String r0 = "direct_quick_reply_camera_fragment"
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OPY.A00(android.app.Activity, android.content.Context, android.graphics.RectF, android.graphics.RectF, X.28D, com.instagram.common.session.UserSession, X.4mZ, com.instagram.model.direct.DirectThreadKey, com.instagram.model.direct.camera.DirectCameraViewModel, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        if (X.182.A06(X.DbS.A0J(r3, 0), r3, 36324831934820747L) == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.app.Activity r14, androidx.fragment.app.Fragment r15, X.AnonymousClass0iw r16, X.0wc r17, com.instagram.common.session.UserSession r18, X.C51869G5g r19, X.C273434mZ r20, com.instagram.model.direct.DirectShareTarget r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r9 = r21
            r5 = r14
            X.3t2 r0 = X.DbS.A0c(r9)
            r14 = 0
            boolean r0 = r0 instanceof X.C254773t1
            r3 = r18
            if (r0 == 0) goto L_0x0059
            X.3t2 r0 = X.DbS.A0c(r9)
            X.3t1 r0 = X.AnonymousClass6W3.A02(r0)
            if (r0 == 0) goto L_0x00c0
            X.2Dm r1 = X.1bJ.A00(r3)
            com.instagram.model.direct.DirectThreadKey r0 = X.AnonymousClass6W4.A01(r0)
            X.3U9 r4 = r1.B33(r0)
        L_0x0024:
            boolean r0 = r9.A0F()
            r2 = 1
            r7 = r16
            r8 = r19
            r11 = r23
            if (r0 == 0) goto L_0x005b
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r4 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r4.<init>(r3)
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            boolean r0 = r9.A0Q()
            if (r0 == 0) goto L_0x004e
            X.0Tu r2 = X.DbS.A0J(r3, r14)
            r0 = 36324831934820747(0x810d3e0000318b, double:3.035308211713971E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r13 = 1
            if (r0 != 0) goto L_0x004f
        L_0x004e:
            r13 = 0
        L_0x004f:
            r6 = 0
            r10 = r6
            r12 = r6
            r15 = r14
            r16 = r14
            r4.A0A(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0059:
            r4 = 0
            goto L_0x0024
        L_0x005b:
            java.util.List r0 = X.DbT.A14(r9)
            r1 = r17
            X.AnonymousClass73V.A08(r1, r3, r4, r0)
            X.1pE r3 = X.1pE.A01(r5, r7, r3, r11)
            X.3t2 r0 = X.DbS.A0c(r9)
            r3.A0B = r0
            java.util.List r0 = X.DbT.A14(r9)
            int r1 = r0.size()
            r0 = 2
            boolean r0 = X.AnonymousClass7TF.A1T(r1, r0)
            r3.A0q = r0
            r3.A01 = r15
            if (r4 == 0) goto L_0x00be
            boolean r0 = r4.isPending()
            if (r0 == 0) goto L_0x00be
        L_0x0087:
            r3.A11 = r2
            r0 = r22
            r3.A0d = r0
            r2 = 1
            r3.A13 = r2
            java.util.List r1 = X.DbT.A14(r9)
            X.0qQ.A0B(r1, r14)
            int r0 = r1.size()
            if (r0 != r2) goto L_0x00bc
            java.lang.Object r0 = r1.get(r14)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            java.lang.String r1 = r0.getId()
            X.Ord r0 = new X.Ord
            r0.<init>(r1)
        L_0x00ac:
            r3.A03 = r0
            r0 = r20
            r3.A09 = r0
            r3.A06 = r8
            r0 = r24
            r3.A0f = r0
            r3.A06()
            return
        L_0x00bc:
            r0 = 0
            goto L_0x00ac
        L_0x00be:
            r2 = 0
            goto L_0x0087
        L_0x00c0:
            java.lang.IllegalStateException r0 = X.C66583MXo.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OPY.A01(android.app.Activity, androidx.fragment.app.Fragment, X.0iw, X.0wc, com.instagram.common.session.UserSession, X.G5g, X.4mZ, com.instagram.model.direct.DirectShareTarget, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
