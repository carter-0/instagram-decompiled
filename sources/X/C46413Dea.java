package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.nux.ndx.util.NdxStepsManager$updateEligibleStepsStore$1;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dea  reason: case insensitive filesystem */
public abstract class C46413Dea implements CallerContextable {
    public static final String __redex_internal_original_name = "LoginUtil";

    public static C49708F2t A03(C268654dm r13) {
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        if (r13 instanceof C268664dn) {
            z = true;
        } else {
            C47361Dvv dvv = (C47361Dvv) ((C268674do) r13).A00;
            str = dvv.mErrorType;
            z8 = dvv.A02;
            z3 = dvv.isCheckpointRequired();
            z6 = dvv.hasErrorType("invalid_one_tap_nonce");
            z5 = dvv.hasErrorType("invalid_google_token_nonce");
            z2 = dvv.hasErrorType("bad_password");
            z7 = dvv.hasErrorType("invalid_user");
            z4 = dvv.hasErrorType("inactive user");
            z9 = dvv.hasErrorType("unusable_password");
        }
        return new C49708F2t(str, z, z8, z4, z7, z5, z2, z6, z3, false, z9);
    }

    public static void A04(Activity activity, Uri uri, AnonymousClass0iw r10, UserSession userSession) {
        A07(activity, uri, r10, userSession, DbS.A01(), true, false, false, false);
    }

    public static void A05(Activity activity, Uri uri, AnonymousClass0iw r9, UserSession userSession) {
        A07(activity, uri, r9, userSession, DbS.A01(), false, false, false, false);
    }

    public static void A08(Activity activity, AnonymousClass0iw r8, UserSession userSession) {
        A07(activity, (Uri) null, r8, userSession, DbS.A01(), false, false, false, false);
    }

    public static Uri A00(Activity activity) {
        Bundle A06;
        String A0m;
        if (activity == null || (A06 = DbU.A06(activity)) == null || (A0m = DbS.A0m(A06)) == null) {
            return null;
        }
        return 0cp.A03(A0m);
    }

    public static Uri A01(Fragment fragment) {
        String A0m;
        Bundle bundle = fragment.mArguments;
        if (bundle == null || (A0m = DbS.A0m(bundle)) == null) {
            return null;
        }
        return 0cp.A03(A0m);
    }

