package X;

/* renamed from: X.FyB  reason: case insensitive filesystem */
public final class C51649FyB extends 0Yk implements 0sJ {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C51649FyB(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L_0x0012
            java.lang.Class<X.DlK> r3 = X.C46790DlK.class
            r1 = 4
            java.lang.String r4 = "getUiState"
            java.lang.String r5 = "getUiState(Lcom/instagram/fanclub/promovideo/FanClubPromoAndWelcomeVideoViewModel$ServerMediaState;Lcom/instagram/fanclub/promovideo/FanClubPromoAndWelcomeVideoViewModel$PendingMediaState;I)Lcom/instagram/fanclub/promovideo/FanClubPromoAndWelcomeVideoViewModel$UiState;"
        L_0x000c:
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<X.DlY> r3 = X.C46797DlY.class
            r1 = 4
            java.lang.String r4 = "combineSubscribedTabSections"
            java.lang.String r5 = "combineSubscribedTabSections(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51649FyB.<init>(java.lang.Object, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r9 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r1.A0E != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        if (r12 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        if (r7 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r6.A02 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r18 = this;
            r1 = r18
            r5 = r21
            r6 = r20
            r10 = r19
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0077
            X.GnR r10 = (X.C53394GnR) r10
            X.JwF r6 = (X.C61077JwF) r6
            int r4 = X.AnonymousClass7TE.A0M(r5)
            java.lang.Object r1 = r1.receiver
            X.DlK r1 = (X.C46790DlK) r1
            r17 = 0
            if (r4 != 0) goto L_0x0021
            boolean r0 = r6.A02
            r12 = 0
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r12 = 1
        L_0x0022:
            X.1Xj r3 = X.C46790DlK.A01(r10, r6)
            r8 = 0
            if (r3 == 0) goto L_0x0075
            com.instagram.common.typedurl.ImageUrl r7 = r3.A1Q()
        L_0x002d:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0073
            java.lang.String r9 = r6.A01
        L_0x0033:
            if (r7 != 0) goto L_0x0038
            r2 = 0
            if (r9 == 0) goto L_0x0039
        L_0x0038:
            r2 = 1
        L_0x0039:
            boolean r0 = r1.A0D
            if (r0 != 0) goto L_0x0042
            boolean r1 = r1.A0E
            r0 = 0
            if (r1 == 0) goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            if (r3 == 0) goto L_0x0049
            java.lang.String r8 = r3.getId()
        L_0x0049:
            boolean r10 = X.AnonymousClass7TF.A1P(r4)
            r13 = r2 ^ 1
            if (r2 == 0) goto L_0x0070
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
        L_0x0053:
            r14 = r12 ^ 1
            if (r7 == 0) goto L_0x005a
            r11 = 1
            if (r12 == 0) goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            if (r0 == 0) goto L_0x0061
            r16 = 1
            if (r7 != 0) goto L_0x0069
        L_0x0061:
            r16 = 0
            if (r0 == 0) goto L_0x0069
            if (r7 != 0) goto L_0x0069
            r17 = 1
        L_0x0069:
            X.Drr r5 = new X.Drr
            r15 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r5
        L_0x0070:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER
            goto L_0x0053
        L_0x0073:
            r9 = r8
            goto L_0x0033
        L_0x0075:
            r7 = r8
            goto L_0x002d
        L_0x0077:
            java.util.List r10 = (java.util.List) r10
            java.util.List r6 = (java.util.List) r6
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r3 = r1.receiver
            X.DlY r3 = (X.C46797DlY) r3
            X.01N r2 = X.0jo.A1H()
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x009b
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 2131974624(0x7f1359e0, float:1.9586317E38)
            X.GKO r1 = X.DbS.A0Q(r1, r0)
            X.EGe r0 = new X.EGe
            r0.<init>(r1)
            r2.add(r0)
        L_0x009b:
            r4 = 0
            r8 = 1
            if (r10 == 0) goto L_0x014c
            boolean r0 = X.AnonymousClass7TE.A1b(r10)
            if (r0 != r8) goto L_0x00f4
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131974603(0x7f1359cb, float:1.9586275E38)
            X.C47253Dte.A00(r2, r1, r0)
            com.instagram.common.session.UserSession r9 = r3.A01
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318668656744820(0x8107a300001974, double:3.031410529841226E-306)
            boolean r7 = X.182.A06(r7, r9, r0)
            java.util.Iterator r1 = r10.iterator()
        L_0x00be:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d3
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            r0.A0a()
            X.DtU r0 = X.C46797DlY.A00(r3, r0, r7)
            r2.add(r0)
            goto L_0x00be
        L_0x00d3:
            if (r7 == 0) goto L_0x00f4
            X.6jB r0 = r3.A04
            X.0xa r1 = r0.A01
            java.lang.String r0 = "has_seen_subscription_notification_settings_tooltip"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x00f4
            X.05G r7 = r3.A05
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131974635(0x7f1359eb, float:1.958634E38)
            X.GKO r1 = X.DbS.A0Q(r1, r0)
            X.EKS r0 = new X.EKS
            r0.<init>(r1)
            r7.Epw(r0)
        L_0x00f4:
            if (r6 == 0) goto L_0x014c
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            if (r0 != r8) goto L_0x0121
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131974601(0x7f1359c9, float:1.958627E38)
            X.C47253Dte.A00(r2, r1, r0)
            java.util.List r0 = X.C46797DlY.A01(r6)
            java.util.Iterator r1 = r0.iterator()
        L_0x010c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0121
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            r0.A0a()
            X.DtU r0 = X.C46797DlY.A00(r3, r0, r4)
            r2.add(r0)
            goto L_0x010c
        L_0x0121:
            boolean r0 = X.AnonymousClass7TE.A1b(r5)
            if (r0 == 0) goto L_0x014c
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131974600(0x7f1359c8, float:1.9586269E38)
            X.C47253Dte.A00(r2, r1, r0)
            java.util.List r0 = X.C46797DlY.A01(r5)
            java.util.Iterator r1 = r0.iterator()
        L_0x0137:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014c
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            r0.A0a()
            X.DtU r0 = X.C46797DlY.A00(r3, r0, r4)
            r2.add(r0)
            goto L_0x0137
        L_0x014c:
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0159
            X.Toc r0 = X.C14036Toc.A00(r3)
            r2.add(r0)
        L_0x0159:
            X.01N r5 = X.0jo.A1I(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51649FyB.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
