package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;

public final class FHC {
    public static final FHC A00 = new Object();

    public static final ArrayList A02(Context context, 0lg r3, String str, String str2, String str3) {
        0qQ.A0B(str2, 3);
        if (!(r3 instanceof UserSession)) {
            return AnonymousClass7TE.A1C();
        }
        if (str.equals("active_account")) {
            return A00.A03(context, (UserSession) r3, str2, str3);
        }
        if (str.equals("inactive_logged_in_accounts")) {
            return A05((UserSession) r3);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        UserSession userSession = (UserSession) r3;
        A1C.addAll(A00.A03(context, userSession, str2, str3));
        A1C.addAll(A05(userSession));
        return A1C;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.FGw] */
    private final List A0B(Context context, UserSession userSession, String str, String str2) {
        String str3 = str2;
        String str4 = str;
        try {
            02m.A0p.markerAnnotate(444800256, "fb_lite_content_provider", "enabled");
            ? obj = new Object();
            Set A002 = FAQ.A00("lite_content_provider", C368108s5.A03, C368238sI.SAVED_ACCOUNTS);
            UserSession userSession2 = userSession;
            if (str == null) {
                str4 = 182.A04(0Tu.A06, userSession, 36884848425632330L);
            }
            if (str2 == null) {
                str3 = "FxNativeAuthDataHelper";
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = ((List) obj.A08(context, userSession2, str4, str3, A002).get()).iterator();
            while (it.hasNext()) {
                A0G(A1C, it);
            }
            return A1C;
        } catch (Exception e) {
            0KC.A0F("FxNativeAuthDataHelper", "Lite Access Library error: ", e);
            return 0sn.A00;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.FGw] */
    private final List A0E(FragmentActivity fragmentActivity, 0lg r13, String str, String str2) {
        String str3 = str2;
        String str4 = str;
        try {
            02m.A0p.markerAnnotate(444800256, "fb_lite_content_provider", "enabled");
            ? obj = new Object();
            Set A002 = FAQ.A00("lite_content_provider", C368108s5.A03, C368238sI.ACTIVE_ACCOUNT);
            0lg r7 = r13;
            if (str == null) {
                str4 = 182.A04(0Tu.A06, r13, 36884848425632330L);
            }
            if (str2 == null) {
                str3 = "FxNativeAuthDataHelper";
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C376139Gr r0 : (List) obj.A08(fragmentActivity, r7, str4, str3, A002).get()) {
                C376119Gp r1 = r0.A01;
                A1C.add(A06(r1.A01.A02, r1.A00, "Facebook", "Facebook", "active_account"));
            }
            return A1C;
        } catch (Exception e) {
            0KC.A0F("FxNativeAuthDataHelper", "Lite Access Library error: ", e);
            return 0sn.A00;
        }
    }

    @Deprecated(message = "Caller name should be set by the Bloks caller for all new usecases. Use bk.fx.action.FetchAllAvailableNativeAuthDataForCaller and the corresponding methods with caller")
    public static final ArrayList A04(0lg r6, String str) {
        if (!(r6 instanceof UserSession)) {
            return AnonymousClass7TE.A1C();
        }
        if (0qQ.A0K(str, "active_account")) {
            UserSession userSession = (UserSession) r6;
            String str2 = AnonymousClass1CT.A00(userSession).A04;
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (0mp.A0B(str2)) {
                return A1C;
            }
            A1C.add(A06(userSession.A06, str2, "Instagram", "Instagram", "active_account"));
            return A1C;
        } else if (0qQ.A0K(str, "inactive_logged_in_accounts")) {
            return A05((UserSession) r6);
        } else {
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            UserSession userSession2 = (UserSession) r6;
            String str3 = AnonymousClass1CT.A00(userSession2).A04;
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            if (!0mp.A0B(str3)) {
                A1C3.add(A06(userSession2.A06, str3, "Instagram", "Instagram", "active_account"));
            }
            A1C2.addAll(A1C3);
            A1C2.addAll(A05(userSession2));
            return A1C2;
        }
    }

    private final List A0A(Context context, UserSession userSession, String str) {
        UserSession userSession2 = userSession;
        Context context2 = context;
        String str2 = str;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36321898472154958L)) {
            return A0B(context, userSession, str, "BKBloksFxActionFetchAllAvailableNativeAuthDataForCallerImpl");
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (A0H()) {
            if (!AJ0.A04(str, "BKBloksFxActionFetchAllAvailableNativeAuthDataForCallerImpl", new C368198sE(userSession, userSession.A06))) {
                new C368208sF(userSession).A08("FACEBOOK", AnonymousClass05K.A03, "SAVED_ACCOUNTS");
            } else {
                A0F(userSession, A1C);
            }
        }
        if (!A1C.isEmpty()) {
            return A1C;
        }
        Iterator it = AJ0.A00(context2, userSession2, str2, "BKBloksFxActionFetchAllAvailableNativeAuthDataForCallerImpl", userSession.A06, C368098s4.FACEBOOK).iterator();
        while (it.hasNext()) {
            A0G(A1C, it);
        }
        return A1C;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.FGw] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0101, code lost:
        if (X.AnonymousClass7TE.A1b(r4) != false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List A0C(androidx.fragment.app.FragmentActivity r17, X.0lg r18) {
        /*
            r16 = this;
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321898472154958(0x810a930000274e, double:3.03345307811202E-306)
            r10 = r18
            boolean r0 = X.182.A06(r2, r10, r0)
            r9 = r17
            if (r0 == 0) goto L_0x00aa
            r0 = 36328199189183547(0x81104e00003c3b, double:3.037437676931851E-306)
            boolean r1 = X.182.A06(r2, r10, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00a3
            java.lang.String r14 = "FxNativeAuthDataHelper"
            X.02m r3 = X.02m.A0p     // Catch:{ Exception -> 0x00f5 }
            r2 = 444800256(0x1a831d00, float:5.422718E-23)
            java.lang.String r1 = "fb_lite_content_provider"
            java.lang.String r0 = "enabled"
            r3.markerAnnotate(r2, r1, r0)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r2 = X.AnonymousClass7TF.A0c()     // Catch:{ Exception -> 0x00f5 }
            X.0qQ.A07(r2)     // Catch:{ Exception -> 0x00f5 }
            X.FGw r12 = new X.FGw     // Catch:{ Exception -> 0x00f5 }
            r12.<init>()     // Catch:{ Exception -> 0x00f5 }
            X.8s5 r3 = X.C368108s5.A03     // Catch:{ Exception -> 0x00f5 }
            X.8sI r1 = X.C368238sI.ACTIVE_ACCOUNT     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = "lite_content_provider"
            java.util.Set r15 = X.FAQ.A00(r0, r3, r1)     // Catch:{ Exception -> 0x00f5 }
            X.0Tu r3 = X.0Tu.A06     // Catch:{ Exception -> 0x00f5 }
            r0 = 36884848425632330(0x830a930001024a, double:3.389464895508625E-306)
            java.lang.String r13 = X.182.A04(r3, r10, r0)     // Catch:{ Exception -> 0x00f5 }
            X.8sF r11 = new X.8sF     // Catch:{ Exception -> 0x00f5 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x00f5 }
            r11.A00 = r2     // Catch:{ Exception -> 0x00f5 }
            com.google.common.util.concurrent.ListenableFuture r0 = X.C49963FGw.A00(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00f5 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00f5 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x00f5 }
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x00f5 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ Exception -> 0x00f5 }
        L_0x0065:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x00f5 }
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r0 = r8.next()     // Catch:{ Exception -> 0x00f5 }
            X.9Gr r0 = (X.C376139Gr) r0     // Catch:{ Exception -> 0x00f5 }
            X.9Gp r1 = r0.A01     // Catch:{ Exception -> 0x00f5 }
            X.9Go r0 = r1.A01     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r7 = r0.A02     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r6 = r1.A00     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r5 = "Facebook"
            java.lang.String r3 = "active_account"
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = "user_id"
            r1.put(r0, r7)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = "auth_token"
            r1.put(r0, r6)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = "account_type"
            r1.put(r0, r5)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = "app_source"
            r1.put(r0, r5)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = "account_source"
            r1.put(r0, r3)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = "table_joint_id"
            r1.put(r0, r2)     // Catch:{ Exception -> 0x00f5 }
            r4.add(r1)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x0065
        L_0x00a3:
            r1 = r16
            java.util.List r4 = r1.A0E(r9, r10, r0, r0)
            goto L_0x00fd
        L_0x00aa:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            android.content.Context r2 = r9.getApplicationContext()
            boolean r0 = A0H()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0104
            r0 = r10
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.lang.String r0 = r0.A06
        L_0x00c3:
            X.9Gs r1 = X.C368048rz.A00(r2, r10, r1, r0)
            if (r1 == 0) goto L_0x0103
            X.9Gt r0 = r1.A00
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = r0.A01
        L_0x00cf:
            boolean r0 = X.0mp.A0B(r0)
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = r1.A02
            boolean r0 = X.0mp.A0B(r0)
            if (r0 != 0) goto L_0x0103
            X.9Gt r0 = r1.A00
            if (r0 == 0) goto L_0x00f1
            java.lang.String r3 = r0.A01
        L_0x00e3:
            java.lang.String r2 = r1.A02
            java.lang.String r1 = "Facebook"
            java.lang.String r0 = "active_account"
            java.util.HashMap r0 = A06(r3, r2, r1, r1, r0)
            r4.add(r0)
            return r4
        L_0x00f1:
            r3 = 0
            goto L_0x00e3
        L_0x00f3:
            r0 = 0
            goto L_0x00cf
        L_0x00f5:
            r1 = move-exception
            java.lang.String r0 = "Lite Access Library error: "
            X.0KC.A0F(r14, r0, r1)
            X.0sn r4 = X.0sn.A00
        L_0x00fd:
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x00aa
        L_0x0103:
            return r4
        L_0x0104:
            r0 = 0
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FHC.A0C(androidx.fragment.app.FragmentActivity, X.0lg):java.util.List");
    }

    private final List A0D(FragmentActivity fragmentActivity, 0lg r8, String str) {
        String str2;
        if (182.A06(0Tu.A05, r8, 36321898472154958L)) {
            return A0E(fragmentActivity, r8, str, "BKBloksFxActionFetchAllAvailableNativeAuthDataForCallerImpl");
        }
        if (r8 instanceof UserSession) {
            str2 = ((UserSession) r8).A06;
        } else {
            str2 = null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C376139Gr r0 : AJ0.A01(DbT.A05(fragmentActivity), r8, str, "BKBloksFxActionFetchAllAvailableNativeAuthDataForCallerImpl", str2)) {
            C376119Gp r1 = r0.A01;
            A1C.add(A06(r1.A01.A02, r1.A00, "Facebook", "Facebook", "active_account"));
        }
        return A1C;
    }

    public static final ArrayList A00(Context context, 0lg r8, String str, String str2) {
        String str3;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (r8 instanceof UserSession) {
            str3 = ((UserSession) r8).A06;
        } else {
            str3 = null;
        }
        for (C376139Gr r0 : AJ0.A02(context, r8, str, str2, str3)) {
            C376119Gp r1 = r0.A01;
            A1C.add(A06(r1.A01.A02, r1.A00, "Facebook", "Messenger", "active_account"));
        }
        return A1C;
    }

    public static final ArrayList A01(Context context, 0lg r8, String str, String str2) {
        String str3;
        ArrayList A1C = AnonymousClass7TE.A1C();
        0lg r1 = r8;
        if (r8 instanceof UserSession) {
            str3 = ((UserSession) r1).A06;
        } else {
            str3 = null;
        }
        for (C376139Gr r0 : AJ0.A03(context, r1, str, str2, str3, 0sc.A06(new C368098s4[]{C368098s4.OCULUS}))) {
            C376119Gp r12 = r0.A01;
            A1C.add(A06(r12.A01.A02, r12.A00, "FRL", "Oculus", "active_account"));
        }
        return A1C;
    }

    private final ArrayList A03(Context context, UserSession userSession, String str, String str2) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        for (C376139Gr r0 : AJ0.A03(context2, userSession, str3, str4, userSession.A06, new HashSet(AnonymousClass7TE.A1I(C368098s4.INSTAGRAM)))) {
            C376119Gp r1 = r0.A01;
            A1C.add(A06(r1.A01.A02, r1.A00, "Facebook", "Messenger", "active_account"));
        }
        return A1C;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.0Js] */
    public static final ArrayList A05(UserSession userSession) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = AnonymousClass0BO.A00(userSession).BNy((String) null).iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            if (!0mp.A0B(A18) && !0qQ.A0K(A18, userSession.A06)) {
                09i.A0A.A0A(new Object(), new C50928FlH(A1C, A18), new Object(), A18);
            }
        }
        return A1C;
    }

    public static final HashMap A06(String str, String str2, String str3, String str4, String str5) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        A1E.put("auth_token", str2);
        A1E.put("account_type", str3);
        A1E.put("app_source", str4);
        A1E.put("account_source", str5);
        return A1E;
    }

    @Deprecated(message = "Caller name should be set by the Bloks caller for all new usecases. Use bk.fx.action.FetchAllAvailableNativeAuthDataForCaller and the corresponding methods with caller name")
    public static final List A07(Context context, FragmentActivity fragmentActivity, 0lg r5, String str) {
        DbY.A1S(r5, fragmentActivity);
        if (r5 instanceof UserSession) {
            if (str == null) {
                str = "";
            }
            if (!str.equals("active_account")) {
                if (str.equals("inactive_logged_in_accounts")) {
                    return A00.A09(context, (UserSession) r5);
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                FHC fhc = A00;
                A1C.addAll(fhc.A0C(fragmentActivity, r5));
                A1C.addAll(fhc.A09(context, (UserSession) r5));
                return A1C;
            }
        }
        return A00.A0C(fragmentActivity, r5);
    }

    public static final List A08(Context context, FragmentActivity fragmentActivity, 0lg r5, String str, String str2) {
        DbY.A1S(r5, fragmentActivity);
        0qQ.A0B(str2, 4);
        if (!(r5 instanceof UserSession) || str.equals("active_account")) {
            return A00.A0D(fragmentActivity, r5, str2);
        }
        if (str.equals("inactive_logged_in_accounts")) {
            return A00.A0A(context, (UserSession) r5, str2);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        FHC fhc = A00;
        A1C.addAll(fhc.A0D(fragmentActivity, r5, str2));
        A1C.addAll(fhc.A0A(context, (UserSession) r5, str2));
        return A1C;
    }

    private final List A09(Context context, UserSession userSession) {
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36321898472154958L)) {
            return A0B(context, userSession, (String) null, (String) null);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (A0H()) {
            A0F(userSession, A1C);
        }
        if (!A1C.isEmpty()) {
            return A1C;
        }
        C368058s0 r3 = new C368058s0();
        r3.A03 = new C368198sE(userSession, (String) null);
        r3.A04 = new C368208sF(userSession);
        Iterator it = C368218sG.A01(context, (String) null, AnonymousClass7TE.A1I(C368098s4.FACEBOOK), new C368218sG(r3)).iterator();
        while (it.hasNext()) {
            A0G(A1C, it);
        }
        return A1C;
    }

    private final void A0F(UserSession userSession, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new FEV(C368108s5.A03, C368238sI.SAVED_ACCOUNTS));
        Iterator it = C49264Es7.A00(AnonymousClass7TF.A0c(), "FxNativeAuthDataHelper", A1C, new C368208sF(userSession)).iterator();
        while (it.hasNext()) {
            F3S f3s = (F3S) it.next();
            list.add(A06(f3s.A02, f3s.A01, "Facebook", "Facebook", "inactive_logged_in_accounts"));
        }
    }

    public static void A0G(AbstractCollection abstractCollection, Iterator it) {
        C376119Gp r1 = ((C376139Gr) it.next()).A01;
        abstractCollection.add(A06(r1.A01.A02, r1.A00, "Facebook", "Facebook", "inactive_logged_in_accounts"));
    }

    public static final boolean A0H() {
        if (0yU.A07(AnonymousClass0yP.A00(36313626365462707L)) || 0yU.A07(AnonymousClass0yP.A00(36313626365593781L)) || 0yU.A07(C63130yM.A00(18299232150948026L)) || 0yU.A07(C63130yM.A00(18299232151079099L))) {
            return true;
        }
        return false;
    }
}
