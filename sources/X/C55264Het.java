package X;

/* renamed from: X.Het  reason: case insensitive filesystem */
public abstract class C55264Het {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0046, code lost:
        if (r0.intValue() != 0) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r28, X.C53372Gmw r29, com.instagram.common.session.UserSession r30, com.instagram.common.typedurl.ImageUrl r31, X.C54588HJx r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36) {
        /*
            r0 = 1
            r15 = r32
            X.0qQ.A0B(r15, r0)
            r2 = 2
            r9 = r30
            r8 = r33
            X.DbW.A1N(r9, r2, r8)
            r0 = 7
            r3 = r35
            X.0qQ.A0B(r3, r0)
            X.8ZA r1 = new X.8ZA
            r1.<init>(r9)
            X.HDv r0 = new X.HDv
            r0.<init>(r9)
            X.Iw1 r0 = X.C58692Iw1.A00(r0, r1, r2)
            X.0t0 r23 = X.AnonymousClass0eN.A01(r0)
            r17 = r28
            r7 = r17
            android.app.Activity r7 = (android.app.Activity) r7
            X.Hzn r6 = new X.Hzn
            r6.<init>(r9)
            X.17i r0 = X.17h.A00(r9)
            com.instagram.user.model.User r28 = r0.A02(r3)
            if (r28 == 0) goto L_0x0048
            java.lang.Integer r0 = r28.Bjj()
            if (r0 == 0) goto L_0x0048
            int r0 = r0.intValue()
            r5 = 1
            if (r0 == 0) goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            r10 = r29
            java.lang.Object r0 = r10.A03
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = X.00k.A0J(r0)
            X.DTC r0 = (X.DTC) r0
            r16 = 0
            if (r0 == 0) goto L_0x0117
            X.DSH r0 = r0.C3S()
            if (r0 == 0) goto L_0x0117
            java.lang.String r4 = r0.BW0()
        L_0x0063:
            boolean r3 = r10.A08
            int r2 = r10.A01
            java.lang.String r1 = r10.A07
            r19 = 38
            X.IxF r0 = new X.IxF
            r20 = r17
            r21 = r15
            r22 = r10
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            r25 = 39
            X.IxF r11 = new X.IxF
            r24 = r11
            r26 = r10
            r27 = r15
            r29 = r23
            r24.<init>(r25, r26, r27, r28, r29)
            r14 = 0
            android.os.Bundle r13 = X.DbV.A0B(r7, r14)
            java.lang.String r12 = "spins_author_name"
            r10 = r34
            r13.putString(r12, r10)
            java.lang.String r10 = "spins_content"
            r13.putString(r10, r4)
            if (r31 == 0) goto L_0x0115
            java.lang.String r10 = r31.getUrl()
        L_0x009e:
            java.lang.String r4 = "profile_pic_url"
            r13.putString(r4, r10)
            java.lang.String r4 = "is_spins_liked"
            r13.putBoolean(r4, r3)
            java.lang.String r3 = "spins_like_count"
            r13.putInt(r3, r2)
            java.lang.String r2 = "spins_timestamp"
            r13.putString(r2, r1)
            java.lang.String r1 = "is_spin_author_reachable"
            r13.putBoolean(r1, r5)
            X.H1Z r2 = new X.H1Z
            r2.<init>()
            r2.setArguments(r13)
            r2.A01 = r0
            r2.A02 = r11
            X.7Pr r1 = X.DbS.A0W(r9)
            r1.A0T = r2
            X.DbS.A1S(r1, r14)
            r0 = r17
            X.C51975G9x.A0z(r0, r1)
            X.7Pu r0 = r1.A00()
            r2.A00 = r0
            r0.A02(r7, r2)
            X.4bN r0 = r15.A06
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x00e4
            java.lang.String r16 = r0.A30()
        L_0x00e4:
            X.0wc r1 = r6.A00
            java.lang.String r0 = "instagram_clips_viewer_link_tap"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r2 = X.C56516Hzn.A00(r16)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0114
            if (r2 == 0) goto L_0x0114
            java.lang.String r1 = "add_spin_nux"
            java.lang.String r0 = "containermodule"
            X.C51968G9o.A1I(r3, r2, r0, r1)
            r0 = r36
            X.C51969G9p.A16(r3, r0)
            X.C51965G9l.A1O(r3, r8)
            X.GKd r0 = X.C52236GKd.A1D
            X.C51965G9l.A19(r0, r3)
            X.5OC r0 = X.AnonymousClass5OC.CLIPS_SPINS
            X.C51965G9l.A1C(r0, r3)
            X.AnonymousClass7TH.A0V(r3)
        L_0x0114:
            return
        L_0x0115:
            r10 = 0
            goto L_0x009e
        L_0x0117:
            r4 = r16
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55264Het.A00(android.content.Context, X.Gmw, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, X.HJx, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
