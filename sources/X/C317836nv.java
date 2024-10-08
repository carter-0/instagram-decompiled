package X;

import android.content.Context;

/* renamed from: X.6nv  reason: invalid class name and case insensitive filesystem */
public final class C317836nv extends 0vM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ G75 A01;
    public final /* synthetic */ C317826nu A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C317836nv(Context context, G75 g75, C317826nu r3, String str, String str2, boolean z) {
        super("MultiNativeAuthVerification", 1206645857, 3, true, true);
        this.A02 = r3;
        this.A00 = context;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = z;
        this.A01 = g75;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007b, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A02, 36319746694192733L) == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0092, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A02, 36319746694323807L) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0094, code lost:
        if (r2 != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
        r5.A02("use_fx_upsell_eligibility_checker", true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r11 = this;
            X.6nu r6 = r11.A02     // Catch:{ Exception -> 0x0136 }
            android.content.Context r3 = r11.A00     // Catch:{ Exception -> 0x0136 }
            java.lang.String r7 = r11.A03     // Catch:{ Exception -> 0x0136 }
            java.lang.String r10 = r11.A04     // Catch:{ Exception -> 0x0136 }
            boolean r2 = r11.A05     // Catch:{ Exception -> 0x0136 }
            X.G75 r5 = r11.A01     // Catch:{ Exception -> 0x0136 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0136 }
            r1.<init>()     // Catch:{ Exception -> 0x0136 }
            com.google.common.collect.ImmutableList r0 = r6.A06(r3)     // Catch:{ Exception -> 0x0136 }
            r1.addAll(r0)     // Catch:{ Exception -> 0x0136 }
            com.google.common.collect.ImmutableList r0 = r6.A07(r3)     // Catch:{ Exception -> 0x0136 }
            r1.addAll(r0)     // Catch:{ Exception -> 0x0136 }
            if (r10 == 0) goto L_0x00c1
            r8 = 0
            java.lang.String r0 = "IG_FB_RIGHT_BEFORE_LOGOUT_SSO_UPSELL"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0136 }
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "IG_LOGOUT_UPSELL"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0136 }
            if (r0 == 0) goto L_0x00c1
        L_0x0032:
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r1 = "FACEBOOK"
            if (r3 == 0) goto L_0x012e
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x0136 }
            if (r0 != 0) goto L_0x012e
            X.EC0 r4 = new X.EC0     // Catch:{ Exception -> 0x0136 }
            r4.<init>(r5, r6, r7, r10)     // Catch:{ Exception -> 0x0136 }
            X.2IS r5 = new X.2IS     // Catch:{ Exception -> 0x0136 }
            r5.<init>()     // Catch:{ Exception -> 0x0136 }
            java.lang.String r0 = "target_accounts"
            r5.A05(r0, r3)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r0 = "entry_point_one"
            r5.A04(r0, r7)     // Catch:{ Exception -> 0x0136 }
            r3 = 1
            java.lang.String r0 = "entry_point_two"
            r5.A04(r0, r10)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r0 = "target_account_type"
            r5.A04(r0, r1)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r1 = "H2_2022"
            java.lang.String r0 = "holdout_type"
            r5.A04(r0, r1)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r0 = "IG_LOGOUT_UPSELL"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0136 }
            if (r0 == 0) goto L_0x007d
            com.instagram.common.session.UserSession r9 = r6.A02     // Catch:{ Exception -> 0x0136 }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ Exception -> 0x0136 }
            r0 = 36319746694192733(0x81089e000a1e5d, double:3.0320922850641947E-306)
            boolean r0 = X.182.A06(r7, r9, r0)     // Catch:{ Exception -> 0x0136 }
            if (r0 != 0) goto L_0x0094
        L_0x007d:
            java.lang.String r0 = "IG_PROFILE_PHOTO_CHANGE_CHAINING"
            boolean r0 = r10.equals(r0)     // Catch:{ Exception -> 0x0136 }
            if (r0 == 0) goto L_0x009f
            com.instagram.common.session.UserSession r9 = r6.A02     // Catch:{ Exception -> 0x0136 }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ Exception -> 0x0136 }
            r0 = 36319746694323807(0x81089e000c1e5f, double:3.0320922851470864E-306)
            boolean r0 = X.182.A06(r7, r9, r0)     // Catch:{ Exception -> 0x0136 }
            if (r0 == 0) goto L_0x009f
        L_0x0094:
            if (r2 != 0) goto L_0x009f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r0 = "use_fx_upsell_eligibility_checker"
            r5.A02(r0, r1)     // Catch:{ Exception -> 0x0136 }
        L_0x009f:
            java.lang.Class<X.B9Q> r1 = X.B9Q.class
            java.lang.String r0 = "FxIgCanUserSeeACUpsellMultiNativeAuthTwoEntrypointQuery"
            X.3Fa r2 = new X.3Fa     // Catch:{ Exception -> 0x0136 }
            r2.<init>(r5, r1, r0, r8)     // Catch:{ Exception -> 0x0136 }
            com.instagram.common.session.UserSession r0 = r6.A02     // Catch:{ Exception -> 0x0136 }
            X.3Fb r1 = X.C46479Dfi.A01(r0)     // Catch:{ Exception -> 0x0136 }
            r1.A08(r2)     // Catch:{ Exception -> 0x0136 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x0136 }
            X.1OC r2 = r1.A07(r0)     // Catch:{ Exception -> 0x0136 }
            r2.A00 = r4     // Catch:{ Exception -> 0x0136 }
            r1 = 1014674879(0x3c7ab5bf, float:0.015302121)
            r0 = 3
            X.1ES.A05(r2, r1, r0, r3, r3)     // Catch:{ Exception -> 0x0136 }
            return
        L_0x00c1:
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r1 = "FACEBOOK"
            if (r3 == 0) goto L_0x012e
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x0136 }
            if (r0 != 0) goto L_0x012e
            X.EBs r4 = new X.EBs     // Catch:{ Exception -> 0x0136 }
            r4.<init>(r5, r6, r7)     // Catch:{ Exception -> 0x0136 }
            X.2IS r5 = new X.2IS     // Catch:{ Exception -> 0x0136 }
            r5.<init>()     // Catch:{ Exception -> 0x0136 }
            java.lang.String r0 = "target_accounts"
            r5.A05(r0, r3)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r0 = "entry_point"
            r5.A04(r0, r7)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r0 = "target_account_type"
            r5.A04(r0, r1)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r1 = "H2_2022"
            java.lang.String r0 = "holdout_type"
            r5.A04(r0, r1)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r0 = "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL"
            boolean r0 = X.0qQ.A0K(r7, r0)     // Catch:{ Exception -> 0x0136 }
            if (r0 == 0) goto L_0x010f
            com.instagram.common.session.UserSession r0 = r6.A02     // Catch:{ Exception -> 0x0136 }
            java.lang.Boolean r0 = X.C63269KuE.A00(r0)     // Catch:{ Exception -> 0x0136 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0136 }
            if (r0 == 0) goto L_0x010f
            if (r2 != 0) goto L_0x010f
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r0 = "use_fx_upsell_eligibility_checker"
            r5.A02(r0, r1)     // Catch:{ Exception -> 0x0136 }
        L_0x010f:
            java.lang.Class<X.B9O> r3 = X.B9O.class
            java.lang.String r1 = "FxIgCanUserSeeACUpsellMultiNativeAuthQuery"
            r0 = 0
            X.3Fa r2 = new X.3Fa     // Catch:{ Exception -> 0x0136 }
            r2.<init>(r5, r3, r1, r0)     // Catch:{ Exception -> 0x0136 }
            com.instagram.common.session.UserSession r0 = r6.A02     // Catch:{ Exception -> 0x0136 }
            X.3Fb r1 = X.C46479Dfi.A01(r0)     // Catch:{ Exception -> 0x0136 }
            r1.A08(r2)     // Catch:{ Exception -> 0x0136 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x0136 }
            X.1OC r0 = r1.A07(r0)     // Catch:{ Exception -> 0x0136 }
            r0.A00 = r4     // Catch:{ Exception -> 0x0136 }
            X.1ES.A03(r0)     // Catch:{ Exception -> 0x0136 }
            return
        L_0x012e:
            if (r5 == 0) goto L_0x0160
            java.lang.String r0 = "Prefetch Failed: Native auth accounts is null or empty"
            r5.onFail(r0)     // Catch:{ Exception -> 0x0136 }
            return
        L_0x0136:
            r2 = move-exception
            X.G75 r1 = r11.A01
            if (r1 == 0) goto L_0x0142
            java.lang.String r0 = r2.getMessage()
            r1.onFail(r0)
        L_0x0142:
            X.6nu r0 = r11.A02
            com.instagram.common.session.UserSession r4 = r0.A02
            java.lang.String r0 = r11.A03
            X.EZu r3 = X.C317826nu.A00(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "criticalPathException"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            java.util.Map r1 = X.0se.A0M(r0)
            java.lang.String r0 = "upsell_multi_native_auth_prefetch_exception"
            X.FFL.A01(r3, r4, r0, r1)
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C317836nv.loggedRun():void");
    }
}
