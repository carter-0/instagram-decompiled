package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

public final class FGT {
    public static final FGT A00 = new Object();
    public static final HashSet A01 = 0sc.A05(new String[]{"com.facebook.wakizashi", "com.facebook.katana", "com.facebook.orca", "com.oculus.twilight", "com.instagram.android", "com.instagram.barcelona", "com.facebook.lite"});

    public static final void A02(Context context, UserSession userSession, String str, String str2, String str3, String str4, long j, boolean z) {
        String str5;
        UserSession userSession2 = userSession;
        if (z && SP0.A00(context).A03()) {
            1TT A002 = new AnonymousClass1SF(context, context.getPackageManager()).A00();
            if (A002.A06 && A002.A05 && 182.A06(0Tu.A05, userSession, 36325089633317476L) && C48918EmI.A00(context)) {
                str5 = "preload";
                A03(userSession2, str2, str3, str4, str5, j);
            }
        }
        if (str != null && str.length() != 0) {
            0kR.A00(context, DbX.A09(str));
            if (z) {
                str5 = "app_store";
                A03(userSession2, str2, str3, str4, str5, j);
            }
        }
    }

    public static final void A03(UserSession userSession, String str, String str2, String str3, String str4, long j) {
        Long A0d = DbZ.A0d(DbT.A09(str).getQueryParameter("account_id"));
        UserSession userSession2 = userSession;
        String str5 = str2;
        String str6 = str4;
        Long l = A0d;
        C46400DeN.A03(userSession2, A0d, l, "inter_app", "", str5, Pxd.A00(149), str6, str3, (String) null, (double) j, false, true, true);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        if (r1 == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011b, code lost:
        if (X.182.A06(r10, r3, 36323762488028624L) == false) goto L_0x011d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r23, androidx.fragment.app.FragmentActivity r24, com.instagram.common.session.UserSession r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30) {
        /*
            r4 = r26
            r0 = 3
            r12 = r29
            r7 = r30
            X.AnonymousClass7TF.A1D(r12, r0, r7)
            r0 = 6
            r3 = r25
            X.0qQ.A0B(r3, r0)
            X.0rm r2 = new X.0rm
            r2.<init>()
            r2.A00 = r4
            long r5 = java.lang.System.currentTimeMillis()
            r0 = 564(0x234, float:7.9E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r11 = 0
            r1 = r28
            if (r28 != 0) goto L_0x0094
            r22 = 0
        L_0x0028:
            if (r22 == 0) goto L_0x0054
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            if (r26 == 0) goto L_0x0092
            java.lang.String r0 = "&initiator_app="
            java.lang.String r0 = X.002.A0R(r4, r0)
        L_0x0036:
            r1.append(r0)
            java.lang.String r0 = "IG_ANDROID&start_time="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "&inter_app_identity_switch="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = "&xapp_session_id="
            r1.append(r0)
            java.lang.String r4 = X.AnonymousClass7TF.A0l(r7, r1)
            r2.A00 = r4
        L_0x0054:
            if (r4 == 0) goto L_0x013d
            android.content.Intent r9 = X.DbX.A09(r4)
            r4 = r23
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r1.queryIntentActivities(r9, r0)
            java.util.ArrayList r8 = X.DbV.A15(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x006e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r10 = r13.next()
            android.content.pm.ResolveInfo r10 = (android.content.pm.ResolveInfo) r10
            android.content.pm.ActivityInfo r0 = r10.activityInfo
            java.util.HashSet r1 = A01
            if (r0 == 0) goto L_0x0090
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = r0.packageName
        L_0x0086:
            boolean r0 = X.00k.A0u(r1, r0)
            if (r0 == 0) goto L_0x006e
            r8.add(r10)
            goto L_0x006e
        L_0x0090:
            r0 = r11
            goto L_0x0086
        L_0x0092:
            r0 = r11
            goto L_0x0036
        L_0x0094:
            boolean r22 = r1.equals(r0)
            goto L_0x0028
        L_0x0099:
            android.net.Uri r0 = r9.getData()
            if (r0 == 0) goto L_0x00b4
            java.lang.String r1 = r0.getHost()
            if (r1 == 0) goto L_0x00b4
            java.lang.String r0 = "facebook"
            boolean r1 = X.DbU.A1a(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x00b4
            r15 = 1
            if (r1 != 0) goto L_0x00b5
        L_0x00b4:
            r15 = 0
        L_0x00b5:
            boolean r14 = X.0oI.A0B(r4)
            java.lang.String r0 = r3.A06
            java.lang.Long r10 = X.AnonymousClass7TE.A10(r0)
            if (r22 == 0) goto L_0x00e9
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r14)
            boolean r0 = X.C46400DeN.A04
            X.0wc r1 = X.AnonymousClass0kN.A02(r3)
            java.lang.String r0 = "horizontal_switch_initiated"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = "target_app_installation_status"
            r1.A7p(r0, r13)
            java.lang.String r0 = "initiator_identity_id"
            r1.A9F(r0, r10)
            java.lang.String r0 = "event_session_id"
            r1.AAJ(r0, r7)
            r1.Cgf()
        L_0x00e9:
            if (r15 == 0) goto L_0x013e
            if (r14 != 0) goto L_0x011d
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r0 = "com.facebook.lite"
            boolean r0 = X.0oI.A0I(r1, r0)
            if (r0 == 0) goto L_0x013e
            r0 = 18301950868263180(0x4105870033110c, double:1.8937148802892855E-307)
            r10 = 1
            boolean r0 = X.AnonymousClass3EM.A05(r0, r10)
            if (r0 == 0) goto L_0x013e
            X.0Tu r10 = X.0Tu.A05
            r0 = 36323762487963087(0x810c4500002dcf, double:3.03463188921487E-306)
            boolean r0 = X.182.A06(r10, r3, r0)
            if (r0 == 0) goto L_0x013e
            r0 = 36323762488028624(0x810c4500012dd0, double:3.034631889256316E-306)
            boolean r0 = X.182.A06(r10, r3, r0)
            if (r0 != 0) goto L_0x013e
        L_0x011d:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r1 = "com.facebook.katana"
            boolean r0 = X.0oI.A0I(r0, r1)
            if (r0 != 0) goto L_0x0137
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r1 = "com.facebook.wakizashi"
            boolean r0 = X.0oI.A0I(r0, r1)
            if (r0 != 0) goto L_0x0137
            java.lang.String r1 = "com.facebook.lite"
        L_0x0137:
            r9.setPackage(r1)
            X.0kR.A0A(r4, r9)
        L_0x013d:
            return
        L_0x013e:
            boolean r0 = X.DbT.A1b(r8)
            if (r0 == 0) goto L_0x0150
            X.0b6 r0 = X.0b6.A00()
            X.0R7 r0 = r0.A06()
            r0.A0G(r4, r9)
            return
        L_0x0150:
            X.SP0 r0 = X.SP0.A00(r4)
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01ca
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            X.1SF r0 = new X.1SF
            r0.<init>(r4, r1)
            X.1TT r1 = r0.A00()
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x01ca
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x01ca
            X.0Tu r10 = X.0Tu.A05
            r0 = 36325089633186403(0x810d7a00053263, double:3.03547118119808E-306)
            boolean r0 = X.182.A06(r10, r3, r0)
            if (r0 == 0) goto L_0x01ca
            X.1An r0 = X.1An.A1U
            java.lang.String r9 = r0.toString()
            X.0tX r13 = X.0xn.A00(r4, r9)
            long r15 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = "switcher_preload_last_redirect_time_ms"
            r0 = 0
            long r0 = r13.getLong(r8, r0)
            long r15 = r15 - r0
            r0 = 36606564610086340(0x820d7a000815c4, double:3.213477089998358E-306)
            long r13 = X.182.A01(r10, r3, r0)
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r13 = r13 * r0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x01ca
            boolean r0 = X.C48918EmI.A00(r4)
            if (r0 == 0) goto L_0x01ca
            long r0 = java.lang.System.currentTimeMillis()
            X.0tX r4 = X.0xn.A00(r4, r9)
            X.0xY r4 = r4.AR4()
            r4.E5c(r8, r0)
            r4.apply()
            java.lang.Object r0 = r2.A00
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r8 = "preload"
            r9 = r5
            r5 = r0
            r6 = r12
            r4 = r3
            A03(r4, r5, r6, r7, r8, r9)
            return
        L_0x01ca:
            X.0Tu r8 = X.0Tu.A05
            r0 = 36325420345340873(0x810dc7000033c9, double:3.035680324896238E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            r16 = r27
            if (r0 == 0) goto L_0x01f0
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.G0m r13 = new X.G0m
            r20 = r5
            r18 = r7
            r19 = r2
            r17 = r12
            r15 = r3
            r14 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r22)
            r1 = r24
            X.C48917EmH.A00(r1, r0, r11, r13)
            return
        L_0x01f0:
            java.lang.Object r0 = r2.A00
            java.lang.String r0 = (java.lang.String) r0
            r8 = r4
            r9 = r3
            r10 = r16
            r11 = r0
            r13 = r7
            r14 = r5
            r16 = r22
            A02(r8, r9, r10, r11, r12, r13, r14, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGT.A00(android.content.Context, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A01(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        String str6;
        StringBuilder A1A;
        StringBuilder A1A2;
        String str7 = str5;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 6);
        if (str5 == null || str7.length() == 0) {
            str7 = "fb://feed";
        }
        Uri.Builder A07 = DbW.A07("https://www.facebook.com/inter_app/redirect/");
        String str8 = "xav:switcher";
        1AW.A05(18873632486851351L);
        0Tu r2 = 0Tu.A04;
        0qQ.A08(r2);
        String A04 = 1AW.A04(r2, 18873632486851351L);
        if (AnonymousClass7TF.A1R(A04.length())) {
            str6 = 002.A0D(A04, ':');
        } else {
            str6 = "";
        }
        0Tu r9 = 0Tu.A05;
        String A042 = 1AW.A04(r9, 18873636781818648L);
        if (AnonymousClass7TF.A1R(A042.length())) {
            if (str6.length() > 0) {
                A1A2 = AnonymousClass7TF.A0n(str6);
                A1A2.append('@');
            } else {
                A1A2 = AnonymousClass7TE.A1A();
                A1A2.append(':');
            }
            str6 = AnonymousClass7TF.A0l(A042, A1A2);
        }
        String A043 = 182.A04(r9, userSession, 36888039586267929L);
        if (A043.length() > 0) {
            if (str6.length() > 0) {
                A1A = AnonymousClass7TF.A0n(str6);
                A1A.append('@');
            } else {
                A1A = AnonymousClass7TE.A1A();
                A1A.append(':');
            }
            str6 = AnonymousClass7TF.A0l(A043, A1A);
        }
        if (str6.length() > 0) {
            str8 = 002.A0T(str8, str6, ':');
        }
        A07.appendQueryParameter("ref", str8);
        A07.appendQueryParameter("account_id", str);
        A07.appendQueryParameter("destination_url", str7);
        A00(context, fragmentActivity, userSession2, DbT.A10(A07.build()), DbT.A10(DbW.A07("https://play.google.com/store/apps/details?id=com.facebook.katana").build()), str2, str3, str4);
    }
}
