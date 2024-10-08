package X;

import android.net.Uri;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;

/* renamed from: X.6EB  reason: invalid class name */
public final class AnonymousClass6EB {
    public static final AnonymousClass6EC A02 = new Object();
    public final C58840Ae A00;
    public final 0lg A01;

    public AnonymousClass6EB(0lg r3) {
        0qQ.A0B(r3, 1);
        0xG r0 = new 0xG("ArmadilloNotificationLogger");
        this.A01 = r3;
        this.A00 = AnonymousClass0kN.A01(r0, r3);
    }

    public static final void A00(AnonymousClass6EB r5, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        String str9;
        Long l = null;
        ArrayList arrayList = new ArrayList();
        if (0qQ.A0K(bool2, true)) {
            arrayList.add(C69500Nmi.A04);
        }
        if (0qQ.A0K(bool3, true)) {
            arrayList.add(C69500Nmi.A0E);
        }
        0wc r4 = r5.A00;
        0Aj A002 = r4.A00(r4.A00, "tincan_notifications_sync");
        A002.AAJ("event_type", str);
        A002.AAJ(TraceFieldType.MsgId, str6);
        A002.AAJ("push_notif_id", str2);
        A002.AAJ("wa_push_id", str3);
        A002.AAJ(AnonymousClass000.A00(599), str5);
        A002.AAJ("exception_type", (String) null);
        UserSession userSession = r5.A01;
        if (userSession instanceof UserSession) {
            str8 = userSession.A06;
        } else {
            str8 = null;
        }
        Long l2 = null;
        if (str8 != null) {
            l = 00y.A0n(10, str8);
        }
        A002.A9F(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, l);
        A002.AAJ("extra_info", str4);
        if (num != null) {
            l2 = Long.valueOf((long) num.intValue());
        }
        A002.A9F("render_type", l2);
        A002.A7p("is_instamadillo", bool);
        A002.AAJ("open_thread_id", str7);
        A002.AAe("feature_tags", arrayList);
        if (0JC.A00().A04()) {
            str9 = "main-app";
        } else {
            str9 = "bg-process";
        }
        A002.AAJ("process", str9);
        A002.Cgf();
    }

    public static final void A01(AnonymousClass6EB r4, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5) {
        A00(r4, bool, bool2, (Boolean) null, (Integer) null, str, str2, str3, str4, (String) null, (String) null, str5);
    }

    public final void A02(C268194cw r13, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6 = str;
        0qQ.A0B(str6, 0);
        r13.A0F("is_bg_account", z);
        String str7 = str5;
        A00(this, bool, bool2, bool3, num, str6, (String) null, str7, r13.toString(), str3, str2, str4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        if (r2.A1U == false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass5HJ r20, java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            r19 = this;
            r8 = 0
            r2 = r20
            X.0qQ.A0B(r2, r8)
            r4 = 1
            java.lang.String r3 = r2.A0g
            if (r3 == 0) goto L_0x00b3
            java.lang.String r0 = "ig_advanced_crypto_transport"
            r7 = 0
            r1 = 0
            boolean r5 = X.00l.A0d(r3, r0, r8)
            boolean r0 = r2.A05()
            java.lang.String r6 = "is_vanish_mode"
            if (r0 != 0) goto L_0x0027
            if (r5 != 0) goto L_0x0027
            boolean r0 = X.00l.A0d(r3, r6, r8)
            if (r0 != 0) goto L_0x0027
            boolean r0 = r2.A1S
            if (r0 == 0) goto L_0x00b3
        L_0x0027:
            android.net.Uri r3 = X.0cp.A03(r3)
            X.0qQ.A07(r3)
            boolean r0 = r2.A1S
            if (r0 == 0) goto L_0x00bc
            X.N4O r0 = r2.A05
            if (r0 == 0) goto L_0x0038
            java.lang.Object r1 = r0.A05
        L_0x0038:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x00bc
            java.lang.String r0 = "dx"
        L_0x003e:
            java.lang.String r14 = r3.getQueryParameter(r0)
            if (r14 != 0) goto L_0x0046
            java.lang.String r14 = r2.A0s
        L_0x0046:
            java.lang.String r0 = r3.getQueryParameter(r6)
            if (r0 == 0) goto L_0x00b6
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 != r4) goto L_0x00b6
        L_0x0052:
            r3 = 1
        L_0x0053:
            X.4fB r0 = X.C269474fB.A00
            X.4cw r8 = new X.4cw
            r8.<init>(r0)
            r8.A0F(r6, r3)
            boolean r0 = r2.A05()
            if (r0 == r5) goto L_0x0070
            com.instagram.common.notifications.push.intf.PushChannelType r0 = r2.A0B
            java.lang.String r1 = r0.A01
            r0 = 1731(0x6c3, float:2.426E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A0E(r0, r1)
        L_0x0070:
            boolean r0 = r2.A1S
            if (r0 == 0) goto L_0x00b4
            java.lang.String r1 = r2.A0i
        L_0x0076:
            java.lang.String r0 = "2"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0088
            X.N4O r0 = r2.A05
            if (r0 == 0) goto L_0x0089
            boolean r0 = r0.A00()
            if (r0 != r4) goto L_0x0089
        L_0x0088:
            r7 = 1
        L_0x0089:
            r12 = 0
            java.lang.String r1 = r2.A1G
            if (r1 != 0) goto L_0x0090
            java.lang.String r1 = r2.A1F
        L_0x0090:
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = ""
        L_0x0094:
            boolean r0 = r2.A1S
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = r2.A0U
            r7 = r19
            r13 = r21
            r15 = r22
            r18 = r23
            r16 = r1
            r17 = r0
            r7.A02(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x00b3:
            return
        L_0x00b4:
            r1 = 0
            goto L_0x0076
        L_0x00b6:
            boolean r0 = r2.A1U
            r3 = 0
            if (r0 == 0) goto L_0x0053
            goto L_0x0052
        L_0x00bc:
            java.lang.String r0 = "x"
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6EB.A03(X.5HJ, java.lang.String, java.lang.String, boolean):void");
    }

    public final void A04(Boolean bool, String str, String str2, String str3, boolean z, boolean z2) {
        boolean z3 = false;
        String str4 = str;
        if (str4.length() != 0) {
            Boolean bool2 = bool;
            if (0qQ.A0K(bool2, true) || 00l.A0d(str4, "ig_advanced_crypto_transport", false) || 00l.A0d(str4, "is_vanish_mode", false)) {
                Uri A03 = 0cp.A03(str4);
                0qQ.A07(A03);
                String queryParameter = A03.getQueryParameter("x");
                String queryParameter2 = A03.getQueryParameter("is_vanish_mode");
                if (queryParameter2 != null) {
                    z3 = Boolean.parseBoolean(queryParameter2);
                }
                C268194cw r4 = new C268194cw(C269474fB.A00);
                r4.A0F("is_vanish_mode", z3);
                A02(r4, bool2, Boolean.valueOf(z2), Boolean.valueOf(z3), (Integer) null, str2, queryParameter, (String) null, str3, (String) null, z);
            }
        }
    }
}
