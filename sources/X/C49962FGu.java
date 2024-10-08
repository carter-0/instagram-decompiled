package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.FGu  reason: case insensitive filesystem */
public final class C49962FGu {
    public static final C49962FGu A00 = new Object();

    public static final void A05(UserSession userSession, C49936FFp fFp, String str, boolean z) {
        String str2;
        UserSession userSession2 = userSession;
        C49936FFp fFp2 = fFp;
        String str3 = str;
        DbZ.A0t(0, userSession2, str3, fFp2);
        String str4 = fFp2.A09;
        0qQ.A07(str4);
        boolean z2 = z;
        if (z) {
            str2 = "block_cancel";
        } else {
            str2 = "unblock_cancel";
        }
        A04(userSession2, fFp2, str4, str2, str3);
        F1O f1o = C49279EsO.A00;
        0xG A002 = C49936FFp.A00(fFp2);
        int i = fFp2.A00;
        String str5 = fFp2.A0A;
        0qQ.A07(str5);
        String str6 = fFp2.A07;
        0qQ.A07(str6);
        f1o.A00(fFp2.A01, fFp2.A02, A002, userSession2, (Integer) null, "cancelled", str3, str5, str6, fFp2.A0B, i, z2);
        if (C49936FFp.A01(fFp2)) {
            0xG A003 = C49936FFp.A00(fFp2);
            int i2 = fFp2.A00;
            C49760F5m.A00(C48137EZf.valueOf(fFp2.A05), EZZ.valueOf(fFp2.A06), A003, userSession2, str3, fFp2.A0A, A00(fFp2), 4, i2, z);
        }
    }

    public static final void A06(UserSession userSession, C49936FFp fFp, String str, boolean z) {
        String str2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        C49936FFp fFp2 = fFp;
        String str3 = str;
        AnonymousClass7TF.A1C(str3, 2, fFp2);
        String str4 = fFp2.A09;
        0qQ.A07(str4);
        boolean z2 = z;
        if (z) {
            str2 = "block_tap";
        } else {
            str2 = "unblock_tap";
        }
        A04(userSession2, fFp2, str4, str2, str3);
        F1O f1o = C49279EsO.A00;
        0xG A002 = C49936FFp.A00(fFp2);
        int i = fFp2.A00;
        String str5 = fFp2.A0A;
        0qQ.A07(str5);
        String str6 = fFp2.A07;
        0qQ.A07(str6);
        f1o.A00(fFp2.A01, fFp2.A02, A002, userSession2, (Integer) null, "tapped", str3, str5, str6, fFp2.A0B, i, z2);
        if (C49936FFp.A01(fFp2)) {
            0xG A003 = C49936FFp.A00(fFp2);
            int i2 = fFp2.A00;
            C49760F5m.A00(C48137EZf.valueOf(fFp2.A05), EZZ.valueOf(fFp2.A06), A003, userSession2, str3, fFp2.A0A, A00(fFp2), 2, i2, z);
        }
    }

