package X;

/* renamed from: X.FuS  reason: case insensitive filesystem */
public final /* synthetic */ class C51458FuS implements Runnable {
    public final /* synthetic */ EVP A00;
    public final /* synthetic */ FH4 A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C51458FuS(EVP evp, FH4 fh4, boolean z) {
        this.A01 = fh4;
        this.A00 = evp;
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.G9i] */
    /* JADX WARNING: type inference failed for: r0v19, types: [X.1xE, java.lang.Object, X.FVf] */
    /* JADX WARNING: type inference failed for: r8v6, types: [X.6qu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v6, types: [X.NQV, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03bf, code lost:
        if (r0 != false) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0500, code lost:
        if (X.1AW.A06(r8, 18296148364296377L) != false) goto L_0x0502;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r0 = r21
            X.FH4 r2 = r0.A01
            X.EVP r6 = r0.A00
            boolean r5 = r0.A02
            X.ExG r0 = r2.A07
            java.lang.Object r1 = r0.A01
            monitor-enter(r1)
            r3 = 0
            r0.A00 = r3     // Catch:{ all -> 0x055a }
            monitor-exit(r1)     // Catch:{ all -> 0x055a }
            com.instagram.common.session.UserSession r14 = r2.A04
            androidx.fragment.app.FragmentActivity r13 = r2.A01
            X.0iw r15 = r2.A03
            X.FfF r7 = new X.FfF
            r7.<init>()
            monitor-enter(r1)
            X.FFu r12 = r0.A00     // Catch:{ all -> 0x0557 }
            if (r12 != 0) goto L_0x0028
            X.FFu r12 = new X.FFu     // Catch:{ all -> 0x0557 }
            r12.<init>()     // Catch:{ all -> 0x0557 }
            r0.A00 = r12     // Catch:{ all -> 0x0557 }
        L_0x0028:
            monitor-exit(r1)     // Catch:{ all -> 0x0557 }
            java.lang.Object r4 = r12.A07
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r12.A04     // Catch:{ all -> 0x0554 }
            r8 = 0
            if (r0 != 0) goto L_0x0041
            r8 = 1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList     // Catch:{ all -> 0x0554 }
            r1.<init>()     // Catch:{ all -> 0x0554 }
            r12.A04 = r1     // Catch:{ all -> 0x0554 }
            X.FfG r0 = new X.FfG     // Catch:{ all -> 0x0554 }
            r0.<init>(r7)     // Catch:{ all -> 0x0554 }
            r1.add(r0)     // Catch:{ all -> 0x0554 }
        L_0x0041:
            monitor-exit(r4)     // Catch:{ all -> 0x0554 }
            if (r8 == 0) goto L_0x004f
            r11 = 1
            X.NQV r10 = new X.NQV
            r10.<init>(r11, r12, r13, r14, r15)
            X.1ES.A03(r10)
        L_0x004d:
            monitor-enter(r4)
            goto L_0x007a
        L_0x004f:
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r12.A04     // Catch:{ all -> 0x0551 }
            r0.getClass()     // Catch:{ all -> 0x0551 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0551 }
            if (r0 != 0) goto L_0x006a
            java.util.concurrent.CopyOnWriteArrayList r1 = r12.A04     // Catch:{ all -> 0x0551 }
            r1.getClass()     // Catch:{ all -> 0x0551 }
            X.FfG r0 = new X.FfG     // Catch:{ all -> 0x0551 }
            r0.<init>(r7)     // Catch:{ all -> 0x0551 }
            r1.add(r0)     // Catch:{ all -> 0x0551 }
        L_0x0068:
            monitor-exit(r4)     // Catch:{ all -> 0x0551 }
            goto L_0x004d
        L_0x006a:
            java.util.List r0 = r12.A01     // Catch:{ all -> 0x0551 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0551 }
        L_0x0070:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0551 }
            if (r0 == 0) goto L_0x0068
            r1.next()     // Catch:{ all -> 0x0551 }
            goto L_0x0070
        L_0x007a:
            java.util.concurrent.CopyOnWriteArrayList r0 = r12.A03     // Catch:{ all -> 0x054e }
            r8 = 0
            if (r0 != 0) goto L_0x0091
            r8 = 1
            r12.A00 = r3     // Catch:{ all -> 0x054e }
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList     // Catch:{ all -> 0x054e }
            r1.<init>()     // Catch:{ all -> 0x054e }
            r12.A03 = r1     // Catch:{ all -> 0x054e }
            X.FfG r0 = new X.FfG     // Catch:{ all -> 0x054e }
            r0.<init>(r7)     // Catch:{ all -> 0x054e }
            r1.add(r0)     // Catch:{ all -> 0x054e }
        L_0x0091:
            monitor-exit(r4)     // Catch:{ all -> 0x054e }
            if (r8 == 0) goto L_0x00c5
            r12.A00 = r3
            X.FV8 r0 = X.FV8.A00()
            java.lang.String r8 = "ig_android_growth_fx_access_fb_ig_autocomplete"
            java.lang.String r1 = "AutoCompleteAccountHelperV2"
            boolean r0 = r0.A04(r14, r8, r1)
            if (r0 == 0) goto L_0x00b1
            X.FV8 r0 = X.FV8.A00()
            java.lang.String r0 = r0.A02(r14, r8, r1)
            X.C49941FFu.A00(r14, r12, r0)
        L_0x00af:
            monitor-enter(r4)
            goto L_0x00f5
        L_0x00b1:
            X.1xC r8 = X.1xC.A01
            java.lang.Class<X.FVg> r1 = X.C50249FVg.class
            X.FWy r0 = new X.FWy
            r0.<init>(r14, r12)
            r8.A02(r0, r1)
            X.FV8 r0 = X.FV8.A00()
            r0.A03(r14, r3)
            goto L_0x00af
        L_0x00c5:
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r12.A03     // Catch:{ all -> 0x054b }
            r0.getClass()     // Catch:{ all -> 0x054b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x054b }
            if (r0 != 0) goto L_0x00e0
            java.util.concurrent.CopyOnWriteArrayList r1 = r12.A03     // Catch:{ all -> 0x054b }
            r1.getClass()     // Catch:{ all -> 0x054b }
            X.FfG r0 = new X.FfG     // Catch:{ all -> 0x054b }
            r0.<init>(r7)     // Catch:{ all -> 0x054b }
            r1.add(r0)     // Catch:{ all -> 0x054b }
        L_0x00de:
            monitor-exit(r4)     // Catch:{ all -> 0x054b }
            goto L_0x00af
        L_0x00e0:
            X.ENP r0 = r12.A00     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x00de
            X.1xC r8 = X.1xC.A01     // Catch:{ all -> 0x054b }
            X.F1D r0 = r0.A00     // Catch:{ all -> 0x054b }
            java.lang.String r1 = r0.A0O     // Catch:{ all -> 0x054b }
            X.FVf r0 = new X.FVf     // Catch:{ all -> 0x054b }
            r0.<init>()     // Catch:{ all -> 0x054b }
            r0.A00 = r1     // Catch:{ all -> 0x054b }
            r8.A00(r0)     // Catch:{ all -> 0x054b }
            goto L_0x00de
        L_0x00f5:
            java.util.List r9 = r12.A02     // Catch:{ all -> 0x0548 }
            r9.clear()     // Catch:{ all -> 0x0548 }
            X.6qt r0 = X.C319606qt.A01(r14)     // Catch:{ all -> 0x0548 }
            r0.A0C(r14)     // Catch:{ all -> 0x0548 }
            java.util.Iterator r8 = X.DbY.A0n(r14)     // Catch:{ all -> 0x0548 }
        L_0x0105:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0548 }
            if (r0 == 0) goto L_0x011a
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x0548 }
            X.6qx r1 = (X.C319646qx) r1     // Catch:{ all -> 0x0548 }
            X.ENN r0 = new X.ENN     // Catch:{ all -> 0x0548 }
            r0.<init>(r1)     // Catch:{ all -> 0x0548 }
            r9.add(r0)     // Catch:{ all -> 0x0548 }
            goto L_0x0105
        L_0x011a:
            monitor-exit(r4)     // Catch:{ all -> 0x0548 }
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r9)
            X.FfG r0 = new X.FfG
            r0.<init>(r7)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>(r1)
            r12.A03(r4, r0)
            boolean r0 = X.1Y3.A00(r13, r14)
            if (r0 == 0) goto L_0x0543
            if (r5 == 0) goto L_0x0175
            X.0Tu r4 = X.AnonymousClass7TF.A0H(r14)
            r0 = 36316461043552652(0x8105a10000118c, double:3.030014426369154E-306)
            boolean r0 = X.182.A06(r4, r14, r0)
            if (r0 == 0) goto L_0x0175
            X.8ab r4 = X.DbS.A0X(r13)
            r1 = 2131965552(0x7f133670, float:1.9567917E38)
            r3 = 1
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r14)
            java.lang.String r0 = X.DbY.A0b(r13, r0, r1)
            r4.A05 = r0
            r0 = 2131969727(0x7f1346bf, float:1.9576385E38)
            r4.A08(r0)
            r1 = 2131965544(0x7f133668, float:1.95679E38)
            r0 = 29
            X.C50025FJk.A01(r4, r2, r6, r0, r1)
            r4.A05()
            X.DbV.A1S(r4)
            android.app.Dialog r0 = r4.A02()
            X.AnonymousClass0fN.A00(r0)     // Catch:{ BadTokenException -> 0x053d }
            return
        L_0x0175:
            X.EVP r4 = X.EVP.ALL
            if (r6 != r4) goto L_0x0220
            X.6qt r3 = X.C319606qt.A01(r14)
            X.6qu r5 = new X.6qu
            r5.<init>()
            X.1Av r6 = X.1Au.A00(r14)
            X.FYx r0 = r2.A06
            r0.A00 = r4
            java.lang.Boolean r0 = X.C48983EnL.A00()
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01f7
            java.util.List r0 = X.DbV.A17(r14)
            java.util.Iterator r1 = r0.iterator()
        L_0x019e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0522
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            java.lang.String r0 = r0.getId()
            boolean r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x019e
            X.E1b r4 = new X.E1b
            r4.<init>()
            X.7Pr r3 = X.DbS.A0W(r14)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r3.A0a = r0
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131954422(0x7f130af6, float:1.9545343E38)
            X.DbT.A1C(r1, r3, r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131954415(0x7f130aef, float:1.9545329E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A0g = r0
            r0 = 1
            r3.A0v = r0
            r3.A1J = r0
            r1 = 34
            X.FPH r0 = new X.FPH
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r4, (java.lang.Object) r5)
            r3.A0K = r0
            X.DbU.A0y(r13, r4, r3)
        L_0x01e9:
            X.0xY r2 = X.AnonymousClass7TE.A0p(r6)
            java.lang.String r1 = "fx_cal_right_before_logout_deprio_other_upsell_seen"
            r0 = 1
            r2.E5T(r1, r0)
        L_0x01f3:
            r2.apply()
            return
        L_0x01f7:
            X.0BQ r0 = X.AnonymousClass0BO.A00(r14)
            java.util.Set r0 = r0.BNz()
            java.util.Iterator r1 = r0.iterator()
        L_0x0203:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0531
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            boolean r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x0203
            boolean r0 = r3.A0I()
            if (r0 == 0) goto L_0x0531
            r13.getApplicationContext()
            X.FH4.A04(r4, r2)
            goto L_0x01e9
        L_0x0220:
            X.EVP r5 = X.EVP.FAMILY
            if (r6 != r5) goto L_0x0343
            X.9BG r0 = X.AnonymousClass9BG.A01(r14)
            com.instagram.user.model.User r6 = r0.A03(r14)
            X.1Av r11 = X.1Au.A00(r14)
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "logout_scenario"
            java.lang.String r0 = "family_accounts"
            r4.put(r1, r0)
            X.FYx r0 = r2.A06
            r0.A00 = r5
            if (r6 == 0) goto L_0x0535
            X.6qt r1 = X.C319606qt.A01(r14)
            java.lang.String r0 = r6.getId()
            boolean r0 = r1.A0K(r0)
            if (r0 != 0) goto L_0x0535
            r0 = 32
            X.FJk r8 = X.C50025FJk.A00(r2, r6, r0)
            r0 = 28
            X.FJf r2 = X.C50020FJf.A00(r2, r0)
            X.F1B r5 = new X.F1B
            r5.<init>(r13)
            r0 = 2131971939(0x7f134f63, float:1.9580871E38)
            android.content.Context r7 = r5.A06
            java.lang.String r0 = r7.getString(r0)
            r5.A04 = r0
            android.content.res.Resources r9 = r13.getResources()
            r1 = 2131971931(0x7f134f5b, float:1.9580855E38)
            r4 = 1
            java.lang.String r0 = r6.getUsername()
            r6 = 0
            android.text.Spanned r0 = X.DbU.A07(r9, r0, r1)
            java.lang.String r0 = r0.toString()
            android.widget.TextView r9 = r5.A0E
            r9.setText(r0)
            r9.setVisibility(r6)
            r0 = 2131971926(0x7f134f56, float:1.9580845E38)
            java.lang.String r0 = r7.getString(r0)
            r5.A03 = r0
            r5.A01 = r8
            r0 = 2131968513(0x7f134201, float:1.9573923E38)
            java.lang.String r0 = r7.getString(r0)
            r5.A02 = r0
            r5.A00 = r2
            java.lang.String r8 = r5.A04
            if (r8 == 0) goto L_0x02c1
            int r0 = r8.length()
            if (r0 == 0) goto L_0x02c1
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.TextView"
            android.view.ViewStub r1 = r5.A0A
            r0 = 2131624789(0x7f0e0355, float:1.8876768E38)
            r1.setLayoutResource(r0)
            android.view.View r0 = r1.inflate()
            X.0qQ.A0C(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r8)
            r0.setVisibility(r6)
        L_0x02c1:
            android.view.ViewStub r0 = r5.A0A
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x032c
            java.lang.CharSequence r0 = r9.getText()
            if (r0 != 0) goto L_0x032c
        L_0x02cf:
            android.widget.TextView r9 = r5.A0D
            X.DbY.A12(r9, r7)
            android.widget.TextView r10 = r5.A0F
            int r0 = X.2Yu.A0D(r7)
            X.DbT.A17(r7, r10, r0)
            r9.setTypeface(r3, r6)
            r10.setTypeface(r3, r4)
            android.view.View r8 = r5.A09
            java.lang.String r2 = r5.A03
            android.content.DialogInterface$OnClickListener r1 = r5.A01
            r0 = -1
            r8.setVisibility(r6)
            r10.setText(r2)
            r7 = 22
            X.FPA.A00(r8, r1, r5, r0, r7)
            android.view.View r3 = r5.A08
            java.lang.String r2 = r5.A02
            android.content.DialogInterface$OnClickListener r1 = r5.A00
            r0 = -2
            r3.setVisibility(r6)
            r9.setText(r2)
            X.FPA.A00(r3, r1, r5, r0, r7)
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x031c
            int r0 = r8.getVisibility()
            if (r0 != 0) goto L_0x031c
            android.view.View r1 = r5.A07
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.width = r4
            r1.setVisibility(r6)
        L_0x031c:
            android.app.Dialog r0 = r5.A05
            X.AnonymousClass0fN.A00(r0)
            X.0xY r2 = X.AnonymousClass7TE.A0p(r11)
            java.lang.String r7 = "fx_cal_right_before_logout_deprio_other_upsell_seen"
        L_0x0327:
            r2.E5T(r7, r4)
            goto L_0x01f3
        L_0x032c:
            android.widget.Space r0 = r5.A0C
            r0.setVisibility(r6)
            java.lang.CharSequence r0 = r9.getText()
            if (r0 == 0) goto L_0x033d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02cf
        L_0x033d:
            android.widget.Space r0 = r5.A0B
            r0.setVisibility(r6)
            goto L_0x02cf
        L_0x0343:
            X.EVP r3 = X.EVP.LINKED_ACCOUNTS
            X.6qt r1 = X.C319606qt.A01(r14)
            if (r6 != r3) goto L_0x0360
            java.lang.String r0 = r14.A06
            boolean r0 = r1.A0K(r0)
            if (r0 != 0) goto L_0x0539
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L_0x0539
            r13.getApplicationContext()
            X.FH4.A04(r3, r2)
            return
        L_0x0360:
            java.lang.String r10 = r14.A06
            boolean r0 = r1.A0K(r10)
            if (r0 != 0) goto L_0x03c2
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L_0x03c2
            boolean r0 = r1.A0L(r10)
            if (r0 == 0) goto L_0x03c2
            boolean r0 = r1.A0M(r10)
            if (r0 != 0) goto L_0x03c2
        L_0x037a:
            r12 = 1
        L_0x037b:
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "logout_scenario"
            java.lang.String r0 = "single_account"
            r3.put(r1, r0)
            X.1Av r5 = X.1Au.A00(r14)
            com.instagram.fxcal.upsell.common.FxIgLogoutACUpsellImpl r6 = r2.A05
            boolean r0 = r6.isUpsellEligible()
            if (r12 == 0) goto L_0x03bf
            if (r0 == 0) goto L_0x03e1
            X.0xa r1 = r5.A01
            java.lang.String r0 = "fx_cal_right_before_logout_deprio_other_upsell_seen"
            boolean r0 = X.DbT.A1a(r1, r0)
            if (r0 == 0) goto L_0x03e1
            java.lang.String r5 = "upsell_clash"
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319746693930585(0x81089e00061e59, double:3.032092284898411E-306)
            boolean r0 = X.182.A06(r4, r14, r0)
            if (r0 == 0) goto L_0x03bc
            X.EZu r1 = X.C48152EZu.A0G
        L_0x03af:
            r0 = 2
            X.FFL.A02(r1, r14, r5, r3, r0)
        L_0x03b3:
            X.Fp6 r0 = new X.Fp6
            r0.<init>(r2)
            r6.showUpsell(r0, r13)
            return
        L_0x03bc:
            X.EZu r1 = X.C48152EZu.A0A
            goto L_0x03af
        L_0x03bf:
            if (r0 == 0) goto L_0x03e1
            goto L_0x03b3
        L_0x03c2:
            X.6qt r1 = X.C319606qt.A01(r14)
            boolean r0 = r1.A0K(r10)
            if (r0 != 0) goto L_0x03df
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L_0x03df
            boolean r0 = r1.A0L(r10)
            if (r0 == 0) goto L_0x037a
            boolean r0 = r1.A0M(r10)
            if (r0 == 0) goto L_0x03df
            goto L_0x037a
        L_0x03df:
            r12 = 0
            goto L_0x037b
        L_0x03e1:
            X.6qt r1 = X.C319606qt.A01(r14)
            X.6qu r8 = new X.6qu
            r8.<init>()
            boolean r0 = r1.A0K(r10)
            r4 = 1
            if (r0 == 0) goto L_0x0430
            java.lang.Boolean r0 = X.C48983EnL.A00()
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0447
            X.FH4.A0A(r2, r4)
        L_0x0400:
            boolean r0 = r6.isUpsellEligible()
            if (r0 == 0) goto L_0x0542
            if (r12 == 0) goto L_0x0542
            X.0xa r6 = r5.A01
            java.lang.String r7 = "fx_cal_right_before_logout_deprio_other_upsell_seen"
            boolean r0 = X.DbT.A1a(r6, r7)
            if (r0 != 0) goto L_0x0542
            java.lang.String r5 = "upsell_clash_dont_prioritize_fx"
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319746693930585(0x81089e00061e59, double:3.032092284898411E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x042d
            X.EZu r1 = X.C48152EZu.A0G
        L_0x0423:
            r0 = 2
            X.FFL.A02(r1, r14, r5, r3, r0)
            X.0xY r2 = r6.AR4()
            goto L_0x0327
        L_0x042d:
            X.EZu r1 = X.C48152EZu.A0A
            goto L_0x0423
        L_0x0430:
            boolean r9 = r1.A0I()
            r7 = 0
            java.lang.Boolean r0 = X.C48983EnL.A00()
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            if (r9 != 0) goto L_0x0456
            if (r0 != 0) goto L_0x0447
            X.FH4.A0A(r2, r7)
            goto L_0x0400
        L_0x0447:
            java.lang.String r9 = "logout_password_saving_not_viewed"
            java.lang.String r7 = "logout_spi"
            java.lang.String r1 = "spi"
            java.lang.String r0 = "logout_interaction"
            X.C319616qu.A01(r14, r9, r7, r1, r0)
            X.FH4.A02(r8, r2, r4)
            goto L_0x0400
        L_0x0456:
            if (r0 == 0) goto L_0x04c2
            java.lang.String r11 = "logout_password_saving_viewed"
            java.lang.String r10 = "logout_spi"
            java.lang.String r9 = "spi"
            java.lang.String r0 = "logout_interaction"
            X.C319616qu.A01(r14, r11, r10, r9, r0)
            X.27y r9 = X.27u.A00(r14)
            java.lang.String r0 = "LogoutDialogHelper"
            com.facebook.common.callercontext.CallerContext.A01(r0)
            boolean r11 = r9.A01()
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r11)
            X.8ab r9 = X.DbS.A0X(r13)
            r0 = 2131954426(0x7f130afa, float:1.954535E38)
            if (r11 == 0) goto L_0x0480
            r0 = 2131971936(0x7f134f60, float:1.9580865E38)
        L_0x0480:
            r9.A09(r0)
            r10 = 2131954423(0x7f130af7, float:1.9545345E38)
            if (r11 == 0) goto L_0x048b
            r10 = 2131971932(0x7f134f5c, float:1.9580857E38)
        L_0x048b:
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r14)
            java.lang.String r0 = r0.getUsername()
            X.DbY.A0w(r13, r9, r0, r10)
            r0 = 2131954425(0x7f130af9, float:1.9545349E38)
            r16 = 9
            X.FJj r15 = new X.FJj
            r17 = r2
            r18 = r1
            r19 = r8
            r15.<init>((int) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20)
            r9.A0I(r15, r0)
            r1 = 2131954424(0x7f130af8, float:1.9545347E38)
            r0 = 30
            X.C50025FJk.A02(r9, r2, r8, r0, r1)
            X.DbV.A1S(r9)
            android.app.Dialog r0 = r9.A02()
            X.AnonymousClass0fN.A00(r0)     // Catch:{ BadTokenException -> 0x04bd }
            goto L_0x0400
        L_0x04bd:
            X.FH4.A02(r8, r2, r7)
            goto L_0x0400
        L_0x04c2:
            boolean r0 = r1.A0L(r10)
            if (r0 != 0) goto L_0x04e5
            X.0Tu r7 = X.0Tu.A05
            r0 = 18296148364230840(0x410040000200b8, double:1.891421425967498E-307)
            boolean r0 = X.1AW.A06(r7, r0)
            if (r0 != 0) goto L_0x051d
            r0 = 18296148364296377(0x410040000300b9, double:1.8914214259934015E-307)
            boolean r0 = X.1AW.A06(r7, r0)
            if (r0 != 0) goto L_0x051d
            X.FH4.A09(r2, r4)
            goto L_0x0400
        L_0x04e5:
            boolean r9 = r1.A0M(r10)
            X.0Tu r8 = X.0Tu.A05
            r0 = 18296148364230840(0x410040000200b8, double:1.891421425967498E-307)
            boolean r0 = X.1AW.A06(r8, r0)
            if (r0 != 0) goto L_0x0502
            r0 = 18296148364296377(0x410040000300b9, double:1.8914214259934015E-307)
            boolean r1 = X.1AW.A06(r8, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0503
        L_0x0502:
            r0 = 1
        L_0x0503:
            if (r9 == 0) goto L_0x0511
            if (r0 == 0) goto L_0x050c
            X.FH4.A08(r2, r7)
            goto L_0x0400
        L_0x050c:
            X.FH4.A09(r2, r7)
            goto L_0x0400
        L_0x0511:
            if (r0 != 0) goto L_0x051d
            r13.getApplicationContext()
            X.EVP r0 = X.EVP.SINGLE
            X.FH4.A04(r0, r2)
            goto L_0x0400
        L_0x051d:
            X.FH4.A08(r2, r4)
            goto L_0x0400
        L_0x0522:
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.String r4 = "logout_password_saving_multiaccount_not_viewed"
            java.lang.String r3 = "logout_spi"
            java.lang.String r1 = "spi"
            java.lang.String r0 = "logout_interaction"
            X.C319616qu.A01(r14, r4, r3, r1, r0)
        L_0x0531:
            X.FH4.A06(r2)
            return
        L_0x0535:
            X.FH4.A07(r2)
            return
        L_0x0539:
            X.FH4.A05(r2)
            return
        L_0x053d:
            X.EVP r0 = X.EVP.SINGLE
            r2.A0D(r0, r3)
        L_0x0542:
            return
        L_0x0543:
            r0 = 1
            X.F6U.A01(r14, r13, r0)
            return
        L_0x0548:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0548 }
            throw r0
        L_0x054b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x054b }
            throw r0
        L_0x054e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x054e }
            throw r0
        L_0x0551:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0551 }
            throw r0
        L_0x0554:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0554 }
            throw r0
        L_0x0557:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0557 }
            throw r0
        L_0x055a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x055a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51458FuS.run():void");
    }
}
