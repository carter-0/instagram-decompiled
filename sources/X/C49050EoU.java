package X;

/* renamed from: X.EoU  reason: case insensitive filesystem */
public abstract class C49050EoU {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r3.equals(r2) != false) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r20, android.content.DialogInterface.OnDismissListener r21, com.instagram.common.session.UserSession r22, X.1Xj r23) {
        /*
            r12 = 0
            r1 = 1
            r14 = r22
            r4 = r23
            com.instagram.user.model.User r3 = r4.A2A(r14)
            com.instagram.user.model.User r2 = X.DbT.A0j(r14)
            r23 = 0
            if (r3 == 0) goto L_0x014a
            java.lang.String r18 = r3.getId()
        L_0x0016:
            java.lang.String r19 = ""
            if (r18 != 0) goto L_0x001c
            r18 = r19
        L_0x001c:
            java.lang.String r0 = r4.getId()
            if (r0 == 0) goto L_0x0024
            r19 = r0
        L_0x0024:
            java.lang.String r15 = "tap"
            X.FUI r13 = new X.FUI
            r13.<init>()
            java.lang.String r16 = "opal_badge"
            java.lang.String r17 = "unknown"
            X.C49049EoT.A00(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x003b
            boolean r0 = r3.equals(r2)
            r11 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r11 = 1
        L_0x003c:
            boolean r10 = r4.A5G()
            boolean r9 = r4.A5v()
            r7 = r20
            if (r11 != 0) goto L_0x0131
            X.1Av r5 = X.1Au.A00(r14)
            X.0s0 r0 = r5.A5S
            X.0YZ[] r8 = X.1Av.A8a
            r6 = 454(0x1c6, float:6.36E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r5, r0, r8, r6)
            if (r0 != 0) goto L_0x0131
            X.1Av r5 = X.1Au.A00(r14)
            X.0s0 r0 = r5.A5S
            X.AnonymousClass7TF.A1J(r5, r0, r8, r6, r1)
            r8 = 2131968855(0x7f134357, float:1.9574616E38)
        L_0x0064:
            if (r10 == 0) goto L_0x0113
            r6 = 2131968876(0x7f13436c, float:1.9574659E38)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            if (r3 != 0) goto L_0x012b
            r0 = r23
        L_0x006f:
            r5[r12] = r0
            java.lang.String r5 = r7.getString(r6, r5)
        L_0x0075:
            X.0qQ.A0A(r5)
            X.8ab r6 = X.DbS.A0X(r7)
            r0 = r21
            r6.A0f(r0)
            r0 = 2131237594(0x7f081ada, float:1.8091443E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r6.A0j(r0)
            r6.A09(r8)
            r6.A0q(r5)
            r6.A0s(r1)
            r1 = 2131960992(0x7f1324a0, float:1.9558668E38)
            X.FJL r0 = X.FJL.A00
            r6.A0H(r0, r1)
            if (r11 == 0) goto L_0x00e2
            r3 = 2131968842(0x7f13434a, float:1.957459E38)
            r0 = 42
            X.FJk r1 = X.C50025FJk.A00(r7, r14, r0)
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            r6.A0O(r1, r0, r3)
            r1 = 2131963118(0x7f132cee, float:1.956298E38)
            r22 = 11
            X.FJj r0 = new X.FJj
            r17 = r0
            r18 = r7
            r19 = r14
            r20 = r4
            r21 = r2
            r17.<init>((android.app.Activity) r18, (com.instagram.common.session.UserSession) r19, (X.1Xj) r20, (com.instagram.user.model.User) r21, (int) r22)
            r6.A0I(r0, r1)
            java.lang.String r22 = r2.getId()
        L_0x00c7:
            X.DbT.A1V(r6)
            X.FUJ r17 = new X.FUJ
            r17.<init>()
            java.lang.String r19 = "impression"
            java.lang.String r20 = "view_self_opal_button"
            r18 = r14
            r21 = r16
            X.C49049EoT.A00(r17, r18, r19, r20, r21, r22, r23)
            if (r11 != 0) goto L_0x00e1
            java.lang.String r20 = "view_user_opal_button"
            X.C49049EoT.A00(r17, r18, r19, r20, r21, r22, r23)
        L_0x00e1:
            return
        L_0x00e2:
            if (r3 == 0) goto L_0x00e1
            r1 = 2131963117(0x7f132ced, float:1.9562978E38)
            r22 = 12
            X.FJj r0 = new X.FJj
            r17 = r0
            r18 = r7
            r19 = r14
            r20 = r4
            r21 = r3
            r17.<init>((android.app.Activity) r18, (com.instagram.common.session.UserSession) r19, (X.1Xj) r20, (com.instagram.user.model.User) r21, (int) r22)
            r6.A0I(r0, r1)
            r5 = 2131963118(0x7f132cee, float:1.956298E38)
            r22 = 13
            X.FJj r1 = new X.FJj
            r17 = r1
            r21 = r2
            r17.<init>((android.app.Activity) r18, (com.instagram.common.session.UserSession) r19, (X.1Xj) r20, (com.instagram.user.model.User) r21, (int) r22)
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            r6.A0O(r1, r0, r5)
            java.lang.String r22 = r3.getId()
            goto L_0x00c7
        L_0x0113:
            if (r9 == 0) goto L_0x0120
            r6 = 2131968877(0x7f13436d, float:1.957466E38)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            if (r3 != 0) goto L_0x012b
            r0 = r23
            goto L_0x006f
        L_0x0120:
            r6 = 2131968875(0x7f13436b, float:1.9574657E38)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            if (r3 != 0) goto L_0x012b
            r0 = r23
            goto L_0x006f
        L_0x012b:
            java.lang.String r0 = r3.getUsername()
            goto L_0x006f
        L_0x0131:
            r8 = 2131968854(0x7f134356, float:1.9574614E38)
            if (r11 == 0) goto L_0x0064
            if (r10 == 0) goto L_0x0141
            r0 = 2131968899(0x7f134383, float:1.9574706E38)
        L_0x013b:
            java.lang.String r5 = r7.getString(r0)
            goto L_0x0075
        L_0x0141:
            r0 = 2131968898(0x7f134382, float:1.9574704E38)
            if (r9 == 0) goto L_0x013b
            r0 = 2131968900(0x7f134384, float:1.9574708E38)
            goto L_0x013b
        L_0x014a:
            r18 = r23
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49050EoU.A00(android.app.Activity, android.content.DialogInterface$OnDismissListener, com.instagram.common.session.UserSession, X.1Xj):void");
    }
}
