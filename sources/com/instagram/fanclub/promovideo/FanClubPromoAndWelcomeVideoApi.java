package com.instagram.fanclub.promovideo;

import X.AnonymousClass0t1;
import X.C273004lm;
import X.C46401DeO;
import X.C51973G9u;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

public final class FanClubPromoAndWelcomeVideoApi {
    public final C46401DeO A00;
    public final UserSession A01;
    public final C273004lm A02;
    public final AnonymousClass0t1 A03;
    public final FanClubApi A04;

    public FanClubPromoAndWelcomeVideoApi(C46401DeO deO, UserSession userSession, C273004lm r4, FanClubApi fanClubApi, AnonymousClass0t1 r6) {
        C51973G9u.A0r(1, userSession, r6, r4);
        this.A01 = userSession;
        this.A00 = deO;
        this.A04 = fanClubApi;
        this.A03 = r6;
        this.A02 = r4;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 22
            boolean r0 = X.C66136MDo.A01(r3, r6)
            if (r0 == 0) goto L_0x0058
            r4 = r6
            X.MDo r4 = (X.C66136MDo) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0058
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0046
            if (r0 != r2) goto L_0x0060
            X.0eS.A00(r1)
        L_0x0024:
            boolean r0 = r1 instanceof X.C239793Ih
            r3 = 0
            if (r0 == 0) goto L_0x0045
            X.3Ih r1 = (X.C239793Ih) r1
            if (r1 == 0) goto L_0x0045
            java.lang.Object r0 = r1.A00
            X.C7k r0 = (X.C43740C7k) r0
            if (r0 == 0) goto L_0x0045
            X.C7j r0 = r0.A0E()
            if (r0 == 0) goto L_0x0045
            X.C7i r1 = r0.A0E()
            if (r1 == 0) goto L_0x0045
            java.lang.String r0 = "strong_id__"
            java.lang.String r3 = r1.A07(r0)
        L_0x0045:
            return r3
        L_0x0046:
            X.0eS.A00(r1)
            com.instagram.fanclub.api.FanClubApi r1 = r5.A04
            com.instagram.common.session.UserSession r0 = r5.A01
            java.lang.String r0 = r0.A06
            r4.A00 = r2
            java.lang.Object r1 = r1.A0F(r0, r4)
            if (r1 != r3) goto L_0x0024
            return r3
        L_0x0058:
            r0 = 42
            X.MDo r4 = new X.MDo
            r4.<init>(r5, r6, r3, r0)
            goto L_0x0016
        L_0x0060:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi.A00(com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 8
            boolean r0 = X.C66137MDp.A02(r3, r8)
            if (r0 == 0) goto L_0x006c
            r6 = r8
            X.MDp r6 = (X.C66137MDp) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r6.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 == r1) goto L_0x0028
            if (r0 != r3) goto L_0x0071
            X.0eS.A00(r5)
        L_0x0027:
            return r5
        L_0x0028:
            java.lang.Object r0 = r6.A01
            com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi r0 = (com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi) r0
            X.0eS.A00(r5)
            goto L_0x0063
        L_0x0030:
            X.0eS.A00(r5)
            X.0t1 r0 = r7.A03
            com.instagram.user.model.User r0 = r0.A00()
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B3v()
            if (r0 == 0) goto L_0x0058
            java.lang.String r5 = r0.getFanClubId()
            if (r5 == 0) goto L_0x0058
            r0 = r7
        L_0x0048:
            com.instagram.fanclub.api.FanClubApi r2 = r0.A04
            X.DeO r1 = r0.A00
            r0 = 0
            r6.A01 = r0
            r6.A00 = r3
            java.lang.Object r5 = r2.A02(r1, r5, r6)
            if (r5 != r4) goto L_0x0027
        L_0x0057:
            return r4
        L_0x0058:
            r6.A01 = r7
            r6.A00 = r1
            java.lang.Object r5 = A00(r7, r6)
            if (r5 == r4) goto L_0x0057
            r0 = r7
        L_0x0063:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0048
            X.5sO r5 = X.DbU.A0f()
            return r5
        L_0x006c:
            X.MDp r6 = X.C66137MDp.A00(r7, r8, r3)
            goto L_0x0016
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi.A01(X.4D7):java.lang.Object");
    }
}
