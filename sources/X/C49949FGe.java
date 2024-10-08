package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.FGe  reason: case insensitive filesystem */
public final class C49949FGe {
    public static final C49949FGe A00 = new Object();

    public static final void A01(Context context, Fragment fragment, UserAccountInfo userAccountInfo, FoaUserSession foaUserSession, String str, String str2) {
        long j;
        C46397DeK deK;
        String A04;
        FoaUserSession foaUserSession2 = foaUserSession;
        0qQ.A0B(foaUserSession2, 0);
        String str3 = str;
        String str4 = str2;
        AnonymousClass7TF.A1B(str3, 1, str4);
        Fragment fragment2 = fragment;
        0qQ.A0B(fragment2, 5);
        UserAccountInfo userAccountInfo2 = userAccountInfo;
        String str5 = userAccountInfo2.A03;
        if (str5 != null) {
            j = Long.parseLong(str5);
        } else {
            j = 0;
        }
        String str6 = userAccountInfo2.A02;
        if (0qQ.A0K(str6, "THREADS")) {
            deK = C46397DeK.THREADS;
        } else {
            deK = C46397DeK.FACEBOOK;
        }
        String str7 = str3;
        String str8 = str4;
        C49901FCe.A00(deK, foaUserSession2, str7, str8, j, false, AnonymousClass7TF.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        if (j > 0) {
            C49901FCe.A01(foaUserSession2, (int) j, true);
        }
        UserSession A002 = C56316HwT.A00(foaUserSession2);
        String str9 = userAccountInfo2.A00;
        FragmentActivity activity = fragment2.getActivity();
        if (activity != null) {
            Context context2 = context;
            if (str9 != null) {
                0qQ.A0B(A002, 0);
                FBL fbl = (FBL) A002.A01(FBL.class, new C73662Phb(A002, 15));
                if (0qQ.A0K(str6, "THREADS")) {
                    0sm A0E = 0Yt.A0E();
                    Uri build = new Uri.Builder().scheme("barcelona").authority("feed").build();
                    0qQ.A07(build);
                    0sm A0E2 = 0Yt.A0E();
                    0sm A0E3 = 0Yt.A0E();
                    AnonymousClass7TF.A1G(A0E, 5, A0E2);
                    0qQ.A0B(A0E3, 10);
                    String A01 = fbl.A01.A01(CallerContext.A01("FxDeeplinkUtil"), "ig_android_linking_cache_fx_internal", str9);
                    if (A01 != null) {
                        Uri.Builder A07 = DbW.A07(build.toString());
                        A07.appendQueryParameter("account_id", A01);
                        Iterator it = A0E.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry A1J = AnonymousClass7TE.A1J(it);
                            A07.appendQueryParameter(DbT.A13(A1J), DbS.A0s(A1J));
                        }
                        String str10 = "";
                        if (0oI.A0A(context2) && (A04 = 0oI.A04(context2)) != null) {
                            str10 = A04;
                        }
                        if (str10.length() > 0) {
                            Intent A09 = DbX.A09(A07.build().toString());
                            Iterator it2 = A0E2.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry A1J2 = AnonymousClass7TE.A1J(it2);
                                A09.putExtra(DbT.A13(A1J2), AnonymousClass7TE.A1a(A1J2.getValue()));
                            }
                            Iterator it3 = A0E3.entrySet().iterator();
                            while (it3.hasNext()) {
                                Map.Entry A1J3 = AnonymousClass7TE.A1J(it3);
                                A09.putExtra(DbT.A13(A1J3), DbS.A0s(A1J3));
                            }
                            A09.setPackage(str10);
                            if (!0kR.A0A(context2, A09)) {
                                A03(foaUserSession2, str4, true);
                                String str11 = str3;
                                0KC.A0C("FxDeeplinkUtil", 002.A14("Launching ", str10, " failed for ", str11, " : ", str11, '.'));
                                return;
                            }
                        } else {
                            0oI.A07(context2, "com.instagram.barcelona", (String) null);
                            A03(foaUserSession2, str4, false);
                            UserSession A003 = C56316HwT.A00(foaUserSession2);
                            double A004 = DbV.A00(A003, 0);
                            UserSession userSession = A003;
                            C46400DeN.A03(userSession, 00y.A0n(10, str9), 00y.A0n(10, str9), "inter_app", AnonymousClass7TG.A0j(), str3, (String) null, "app_store", (String) null, "BARCELONA_ANDROID", A004, false, true, true);
                            return;
                        }
                    }
                    A03(foaUserSession2, str4, true);
                    return;
                }
                FBL fbl2 = fbl;
                Context context3 = context2;
                fbl2.A00(context3, activity, CallerContext.A01("AccountSwitcherInstagramAppBindings"), "", str9, AnonymousClass000.A00(564), str7, str8, (String) null);
                return;
            }
            FGT.A01(context2, activity, A002, userAccountInfo2.A08, AnonymousClass000.A00(564), str3, str4, (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (r0 <= 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(androidx.fragment.app.Fragment r21, com.meta.foa.accountswitcher.UserAccountInfo r22, com.meta.foa.session.FoaUserSession r23, java.lang.String r24, java.lang.String r25, boolean r26) {
        /*
            r6 = 0
            r9 = r23
            X.0qQ.A0B(r9, r6)
            r4 = r24
            r3 = r25
            X.AnonymousClass7TG.A1O(r4, r3)
            r0 = 5
            r14 = r21
            X.0qQ.A0B(r14, r0)
            com.instagram.common.session.UserSession r17 = X.C56316HwT.A00(r9)
            X.0BQ r0 = X.AnonymousClass0BO.A00(r17)
            r5 = r22
            java.lang.String r2 = r5.A08
            boolean r24 = r0.CO7(r2)
            java.lang.String r7 = r5.A03
            r10 = 0
            if (r7 == 0) goto L_0x00c3
            long r0 = java.lang.Long.parseLong(r7)
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r25 = 1
            if (r8 > 0) goto L_0x0035
        L_0x0033:
            r25 = 0
        L_0x0035:
            X.DeK r18 = X.C46397DeK.INSTAGRAM
            r20 = r4
            r21 = r3
            r22 = r0
            r19 = r9
            X.C49901FCe.A00(r18, r19, r20, r21, r22, r24, r25)
            if (r26 != 0) goto L_0x0172
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x004c
            int r8 = (int) r0
            X.C49901FCe.A01(r9, r8, r6)
        L_0x004c:
            com.instagram.common.session.UserSession r9 = X.C56316HwT.A00(r9)
            r0 = 1
            X.0Tu r8 = X.DbS.A0J(r9, r0)
            r0 = 36310667133714668(0x81005c001000ec, double:3.026350334457411E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x012f
            java.util.List r0 = X.DbV.A17(r9)
            java.util.Iterator r8 = r0.iterator()
        L_0x0068:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = r8.next()
            java.lang.String r0 = X.DbS.A0q(r1)
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x0068
        L_0x007c:
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x00bc
            java.util.Map r0 = r1.A05
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r0)
            X.0qQ.A07(r0)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r0)
        L_0x008e:
            java.util.List r8 = X.AnonymousClass2aW.A00
            X.2aD r1 = X.2aD.A0I
            X.2aD r0 = X.2aD.A0U
            X.2aD[] r0 = new X.2aD[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.ArrayList r0 = X.00k.A0S(r0, r8)
            java.util.Iterator r8 = r0.iterator()
        L_0x00a4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r1 = r8.next()
            boolean r0 = r10.containsKey(r1)
            if (r0 != 0) goto L_0x00a4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r10.put(r1, r0)
            goto L_0x00a4
        L_0x00bc:
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            goto L_0x008e
        L_0x00c1:
            r1 = 0
            goto L_0x007c
        L_0x00c3:
            r0 = 0
            goto L_0x0033
        L_0x00c7:
            X.2aD r0 = X.2aD.A0K
            r10.remove(r0)
            X.2aD r0 = X.2aD.A0J
            r10.remove(r0)
            X.2aD r11 = X.2aD.A0p
            if (r7 == 0) goto L_0x0113
            java.lang.Integer r0 = X.00y.A0l(r7)
            if (r0 == 0) goto L_0x0113
            int r12 = r0.intValue()
        L_0x00df:
            int r0 = r10.size()
            java.util.ArrayList r8 = X.DbS.A0v(r0)
            java.util.Iterator r13 = X.AnonymousClass7TF.A0s(r10)
        L_0x00eb:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0115
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r13)
            java.lang.Object r9 = r0.getKey()
            X.0qQ.A07(r9)
            X.2aE r9 = (X.C71062aE) r9
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            int r7 = X.AnonymousClass7TE.A0M(r0)
            r1 = 0
            X.2aX r0 = new X.2aX
            r0.<init>(r9, r1, r7, r7)
            r8.add(r0)
            goto L_0x00eb
        L_0x0113:
            r12 = 0
            goto L_0x00df
        L_0x0115:
            X.2aX r9 = new X.2aX
            r9.<init>(r11, r8, r12, r12)
            r8 = 0
            X.2g1 r7 = X.AnonymousClass2g1.BOTTOM_SHEET
            X.0qQ.A0B(r7, r6)
            X.2fx r6 = X.C226252fx.LIST_ITEM
            X.2aE r1 = X.FFg.A01(r10)
            X.3Jd r0 = new X.3Jd
            r0.<init>(r6, r7, r1, r8)
            X.C48214Eav.A01 = r9
            X.C48214Eav.A00 = r0
        L_0x012f:
            androidx.fragment.app.FragmentActivity r0 = r14.getActivity()
            if (r0 == 0) goto L_0x0172
            X.2ZQ r1 = X.C71172bH.A00()
            if (r1 == 0) goto L_0x0173
            X.1QK r0 = X.1QK.A0B
            boolean r7 = r1.CR0(r0)
        L_0x0141:
            r0 = 5388(0x150c, float:7.55E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0xG r16 = X.DbS.A0O(r0)
            androidx.fragment.app.FragmentActivity r15 = r14.requireActivity()
            java.lang.String r6 = r5.A0A
            java.lang.String r0 = "Required value was null."
            if (r6 == 0) goto L_0x017a
            java.lang.String r5 = r5.A09
            if (r5 == 0) goto L_0x0175
            double r0 = X.DbS.A01()
            java.lang.Double r19 = java.lang.Double.valueOf(r0)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r7)
            r20 = r2
            r21 = r6
            r22 = r5
            r23 = r4
            r24 = r3
            X.C46399DeM.A05(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0172:
            return
        L_0x0173:
            r7 = 0
            goto L_0x0141
        L_0x0175:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x017a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49949FGe.A02(androidx.fragment.app.Fragment, com.meta.foa.accountswitcher.UserAccountInfo, com.meta.foa.session.FoaUserSession, java.lang.String, java.lang.String, boolean):void");
    }

    public final boolean A05(FoaUserSession foaUserSession) {
        if (!A04(foaUserSession)) {
            return AnonymousClass3EM.A05(18312718348007601L, true);
        }
        return false;
    }

    public static final C58687Ivw A00(Activity activity, FoaUserSession foaUserSession, String str, String str2) {
        AnonymousClass7TG.A1T(foaUserSession, str, str2);
        UserSession A002 = C56316HwT.A00(foaUserSession);
        0qQ.A0B(A002, 0);
        long parseLong = Long.parseLong(A002.A06);
        C46398DeL A003 = C46400DeN.A00(str);
        Long valueOf = Long.valueOf(parseLong);
        double A004 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A002), "manage_accounts_button_tapped");
        if (A0e.isSampled()) {
            A0e.A9F("raw_initiator_account_id", valueOf);
            A0e.A9F("initiator_identity_id", valueOf);
            DbW.A12(A0e, A004);
            A0e.AAJ("event_session_id", str2);
            DbS.A1F(A003, A0e);
            A0e.A7p("is_cds", AnonymousClass7TE.A0v());
            A0e.A8M(C46397DeK.INSTAGRAM, "initiator_account_type");
            A0e.Cgf();
        }
        return new C58687Ivw(28, activity, C56316HwT.A00(foaUserSession));
    }

    public static final void A03(FoaUserSession foaUserSession, String str, boolean z) {
        Long A0d = DbZ.A0d(foaUserSession.getUserId());
        UserSession A002 = C56316HwT.A00(foaUserSession);
        0qQ.A0B(A002, 0);
        Boolean valueOf = Boolean.valueOf(z);
        boolean z2 = C46400DeN.A04;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A002), "horizontal_switch_initiated");
        if (A0e.isSampled()) {
            A0e.A7p("target_app_installation_status", valueOf);
            A0e.A9F("initiator_identity_id", A0d);
            A0e.AAJ("event_session_id", str);
            A0e.Cgf();
        }
    }

    public static final boolean A04(FoaUserSession foaUserSession) {
        UserSession A002 = C56316HwT.A00(foaUserSession);
        boolean A09 = AnonymousClass3EM.A09(A002, !1wB.A00(A002).A02(C46399DeM.A00, "FACEBOOK").isEmpty());
        if (!AnonymousClass3EM.A05(18301950866428154L, true) || !A09) {
            return false;
        }
        return true;
    }
}
