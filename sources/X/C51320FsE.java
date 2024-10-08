package X;

/* renamed from: X.FsE  reason: case insensitive filesystem */
public final /* synthetic */ class C51320FsE implements Runnable {
    public final /* synthetic */ C46358DdV A00;

    public /* synthetic */ C51320FsE(C46358DdV ddV) {
        this.A00 = ddV;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x028e, code lost:
        if (r10 == false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0291, code lost:
        r6.A0V(r5, r8, (X.EWJ) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d0, code lost:
        r2.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02d3, code lost:
        X.2B0.A01.A0C(r4, r8, X.AnonymousClass7TG.A0I());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01dc, code lost:
        X.2B0.A01.A09(r4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e7, code lost:
        if (X.AnonymousClass3FV.A09(r4) != false) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e9, code lost:
        r9 = X.C71172bH.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ef, code lost:
        if ((r9 instanceof android.content.Context) == false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f5, code lost:
        if (r5.isFinishing() != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f7, code lost:
        r9 = (android.content.Context) r9;
        X.AnonymousClass7TF.A1B(r9, 1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0201, code lost:
        if (r5.isFinishing() != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0203, code lost:
        r0 = (X.C280074zx.A00() / 1000) + new X.AnonymousClass3FW(r4).A00();
        r10 = X.2Au.A01(r4);
        r5 = X.DbS.A0X(r5);
        X.DbU.A16(r9, r5, com.instagram.android.R.drawable.ig_illustrations_qp_moon_refresh);
        r2 = 2131971191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0225, code lost:
        if (r10 == false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0227, code lost:
        r2 = 2131973942;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022a, code lost:
        X.DbT.A19(r9, r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022d, code lost:
        if (r10 == false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x023b, code lost:
        if (X.2B0.A01.A07(r4).getBoolean("HAS_SEEN_SLEEP_MODE_INTERSTITIAL_DIALOG", false) != false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x023d, code lost:
        r3 = X.002.A0R(r9.getString(2131973939), "\n\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024a, code lost:
        r2 = 2131973938;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024d, code lost:
        r5.A0q(X.002.A0R(r3, X.DbV.A0u(r9, X.FGR.A01(r9, r0), r9.getString(com.instagram.android.R.string.f0nameremoved), r2)));
        r0 = 2131971190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0266, code lost:
        if (r10 == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0268, code lost:
        r0 = 2131973941;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x026b, code lost:
        r5.A0a(X.C50021FJg.A00(r4, 54), X.AnonymousClass7TE.A16(r9, r0));
        X.DbT.A1V(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x027b, code lost:
        if (r10 == false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027d, code lost:
        r2 = X.DbV.A0c(r4, X.2B0.A01);
        r2.E5T("HAS_SEEN_SLEEP_MODE_INTERSTITIAL_DIALOG", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0289, code lost:
        r3 = "";
        r2 = 2131971189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            X.DdV r10 = r14.A00
            X.2Aq r6 = r10.A01
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x002a
            boolean r0 = X.14i.A04
            if (r0 == 0) goto L_0x002a
            X.2Ay r1 = r10.A00
            X.2Ay r0 = X.2Ay.A0B
            if (r1 != r0) goto L_0x0029
            com.instagram.common.session.UserSession r4 = r6.A05
            long r0 = r6.A0P()
            r3 = 0
            X.0qQ.A0B(r4, r3)
            java.lang.Integer r2 = X.AnonymousClass05K.A0E
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 0
            X.2Ci.A07(r4, r2, r1)
            X.2Aq.A0D(r0, r6, r3)
        L_0x0029:
            return
        L_0x002a:
            r7 = 0
            r6.A08 = r7
            r5 = 0
            X.2MD r0 = X.2MD.A01()     // Catch:{ ClassCastException | IndexOutOfBoundsException -> 0x0036 }
            androidx.fragment.app.FragmentActivity r5 = r0.A06()     // Catch:{ ClassCastException | IndexOutOfBoundsException -> 0x0036 }
        L_0x0036:
            if (r5 != 0) goto L_0x0042
            X.2ZQ r5 = X.C71172bH.A00()
            boolean r0 = r5 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x00a6
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
        L_0x0042:
            com.instagram.common.session.UserSession r4 = r6.A05
            if (r4 == 0) goto L_0x0050
            X.2Ay r1 = r10.A00
            int r0 = r1.ordinal()
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0081;
                case 1: goto L_0x006c;
                case 2: goto L_0x008b;
                case 3: goto L_0x0075;
                case 4: goto L_0x0075;
                case 5: goto L_0x0081;
                case 6: goto L_0x0075;
                case 7: goto L_0x0081;
                case 8: goto L_0x006c;
                default: goto L_0x0050;
            }
        L_0x0050:
            X.2Ay r8 = r10.A00
            int r0 = r8.ordinal()
            java.lang.String r13 = "time_up_animation"
            r9 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L_0x01d7;
                case 1: goto L_0x015d;
                case 2: goto L_0x0295;
                case 3: goto L_0x0162;
                case 4: goto L_0x00d1;
                case 5: goto L_0x01e3;
                case 6: goto L_0x01e9;
                case 7: goto L_0x0291;
                case 8: goto L_0x015d;
                default: goto L_0x005e;
            }
        L_0x005e:
            java.lang.String r1 = "Unrecognized reminder type "
            java.lang.String r0 = r8.A00
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "TimeSpentReminderRunnable_launchReminderExperience"
            X.0wb.A03(r0, r1)
            return
        L_0x006c:
            java.lang.String r3 = r1.A00
            long r0 = r6.A0P()
            java.lang.Integer r2 = X.AnonymousClass05K.A02
            goto L_0x007d
        L_0x0075:
            java.lang.String r3 = r1.A00
            long r0 = r6.A0P()
            java.lang.Integer r2 = X.AnonymousClass05K.A04
        L_0x007d:
            X.DbT.A1T(r4, r2, r3, r0)
            goto L_0x0050
        L_0x0081:
            java.lang.String r2 = r1.A00
            long r0 = r6.A0P()
            X.2Ci.A04(r4, r3, r2, r0)
            goto L_0x0050
        L_0x008b:
            X.0Tu r2 = X.0Tu.A06
            r0 = 2342168300710146892(0x20810da90002334c, double:4.070072620364427E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0050
            long r2 = r6.A0P()
            java.lang.Integer r1 = X.AnonymousClass05K.A0L
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            X.2Ci.A07(r4, r1, r0)
            goto L_0x0050
        L_0x00a6:
            X.2Ay r4 = r10.A00
            int r1 = r4.ordinal()
            r0 = 2
            r5 = 0
            if (r1 == r0) goto L_0x02e0
            r0 = 5
            if (r1 != r0) goto L_0x0029
            com.instagram.common.session.UserSession r3 = r6.A05
            X.0Tu r2 = X.DbS.A0J(r3, r7)
            r0 = 36328396757679428(0x81107c00003d44, double:3.0375626200441905E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r2 = r4.A00
            long r0 = r6.A0P()
            X.2Ci.A04(r3, r5, r2, r0)
            X.2Aq.A0C(r4, r5, r6)
            return
        L_0x00d1:
            boolean r0 = X.AnonymousClass3FV.A0A(r4)
            if (r0 != 0) goto L_0x015d
            r0 = 58
            X.FJg r3 = X.C50021FJg.A00(r10, r0)
            X.AnonymousClass7TF.A1B(r5, r7, r4)
            X.G8w r1 = X.C49953FGi.A03(r4)
            if (r1 != 0) goto L_0x0151
            r10 = 0
        L_0x00e7:
            boolean r0 = X.0oI.A09(r5)
            if (r0 != 0) goto L_0x00fd
            boolean r0 = X.0oI.A0C(r5)
            if (r0 == 0) goto L_0x0149
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r4)
            boolean r0 = r0.A1r()
            if (r0 == 0) goto L_0x0149
        L_0x00fd:
            r1 = 2131975382(0x7f135cd6, float:1.9587855E38)
            r0 = 2131951625(0x7f130009, float:1.953967E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r11 = X.DbW.A0h(r5, r0, r1)
        L_0x010b:
            X.0qQ.A0A(r11)
            X.8ab r2 = X.DbS.A0X(r5)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131237554(0x7f081ab2, float:1.8091362E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2dd.A00(r1, r0)
            r2.A0i(r0)
            r2.A05 = r11
            r1 = 2131972663(0x7f135237, float:1.958234E38)
            java.lang.String r0 = X.C49927FFd.A00(r5, r10)
            X.DbY.A0w(r5, r2, r0, r1)
            r2.A0E(r3)
            r2.A0s(r7)
            android.app.Dialog r1 = r2.A02()
            android.app.Dialog r0 = r6.A03
            if (r0 == 0) goto L_0x013f
            r0.dismiss()
            r6.A03 = r9
        L_0x013f:
            r6.A03 = r1
            X.AnonymousClass0fN.A00(r1)
            X.C293755lI.A00(r13)
            goto L_0x02d3
        L_0x0149:
            r0 = 2131972664(0x7f135238, float:1.9582342E38)
            java.lang.String r11 = r5.getString(r0)
            goto L_0x010b
        L_0x0151:
            java.lang.Integer r0 = r1.B1c()
            java.lang.Integer r10 = X.C49953FGi.A04(r1, r4)
            if (r10 != 0) goto L_0x00e7
            r10 = r0
            goto L_0x00e7
        L_0x015d:
            X.2Aq.A09(r5, r8, r6)
            goto L_0x02d3
        L_0x0162:
            boolean r0 = X.AnonymousClass3FV.A0A(r4)
            if (r0 == 0) goto L_0x016c
            X.2Aq.A09(r5, r8, r6)
            goto L_0x01dc
        L_0x016c:
            r0 = 57
            X.FJg r11 = X.C50021FJg.A00(r10, r0)
            X.AnonymousClass7TF.A1B(r5, r7, r4)
            boolean r0 = X.0oI.A09(r5)
            if (r0 != 0) goto L_0x018b
            boolean r0 = X.0oI.A0C(r5)
            if (r0 == 0) goto L_0x01cf
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r4)
            boolean r0 = r0.A1r()
            if (r0 == 0) goto L_0x01cf
        L_0x018b:
            r1 = 2131975382(0x7f135cd6, float:1.9587855E38)
            r0 = 2131951625(0x7f130009, float:1.953967E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r12 = X.DbW.A0h(r5, r0, r1)
        L_0x0199:
            X.8ab r10 = X.DbS.A0X(r5)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131237554(0x7f081ab2, float:1.8091362E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2dd.A00(r1, r0)
            r10.A0i(r0)
            r10.A05 = r12
            r0 = 2131963238(0x7f132d66, float:1.9563224E38)
            X.DbU.A17(r5, r10, r0)
            r10.A0E(r11)
            r10.A0s(r7)
            android.app.Dialog r1 = r10.A02()
            android.app.Dialog r0 = r6.A03
            if (r0 == 0) goto L_0x01c6
            r0.dismiss()
            r6.A03 = r9
        L_0x01c6:
            r6.A03 = r1
            X.AnonymousClass0fN.A00(r1)
            X.C293755lI.A00(r13)
            goto L_0x01dc
        L_0x01cf:
            r0 = 2131963239(0x7f132d67, float:1.9563226E38)
            java.lang.String r12 = r5.getString(r0)
            goto L_0x0199
        L_0x01d7:
            X.EWJ r0 = X.EWJ.IG_TS_ENTRY_POINT_DAILY_LIMIT_BLOCKING
            r6.A0V(r5, r8, r0)
        L_0x01dc:
            X.2B1 r0 = X.2B0.A01
            r0.A09(r4, r2)
            goto L_0x02d3
        L_0x01e3:
            boolean r0 = X.AnonymousClass3FV.A09(r4)
            if (r0 == 0) goto L_0x0291
        L_0x01e9:
            X.2ZQ r9 = X.C71172bH.A00()
            boolean r0 = r9 instanceof android.content.Context
            if (r0 == 0) goto L_0x02d3
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L_0x02d3
            android.content.Context r9 = (android.content.Context) r9
            r6 = 1
            X.AnonymousClass7TF.A1B(r9, r6, r4)
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L_0x02d3
            X.3FW r10 = new X.3FW
            r10.<init>(r4)
            long r0 = X.C280074zx.A00()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r2 = r10.A00()
            long r0 = r0 + r2
            boolean r10 = X.2Au.A01(r4)
            X.8ab r5 = X.DbS.A0X(r5)
            r2 = 2131237686(0x7f081b36, float:1.809163E38)
            X.DbU.A16(r9, r5, r2)
            r2 = 2131971191(0x7f134c77, float:1.9579354E38)
            if (r10 == 0) goto L_0x022a
            r2 = 2131973942(0x7f135736, float:1.9584934E38)
        L_0x022a:
            X.DbT.A19(r9, r5, r2)
            if (r10 == 0) goto L_0x0289
            X.2B1 r2 = X.2B0.A01
            X.0xa r3 = r2.A07(r4)
            java.lang.String r2 = "HAS_SEEN_SLEEP_MODE_INTERSTITIAL_DIALOG"
            boolean r2 = r3.getBoolean(r2, r7)
            if (r2 != 0) goto L_0x0289
            r2 = 2131973939(0x7f135733, float:1.9584928E38)
            java.lang.String r3 = r9.getString(r2)
            java.lang.String r2 = "\n\n"
            java.lang.String r3 = X.002.A0R(r3, r2)
        L_0x024a:
            r2 = 2131973938(0x7f135732, float:1.9584926E38)
        L_0x024d:
            java.lang.String r1 = X.FGR.A01(r9, r0)
            r0 = 2131951730(0x7f130072, float:1.9539883E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r0 = X.DbV.A0u(r9, r1, r0, r2)
            java.lang.String r0 = X.002.A0R(r3, r0)
            r5.A0q(r0)
            r0 = 2131971190(0x7f134c76, float:1.9579352E38)
            if (r10 == 0) goto L_0x026b
            r0 = 2131973941(0x7f135735, float:1.9584932E38)
        L_0x026b:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r9, r0)
            r0 = 54
            X.FJg r0 = X.C50021FJg.A00(r4, r0)
            r5.A0a(r0, r1)
            X.DbT.A1V(r5)
            if (r10 == 0) goto L_0x02d3
            X.2B1 r0 = X.2B0.A01
            X.0xY r2 = X.DbV.A0c(r4, r0)
            java.lang.String r0 = "HAS_SEEN_SLEEP_MODE_INTERSTITIAL_DIALOG"
            r2.E5T(r0, r6)
            goto L_0x02d0
        L_0x0289:
            java.lang.String r3 = ""
            r2 = 2131971189(0x7f134c75, float:1.957935E38)
            if (r10 == 0) goto L_0x024d
            goto L_0x024a
        L_0x0291:
            r6.A0V(r5, r8, r9)
            goto L_0x02d3
        L_0x0295:
            X.0Tu r9 = X.0Tu.A06
            r0 = 2342168300710146892(0x20810da90002334c, double:4.070072620364427E-152)
            boolean r0 = X.182.A06(r9, r4, r0)
            if (r0 != 0) goto L_0x02d3
            r6.A02 = r2
            X.0qQ.A0B(r4, r7)
            X.2B1 r9 = X.2B0.A01
            X.0xa r0 = r9.A07(r4)
            java.lang.String r7 = "LAST_TAKE_A_BREAK_REMINDER_SEEN"
            long r10 = r0.getLong(r7, r2)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x02dd
            X.EWJ r3 = X.EWJ.IG_TS_ENTRY_POINT_TAKE_A_BREAK_FIRST_TIME_BLOCKING
        L_0x02b9:
            java.lang.String r2 = r8.A00
            long r0 = r6.A0P()
            X.2Ci.A04(r4, r3, r2, r0)
            r6.A0V(r5, r8, r3)
            long r0 = java.lang.System.currentTimeMillis()
            X.0xY r2 = X.DbV.A0c(r4, r9)
            r2.E5c(r7, r0)
        L_0x02d0:
            r2.apply()
        L_0x02d3:
            long r1 = X.AnonymousClass7TG.A0I()
            X.2B1 r0 = X.2B0.A01
            r0.A0C(r4, r8, r1)
            return
        L_0x02dd:
            X.EWJ r3 = X.EWJ.IG_TS_ENTRY_POINT_TAKE_A_BREAK_BLOCKING
            goto L_0x02b9
        L_0x02e0:
            com.instagram.common.session.UserSession r4 = r6.A05
            long r2 = r6.A0P()
            X.0qQ.A0B(r4, r7)
            java.lang.Integer r1 = X.AnonymousClass05K.A0F
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            X.2Ci.A07(r4, r1, r0)
            X.2Aq.A0D(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51320FsE.run():void");
    }
}
