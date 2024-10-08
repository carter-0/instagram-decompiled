package com.instagram.direct.avatar.powerups.api;

import X.1vn;
import X.AnonymousClass7TG;
import com.instagram.common.session.UserSession;

public final class AvatarPowerupsApi {
    public final UserSession A00;
    public final 1vn A01;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r20) {
        /*
            r19 = this;
            r5 = 20
            r6 = r20
            boolean r0 = X.C66129MDh.A01(r5, r6)
            r4 = r19
            if (r0 == 0) goto L_0x00f5
            r3 = r6
            X.MDh r3 = (X.C66129MDh) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00f5
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x00b8
            if (r1 != r0) goto L_0x012a
            X.0eS.A00(r5)
        L_0x0028:
            r2 = r5
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x00fc
            X.3lr r5 = X.C41846B3n.A0R(r2)
            if (r5 == 0) goto L_0x0105
            java.lang.Class<X.Bny> r3 = X.C42956Bny.class
            r4 = 0
            java.lang.String r2 = "fetch__IGUser(igid:$user_id)"
            r1 = -22164540(0xfffffffffeadcbc4, float:-1.1550723E38)
            X.3lr r5 = r5.getOptionalTreeField(r4, r2, r3, r1)
            if (r5 == 0) goto L_0x0105
            java.lang.Class<X.Bnx> r3 = X.C42955Bnx.class
            java.lang.String r2 = "user_avatar"
            r1 = -89336629(0xfffffffffaacd4cb, float:-4.486955E35)
            X.3lr r5 = r5.getOptionalTreeField(r4, r2, r3, r1)
            if (r5 == 0) goto L_0x0105
            java.lang.Class<X.Bnw> r3 = X.C42954Bnw.class
            java.lang.String r2 = "power_ups"
            r1 = 659771805(0x2753519d, float:2.9326375E-15)
            com.google.common.collect.ImmutableList r2 = r5.getRequiredCompactedTreeListField(r4, r2, r3, r1)
            if (r2 == 0) goto L_0x0105
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r2.iterator()
        L_0x0065:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0107
            X.3lr r5 = X.C41845B3m.A0V(r6)
            X.0qQ.A0A(r5)
            X.5FW r3 = X.AnonymousClass5FV.A02
            java.lang.String r2 = "power_up_type"
            int r2 = r5.getCoercedIntField(r4, r2)
            X.5FV r8 = r3.A00(r2)
            boolean r2 = r8.A01
            if (r2 == 0) goto L_0x0065
            java.lang.String r2 = "composer_asset_url"
            java.lang.String r3 = r5.A0B(r2)
            if (r3 == 0) goto L_0x0065
            java.lang.String r2 = "thread_asset_url"
            java.lang.String r2 = r5.getOptionalStringField(r0, r2)
            if (r2 == 0) goto L_0x0065
            com.instagram.common.typedurl.SimpleImageUrl r9 = new com.instagram.common.typedurl.SimpleImageUrl
            r9.<init>(r2)
            com.instagram.common.typedurl.SimpleImageUrl r10 = new com.instagram.common.typedurl.SimpleImageUrl
            r10.<init>(r3)
            java.lang.String r2 = "thread_asset_content_cache_key"
            java.lang.String r11 = r5.A09(r2)
            java.lang.String r2 = "composer_asset_content_cache_key"
            java.lang.String r12 = r5.A0C(r2)
            r3 = 7
            java.lang.String r2 = "order_index"
            int r13 = r5.getCoercedIntField(r3, r2)
            X.Jv7 r7 = new X.Jv7
            r7.<init>((X.AnonymousClass5FV) r8, (com.instagram.common.typedurl.ImageUrl) r9, (com.instagram.common.typedurl.ImageUrl) r10, (java.lang.String) r11, (java.lang.String) r12, (int) r13)
            r1.add(r7)
            goto L_0x0065
        L_0x00b8:
            X.0eS.A00(r5)
            r14 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            com.instagram.common.session.UserSession r1 = r4.A00
            java.lang.String r5 = r1.A06
            java.lang.String r1 = "user_id"
            r7.A04(r1, r5)
            X.1vR r8 = X.C41845B3m.A05()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Bnz> r12 = X.C42957Bnz.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "IGAvatarPowerUpsQuery"
            r13 = 0
            java.lang.String r17 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r1 = r4.A01
            java.lang.Object r5 = X.C41846B3n.A0h(r7, r1, r4, r3)
            if (r5 != r2) goto L_0x0028
            return r2
        L_0x00f5:
            X.MDh r3 = new X.MDh
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x00fc:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x010b
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0105:
            X.0sn r1 = X.0sn.A00
        L_0x0107:
            X.3Ih r2 = X.C41845B3m.A0d(r1)
        L_0x010b:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0124
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0125
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r0 = r2.A00
            java.lang.String r1 = r0.toString()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            X.5sO r2 = X.C41845B3m.A0c(r0)
        L_0x0124:
            return r2
        L_0x0125:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x012a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.powerups.api.AvatarPowerupsApi.A00(X.4D7):java.lang.Object");
    }

    public AvatarPowerupsApi(UserSession userSession, 1vn r2) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A00 = userSession;
        this.A01 = r2;
    }
}
