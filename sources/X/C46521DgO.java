package X;

import android.content.Context;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.DgO  reason: case insensitive filesystem */
public final class C46521DgO {
    public static final int A0A = (DbX.A07(Dc2.A0S) + IgNetworkConsentStorage.MAX_ENTRIES);
    public static final Handler A0B = AnonymousClass7TF.A0D();
    public final Fragment A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final UserSession A03;
    public final G7E A04;
    public final AnonymousClass4HS A05;
    public final G7F A06;
    public final C46529DgW A07;
    public final List A08 = AnonymousClass7TE.A1C();
    public final boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (r3.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        if (android.text.TextUtils.isEmpty(r9.A01) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        if (android.text.TextUtils.isEmpty(r9.A03) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        r0 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b6, code lost:
        if (r0 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00da, code lost:
        r2.A06(r7, r0, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0103, code lost:
        r2.A0A(A00(r8, r12, r13, r3), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0115, code lost:
        r2.A0C(A00(r8, r12, r13, r3), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r14, X.AnonymousClass9JH r15, X.JV7 r16, X.C46498Dg1 r17, X.C46521DgO r18, X.C283155Gi r19, int r20) {
        /*
            r9 = r15
            java.lang.String r3 = r15.A02
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0029
            r11 = r18
            com.instagram.common.session.UserSession r6 = r11.A03
            r12 = r19
            com.instagram.user.model.User r13 = X.F6W.A00(r6, r12)
            r15 = 4
            X.FOy r7 = new X.FOy
            r8 = r14
            r10 = r16
            r14 = r20
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (int) r14, (int) r15)
            int r0 = r3.hashCode()
            r5 = 10
            r2 = r17
            switch(r0) {
                case -1840722463: goto L_0x002d;
                case -336545092: goto L_0x0036;
                case -250367239: goto L_0x0055;
                case -101739776: goto L_0x002a;
                case 3202370: goto L_0x0076;
                case 93832333: goto L_0x0091;
                case 134534829: goto L_0x009c;
                case 281394031: goto L_0x00b9;
                case 499953017: goto L_0x00de;
                case 1191002059: goto L_0x00ef;
                case 1449514870: goto L_0x010b;
                default: goto L_0x0029;
            }
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r0 = "deprioritize"
            goto L_0x009e
        L_0x002d:
            java.lang.String r0 = "debug_copy"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00b4
            return
        L_0x0036:
            java.lang.String r0 = "restrict"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0029
            if (r13 == 0) goto L_0x0029
            java.lang.String r0 = A00(r8, r12, r13, r3)
            r2.A0A(r0, r7)
            X.0wc r3 = r11.A02
            java.lang.String r2 = r13.getId()
            java.lang.String r1 = "impression"
            java.lang.String r0 = "newsfeed_you_entry_point"
            X.AnonymousClass73V.A0F(r3, r1, r0, r2)
            return
        L_0x0055:
            java.lang.String r0 = "tag_options"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0029
            boolean r0 = r12.A0E
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = r12.A07()
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = A00(r8, r12, r13, r3)
            r2.A0C(r0, r7)
            X.1Xj r0 = r12.A02
            if (r0 != 0) goto L_0x0029
            A03(r8, r11, r12)
            return
        L_0x0076:
            java.lang.String r0 = "hide"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0029
            boolean r0 = X.C324536zU.A00(r6)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0089
            r1 = 1050253722(0x3e99999a, float:0.3)
        L_0x0089:
            java.lang.String r0 = A00(r8, r12, r13, r3)
            r2.A05(r7, r0, r1)
            return
        L_0x0091:
            java.lang.String r0 = "block"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0029
            if (r13 == 0) goto L_0x0029
            goto L_0x0103
        L_0x009c:
            java.lang.String r0 = "turn_off"
        L_0x009e:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r9.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = r9.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0029
        L_0x00b4:
            java.lang.String r0 = r9.A01
            if (r0 != 0) goto L_0x00da
            return
        L_0x00b9:
            r0 = 385(0x181, float:5.4E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0029
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.0Tu r4 = X.0Tu.A06
            r0 = 36321481861375413(0x810a32001025b5, double:3.033189611777479E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = A00(r8, r12, r13, r3)
        L_0x00da:
            r2.A06(r7, r0, r5)
            return
        L_0x00de:
            java.lang.String r0 = "remove_follower"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0029
            if (r13 == 0) goto L_0x0029
            boolean r0 = r13.A2A()
            if (r0 == 0) goto L_0x0029
            goto L_0x0115
        L_0x00ef:
            java.lang.String r0 = "delete_comment"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0029
            X.5Gj r0 = r12.A04
            java.lang.String r0 = r0.A0b
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r12.A07()
            if (r0 == 0) goto L_0x0029
        L_0x0103:
            java.lang.String r0 = A00(r8, r12, r13, r3)
            r2.A0A(r0, r7)
            return
        L_0x010b:
            java.lang.String r0 = "report_a_problem"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0029
            if (r13 == 0) goto L_0x0029
        L_0x0115:
            java.lang.String r0 = A00(r8, r12, r13, r3)
            r2.A0C(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46521DgO.A01(android.content.Context, X.9JH, X.JV7, X.Dg1, X.DgO, X.5Gi, int):void");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.FpO, java.lang.Object, java.lang.Runnable] */
    public static void A02(Context context, JV7 jv7, C46521DgO dgO, C283155Gi r19, int i) {
        C46521DgO dgO2 = dgO;
        UserSession userSession = dgO2.A03;
        Dd0 A012 = C46354Dcy.A01(userSession);
        String str = userSession.A06;
        AnonymousClass0iw r6 = dgO2.A01;
        G7E g7e = dgO2.A04;
        C283155Gi r7 = r19;
        int i2 = i;
        A012.A0G(jv7, r6, r7, str, g7e.AbI(), g7e.BcQ(), i2);
        if (DdE.A00(r7)) {
            0xI A002 = 0xI.A00(DbS.A0O(AnonymousClass000.A00(68)), AnonymousClass000.A00(2686));
            0qQ.A0A(A002);
            A002.A0C("actor_igid", str);
            A002.A0B("tip_id", Long.valueOf(DbY.A04(r7.A04.A0S)));
            A002.A0B("channel_id", Long.valueOf(DbY.A04(r7.A04.A0R)));
            DbU.A1R(A002, userSession);
        }
        C51376Ft8 ft8 = new C51376Ft8(dgO2, r7);
        Context context2 = context;
        EC1 ec1 = new EC1(context2, dgO2, r7, i2);
        String str2 = r7.A09;
        String str3 = r7.A04.A0s;
        0qQ.A0B(str2, 2);
        1OC A003 = Dd3.A00(userSession, "hide", str2, str3, (Map) null);
        A003.A00 = ec1;
        ? obj = new Object();
        obj.A00 = A003;
        boolean z = false;
        if (context != null) {
            C310336ap A0a = DbS.A0a();
            DbZ.A10(context2, A0a, context2.getString(2131968334));
            A0a.A0A = new C57266IVb(r7, dgO2, ft8, obj, i2, 1);
            A0a.A0L = true;
            A0a.A06();
            A0a.A02 = 0;
            DbY.A1N(A0a);
            Handler handler = A0B;
            long j = (long) A0A;
            handler.postDelayed(obj, j);
            handler.postDelayed(ft8, j);
            z = true;
        } else {
            Handler handler2 = A0B;
            handler2.post(obj);
            handler2.post(ft8);
        }
        dgO2.A06.EEA(r7, z);
    }

    public static void A04(C46521DgO dgO, C283155Gi r6, String str, int i) {
        UserSession userSession = dgO.A03;
        AnonymousClass0iw r5 = dgO.A01;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "newsfeed_story_inline_action");
        if (A0e.isSampled()) {
            ArrayList A14 = DbV.A14(str);
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("module_name", r5.getModuleName());
            A1E.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r6.A05.toString());
            A0e.A9F("story_type", DbS.A0j(r6.A00));
            A0e.A9F("position", DbV.A0p(A0e, "story_id", r6.A09, i));
            A0e.AAJ("section", r6.A0D);
            A0e.AAJ("tuuid", r6.A04.A0s);
            A0e.AAJ("tab", "you");
            A0e.A9H("extra_data", A1E);
            A0e.AAe("step", A14);
            A0e.Cgf();
        }
    }

    public static boolean A05(C46521DgO dgO) {
        FragmentActivity activity = dgO.A00.getActivity();
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    public C46521DgO(Fragment fragment, AnonymousClass0iw r4, 0wc r5, UserSession userSession, G7E g7e, G7F g7f) {
        this.A00 = fragment;
        this.A03 = userSession;
        this.A01 = r4;
        this.A02 = r5;
        this.A06 = g7f;
        this.A04 = g7e;
        0qQ.A0B(userSession, 0);
        this.A07 = (C46529DgW) userSession.A01(C46529DgW.class, C46528DgV.A00);
        this.A05 = AnonymousClass4HR.A00(userSession);
        this.A09 = 1CI.A00(userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r4.CPV() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        return X.DbW.A0h(r2, r3.A04.A0h, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        return r2.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        throw X.AnonymousClass7TF.A0W("Unknown action type ", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r4.isRestricted() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.Context r2, X.C283155Gi r3, com.instagram.user.model.User r4, java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            switch(r0) {
                case -336545092: goto L_0x000e;
                case -250367239: goto L_0x0025;
                case 3202370: goto L_0x0031;
                case 93832333: goto L_0x003d;
                case 281394031: goto L_0x005c;
                case 499953017: goto L_0x006c;
                case 1191002059: goto L_0x0078;
                case 1449514870: goto L_0x0084;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = "Unknown action type "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r5)
            throw r0
        L_0x000e:
            java.lang.String r0 = "restrict"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            if (r4 == 0) goto L_0x0021
            boolean r0 = r4.isRestricted()
            r1 = 2131968343(0x7f134157, float:1.9573578E38)
            if (r0 != 0) goto L_0x0053
        L_0x0021:
            r1 = 2131968338(0x7f134152, float:1.9573568E38)
            goto L_0x0053
        L_0x0025:
            java.lang.String r0 = "tag_options"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 2131968339(0x7f134153, float:1.957357E38)
            goto L_0x008f
        L_0x0031:
            java.lang.String r0 = "hide"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 2131968330(0x7f13414a, float:1.9573552E38)
            goto L_0x008f
        L_0x003d:
            java.lang.String r0 = "block"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            if (r4 == 0) goto L_0x0050
            boolean r0 = r4.CPV()
            r1 = 2131968342(0x7f134156, float:1.9573576E38)
            if (r0 != 0) goto L_0x0053
        L_0x0050:
            r1 = 2131968329(0x7f134149, float:1.957355E38)
        L_0x0053:
            X.5Gj r0 = r3.A04
            java.lang.String r0 = r0.A0h
            java.lang.String r0 = X.DbW.A0h(r2, r0, r1)
            return r0
        L_0x005c:
            r0 = 385(0x181, float:5.4E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 2131968340(0x7f134154, float:1.9573572E38)
            goto L_0x008f
        L_0x006c:
            java.lang.String r0 = "remove_follower"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 2131968335(0x7f13414f, float:1.9573562E38)
            goto L_0x008f
        L_0x0078:
            java.lang.String r0 = "delete_comment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 2131968331(0x7f13414b, float:1.9573554E38)
            goto L_0x008f
        L_0x0084:
            java.lang.String r0 = "report_a_problem"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 2131968337(0x7f134151, float:1.9573566E38)
        L_0x008f:
            java.lang.String r0 = r2.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46521DgO.A00(android.content.Context, X.5Gi, com.instagram.user.model.User, java.lang.String):java.lang.String");
    }

    public static void A03(Context context, C46521DgO dgO, C283155Gi r5) {
        if (r5.A07() != null) {
            UserSession userSession = dgO.A03;
            1Xj A022 = 1E7.A00(userSession).A02(r5.A07());
            if (A022 == null) {
                1OC A042 = C3724090s.A04(userSession, r5.A07());
                EDV.A00(A042, dgO, r5, 21);
                1ES.A00(context, AnonymousClass07i.A00(dgO.A00), A042);
                return;
            }
            r5.A02 = A022;
        }
    }
}