    /* JADX WARNING: type inference failed for: r2v39, types: [X.1qK, java.lang.Object] */
    public static void A07(Activity activity, Uri uri, AnonymousClass0iw r24, UserSession userSession, double d, boolean z, boolean z2, boolean z3, boolean z4) {
        Bundle bundle;
        Intent launchIntentForPackage;
        String moduleName;
        1Q9.A01("log_in").A08();
        Integer num = AnonymousClass05K.A00;
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        C49591EzA ezA = new C49591EzA(activity2, userSession2, num);
        AnonymousClass12T r4 = AnonymousClass12T.A00;
        0qQ.A0B(r4, 0);
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass19S A02 = 19E.A02(r4.AOJ(1260133026, 3));
        1Eo.A03(num, 19B.A00, new NdxStepsManager$updateEligibleStepsStore$1(ezA, (AnonymousClass4D7) null, 3, currentTimeMillis), A02);
        User A0j = DbT.A0j(userSession2);
        FCR.A01(A0j.Bh3(), A0j.getId(), A0j.getUsername());
        if (z && 1CI.A00(userSession2)) {
            AnonymousClass1Nd.A00(userSession2).A00(new Object());
        }
        if (activity2 instanceof G7B) {
            G7B g7b = (G7B) activity2;
            if (g7b.COM()) {
                String BKa = g7b.BKa();
                if (BKa == null || BKa.isEmpty()) {
                    BKa = "0";
                }
                long parseLong = Long.parseLong(userSession2.A06);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession2), "ig_account_added");
                Long valueOf = Long.valueOf(parseLong);
                A0e.A9F("pk_added", valueOf);
                A0e.A9F("updated_accounts_count", DbS.A0j(DbV.A04(userSession2)));
                A0e.A9F("from_pk", DbV.A0q(BKa));
                A0e.A9F("to_pk", valueOf);
                if (r24 == null) {
                    moduleName = null;
                } else {
                    moduleName = r24.getModuleName();
                }
                DbS.A1K(A0e, moduleName);
                A0e.Cgf();
                C46400DeN.A03(userSession2, valueOf, valueOf, "intra_app", AnonymousClass7TF.A0b(), "new_account_created", (String) null, (String) null, (String) null, (String) null, d, true, false, true);
            }
        }
        Bundle A06 = DbU.A06(activity2);
        if (A06 != null && A06.getBoolean("LAUNCH_CALLING_APPLICATION_PACKAGE")) {
            String string = A06.getString("CALLING_APPLICATION_PACKAGE_NAME");
            PackageManager packageManager = activity2.getPackageManager();
            if (!(packageManager == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(string)) == null)) {
                0kR.A0A(activity2, launchIntentForPackage);
                activity2.finish();
            }
        }
        Uri uri2 = uri;
        Intent A03 = AnonymousClass14B.A00().A03(activity2, 0);
        if (uri != null) {
            A03.setData(uri2);
        }
        A03.addFlags(268468224);
        A03.putExtra("LOGIN_EVENT", true);
        if (z2) {
            A03.putExtra("FORCE_LOGOUT_LOGIN_EVENT", true);
        }
        if (z3) {
            A03.putExtra("REACTIVATION_EVENT", true);
        }
        if (z4) {
            A03.putExtra("NDX_ACCOUNT_LOGIN_EVENT", true);
        }
        Class<C51964G9k> cls = C51964G9k.class;
        List A032 = C46604Dhk.A03(C46604Dhk.A00(activity2));
        if (A032 == null || A032.isEmpty() || !cls.isInstance(A032.get(A032.size() - 1)) || (bundle = ActivityOptions.makeCustomAnimation(activity2, R.anim.cds_fade_in, R.anim.cds_slide_out_bottom).toBundle()) == null) {
            0kR.A0B(activity2, A03);
        } else {
            0kR.A01(activity2, A03, bundle);
        }
        activity2.finish();
    }

    public static boolean A09(C268654dm r1) {
        if (!(r1 instanceof C268674do) || !((C47361Dvv) r1.A00()).A02) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v42, types: [java.lang.Object, X.9BR] */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01af, code lost:
        if (r17 == 0) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c7, code lost:
        if (r16 == false) goto L_0x01de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.common.session.UserSession A02(android.content.Context r19, X.AnonymousClass0iw r20, X.AnonymousClass0aP r21, com.instagram.user.model.User r22, java.lang.String r23, boolean r24) {
        /*
            java.lang.String r7 = X.1Q0.A01()
            android.content.Context r6 = r19.getApplicationContext()
            r4 = r24
            if (r24 == 0) goto L_0x001c
            X.02m r2 = X.02m.A0p
            r1 = 46333953(0x2c30001, float:2.8652677E-37)
            java.lang.String r0 = "afterAccountSwitch"
            r2.A0i(r1, r0)
            r1 = 4340(0x10f4, float:6.082E-42)
            r0 = 0
            r2.endAllMarkers(r1, r0)
        L_0x001c:
            X.09i r0 = X.08y.A00()
            r3 = 0
            X.0qQ.A0B(r6, r3)
            X.0Ic r0 = r0.A05
            com.instagram.common.session.UserSession r1 = r0.A00
            if (r1 == 0) goto L_0x002f
            X.0eB r0 = X.0eB.A00
            r0.A00(r1, r3)
        L_0x002f:
            X.09i r5 = X.08y.A00()
            monitor-enter(r5)
            r8 = r22
            X.0qQ.A0B(r8, r3)     // Catch:{ all -> 0x03b5 }
            com.instagram.common.session.UserSession r2 = r5.A02(r8)     // Catch:{ all -> 0x03b5 }
            if (r24 != 0) goto L_0x00d3
            r9 = r21
            X.0qQ.A0B(r9, r3)     // Catch:{ all -> 0x03b5 }
            X.1CU r0 = X.AnonymousClass1CT.A00(r9)     // Catch:{ all -> 0x03b5 }
            java.lang.String r1 = r0.A04     // Catch:{ all -> 0x03b5 }
            if (r1 == 0) goto L_0x0059
            int r0 = r1.length()     // Catch:{ all -> 0x03b5 }
            if (r0 == 0) goto L_0x0059
            X.1CU r0 = X.AnonymousClass1CT.A00(r2)     // Catch:{ all -> 0x03b5 }
            r0.A04(r1)     // Catch:{ all -> 0x03b5 }
        L_0x0059:
            X.1NJ r11 = X.AnonymousClass1NG.A00(r9)     // Catch:{ all -> 0x03b5 }
            X.1NJ r10 = X.AnonymousClass1NG.A00(r2)     // Catch:{ all -> 0x03b5 }
            java.lang.String r1 = r11.A00()     // Catch:{ all -> 0x03b5 }
            int r0 = r1.length()     // Catch:{ all -> 0x03b5 }
            if (r0 <= 0) goto L_0x006e
            r10.A06(r1)     // Catch:{ all -> 0x03b5 }
        L_0x006e:
            java.lang.String r1 = r11.A03()     // Catch:{ all -> 0x03b5 }
            int r0 = r1.length()     // Catch:{ all -> 0x03b5 }
            if (r0 <= 0) goto L_0x007b
            r10.A08(r1)     // Catch:{ all -> 0x03b5 }
        L_0x007b:
            java.lang.String r1 = r11.A04()     // Catch:{ all -> 0x03b5 }
            int r0 = r1.length()     // Catch:{ all -> 0x03b5 }
            if (r0 <= 0) goto L_0x0088
            r10.A09(r1)     // Catch:{ all -> 0x03b5 }
        L_0x0088:
            java.lang.String r1 = r11.A01()     // Catch:{ all -> 0x03b5 }
            int r0 = r1.length()     // Catch:{ all -> 0x03b5 }
            if (r0 <= 0) goto L_0x0095
            r10.A07(r1)     // Catch:{ all -> 0x03b5 }
        L_0x0095:
            java.lang.String r1 = r11.A02()     // Catch:{ all -> 0x03b5 }
            int r0 = r1.length()     // Catch:{ all -> 0x03b5 }
            if (r0 <= 0) goto L_0x00ab
            java.lang.String r0 = r10.A02()     // Catch:{ all -> 0x03b5 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x03b5 }
            if (r0 != 0) goto L_0x00ab
            r10.A00 = r1     // Catch:{ all -> 0x03b5 }
        L_0x00ab:
            r11.A05()     // Catch:{ all -> 0x03b5 }
            X.1ND r12 = X.1ND.A00(r9)     // Catch:{ all -> 0x03b5 }
            X.1ND r11 = X.1ND.A00(r2)     // Catch:{ all -> 0x03b5 }
            java.lang.String r10 = r12.A02     // Catch:{ all -> 0x03b5 }
            java.lang.String r9 = r12.A01     // Catch:{ all -> 0x03b5 }
            if (r9 != 0) goto L_0x00f6
            java.lang.String r9 = "transferWwwClaim3_empty"
        L_0x00be:
            boolean r0 = X.AnonymousClass5He.A00(r10)     // Catch:{ all -> 0x03b5 }
            if (r0 != 0) goto L_0x00f3
            java.lang.String r0 = "0"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x03b5 }
            if (r0 != 0) goto L_0x00f3
            r11.A02(r10)     // Catch:{ all -> 0x03b5 }
            java.lang.String r0 = r12.A00     // Catch:{ all -> 0x03b5 }
            r11.A00 = r0     // Catch:{ all -> 0x03b5 }
        L_0x00d3:
            X.17i r0 = X.17h.A00(r2)     // Catch:{ all -> 0x03b5 }
            r0.A01(r8, r3, r3)     // Catch:{ all -> 0x03b5 }
            X.02m r1 = X.02m.A0p     // Catch:{ all -> 0x03b5 }
            r0 = 2293785(0x230019, float:3.214277E-39)
            r11 = 2
            r1.markerEnd(r0, r11)     // Catch:{ all -> 0x03b5 }
            X.07d r0 = r5.A02     // Catch:{ all -> 0x03b5 }
            r0.A08(r8)     // Catch:{ all -> 0x03b5 }
            X.08y.A01(r3)     // Catch:{ all -> 0x03b5 }
            X.0t9 r0 = r5.A04     // Catch:{ all -> 0x03b5 }
            if (r0 == 0) goto L_0x03b0
            X.0t9.A00(r0, r3)     // Catch:{ all -> 0x03b5 }
            goto L_0x0103
        L_0x00f3:
            r11.A01 = r9     // Catch:{ all -> 0x03b5 }
            goto L_0x00d3
        L_0x00f6:
            java.lang.String r1 = "transferWwwClaim3_"
            boolean r0 = r9.startsWith(r1)     // Catch:{ all -> 0x03b5 }
            if (r0 != 0) goto L_0x00be
            java.lang.String r9 = X.002.A0R(r1, r9)     // Catch:{ all -> 0x03b5 }
            goto L_0x00be
        L_0x0103:
            monitor-exit(r5)
            X.2He r0 = X.2Hd.A00(r2)
            r0.A02()
            X.2HN r0 = X.2HM.A00(r2)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0135
            X.2I1 r0 = X.2Hz.A00(r2)
            r0.A07(r3, r3)
            X.2Hp r0 = X.2Hi.A01(r2)
            r0.onStartFlow(r3)
            r0 = 47
            X.GA1 r1 = new X.GA1
            r1.<init>(r0, r2, r4)
            java.lang.Class<X.2Io> r0 = X.2Io.class
            java.lang.Object r0 = r2.A01(r0, r1)
            X.2Io r0 = (X.2Io) r0
            r0.A00()
        L_0x0135:
            X.4v0 r0 = X.AnonymousClass4v0.A00(r2)
            X.4v3 r0 = r0.A00
            X.4v4 r0 = r0.A01
            r5 = 0
            r0.A00 = r5
            X.02m r0 = X.02m.A0p
            java.lang.String r1 = r8.getId()
            X.0aQ r0 = r0.A0G
            r0.Epp(r1)
            java.lang.Class<X.FGv> r9 = X.FGv.class
            monitor-enter(r9)
            X.EtZ r0 = X.FGv.A02     // Catch:{ all -> 0x03ad }
            X.0xa r0 = r0.A00     // Catch:{ all -> 0x03ad }
            X.0xY r1 = r0.AR4()     // Catch:{ all -> 0x03ad }
            java.lang.String r0 = "number_of_login_attempts"
            r1.E5Z(r0, r3)     // Catch:{ all -> 0x03ad }
            r1.apply()     // Catch:{ all -> 0x03ad }
            monitor-exit(r9)
            X.183 r0 = X.183.A01
            if (r0 == 0) goto L_0x016f
            X.9l6 r1 = new X.9l6
            r1.<init>(r2, r0)
            X.0nO r0 = X.0nY.A00()
            r0.ATE(r1)
        L_0x016f:
            X.0Tu r9 = X.0Tu.A05
            r0 = 36315090949508063(0x81046200080bdf, double:3.02914797337843E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x0310
            X.1Av r10 = X.1Au.A00(r2)
            r0 = 36315090949049305(0x81046200010bd9, double:3.02914797308831E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x01c9
            boolean r0 = X.AnonymousClass1B0.A05
            X.1B0 r1 = X.AnonymousClass1B1.A00(r2)
            X.1B2 r0 = X.1B2.A0K
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x01c9
            X.0xa r13 = r10.A01
            java.lang.String r12 = "mobile_config_last_sync_time_peak"
            r0 = 0
            long r17 = r13.getLong(r12, r0)
            long r13 = android.os.SystemClock.elapsedRealtime()
            int r12 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x01b1
            int r12 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            r16 = 0
            if (r12 != 0) goto L_0x01b3
        L_0x01b1:
            r16 = 1
        L_0x01b3:
            long r14 = android.os.SystemClock.elapsedRealtime()
            long r14 = r14 - r17
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 32
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.HOURS
            long r12 = r13.convert(r0, r12)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x01c9
            if (r16 == 0) goto L_0x01de
        L_0x01c9:
            X.183 r0 = X.183.A01
            r0.A03(r2)
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.0xY r12 = X.AnonymousClass7TE.A0p(r10)
            java.lang.String r10 = "mobile_config_last_sync_time_peak"
            r12.E5c(r10, r0)
            r12.apply()
        L_0x01de:
            X.0nO r1 = X.0nY.A00()
            X.RA2 r0 = new X.RA2
            r0.<init>(r6)
            r1.ATE(r0)
            X.9BF r12 = X.AnonymousClass9BE.A00(r2)
            X.9BG r0 = X.AnonymousClass9BG.A01(r2)
            X.3EO r1 = r0.A00
            java.lang.String r13 = r2.A06
            java.util.HashMap r0 = r1.A01
            java.lang.Object r0 = r0.remove(r13)
            if (r0 == 0) goto L_0x0207
            java.util.HashMap r0 = r1.A01
            java.util.Collection r0 = r0.values()
            r1.A04(r0)
        L_0x0207:
            r10 = r23
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x030c
            X.0xm r0 = X.DbS.A0e()
            r12 = 1
            X.0xY r1 = X.DbS.A0d(r0)
            r0 = 3213(0xc8d, float:4.502E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r12)
            r1.apply()
            java.lang.Long r12 = X.DbV.A0q(r13)
            X.0wc r1 = X.AnonymousClass0kN.A02(r2)
            java.lang.String r0 = "ig_one_login_nonce_received"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r14 = "waterfall_id"
            r1.AAJ(r14, r7)
            r0 = 1567(0x61f, float:2.196E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A9F(r0, r12)
            r1.Cgf()
            X.0BQ r0 = X.AnonymousClass0BO.A00(r2)
            X.0tB r0 = (X.0tB) r0
            java.util.List r13 = r0.BNy(r5)
            X.0wc r1 = X.AnonymousClass0kN.A02(r2)
            java.lang.String r0 = "ig_one_login_request_sent"
            X.0Aj r12 = X.AnonymousClass7TE.A0e(r1, r0)
            r12.AAJ(r14, r7)
            java.util.HashSet r1 = X.F42.A00(r13)
            java.lang.String r0 = "array_logged_in_account_ids"
            r12.AAF(r0, r1)
            r12.Cgf()
            X.0BQ r0 = X.AnonymousClass0BO.A00(r2)
            X.0tB r0 = (X.0tB) r0
            java.util.List r1 = r0.BNy(r5)
            java.lang.String r0 = ","
            java.lang.String r12 = android.text.TextUtils.join(r0, r1)
            X.1NY r5 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r0 = "multiple_accounts/multi_account_login/"
            r5.A0A(r0)
            java.lang.Class<X.DvX> r1 = X.DvX.class
            java.lang.Class<X.F43> r0 = X.F43.class
            r5.A0R(r1, r0)
            java.lang.String r1 = X.0qv.A00(r6)
            java.lang.String r0 = X.C66955Mfo.A01()
            X.DbZ.A0y(r6, r5, r0, r1)
            java.lang.String r0 = "mac_login_nonce"
            r5.A9m(r0, r10)
            java.lang.String r0 = "logged_in_user_ids"
            X.1OC r1 = X.DbT.A0T(r5, r0, r12)
            X.EBm r0 = new X.EBm
            r5 = r20
            r0.<init>(r5, r2, r7)
            r1.A00 = r0
            X.1ES.A03(r1)
        L_0x02a8:
            X.3EO r5 = X.AnonymousClass3EO.A00(r2)
            java.lang.String r1 = r8.getId()
            java.util.HashMap r0 = r5.A02
            java.lang.Object r0 = r0.remove(r1)
            if (r0 == 0) goto L_0x02c1
            java.util.HashMap r0 = r5.A02
            java.util.Collection r0 = r0.values()
            r5.A05(r0)
        L_0x02c1:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x02cc
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.AnonymousClass3FH.A02(r0)
        L_0x02cc:
            boolean r0 = X.C3726691w.A0C(r6, r2)
            X.C3726691w.A0B(r6, r2, r0)
            if (r24 == 0) goto L_0x0352
            X.0Tu r5 = X.0Tu.A06
            r0 = 36316323604599011(0x810581000010e3, double:3.0299275094214495E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            if (r0 == 0) goto L_0x02e9
            X.C3726691w.A09(r6, r2)
        L_0x02e9:
            boolean r0 = X.C267044ar.A01(r6, r2)
            if (r0 == 0) goto L_0x0308
            r0 = 36311916968149808(0x81017f00000330, double:3.027140734786873E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x0308
            X.94I r0 = X.AnonymousClass94I.A01
            if (r0 != 0) goto L_0x0305
            X.94I r0 = new X.94I
            r0.<init>()
            X.AnonymousClass94I.A01 = r0
        L_0x0305:
            r0.A00(r6, r2)
        L_0x0308:
            java.lang.Class<X.DeN> r5 = X.C46400DeN.class
            monitor-enter(r5)
            goto L_0x0317
        L_0x030c:
            r12.A02()
            goto L_0x02a8
        L_0x0310:
            X.183 r0 = X.183.A01
            r0.A03(r2)
            goto L_0x01de
        L_0x0317:
            boolean r0 = X.C46400DeN.A04     // Catch:{ all -> 0x03b5 }
            if (r0 == 0) goto L_0x0345
            X.02m r12 = X.02m.A0p     // Catch:{ all -> 0x0343 }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x0343 }
            long r0 = X.C46400DeN.A01     // Catch:{ all -> 0x0343 }
            r13 = 857811724(0x33212b0c, float:3.7524885E-8)
            r12.A0g(r13, r0)     // Catch:{ all -> 0x0343 }
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = X.C46400DeN.A02     // Catch:{ all -> 0x0343 }
            r12.markerAnnotate(r13, r1, r0)     // Catch:{ all -> 0x0343 }
            java.lang.String r1 = "native_or_bloks"
            java.lang.String r0 = X.C46400DeN.A03     // Catch:{ all -> 0x0343 }
            r12.markerAnnotate(r13, r1, r0)     // Catch:{ all -> 0x0343 }
            X.0JR r0 = X.C46400DeN.A05     // Catch:{ all -> 0x0343 }
            long r15 = r0.now()     // Catch:{ all -> 0x0343 }
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0343 }
            r14 = r11
            r12.markerEnd(r13, r14, r15, r17)     // Catch:{ all -> 0x0343 }
            goto L_0x0345
        L_0x0343:
            r0 = move-exception
            goto L_0x03b4
        L_0x0345:
            X.C46400DeN.A04 = r3     // Catch:{ all -> 0x03b5 }
            r0 = 0
            X.C46400DeN.A01 = r0     // Catch:{ all -> 0x03b5 }
            java.lang.String r0 = ""
            X.C46400DeN.A02 = r0     // Catch:{ all -> 0x03b5 }
            X.C46400DeN.A03 = r0     // Catch:{ all -> 0x03b5 }
            monitor-exit(r5)
        L_0x0352:
            java.lang.String r8 = "normal_login"
            java.lang.String r10 = "account_switch"
            r1 = r8
            if (r24 == 0) goto L_0x035a
            r1 = r10
        L_0x035a:
            X.2I1 r0 = X.2Hz.A00(r2)
            java.lang.String r7 = "login_type"
            r0.A06(r7, r1)
            com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger r0 = X.2Hi.A00(r2)
            if (r0 == 0) goto L_0x036c
            r0.annotateLoginType(r1)
        L_0x036c:
            if (r24 == 0) goto L_0x03aa
            r3 = r10
        L_0x036f:
            r0 = 36607702776419948(0x820e830008166c, double:3.21419687097076E-306)
            long r5 = X.182.A01(r9, r2, r0)
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()
            X.Fsq r0 = new X.Fsq
            r0.<init>(r2, r3)
            r1.postDelayed(r0, r5)
            X.2He r0 = X.2Hd.A00(r2)
            if (r24 == 0) goto L_0x038b
            r8 = r10
        L_0x038b:
            X.02m r1 = r0.A00
            r0 = 20119557(0x1330005, float:3.2877122E-38)
            r1.markerAnnotate(r0, r7, r8)
            X.C49963FGw.A05(r19)
            X.9BR r0 = X.AnonymousClass9BR.A01
            if (r0 != 0) goto L_0x03a3
            X.9BR r0 = new X.9BR
            r0.<init>()
            r0.A00 = r2
            X.AnonymousClass9BR.A01 = r0
        L_0x03a3:
            if (r0 == 0) goto L_0x03a7
            r0.A00 = r2
        L_0x03a7:
            X.AnonymousClass94L.A02 = r2
            return r2
        L_0x03aa:
            java.lang.String r3 = "login"
            goto L_0x036f
        L_0x03ad:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x03b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x03b5 }
        L_0x03b4:
            throw r0     // Catch:{ all -> 0x03b5 }
        L_0x03b5:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46413Dea.A02(android.content.Context, X.0iw, X.0aP, com.instagram.user.model.User, java.lang.String, boolean):com.instagram.common.session.UserSession");
    }

    public static void A06(Activity activity, Uri uri, AnonymousClass0iw r9, UserSession userSession) {
        A07(activity, uri, r9, userSession, DbS.A01(), false, false, false, false);
    }
}