    public static final ImmutableMap A00(C49936FFp fFp) {
        String str;
        String str2;
        String str3 = fFp.A0B;
        Boolean bool = fFp.A04;
        Boolean bool2 = fFp.A03;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        if (str3 != null) {
            builder.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "pending";
            } else {
                str2 = "inbox";
            }
            builder.put("folder", str2);
        }
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                str = "group_thread";
            } else {
                str = "one_on_one_thread";
            }
            builder.put(AnonymousClass000.A00(380), str);
        }
        ImmutableMap build = builder.build();
        0qQ.A07(build);
        return build;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r3 == 2) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.common.session.UserSession r21, X.C49936FFp r22, java.lang.String r23, int r24) {
        /*
            r0 = r22
            java.lang.String r2 = r0.A09
            X.0qQ.A07(r2)
            r3 = r24
            if (r24 == 0) goto L_0x0070
            r1 = 2
            if (r3 == r1) goto L_0x006d
            java.lang.String r1 = "unblock_confirm"
        L_0x0010:
            r6 = r21
            r9 = r23
            A04(r6, r0, r2, r1, r9)
            X.F1O r2 = X.C49279EsO.A00
            if (r24 == 0) goto L_0x001f
            r1 = 2
            r14 = 0
            if (r3 != r1) goto L_0x0020
        L_0x001f:
            r14 = 1
        L_0x0020:
            X.0xG r5 = X.C49936FFp.A00(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            int r13 = r0.A00
            java.lang.String r10 = r0.A0A
            X.0qQ.A07(r10)
            java.lang.String r11 = r0.A07
            X.0qQ.A07(r11)
            java.lang.String r12 = r0.A0B
            X.76k r3 = r0.A01
            X.Nlp r4 = r0.A02
            java.lang.String r8 = "confirmed"
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = X.C49936FFp.A01(r0)
            if (r1 == 0) goto L_0x006c
            X.0xG r17 = X.C49936FFp.A00(r0)
            r22 = 3
            int r3 = r0.A00
            java.lang.String r2 = r0.A0A
            java.lang.String r1 = r0.A05
            X.EZf r15 = X.C48137EZf.valueOf(r1)
            java.lang.String r1 = r0.A06
            X.EZZ r16 = X.EZZ.valueOf(r1)
            com.google.common.collect.ImmutableMap r21 = A00(r0)
            r18 = r6
            r19 = r9
            r20 = r2
            r23 = r3
            r24 = r14
            X.C49760F5m.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r1 = "multi_block_confirmed"
            goto L_0x0010
        L_0x0070:
            java.lang.String r1 = "block_confirm"
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49962FGu.A01(com.instagram.common.session.UserSession, X.FFp, java.lang.String, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r3 == 2) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.instagram.common.session.UserSession r21, X.C49936FFp r22, java.lang.String r23, int r24) {
        /*
            r0 = r22
            java.lang.String r2 = r0.A09
            X.0qQ.A07(r2)
            r3 = r24
            if (r24 == 0) goto L_0x0070
            r1 = 2
            if (r3 == r1) goto L_0x006d
            java.lang.String r1 = "unblock_fail"
        L_0x0010:
            r6 = r21
            r9 = r23
            A04(r6, r0, r2, r1, r9)
            X.F1O r2 = X.C49279EsO.A00
            if (r24 == 0) goto L_0x001f
            r1 = 2
            r14 = 0
            if (r3 != r1) goto L_0x0020
        L_0x001f:
            r14 = 1
        L_0x0020:
            X.0xG r5 = X.C49936FFp.A00(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            int r13 = r0.A00
            java.lang.String r10 = r0.A0A
            X.0qQ.A07(r10)
            java.lang.String r11 = r0.A07
            X.0qQ.A07(r11)
            java.lang.String r12 = r0.A0B
            X.76k r3 = r0.A01
            X.Nlp r4 = r0.A02
            java.lang.String r8 = "failed"
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = X.C49936FFp.A01(r0)
            if (r1 == 0) goto L_0x006c
            X.0xG r17 = X.C49936FFp.A00(r0)
            r22 = 6
            int r3 = r0.A00
            java.lang.String r2 = r0.A0A
            java.lang.String r1 = r0.A05
            X.EZf r15 = X.C48137EZf.valueOf(r1)
            java.lang.String r1 = r0.A06
            X.EZZ r16 = X.EZZ.valueOf(r1)
            com.google.common.collect.ImmutableMap r21 = A00(r0)
            r18 = r6
            r19 = r9
            r20 = r2
            r23 = r3
            r24 = r14
            X.C49760F5m.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r1 = "multi_block_failed"
            goto L_0x0010
        L_0x0070:
            java.lang.String r1 = "block_fail"
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49962FGu.A02(com.instagram.common.session.UserSession, X.FFp, java.lang.String, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r3 == 2) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.common.session.UserSession r21, X.C49936FFp r22, java.lang.String r23, int r24) {
        /*
            r0 = r22
            java.lang.String r2 = r0.A09
            X.0qQ.A07(r2)
            r3 = r24
            if (r24 == 0) goto L_0x0070
            r1 = 2
            if (r3 == r1) goto L_0x006d
            java.lang.String r1 = "unblock"
        L_0x0010:
            r6 = r21
            r9 = r23
            A04(r6, r0, r2, r1, r9)
            X.F1O r2 = X.C49279EsO.A00
            if (r24 == 0) goto L_0x001f
            r1 = 2
            r14 = 0
            if (r3 != r1) goto L_0x0020
        L_0x001f:
            r14 = 1
        L_0x0020:
            X.0xG r5 = X.C49936FFp.A00(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            int r13 = r0.A00
            java.lang.String r10 = r0.A0A
            X.0qQ.A07(r10)
            java.lang.String r11 = r0.A07
            X.0qQ.A07(r11)
            java.lang.String r12 = r0.A0B
            X.76k r3 = r0.A01
            X.Nlp r4 = r0.A02
            java.lang.String r8 = "succeeded"
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = X.C49936FFp.A01(r0)
            if (r1 == 0) goto L_0x006c
            X.0xG r17 = X.C49936FFp.A00(r0)
            r22 = 5
            int r3 = r0.A00
            java.lang.String r2 = r0.A0A
            java.lang.String r1 = r0.A05
            X.EZf r15 = X.C48137EZf.valueOf(r1)
            java.lang.String r1 = r0.A06
            X.EZZ r16 = X.EZZ.valueOf(r1)
            com.google.common.collect.ImmutableMap r21 = A00(r0)
            r18 = r6
            r19 = r9
            r20 = r2
            r23 = r3
            r24 = r14
            X.C49760F5m.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r1 = "multi_block_succeeded"
            goto L_0x0010
        L_0x0070:
            java.lang.String r1 = "block"
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49962FGu.A03(com.instagram.common.session.UserSession, X.FFp, java.lang.String, int):void");
    }

    public static void A04(UserSession userSession, C49936FFp fFp, String str, String str2, String str3) {
        FollowStatus valueOf = FollowStatus.valueOf(fFp.A08);
        0qQ.A07(valueOf);
        C319986rY A01 = C319976rX.A01(valueOf);
        String str4 = fFp.A07;
        String str5 = fFp.A0B;
        int i = fFp.A00;
        C319976rX.A03(fFp.A01, fFp.A02, userSession, A01, str, str2, str3, str4, str5, fFp.A0A, i);
    }
}
