package X;

import android.content.DialogInterface;

/* renamed from: X.FIu  reason: case insensitive filesystem */
public final class C50009FIu implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C50009FIu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A05 = obj2;
        this.A04 = obj4;
        this.A02 = obj3;
        this.A06 = str;
        this.A07 = str2;
        this.A03 = obj5;
        this.A08 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r1 != 62) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r19, int r20) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0044
            java.lang.Object r4 = r3.A01
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r7 = r3.A05
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r12 = r3.A04
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            java.lang.Object r11 = r3.A02
            X.3aD r11 = (X.C243853aD) r11
            java.lang.String r13 = r3.A06
            java.lang.String r15 = r3.A07
            java.lang.Object r0 = r3.A03
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r5 = 0
            r6 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r14 = r5
            r16 = r5
            r17 = r0
            X.FH6.A08(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.user.model.FollowStatus r2 = r12.B6o()
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A05
            r0 = 2131975856(0x7f135eb0, float:1.9588816E38)
            if (r2 != r1) goto L_0x0039
            r0 = 2131962539(0x7f132aab, float:1.9561806E38)
        L_0x0039:
            X.DbU.A0z(r4, r0)
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0043
            X.C49960FGs.A03(r4)
        L_0x0043:
            return
        L_0x0044:
            r0 = 0
            r4 = r19
            X.0qQ.A0B(r4, r0)
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r0 = r3.A05
            X.N4P r0 = (X.N4P) r0
            int r1 = r0.A09
            r0 = 28
            if (r1 == r0) goto L_0x00ce
            r0 = 29
            if (r1 == r0) goto L_0x0095
            r0 = 32
            if (r1 == r0) goto L_0x006c
            r0 = 61
            if (r1 == r0) goto L_0x00ce
            r0 = 62
            if (r1 == r0) goto L_0x006c
        L_0x0068:
            r4.dismiss()
            return
        L_0x006c:
            java.lang.Object r1 = r3.A04
            X.FYv r1 = (X.C50338FYv) r1
            java.lang.String r5 = r3.A06
            java.lang.String r3 = r3.A07
            X.1Ln r2 = X.C50338FYv.A00(r1)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0068
            com.instagram.common.session.UserSession r0 = r1.A03
            X.Dbb.A1G(r2, r0)
            java.lang.String r0 = "thread_end_cancel"
            X.DbV.A1M(r2, r0)
            java.lang.String r0 = "end_chat_dialog"
            r2.A0p(r0)
            java.lang.String r0 = "thread_detail"
            r2.A0q(r0)
            java.lang.String r0 = "instagram"
            goto L_0x00bd
        L_0x0095:
            java.lang.Object r1 = r3.A01
            X.6gx r1 = (X.C313756gx) r1
            java.lang.String r5 = r3.A06
            java.lang.String r3 = r3.A07
            X.1Ln r2 = X.DbT.A0J(r1)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0068
            com.instagram.common.session.UserSession r0 = r1.A04
            X.Dbb.A1G(r2, r0)
            java.lang.String r0 = "thread_end_cancel"
            X.DbV.A1M(r2, r0)
            java.lang.String r0 = "end_chat_dialog"
            r2.A0p(r0)
            java.lang.String r0 = "thread_details"
            r2.A0q(r0)
            java.lang.String r0 = "broadcast"
        L_0x00bd:
            r2.A0o(r0)
            r2.A0s(r5)
            java.lang.Long r0 = X.DbZ.A0d(r3)
            r2.A0i(r0)
            r2.Cgf()
            goto L_0x0068
        L_0x00ce:
            java.lang.Object r2 = r3.A02
            X.FYu r2 = (X.C50337FYu) r2
            r1 = 1
            java.lang.String r0 = r3.A06
            r2.A04(r1, r0)
            goto L_0x0068
        L_0x00d9:
            java.lang.Object r3 = r3.A03
            X.FAS r3 = (X.FAS) r3
            if (r3 == 0) goto L_0x0068
            java.lang.String r2 = "thread_end_cancel"
            java.lang.String r1 = "tap"
            java.lang.String r0 = "thread_detail"
            X.FAS.A00(r3, r2, r1, r0)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50009FIu.onClick(android.content.DialogInterface, int):void");
    }
}
