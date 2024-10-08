package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.List;

/* renamed from: X.OdR  reason: case insensitive filesystem */
public abstract class C71128OdR {
    public static void A01(Activity activity, AnonymousClass0iw r5, UserSession userSession, C70453O7e o7e, C14068TpH tpH, C16677UzD uzD, C74489Pvj pvj, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3) {
        String str8;
        0nA.A0J(activity);
        UserSession userSession2 = userSession;
        C71093OcF A01 = ORV.A01(activity, r5, userSession2, tpH, uzD, str3);
        A01.A01 = DbV.A0j(userSession2, str);
        A01.A07(pvj);
        A01.A0G = z;
        A01.A0F = z2;
        A01.A07 = str2;
        A01.A05 = str4;
        A01.A09 = str5;
        A01.A08 = str6;
        A01.A04 = l;
        if (z3) {
            str8 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str8 = null;
        }
        A01.A08("is_edited", str8);
        A01.A08("messages_to_load", str7);
        A01.A0B = list;
        C71093OcF.A00((C331157Pu) null, A01);
        if (o7e != null) {
            o7e.A00.A05.Cyt();
        }
    }

    public static void A04(Activity activity, AnonymousClass0iw r20, UserSession userSession, C14068TpH tpH, C16677UzD uzD, C74489Pvj pvj, String str, String str2, String str3, boolean z, boolean z2) {
        A01(activity, r20, userSession, (C70453O7e) null, tpH, uzD, pvj, (Long) null, str, (String) null, str2, str3, (String) null, (String) null, (String) null, (List) null, z, z2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = X.2L2.A00(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(com.instagram.common.session.UserSession r3, java.lang.String r4) {
        /*
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323311516396605(0x810bdc00002c3d, double:3.03434669298031E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002b
            X.2Dm r2 = X.2L2.A00(r3)
            X.3U9 r0 = X.C66580MXl.A0d(r2, r4)
            if (r0 == 0) goto L_0x002b
            com.instagram.model.direct.DirectThreadKey r1 = r0.BJz()
            r0 = 1
            java.util.ArrayList r0 = r2.Aax(r1, r0)
            int r1 = r0.size()
            java.lang.String r0 = ""
            java.lang.String r0 = X.002.A03(r1, r0)
            return r0
        L_0x002b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71128OdR.A00(com.instagram.common.session.UserSession, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r27 != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.app.Activity r16, X.AnonymousClass0iw r17, com.instagram.common.session.UserSession r18, X.C70453O7e r19, java.lang.Long r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            r12 = r23
            if (r23 != 0) goto L_0x000d
            r2 = 1
            java.lang.String r1 = "Invalid DirectThread"
            java.lang.String r0 = "DirectReportUtil.showReportDirectMessage"
            X.0wb.A04(r1, r0, r2)
            return
        L_0x000d:
            r15 = 0
            r3 = r18
            r18 = r27
            if (r27 != 0) goto L_0x001a
            if (r28 != 0) goto L_0x001a
            java.lang.String r15 = A00(r3, r12)
        L_0x001a:
            r10 = r21
            if (r27 == 0) goto L_0x0059
            java.lang.String r11 = "DUMMY"
        L_0x0020:
            if (r28 == 0) goto L_0x004f
            boolean r0 = A06(r3, r12)
            if (r0 == 0) goto L_0x004c
            X.TpH r5 = X.C14068TpH.IGD_ENCRYPTED_DIRECT_MESSAGE_INSTAMADILLO
        L_0x002a:
            if (r27 == 0) goto L_0x0056
        L_0x002c:
            X.UzD r6 = X.C16677UzD.ENCRYPTED_DIRECT_MESSAGE
        L_0x002e:
            r0 = 0
            X.Nhq r7 = new X.Nhq
            r1 = r16
            r4 = r19
            r7.<init>(r1, r4, r0)
            r16 = 0
            r19 = r29
            r2 = r17
            r8 = r20
            r9 = r22
            r13 = r24
            r14 = r25
            r17 = r26
            A01(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x004c:
            X.TpH r5 = X.C14068TpH.IGD_ENCRYPTED_DIRECT_MESSAGE_VANISH
            goto L_0x002a
        L_0x004f:
            if (r27 == 0) goto L_0x0054
            X.TpH r5 = X.C14068TpH.ENCRYPTED_DIRECT_MESSAGE
            goto L_0x002c
        L_0x0054:
            X.TpH r5 = X.C14068TpH.DIRECT_MESSAGES
        L_0x0056:
            X.UzD r6 = X.C16677UzD.DIRECT_MESSAGE
            goto L_0x002e
        L_0x0059:
            java.lang.String r0 = "_"
            java.lang.String r11 = X.002.A0g(r12, r0, r10)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71128OdR.A02(android.app.Activity, X.0iw, com.instagram.common.session.UserSession, X.O7e, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    public static void A03(Activity activity, AnonymousClass0iw r13, UserSession userSession, DirectPromptTypes directPromptTypes, C14068TpH tpH, C16677UzD uzD, String str, String str2, String str3, String str4) {
        String str5 = str4;
        if (str4 != null) {
            String str6 = str;
            if (str != null) {
                String str7 = str2;
                if (directPromptTypes == DirectPromptTypes.CHALLENGES || str2 != null) {
                    0nA.A0J(activity);
                    C71093OcF A01 = ORV.A01(activity, r13, userSession, tpH, uzD, str6);
                    A01.A0H = true;
                    C16666Uz2 uz2 = C16666Uz2.REPORT_BUTTON;
                    0qQ.A0B(uz2, 0);
                    A01.A02 = uz2;
                    String str8 = str3;
                    A01.A01 = DbV.A0j(userSession, str8);
                    A01.A07(new C48057EUb(activity, 0));
                    A01.A08("responsible_user_id", str8);
                    A01.A08("igd_thread_item_id", str7);
                    A01.A08("igd_thread_id", str5);
                    C71093OcF.A00((C331157Pu) null, A01);
                    return;
                }
            }
        }
        0wb.A04("Invalid DirectThread", "DirectReportUtil.showReportDirectMessage", 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (X.C331077Pk.A02.A03(r7, r18.AiM()) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(android.app.Activity r24, X.AnonymousClass0iw r25, com.instagram.common.session.UserSession r26, X.C74489Pvj r27, java.lang.String r28, java.lang.String r29, int r30, boolean r31, boolean r32, boolean r33) {
        /*
            r2 = r29
            if (r29 == 0) goto L_0x0062
            X.0Tu r3 = X.0Tu.A06
            r7 = r26
            r22 = r32
            if (r32 == 0) goto L_0x0063
            r0 = 36316993619563247(0x81061d000112ef, double:3.030351229582766E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 != 0) goto L_0x006e
        L_0x0017:
            r23 = 0
        L_0x0019:
            X.3U9 r18 = X.C66582MXn.A0b(r7, r2)
            r5 = r24
            r6 = r25
            r11 = r27
            r13 = r28
            if (r18 == 0) goto L_0x0071
            r0 = 4
            r1 = r30
            if (r1 == r0) goto L_0x003a
            if (r33 != 0) goto L_0x003a
            X.3Tu r1 = r18.AiM()
            X.7Pi r0 = X.C331077Pk.A02
            boolean r0 = r0.A03(r7, r1)
            if (r0 == 0) goto L_0x0071
        L_0x003a:
            java.lang.String r4 = r18.C6C()
            r4.getClass()
            X.Pdu r3 = new X.Pdu
            r14 = r3
            r15 = r5
            r16 = r6
            r17 = r7
            r19 = r11
            r20 = r13
            r21 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            X.0nO r1 = X.0nY.A00()
            X.0qQ.A07(r1)
            X.NSP r0 = new X.NSP
            r0.<init>(r7, r4, r2, r3)
            r1.ATE(r0)
        L_0x0062:
            return
        L_0x0063:
            r0 = 36316993619497710(0x81061d000012ee, double:3.03035122954132E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 == 0) goto L_0x0017
        L_0x006e:
            r23 = 1
            goto L_0x0019
        L_0x0071:
            r19 = 0
            if (r32 != 0) goto L_0x0079
            java.lang.String r19 = A00(r7, r2)
        L_0x0079:
            r8 = 0
            if (r23 == 0) goto L_0x009f
            java.lang.String r0 = "_"
            java.lang.String r15 = X.002.A0g(r2, r0, r13)
        L_0x0082:
            if (r32 == 0) goto L_0x009a
            X.TpH r9 = X.C14068TpH.IG_DIRECT_ENCRYPTED_THREAD
            X.UzD r10 = X.C16677UzD.ENCRYPTED_DIRECT_MESSAGE
        L_0x0088:
            r23 = 0
            r21 = r31
            r12 = r8
            r14 = r8
            r17 = r8
            r18 = r8
            r20 = r8
            r16 = r2
            A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x009a:
            X.TpH r9 = X.C14068TpH.DIRECT_THREAD
            X.UzD r10 = X.C16677UzD.DIRECT_MESSAGE_THREAD
            goto L_0x0088
        L_0x009f:
            r15 = r2
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71128OdR.A05(android.app.Activity, X.0iw, com.instagram.common.session.UserSession, X.Pvj, java.lang.String, java.lang.String, int, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 2342161901218306779L) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36318892000680622L) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(com.instagram.common.session.UserSession r6, java.lang.String r7) {
        /*
            X.3U9 r5 = X.C66582MXn.A0b(r6, r7)
            r4 = 0
            if (r5 == 0) goto L_0x0051
            X.C331057Pi.A00(r6)
            X.3Tu r0 = r5.AiM()
            boolean r0 = X.C331057Pi.A02(r0)
            if (r0 == 0) goto L_0x0022
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318892000680622(0x8107d700561aae, double:3.031551773445561E-306)
            boolean r1 = X.182.A06(r2, r6, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            X.3Tu r0 = r5.AiM()
            boolean r0 = X.C331057Pi.A01(r6, r0)
            if (r0 == 0) goto L_0x003f
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342161901218306779(0x208107d700921adb, double:4.06464639413767E-152)
            boolean r1 = X.182.A06(r2, r6, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.booleanValue()
            if (r0 != 0) goto L_0x0050
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x0051
        L_0x0050:
            r4 = 1
        L_0x0051:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71128OdR.A06(com.instagram.common.session.UserSession, java.lang.String):boolean");
    }
}
