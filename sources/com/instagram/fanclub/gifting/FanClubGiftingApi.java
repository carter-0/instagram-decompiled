package com.instagram.fanclub.gifting;

import X.1vn;
import X.AnonymousClass7TG;
import com.instagram.common.session.UserSession;

public final class FanClubGiftingApi {
    public final UserSession A00;
    public final 1vn A01;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r5 = 15
            r6 = r20
            boolean r0 = X.C66136MDo.A01(r5, r6)
            r4 = r18
            if (r0 == 0) goto L_0x0089
            r3 = r6
            X.MDo r3 = (X.C66136MDo) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x004c
            if (r0 != r1) goto L_0x0096
            X.0eS.A00(r5)
        L_0x0028:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = X.JTQ.A0Y(r5)
            X.3Ih r5 = X.C41845B3m.A0d(r0)
        L_0x0036:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0042
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0091
            X.5sO r5 = X.DbU.A0f()
        L_0x0042:
            return r5
        L_0x0043:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0036
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004c:
            X.0eS.A00(r5)
            r13 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "user_id"
            r7 = r19
            boolean r0 = X.C41848B3p.A1Z(r6, r0, r7)
            X.1vR r7 = X.C41845B3m.A06(r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Bjo> r11 = X.C42842Bjo.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "FanClubGiftOptions"
            r12 = 0
            java.lang.String r16 = "xig_user_by_igid_v2"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = r4.A01
            r3.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r3)
            if (r5 != r2) goto L_0x0028
            return r2
        L_0x0089:
            r0 = 42
            X.MDo r3 = new X.MDo
            r3.<init>(r4, r6, r5, r0)
            goto L_0x001a
        L_0x0091:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.gifting.FanClubGiftingApi.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    public FanClubGiftingApi(UserSession userSession, 1vn r2) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A00 = userSession;
        this.A01 = r2;
    }
}
