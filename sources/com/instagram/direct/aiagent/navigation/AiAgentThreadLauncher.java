package com.instagram.direct.aiagent.navigation;

import X.00k;
import X.0Tu;
import X.0qQ;
import X.182;
import X.1Au;
import X.1Av;
import X.1ES;
import X.1OC;
import X.1pE;
import X.2Dm;
import X.2Er;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fN;
import X.AnonymousClass0iw;
import X.AnonymousClass3U9;
import X.AnonymousClass6ST;
import X.AnonymousClass6W4;
import X.AnonymousClass7I6;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass9B8;
import X.C273414mX;
import X.C291175gg;
import X.C3262475z;
import X.C49909FEh;
import X.C50351FZi;
import X.C51869G5g;
import X.C68112N1a;
import X.C73661Pha;
import X.DbS;
import X.DbV;
import X.DbW;
import X.DbZ;
import X.EDL;
import X.F3E;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.launcher.AutoSendMessageData;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collection;
import java.util.List;

public final class AiAgentThreadLauncher {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = DbW.A0p(this, 10);
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C73661Pha(this, 12));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C73661Pha(this, 13));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C73661Pha(this, 11));

    public AiAgentThreadLauncher(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r46 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r42 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r1 == 0) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(androidx.fragment.app.FragmentActivity r38, X.C68112N1a r39, X.AnonymousClass0iw r40, X.C51869G5g r41, X.2Eq r42, X.C254783t2 r43, X.C273414mX r44, java.lang.String r45, java.lang.String r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51) {
        /*
            r37 = this;
            r4 = 0
            r12 = 0
            r3 = r37
            r10 = r45
            r2 = r46
            if (r51 == 0) goto L_0x0033
            if (r46 == 0) goto L_0x0042
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0035
            java.lang.String r9 = X.DbV.A0s()
            java.lang.String r7 = X.DbV.A0s()
            r0 = r39
            if (r39 == 0) goto L_0x0045
            org.json.JSONObject r5 = r0.A00
            java.lang.String r1 = "qpl_join_id"
            if (r7 != 0) goto L_0x002a
            java.lang.Object r0 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x002d }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x002d }
            goto L_0x002d
        L_0x002a:
            r5.put(r1, r7)     // Catch:{ JSONException -> 0x002d }
        L_0x002d:
            X.N1a r6 = new X.N1a
            r6.<init>(r5)
            goto L_0x004d
        L_0x0033:
            if (r46 == 0) goto L_0x0042
        L_0x0035:
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0042
            com.instagram.direct.model.launcher.AutoSendMessageData r1 = new com.instagram.direct.model.launcher.AutoSendMessageData
            r1.<init>(r2, r12, r12)
            goto L_0x00f4
        L_0x0042:
            r1 = r12
            goto L_0x00f4
        L_0x0045:
            com.instagram.common.session.UserSession r1 = r3.A00
            X.HNL r0 = X.HNL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            X.N1a r6 = X.C70892OQk.A00(r0, r12, r1, r12, r7)
        L_0x004d:
            org.json.JSONObject r0 = r6.A00
            java.lang.String r8 = r0.toString()
            X.0eM r0 = r3.A01
            java.lang.Object r5 = r0.getValue()
            X.5D7 r5 = (X.AnonymousClass5D7) r5
            if (r42 == 0) goto L_0x0063
            java.lang.String r18 = r42.C6C()
            if (r18 != 0) goto L_0x0067
        L_0x0063:
            java.lang.String r18 = ""
            if (r42 == 0) goto L_0x0074
        L_0x0067:
            java.lang.String r0 = r42.C6C()
            if (r0 == 0) goto L_0x0074
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0075
        L_0x0074:
            r0 = 1
        L_0x0075:
            java.lang.Boolean r15 = X.DbT.A0l(r0)
            r21 = 1
            X.HNL r1 = X.HNL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "prompt_type"
            java.lang.Enum r0 = r6.A04(r0, r1)
            X.HNL r0 = (X.HNL) r0
            if (r0 != 0) goto L_0x0088
            r0 = r1
        L_0x0088:
            r16 = r12
            r20 = r7
            r22 = r4
            r13 = r5
            r14 = r0
            r17 = r9
            r19 = r10
            r13.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r42 == 0) goto L_0x01ae
            com.instagram.model.direct.DirectThreadKey r0 = r42.BJy()
            java.lang.String r5 = r0.A00
            if (r5 == 0) goto L_0x01ae
            com.instagram.common.session.UserSession r7 = r3.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36329440434733181(0x81116f0000407d, double:3.038222645615534E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x01ae
            X.7Zi r11 = X.C333527Zh.A00(r7)
            X.3t0 r0 = new X.3t0
            r0.<init>(r5)
            java.lang.String r27 = X.AnonymousClass7L6.A00(r10)
            X.2FW r17 = X.2FW.A1g
            java.lang.String r26 = "none"
            r13 = r12
            r14 = r12
            r15 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r12
            r24 = r12
            r25 = r2
            r28 = r12
            r29 = r12
            r30 = r9
            r31 = r8
            r32 = r12
            r33 = r4
            r34 = r4
            r35 = r4
            r36 = r4
            r18 = r0
            X.1aU r1 = r11.EMs(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.FYU r0 = new X.FYU
            r0.<init>()
            r1.A0V(r0)
            r1 = r12
            r4 = 1
        L_0x00f4:
            com.instagram.common.session.UserSession r6 = r3.A00
            r3 = r38
            r0 = r40
            X.1pE r5 = X.1pE.A01(r3, r0, r6, r10)
            r2 = r43
            r5.A0B = r2
            r0 = 1012(0x3f4, float:1.418E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0H = r0
            r5.A07 = r1
            r0 = r47
            r5.A10 = r0
            r5.A0r = r4
            r0 = r44
            if (r44 == 0) goto L_0x0118
            r5.A0D = r0
        L_0x0118:
            r0 = r41
            if (r41 == 0) goto L_0x011e
            r5.A06 = r0
        L_0x011e:
            r0 = 15739(0x3d7b, float:2.2055E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0F = r0
            if (r48 == 0) goto L_0x015c
            r4 = 0
            X.0Tu r2 = X.0Tu.A05
            r0 = 37169256865071591(0x840d3e000201e7, double:3.569325937830877E-306)
            double r0 = X.182.A00(r2, r6, r0)
            float r2 = (float) r0
            X.3t2 r1 = r5.A0B
            java.lang.String r0 = "Missing ThreadTarget"
            X.17k.A07(r1, r0)
            r0 = 1
            X.6W8 r1 = X.1pE.A02(r5, r1, r2, r4, r0)
            int[] r0 = com.instagram.modal.ModalActivity.A08
            r1.A0J = r0
            java.lang.Integer r0 = r5.A0F
            if (r0 == 0) goto L_0x0158
            int r0 = r0.intValue()
            r1.A0A(r3, r0)
        L_0x0150:
            X.G5g r0 = r5.A06
            if (r0 == 0) goto L_0x0157
            r0.DrE()
        L_0x0157:
            return
        L_0x0158:
            r1.A0C(r3)
            goto L_0x0150
        L_0x015c:
            if (r49 == 0) goto L_0x0168
            X.4me r0 = r5.A05(r3, r2)
            if (r0 == 0) goto L_0x0157
            X.DbZ.A18(r0, r3, r6)
            return
        L_0x0168:
            if (r50 == 0) goto L_0x01b5
            r8 = 0
            X.0Tu r2 = X.0Tu.A05
            r0 = 37169256865071591(0x840d3e000201e7, double:3.569325937830877E-306)
            double r0 = X.182.A00(r2, r6, r0)
            float r7 = (float) r0
            X.37D r0 = X.DbT.A0i(r3)
            X.7Pu r6 = X.C48943Emh.A00(r0)
            if (r6 == 0) goto L_0x0157
            X.4me r4 = new X.4me
            r4.<init>()
            X.3t2 r1 = r5.A0B
            java.lang.String r0 = "Missing ThreadTarget"
            X.17k.A07(r1, r0)
            r3 = 1
            android.os.Bundle r2 = X.1pE.A00(r5, r1, r8, r3)
            com.instagram.common.session.UserSession r0 = r5.A16
            X.7Pr r1 = X.C69861NtP.A00(r0)
            r1.A1I = r3
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a7
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01a7
            r1.A03 = r7
        L_0x01a7:
            r4.setArguments(r2)
            r6.A0E(r4, r1)
            goto L_0x0150
        L_0x01ae:
            com.instagram.direct.model.launcher.AutoSendMessageData r1 = new com.instagram.direct.model.launcher.AutoSendMessageData
            r1.<init>(r2, r9, r8)
            goto L_0x00f4
        L_0x01b5:
            X.DbV.A1R(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher.A01(androidx.fragment.app.FragmentActivity, X.N1a, X.0iw, X.G5g, X.2Eq, X.3t2, X.4mX, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void A05(Activity activity, AnonymousClass0iw r12, ImageUrl imageUrl, String str, String str2, String str3, String str4) {
        0qQ.A0B(activity, 0);
        AnonymousClass7TG.A1U(r12, str, imageUrl);
        String str5 = str3;
        0qQ.A0B(str5, 5);
        A06(activity, r12, imageUrl, str, str2, str5, (String) null, str4, (String) null);
    }

    public final void A09(Activity activity, String str, String str2) {
        0qQ.A0B(str2, 1);
        UserSession userSession = this.A00;
        1Au.A00(userSession).A13("has_initiated_chat_with_agent", true);
        AnonymousClass7I6 r3 = (AnonymousClass7I6) this.A02.getValue();
        r3.A06.markerPoint(AnonymousClass7I6.A00(r3), "create_server_thread_start");
        String str3 = r3.A01;
        1OC A0D = DirectThreadApi.A0D(userSession, DbV.A0s(), str, AnonymousClass7TE.A1I(str2));
        A0D.A00 = new EDL(activity, this, str3, 2);
        1ES.A05(A0D, 315964894, 2, true, false);
    }

    public final boolean A0A(FragmentActivity fragmentActivity, C68112N1a n1a, AnonymousClass0iw r27, C51869G5g g5g, DirectShareTarget directShareTarget, C273414mX r30, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3;
        boolean z5;
        PendingRecipient pendingRecipient;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity2, 0);
        DirectShareTarget directShareTarget2 = directShareTarget;
        String str4 = str;
        AnonymousClass7TF.A1B(directShareTarget2, 1, str4);
        UserSession userSession = this.A00;
        if (!AnonymousClass9B8.A07(userSession) || (str3 = ((PendingRecipient) 00k.A0I(DbW.A0m(directShareTarget2))).A0B) == null) {
            return false;
        }
        String str5 = ((PendingRecipient) 00k.A0I(DbW.A0m(directShareTarget2))).A0A;
        AnonymousClass3U9 C5z = ((2Dm) this.A03.getValue()).C5z(directShareTarget2.A00());
        if (C5z == null || (((C5z instanceof 2Er) && !C5z.BBQ()) || (182.A06(0Tu.A05, userSession, 36329440434798718L) && C5z.C6C() == null))) {
            if (!A02() || (pendingRecipient = (PendingRecipient) 00k.A0J(DbW.A0m(directShareTarget2))) == null || !pendingRecipient.A0X) {
                A09((Activity) null, str5, str3);
            } else {
                z5 = false;
                String str6 = str4;
                A01(fragmentActivity2, n1a, r27, g5g, C5z, DbS.A0c(directShareTarget2), r30, str6, str2, z2, z, z3, z4, z5);
                return true;
            }
        }
        z5 = true;
        String str62 = str4;
        A01(fragmentActivity2, n1a, r27, g5g, C5z, DbS.A0c(directShareTarget2), r30, str62, str2, z2, z, z3, z4, z5);
        return true;
    }

    public final boolean A0B(FragmentActivity fragmentActivity, C68112N1a n1a, AnonymousClass0iw r31, C51869G5g g5g, DirectShareTarget directShareTarget, C273414mX r34, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        PendingRecipient pendingRecipient;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity2, 0);
        UserSession userSession = this.A00;
        String A002 = C3262475z.A00(userSession);
        C68112N1a n1a2 = n1a;
        AnonymousClass0iw r11 = r31;
        C51869G5g g5g2 = g5g;
        DirectShareTarget directShareTarget2 = directShareTarget;
        C273414mX r15 = r34;
        String str3 = str;
        String str4 = str2;
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z4;
        if (directShareTarget != null) {
            return A0A(fragmentActivity2, n1a2, r11, g5g2, directShareTarget2, r15, str3, str4, z6, z7, z8, z9);
        }
        if (!AnonymousClass9B8.A07(userSession)) {
            return false;
        }
        C291175gg A003 = A00(DbS.A0V(""), A002, "", false, false, false);
        List list = A003.A00;
        AnonymousClass3U9 C5z = ((2Dm) this.A03.getValue()).C5z(new DirectThreadKey((Collection) list));
        if (C5z == null || (182.A06(0Tu.A05, userSession, 36329440434798718L) && C5z.C6C() == null)) {
            if (!A02() || (pendingRecipient = (PendingRecipient) 00k.A0J(list)) == null || !pendingRecipient.A0X) {
                A09(fragmentActivity2, (String) null, A002);
            } else {
                z5 = false;
                A01(fragmentActivity2, n1a2, r11, g5g2, C5z, A003, r15, str3, str4, z7, z6, z8, z9, z5);
                return true;
            }
        }
        z5 = true;
        A01(fragmentActivity2, n1a2, r11, g5g2, C5z, A003, r15, str3, str4, z7, z6, z8, z9, z5);
        return true;
    }

    public static final C291175gg A00(ImageUrl imageUrl, String str, String str2, boolean z, boolean z2, boolean z3) {
        PendingRecipient pendingRecipient = new PendingRecipient(imageUrl, str, str2);
        pendingRecipient.A0H = !z3;
        pendingRecipient.A0b = z2;
        pendingRecipient.A0F = z;
        pendingRecipient.A0M = z3;
        return new C291175gg(AnonymousClass7TE.A1I(pendingRecipient));
    }

    private final boolean A02() {
        UserSession userSession = this.A00;
        1Av A002 = 1Au.A00(userSession);
        0qQ.A0B("meta_ai_in_thread_blocking_nux", 0);
        if (A002.A01.getBoolean("meta_ai_in_thread_blocking_nux", false) || !182.A06(0Tu.A05, userSession, 36320438185632202L)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.JUI, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(android.app.Activity r24, X.AnonymousClass0iw r25, java.lang.String r26, java.lang.String r27, X.AnonymousClass4D7 r28) {
        /*
            r23 = this;
            r0 = r24
            r1 = r25
            r2 = r27
            r4 = 0
            r6 = 1
            r10 = r28
            boolean r3 = X.JUI.A01(r6, r10)
            r7 = r23
            if (r3 == 0) goto L_0x0106
            r5 = r10
            X.JUI r5 = (X.JUI) r5
            int r9 = r5.A00
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r9 & r8
            if (r3 == 0) goto L_0x0106
            int r9 = r9 - r8
            r5.A00 = r9
        L_0x0020:
            java.lang.Object r11 = r5.A05
            X.1Hj r3 = X.1Hj.A02
            int r8 = r5.A00
            if (r8 == 0) goto L_0x00ac
            if (r8 != r6) goto L_0x0112
            boolean r9 = r5.A06
            java.lang.Object r2 = r5.A04
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r5.A03
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.Object r0 = r5.A02
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r10 = r5.A01
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r10 = (com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher) r10
            X.0eS.A00(r11)
        L_0x003f:
            X.3Ii r11 = (X.C239803Ii) r11
            boolean r3 = r11 instanceof X.C239793Ih
            java.lang.String r6 = "unknown_error_occured"
            if (r3 == 0) goto L_0x00a3
            X.3Ih r11 = (X.C239793Ih) r11
            java.lang.Object r3 = r11.A00
            X.3JD r3 = (X.AnonymousClass3JD) r3
            if (r3 == 0) goto L_0x009b
            java.lang.Object r3 = r3.Bny()
            X.C82 r3 = (X.C82) r3
            if (r3 == 0) goto L_0x009b
            X.C81 r8 = r3.A0E()
            if (r8 == 0) goto L_0x009b
            java.lang.Class<X.C8R> r7 = X.C8R.class
            r5 = 2
            r3 = -612162544(0xffffffffdb832410, float:-7.3825746E16)
            X.3lr r3 = r8.reinterpretRequired(r5, r7, r3)
            X.C8R r3 = (X.C8R) r3
            if (r3 == 0) goto L_0x009b
            X.BuN r5 = r3.A0F()
            if (r5 == 0) goto L_0x009b
            java.lang.String r3 = "bot_id"
            java.lang.String r13 = r5.getOptionalStringField(r4, r3)
            if (r13 == 0) goto L_0x009b
            r15 = 0
            r11 = r0
            r12 = r1
            r14 = r2
            r16 = r15
            r17 = r9
            r10.A08(r11, r12, r13, r14, r15, r16, r17)
            X.0gF r1 = X.C60340gF.A00
        L_0x0086:
            X.3Ih r11 = X.C41845B3m.A0d(r1)
        L_0x008a:
            boolean r1 = r11 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0098
            boolean r1 = r11 instanceof X.C297815sO
            if (r1 == 0) goto L_0x010d
            r1 = 2131955061(0x7f130d75, float:1.9546639E38)
            X.C59689JTv.A01(r0, r6, r1, r4)
        L_0x0098:
            X.0gF r3 = X.C60340gF.A00
        L_0x009a:
            return r3
        L_0x009b:
            r1 = 2131955061(0x7f130d75, float:1.9546639E38)
            android.widget.Toast r1 = X.C59689JTv.A01(r0, r6, r1, r4)
            goto L_0x0086
        L_0x00a3:
            boolean r1 = r11 instanceof X.C297815sO
            if (r1 != 0) goto L_0x008a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ac:
            X.0eS.A00(r11)
            com.instagram.common.session.UserSession r8 = r7.A00
            X.1vn r8 = X.1vm.A01(r8)
            r18 = 0
            X.2IS r11 = X.C41845B3m.A04()
            X.2IS r10 = X.C41845B3m.A04()
            java.lang.String r9 = "persona_id"
            r12 = r26
            boolean r9 = X.C41848B3p.A1Z(r11, r9, r12)
            X.1vR r12 = X.C41845B3m.A06(r9)
            java.util.Map r14 = r11.getParamsCopy()
            java.util.Map r15 = r10.getParamsCopy()
            java.lang.Class<X.C82> r16 = X.C82.class
            java.util.ArrayList r22 = X.AnonymousClass7TE.A1C()
            r9 = 204(0xcc, float:2.86E-43)
            java.lang.String r13 = X.AnonymousClass000.A00(r9)
            r9 = 394(0x18a, float:5.52E-43)
            java.lang.String r21 = X.AnonymousClass000.A00(r9)
            com.facebook.pando.PandoGraphQLRequest r11 = new com.facebook.pando.PandoGraphQLRequest
            r19 = r4
            r20 = r18
            r17 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r5.A01 = r7
            r5.A02 = r0
            r5.A03 = r1
            r5.A04 = r2
            r5.A06 = r4
            r5.A00 = r6
            java.lang.Object r11 = r8.A04(r11, r5)
            if (r11 == r3) goto L_0x009a
            r10 = r7
            r9 = 0
            goto L_0x003f
        L_0x0106:
            X.JUI r5 = new X.JUI
            r5.<init>(r7, r10, r6)
            goto L_0x0020
        L_0x010d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0112:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher.A03(android.app.Activity, X.0iw, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public final void A04(Activity activity, AnonymousClass0iw r15, ImageUrl imageUrl, String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        AnonymousClass7TF.A1D(str5, 3, str6);
        UserSession userSession = this.A00;
        if (0qQ.A0K(userSession.A06, str5)) {
            AnonymousClass6ST r3 = new AnonymousClass6ST(activity, true);
            AnonymousClass0fN.A00(r3);
            new F3E(activity, userSession).A00(r15, new C50351FZi(r3, 2), str5);
            return;
        }
        C291175gg A002 = A00(imageUrl, str5, str6, false, false, true);
        AnonymousClass3U9 B33 = ((2Dm) this.A03.getValue()).B33(AnonymousClass6W4.A01(A002));
        if (B33 == null || (182.A06(0Tu.A05, userSession, 36329440434798718L) && B33.C6C() == null)) {
            A09(activity, str6, str5);
        }
        if (str == null) {
            str4 = "direct_thread";
        }
        1pE A012 = 1pE.A01(activity, r15, userSession, str4);
        A012.A0B = A002;
        A012.A0H = 1003;
        A012.A0v = true;
        A012.A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        if (r25 != null) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(android.app.Activity r21, X.AnonymousClass0iw r22, com.instagram.common.typedurl.ImageUrl r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            r20 = this;
            r9 = r28
            r11 = 0
            r0 = 2
            r13 = r24
            r12 = r26
            X.DbW.A1N(r13, r0, r12)
            com.instagram.common.typedurl.SimpleImageUrl r14 = new com.instagram.common.typedurl.SimpleImageUrl
            r0 = r23
            r14.<init>(r0)
            r6 = 0
            r18 = r11
            r19 = r11
            r17 = r11
            r15 = r12
            r16 = r13
            X.5gg r8 = A00(r14, r15, r16, r17, r18, r19)
            r10 = r20
            X.0eM r0 = r10.A03
            java.lang.Object r1 = r0.getValue()
            X.2Dm r1 = (X.2Dm) r1
            com.instagram.model.direct.DirectThreadKey r0 = X.AnonymousClass6W4.A01(r8)
            X.3U9 r0 = r1.B33(r0)
            r7 = 0
            if (r0 == 0) goto L_0x00d8
            com.instagram.model.direct.DirectThreadKey r0 = r0.BJz()
        L_0x0039:
            r5 = 1
            boolean r16 = X.DbW.A1a(r0)
            X.0eM r0 = r10.A02
            r17 = r0
            java.lang.Object r14 = r17.getValue()
            X.7I6 r14 = (X.AnonymousClass7I6) r14
            if (r28 != 0) goto L_0x00d5
            java.lang.String r4 = ""
        L_0x004c:
            r15 = r25
            if (r16 == 0) goto L_0x0053
            r3 = 1
            if (r25 == 0) goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            java.lang.String r0 = r14.A01
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = X.AnonymousClass7TF.A0c()
            r14.A01 = r0
        L_0x005e:
            r2 = 895690478(0x356326ee, float:8.462074E-7)
            if (r3 == 0) goto L_0x0066
            r2 = 895691428(0x35632aa4, float:8.462614E-7)
        L_0x0066:
            X.02m r1 = r14.A06
            r1.markerStart(r2)
            java.lang.String r0 = "entry_point"
            r1.markerAnnotate(r2, r0, r4)
            r14.A05 = r3
            r14.A04 = r11
            r0 = r29
            r14.A02 = r0
            if (r16 == 0) goto L_0x007d
            r10.A09(r6, r13, r12)
        L_0x007d:
            if (r25 == 0) goto L_0x0084
            X.3t0 r8 = new X.3t0
            r8.<init>(r15)
        L_0x0084:
            java.lang.Object r0 = r17.getValue()
            X.7I6 r0 = (X.AnonymousClass7I6) r0
            int r2 = X.AnonymousClass7I6.A00(r0)
            java.lang.String r1 = "navigation_to_thread_start"
            X.02m r0 = r0.A06
            r0.markerPoint(r2, r1)
            com.instagram.common.session.UserSession r4 = r10.A00
            if (r28 != 0) goto L_0x009b
            java.lang.String r9 = "direct_thread"
        L_0x009b:
            r1 = r21
            r0 = r22
            X.1pE r3 = X.1pE.A01(r1, r0, r4, r9)
            r3.A0B = r8
            r0 = 1014(0x3f6, float:1.421E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0H = r0
            r1 = r27
            if (r27 == 0) goto L_0x00bc
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00bc
            com.instagram.direct.model.launcher.AutoSendMessageData r7 = new com.instagram.direct.model.launcher.AutoSendMessageData
            r7.<init>(r1, r6, r6)
        L_0x00bc:
            r3.A07 = r7
            if (r16 == 0) goto L_0x00d3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325145468482184(0x810d8700103288, double:3.0355064916639626E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00d3
        L_0x00cd:
            r3.A0z = r5
            X.DbV.A1R(r3)
            return
        L_0x00d3:
            r5 = 0
            goto L_0x00cd
        L_0x00d5:
            r4 = r9
            goto L_0x004c
        L_0x00d8:
            r0 = r6
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher.A06(android.app.Activity, X.0iw, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void A07(Activity activity, AnonymousClass0iw r4, String str, String str2, String str3, int i, boolean z) {
        UserSession userSession = this.A00;
        if (!AnonymousClass9B8.A07(userSession)) {
            C49909FEh.A00(activity, (String) null);
            return;
        }
        if (str2 == null) {
            str2 = "direct_thread";
        }
        1pE A012 = 1pE.A01(activity, r4, userSession, str2);
        DbZ.A1Z(A012, str);
        A012.A0H = Integer.valueOf(i);
        if (z) {
            A012.A0m = true;
        }
        if (str3 != null) {
            A012.A0i = str3;
        }
        DbV.A1R(A012);
    }

    public final void A08(Activity activity, AnonymousClass0iw r20, String str, String str2, String str3, String str4, boolean z) {
        PendingRecipient pendingRecipient;
        String str5 = str2;
        Activity activity2 = activity;
        0qQ.A0B(activity2, 0);
        String str6 = str;
        AnonymousClass0iw r7 = r20;
        AnonymousClass7TF.A1B(r7, 1, str6);
        UserSession userSession = this.A00;
        AutoSendMessageData autoSendMessageData = null;
        if (!AnonymousClass9B8.A07(userSession)) {
            C49909FEh.A00(activity2, (String) null);
            return;
        }
        C291175gg A002 = A00(DbS.A0V(""), str6, "", false, z, false);
        List list = A002.A00;
        AnonymousClass3U9 C5z = ((2Dm) this.A03.getValue()).C5z(new DirectThreadKey((Collection) list));
        if ((C5z == null || (((C5z instanceof 2Er) && !C5z.BBQ()) || (182.A06(0Tu.A05, userSession, 36329440434798718L) && C5z.C6C() == null))) && (!A02() || (pendingRecipient = (PendingRecipient) 00k.A0J(list)) == null || !pendingRecipient.A0X)) {
            A09((Activity) null, (String) null, str6);
        }
        if (str2 == null) {
            str5 = "direct_thread";
        }
        1pE A012 = 1pE.A01(activity2, r7, userSession, str5);
        A012.A0B = A002;
        A012.A0H = 1012;
        A012.A0i = str3;
        String str7 = str4;
        if (!(str4 == null || str7.length() == 0)) {
            autoSendMessageData = new AutoSendMessageData(str7, (String) null, (String) null);
        }
        A012.A07 = autoSendMessageData;
        A012.A0m = true;
        A012.A0v = true;
        A012.A06();
    }
}
