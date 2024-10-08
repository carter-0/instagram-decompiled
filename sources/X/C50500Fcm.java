package X;

/* renamed from: X.Fcm  reason: case insensitive filesystem */
public final class C50500Fcm implements C66491MTu {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50500Fcm(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        r2 = (X.FBI) r15.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D1x(android.content.Context r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r15.A02
            X.L7T r0 = (X.L7T) r0
            com.instagram.common.session.UserSession r6 = r0.A01
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            X.1a1 r3 = X.C46447Df9.A02()
            java.lang.String r2 = r6.A06
            java.lang.String r1 = r0.A02
            r0 = 297(0x129, float:4.16E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = X.C46474Dfc.A01(r6, r2, r0, r1)
            android.os.Bundle r2 = r3.A01(r6, r0)
            java.lang.Object r1 = r15.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "profile"
            X.DbU.A0w(r1, r2, r6, r5, r0)
        L_0x002b:
            return
        L_0x002c:
            X.2MD r0 = X.2MD.A01()
            androidx.fragment.app.FragmentActivity r8 = r0.A06()
            if (r8 == 0) goto L_0x002b
            java.lang.Object r2 = r15.A01
            X.FBI r2 = (X.FBI) r2
            java.lang.String r0 = "id"
            java.lang.String r10 = r2.A00(r0)
            if (r10 == 0) goto L_0x002b
            java.lang.String r3 = "media_id"
            java.lang.String r0 = r2.A00(r3)
            if (r0 == 0) goto L_0x008e
            java.lang.Object r1 = r15.A02
            X.Fcz r1 = (X.C50513Fcz) r1
            java.lang.String r6 = r2.A00(r3)
            if (r6 == 0) goto L_0x00dc
            java.lang.String r0 = "x"
            java.lang.String r7 = r2.A00(r0)
            java.lang.String r0 = "target_comment_id"
            java.lang.String r5 = r2.A00(r0)
            java.lang.String r0 = "media_owner_id"
            java.lang.String r4 = r2.A00(r0)
            r0 = 700(0x2bc, float:9.81E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r2.A00(r0)
            com.instagram.common.session.UserSession r2 = r1.A00
            java.lang.String r0 = "inapp_notification"
            X.0xG r1 = X.DbS.A0O(r0)
            java.lang.String r0 = "in_app_notification"
            X.1pE r1 = X.1pE.A01(r8, r1, r2, r0)
            r1.A0A(r10)
            r1.A0Y = r7
            com.instagram.comments.model.ChannelRepliesNotifData r0 = new com.instagram.comments.model.ChannelRepliesNotifData
            r0.<init>(r6, r5, r4, r3)
            r1.A04 = r0
        L_0x008a:
            r1.A06()
            return
        L_0x008e:
            java.lang.String r1 = "notif_recipient_id"
            java.lang.String r0 = r2.A00(r1)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r15.A02
            X.Fcz r0 = (X.C50513Fcz) r0
            java.lang.String r9 = r2.A00(r1)
            if (r9 == 0) goto L_0x00e1
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.String r0 = r2.A06
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "inapp_notification"
            X.0xG r1 = X.DbS.A0O(r0)
            java.lang.String r0 = "watch_receipt_inapp_notification"
            X.1pE r1 = X.1pE.A01(r8, r1, r2, r0)
            r1.A0A(r10)
            goto L_0x008a
        L_0x00ba:
            X.0BQ r4 = X.AnonymousClass0BO.A00(r2)
            com.instagram.user.model.User r1 = r4.BNw(r9)
            if (r1 == 0) goto L_0x002b
            boolean r0 = r4.AG1(r8, r2, r1)
            if (r0 == 0) goto L_0x002b
            r11 = 0
            java.lang.String r12 = "DirectUrlHandler"
            r13 = r11
            r14 = r11
            android.content.Intent r6 = X.F5W.A01(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r9 = "watch_receipt"
            r5 = r8
            r7 = r2
            r8 = r1
            r4.E2S(r5, r6, r7, r8, r9)
            return
        L_0x00dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50500Fcm.D1x(android.content.Context):void");
    }

    public final void onDismiss() {
    }
}
