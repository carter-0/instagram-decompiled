package X;

import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.fx.access.sso.FxSsoViewModel;

/* renamed from: X.EDd  reason: case insensitive filesystem */
public final class C47694EDd extends 1P0 {
    public final /* synthetic */ C257443xP A00;
    public final /* synthetic */ AnonymousClass0aP A01;
    public final /* synthetic */ EEM A02;
    public final /* synthetic */ AnonymousClass6ST A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public C47694EDd(C257443xP r1, AnonymousClass0aP r2, EEM eem, AnonymousClass6ST r4, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A02 = eem;
        this.A09 = z;
        this.A08 = z2;
        this.A04 = str;
        this.A05 = str2;
        this.A07 = z3;
        this.A01 = r2;
        this.A06 = str3;
        this.A00 = r1;
        this.A03 = r4;
    }

    private void A00() {
        EEM eem = this.A02;
        CallerContext callerContext = EEM.A0B;
        FxSsoViewModel fxSsoViewModel = eem.A00;
        if (fxSsoViewModel != null) {
            DbT.A0H(fxSsoViewModel.A04).A0B(true);
        }
    }

    private void A01(String str, boolean z) {
        EEM eem = this.A02;
        CallerContext callerContext = EEM.A0B;
        AnonymousClass0aP r3 = eem.A08;
        C46634DiE diE = eem.A09;
        C49209ErE.A00(r3, AnonymousClass7TE.A0v(), diE.A01, this.A05, str, z, this.A08);
        C49886FBm A062 = 1Q0.A1v.A02(r3).A06(EXD.A04, diE);
        if (str != null) {
            A062.A04("error", str);
        }
        A062.A02();
        if (str != null && !str.equals("fb_email_taken")) {
            A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0138, code lost:
        if ((!r0) != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r3.A09 != false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0295  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r24) {
        /*
            r23 = this;
            r4 = r24
            r0 = -1790732151(0xffffffff95439889, float:-3.9500265E-26)
            int r16 = X.AnonymousClass0fD.A03(r0)
            X.EM5 r4 = (X.EM5) r4
            r0 = 948633966(0x388b016e, float:6.628303E-5)
            int r2 = X.AnonymousClass0fD.A03(r0)
            com.instagram.user.model.User r1 = r4.A05
            r3 = r23
            if (r1 == 0) goto L_0x0142
            int r6 = r4.A00
            r0 = 4
            r5 = 1
            if (r6 == r0) goto L_0x0023
            r5 = 0
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0074
        L_0x0023:
            java.lang.String r7 = r4.A0C
            if (r7 == 0) goto L_0x0074
            X.EEM r6 = r3.A02
            if (r5 == 0) goto L_0x0070
            com.facebook.common.callercontext.CallerContext r0 = X.EEM.A0B
            X.1Q0 r3 = X.1Q0.A0K
            X.0aP r0 = r6.A08
            X.FGI r3 = r3.A02(r0)
            X.DiE r0 = r6.A09
            X.FGI.A03(r3, r0)
            android.app.Activity r0 = r6.A04
            X.8ab r5 = X.DbS.A0X(r0)
            r0 = 2131972265(0x7f1350a9, float:1.9581533E38)
            r5.A08(r0)
            r4 = 2131972262(0x7f1350a6, float:1.9581527E38)
            r3 = 5
            X.FJd r0 = new X.FJd
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r1, (java.lang.String) r7, (int) r3)
            X.Dba.A0t(r0, r5, r4)
        L_0x0052:
            X.1Q0 r1 = X.1Q0.A1x
            X.0aP r0 = r6.A08
            X.FGI r1 = r1.A02(r0)
            X.DiE r3 = r6.A09
        L_0x005c:
            X.EXD r0 = X.EXD.A04
            X.FGI.A02(r1, r0, r3)
        L_0x0061:
            r0 = 137183036(0x82d3f3c, float:5.2134625E-34)
        L_0x0064:
            X.AnonymousClass0fD.A0A(r0, r2)
            r1 = -1417390864(0xffffffffab8454f0, float:-9.402739E-13)
            r0 = r16
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0070:
            X.EEM.A04(r6, r1, r7)
            goto L_0x0052
        L_0x0074:
            X.EEM r8 = r3.A02
            com.facebook.common.callercontext.CallerContext r0 = X.EEM.A0B
            X.0aP r7 = r8.A08
            X.4DH r10 = r8.A06
            android.content.Context r17 = r10.getContext()
            r6 = 0
            java.lang.String r0 = r4.A0A
            X.0iw r9 = r8.A07
            r18 = r9
            r19 = r7
            r20 = r1
            r21 = r0
            r22 = r6
            com.instagram.common.session.UserSession r5 = X.C46413Dea.A02(r17, r18, r19, r20, r21, r22)
            java.lang.String r11 = r1.getUsername()
            com.instagram.common.typedurl.ImageUrl r0 = r1.Bh3()
            X.FGv.A03(r0, r11)
            X.FEx r14 = new X.FEx
            r14.<init>()
            android.os.Bundle r12 = r14.A00
            X.EUp r0 = X.C48071EUp.A0B
            java.lang.String r11 = X.DbX.A0s(r0)
            java.lang.String r0 = "FACEBOOK"
            java.lang.String r0 = X.AnonymousClass7TF.A0j(r0)
            r12.putString(r11, r0)
            X.DiE r12 = r8.A09
            java.lang.String r13 = r12.A01
            java.lang.String r1 = r1.getId()
            boolean r0 = r3.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.0qQ.A0B(r7, r6)
            r11 = 0
            X.C49210ErF.A00(r7, r14, r0, r13, r1)
            X.1Q0 r0 = X.1Q0.A1x
            X.FGI r0 = r0.A02(r7)
            X.EXD r7 = X.EXD.A04
            X.FGI.A02(r0, r7, r12)
            android.os.Bundle r12 = r10.mArguments
            if (r12 == 0) goto L_0x00e8
            java.lang.String r1 = "original_url"
            java.lang.String r0 = r12.getString(r1)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = r12.getString(r1)
            android.net.Uri r11 = X.0cp.A03(r0)
        L_0x00e8:
            if (r11 == 0) goto L_0x00f6
            android.net.Uri$Builder r11 = r11.buildUpon()
            java.lang.String r1 = "fresh_sign_in"
            java.lang.String r0 = "1"
            android.net.Uri r11 = X.DbV.A08(r11, r1, r0)
        L_0x00f6:
            X.Eu9 r0 = r4.A02
            if (r0 == 0) goto L_0x013b
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x013b
            X.0xa r4 = X.AnonymousClass7TE.A0q(r5)
            java.lang.String r1 = "account_nux_ran"
            boolean r0 = r4.getBoolean(r1, r6)
            if (r0 != 0) goto L_0x0136
            X.0xY r0 = r4.AR4()
            X.DbW.A1L(r0, r1)
        L_0x0111:
            android.content.Context r1 = r10.getContext()
            boolean r0 = X.AnonymousClass1G3.A03()
            X.1OC r0 = X.C49026Eo2.A00(r1, r5, r0)
            X.1ES.A03(r0)
            X.1WU r9 = X.AnonymousClass35B.A00()
            android.app.Activity r1 = r8.A04
            X.Ffr r0 = new X.Ffr
            r0.<init>(r5, r3)
            r12 = r0
            r13 = r7
            r14 = r6
            r15 = r6
            r10 = r1
            r11 = r5
            r9.A04(r10, r11, r12, r13, r14, r15)
            goto L_0x0061
        L_0x0136:
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x013b
            goto L_0x0111
        L_0x013b:
            android.app.Activity r0 = r8.A04
            X.C46413Dea.A04(r0, r11, r9, r5)
            goto L_0x0061
        L_0x0142:
            boolean r0 = r4.A0G
            r9 = 1
            if (r0 == 0) goto L_0x031a
            X.EEM r7 = r3.A02
            com.facebook.common.callercontext.CallerContext r0 = X.EEM.A0B
            X.4DH r5 = r7.A06
            android.app.Activity r1 = r5.getRootActivity()
            X.F1U r0 = X.C49290EsZ.A00
            boolean r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x015e
            r0 = -1742482053(0xffffffff9823d57b, float:-2.1175036E-24)
            goto L_0x0064
        L_0x015e:
            android.content.Context r1 = r5.getContext()
            r0 = 2130970750(0x7f04087e, float:1.7550219E38)
            boolean r0 = X.2Yu.A0L(r1, r0, r9)
            if (r0 == 0) goto L_0x0302
            com.instagram.nux.cal.model.SignupContent r8 = r4.A03
            X.F2H r13 = r4.A04
            if (r13 == 0) goto L_0x01c3
            java.util.List r5 = r13.A00()
            java.util.List r6 = r13.A01
            X.1Q0 r1 = X.1Q0.A25
            X.0aP r0 = r7.A08
            X.FGI r10 = r1.A02(r0)
            X.DiE r1 = r7.A09
            r0 = 0
            X.FBm r10 = r10.A06(r0, r1)
            java.lang.String r0 = ", "
            X.3El r12 = new X.3El
            r12.<init>(r0)
            java.util.List r0 = r13.A00
            if (r0 != 0) goto L_0x01b7
            java.util.List r0 = r13.A01
            int r0 = r0.size()
            java.util.ArrayList r0 = X.DbS.A0v(r0)
            r13.A00 = r0
            java.util.List r0 = r13.A01
            java.util.Iterator r11 = r0.iterator()
        L_0x01a3:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r0 = r11.next()
            X.Ewr r0 = (X.C49512Ewr) r0
            java.util.List r1 = r13.A00
            java.lang.String r0 = r0.A00
            r1.add(r0)
            goto L_0x01a3
        L_0x01b7:
            java.util.List r0 = r13.A00
            java.lang.String r1 = r12.A02(r0)
            java.lang.String r0 = "prototypes"
            r10.A04(r0, r1)
            goto L_0x01da
        L_0x01c3:
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.ArrayList r5 = r4.A0E
            if (r5 == 0) goto L_0x0266
            X.1Q0 r1 = X.1Q0.A0z
            X.0aP r0 = r7.A08
            X.FGI r10 = r1.A02(r0)
            X.DiE r1 = r7.A09
            r0 = 0
            X.FBm r10 = r10.A06(r0, r1)
        L_0x01da:
            r10.A02()
        L_0x01dd:
            if (r8 == 0) goto L_0x0295
            X.0Tu r9 = X.0Tu.A05
            r0 = 2324139969326612992(0x204100fd00000200, double:2.536411703163088E-153)
            boolean r0 = X.1AW.A06(r9, r0)
            java.lang.String r12 = r3.A04
            if (r0 == 0) goto L_0x01f3
            java.lang.String r0 = r4.A07
            if (r0 == 0) goto L_0x01f3
            r12 = r0
        L_0x01f3:
            android.app.Activity r11 = r7.A04
            X.0aP r1 = r3.A01
            r10 = 3233(0xca1, float:4.53E-42)
            r0 = 0
            X.AnonymousClass7TF.A1D(r11, r0, r1)
            java.lang.Class<com.instagram.nux.cal.activity.CalActivity> r0 = com.instagram.nux.cal.activity.CalActivity.class
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r11, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C49778F6l.A01(r9, r8, r0, r12, r10)
            X.EVV r1 = X.EVV.IG_FB_SIGN_UP
            java.lang.String r0 = "argument_entry_point"
            r9.putExtra(r0, r1)
            java.lang.String r1 = "IgSessionManager.LOGGED_OUT_TOKEN"
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r9.putExtra(r0, r1)
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r3.A05
            java.lang.String r0 = "extra_cal_fb_user_id"
            r8.putString(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r5)
            java.lang.String r0 = "extra_cal_usernames"
            r8.putStringArrayList(r0, r1)
            int r0 = r6.size()
            java.lang.String[] r12 = new java.lang.String[r0]
            r13 = 0
        L_0x0232:
            int r0 = r6.size()
            if (r13 >= r0) goto L_0x026c
            java.lang.Object r15 = r6.get(r13)
            X.Ewr r15 = (X.C49512Ewr) r15
            java.io.StringWriter r14 = new java.io.StringWriter     // Catch:{ IOException -> 0x0260 }
            r14.<init>()     // Catch:{ IOException -> 0x0260 }
            X.17W r5 = X.AnonymousClass7TF.A0K(r14)     // Catch:{ IOException -> 0x0260 }
            java.lang.String r1 = r15.A01     // Catch:{ IOException -> 0x0260 }
            if (r1 == 0) goto L_0x0252
            java.lang.String r0 = X.Dd6.A00()     // Catch:{ IOException -> 0x0260 }
            r5.A0R(r0, r1)     // Catch:{ IOException -> 0x0260 }
        L_0x0252:
            java.lang.String r1 = r15.A00     // Catch:{ IOException -> 0x0260 }
            if (r1 == 0) goto L_0x025b
            java.lang.String r0 = "prototype"
            r5.A0R(r0, r1)     // Catch:{ IOException -> 0x0260 }
        L_0x025b:
            java.lang.String r0 = X.AnonymousClass7TG.A0k(r5, r14)     // Catch:{ IOException -> 0x0260 }
            goto L_0x0261
        L_0x0260:
            r0 = 0
        L_0x0261:
            r12[r13] = r0
            int r13 = r13 + 1
            goto L_0x0232
        L_0x0266:
            java.util.List r5 = java.util.Collections.emptyList()
            goto L_0x01dd
        L_0x026c:
            java.lang.String r0 = "extra_cal_usernames_with_metadata"
            r8.putStringArray(r0, r12)
            java.lang.String r1 = r4.A0B
            java.lang.String r0 = "extra_cal_tos_version"
            r8.putString(r0, r1)
            boolean r1 = r3.A07
            java.lang.String r0 = "extra_cal_force_signup_with_fb_after_cp_claiming"
            r8.putBoolean(r0, r1)
            X.DiE r3 = r7.A09
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "extra_cal_registration_source"
            r8.putString(r0, r1)
            X.Dbc.A0H(r11, r9, r8, r10)
            X.1Q0 r1 = X.1Q0.A1u
            X.0aP r0 = r7.A08
            X.FGI r1 = r1.A02(r0)
            goto L_0x005c
        L_0x0295:
            r3.A00()
            java.lang.String r10 = "missing_content"
            X.1Q0 r0 = X.1Q0.A1s
            X.0aP r11 = r7.A08
            X.FGI r1 = r0.A02(r11)
            X.DiE r8 = r7.A09
            X.EXD r0 = X.EXD.A04
            X.FBm r1 = r1.A06(r0, r8)
            java.lang.String r0 = "error"
            r1.A04(r0, r10)
            r1.A02()
            X.1Q0 r0 = X.1Q0.A0h
            X.FGI r1 = r0.A02(r11)
            r0 = 0
            X.FBm r8 = r1.A06(r0, r8)
            java.lang.String r1 = r3.A05
            java.lang.String r0 = "fbid"
            r8.A04(r0, r1)
            java.lang.String r0 = "reason"
            r8.A04(r0, r10)
            java.lang.String r0 = "cal_enabled"
            r8.A05(r0, r9)
            boolean r1 = X.AnonymousClass1G3.A03()
            java.lang.String r0 = "fb4a_installed"
            r8.A05(r0, r1)
            boolean r1 = r3.A08
            java.lang.String r0 = "found_unlinked_account"
            r8.A05(r0, r1)
            r8.A02()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r3 = r3.A04
            X.DbS.A1A(r1, r3)
            X.08y r0 = X.09i.A0A
            r0.A07(r1)
            java.lang.String r1 = r4.A0B
            java.lang.String r0 = r4.A07
            if (r0 == 0) goto L_0x02f6
            r3 = r0
        L_0x02f6:
            r10 = 0
            r8 = r5
            r9 = r6
            r11 = r10
            r5 = r7
            r6 = r1
            r7 = r3
            X.EEM.A06(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0061
        L_0x0302:
            r3.A00()
            X.8ab r1 = X.DbS.A0Y(r1)
            r0 = 2131953895(0x7f1308e7, float:1.9544274E38)
            r1.A09(r0)
            r0 = 2131953894(0x7f1308e6, float:1.9544272E38)
            r1.A08(r0)
            X.Dba.A1L(r1)
            goto L_0x0061
        L_0x031a:
            java.lang.String r0 = r4.mErrorType
            if (r0 != 0) goto L_0x0324
            r0 = 4521(0x11a9, float:6.335E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x0324:
            r3.A01(r0, r9)
            X.EEM r3 = r3.A02
            com.facebook.common.callercontext.CallerContext r0 = X.EEM.A0B
            X.4DH r0 = r3.A06
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x0349
            X.8ab r1 = X.DbS.A0X(r0)
            r0 = 2131968258(0x7f134102, float:1.9573406E38)
            r1.A08(r0)
            r0 = 62
            X.FJf r0 = X.C50020FJf.A00(r3, r0)
            r1.A0E(r0)
            X.DbT.A1V(r1)
        L_0x0349:
            java.lang.String r1 = "bad response with code: "
            int r0 = r4.A00
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.String r0 = "FacebookSignUpRequest"
            X.0wb.A03(r0, r1)
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47694EDd.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r7) {
        String str;
        int i;
        int A032 = AnonymousClass0fD.A03(1581441747);
        CallerContext callerContext = EEM.A0B;
        boolean z = r7 instanceof C268674do;
        if (!z || !((C47361Dvv) ((C268674do) r7).A00).A02) {
            if (!z || (str = ((1XP) r7.A00()).mErrorType) == null) {
                str = "request_failed";
            }
            A01(str, z);
            Throwable A012 = r7.A01();
            if (A012 != null) {
                0wb.A07("facebook_sso_error", A012);
            }
            if (z) {
                EM5 em5 = (EM5) r7.A00();
                if (!em5.isCheckpointRequired()) {
                    this.A02.A0C(em5, this.A04, this.A05, this.A06);
                }
                String str2 = em5.A0D;
                if (str2 != null) {
                    C257443xP r1 = this.A00;
                    if (r1.A06()) {
                        ((TextView) r1.A03()).setText(str2);
                    }
                }
            } else {
                C49952FGh.A01(this.A02.A04);
            }
            i = -595463857;
        } else {
            EEM eem = this.A02;
            C47361Dvv dvv = (C47361Dvv) r7.A00();
            F19 f19 = dvv.A01;
            eem.A05.post(new C51473Fuh(dvv.A00, f19, eem));
            i = 1120741147;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(1643649854);
        this.A03.dismiss();
        AnonymousClass0fD.A0A(712614049, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(97928716);
        AnonymousClass0fN.A00(this.A03);
        AnonymousClass0fD.A0A(-672705688, A032);
    }
}
