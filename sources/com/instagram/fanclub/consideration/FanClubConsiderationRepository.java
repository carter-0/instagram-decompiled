package com.instagram.fanclub.consideration;

import X.0qQ;
import X.17h;
import X.17i;
import X.AnonymousClass441;
import X.C272994ll;
import X.C273004lm;
import X.C51973G9u;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

public final class FanClubConsiderationRepository {
    public final UserSession A00;
    public final C273004lm A01;
    public final FanClubApi A02;
    public final AnonymousClass441 A03;
    public final 17i A04;

    public /* synthetic */ FanClubConsiderationRepository(UserSession userSession) {
        FanClubApi fanClubApi = new FanClubApi(userSession);
        17i A002 = 17h.A00(userSession);
        AnonymousClass441 r2 = AnonymousClass441.A02;
        C273004lm A003 = C272994ll.A00(userSession);
        0qQ.A0B(userSession, 1);
        C51973G9u.A0r(3, A002, r2, A003);
        this.A00 = userSession;
        this.A02 = fanClubApi;
        this.A04 = A002;
        this.A03 = r2;
        this.A01 = A003;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.Boolean r9, java.lang.Boolean r10, java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r8 = this;
            r4 = 43
            boolean r0 = X.MED.A04(r4, r12)
            if (r0 == 0) goto L_0x00e6
            r3 = r12
            X.MED r3 = (X.MED) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e6
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r3.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L_0x009f
            if (r0 != r5) goto L_0x00ed
            java.lang.Object r10 = r3.A03
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r9 = r3.A02
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Object r1 = r3.A01
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r1 = (com.instagram.fanclub.consideration.FanClubConsiderationRepository) r1
            X.0eS.A00(r4)
        L_0x0030:
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            if (r4 == 0) goto L_0x009d
            X.4Cl r0 = r4.A03
            com.instagram.api.schemas.FanClubInfoDict r7 = r0.B3v()
        L_0x003a:
            java.lang.String r6 = "FanClubConsiderationViewModel_validateDataAndReport_null"
            if (r7 != 0) goto L_0x0064
            java.lang.String r0 = "FanClubInfoDict"
        L_0x0040:
            X.0wb.A03(r6, r0)
        L_0x0043:
            if (r4 == 0) goto L_0x0063
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.0qQ.A0K(r9, r1)
            if (r0 == 0) goto L_0x0056
            boolean r0 = r9.booleanValue()
            r4.A1I(r0)
        L_0x0056:
            boolean r0 = X.0qQ.A0K(r10, r1)
            if (r0 == 0) goto L_0x0063
            boolean r0 = r10.booleanValue()
            r4.A10(r0)
        L_0x0063:
            return r4
        L_0x0064:
            java.lang.String r0 = r7.getFanClubId()
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = "fanClubId"
            X.0wb.A03(r6, r0)
        L_0x006f:
            java.lang.String r0 = r7.getFanClubName()
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "fanClubName"
            X.0wb.A03(r6, r0)
        L_0x007a:
            java.lang.Integer r0 = r7.C2R()
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "subscriberCount"
            X.0wb.A03(r6, r0)
        L_0x0085:
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315945647476433(0x81052900000ed1, double:3.02968848781522E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0043
            java.lang.Boolean r0 = r7.CT9()
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "isFanClubReferralEligible"
            goto L_0x0040
        L_0x009d:
            r7 = 0
            goto L_0x003a
        L_0x009f:
            X.0eS.A00(r4)
            X.MED.A00(r8, r9, r10, r3, r5)
            X.3Pl r4 = X.JTQ.A0m(r3)
            X.17i r0 = r8.A04
            com.instagram.user.model.User r2 = r0.A02(r11)
            if (r2 == 0) goto L_0x00d5
            X.4Cl r0 = r2.A03
            com.instagram.api.schemas.FanClubInfoDict r1 = r0.B3v()
            if (r1 == 0) goto L_0x00d5
            java.lang.String r0 = r1.getFanClubId()
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = r1.getFanClubName()
            if (r0 == 0) goto L_0x00d5
            java.lang.Integer r0 = r1.C2R()
            if (r0 == 0) goto L_0x00d5
            r4.resumeWith(r2)
        L_0x00ce:
            java.lang.Object r4 = r4.A00()
            if (r4 != r6) goto L_0x00e3
            return r6
        L_0x00d5:
            X.441 r3 = r8.A03
            com.instagram.common.session.UserSession r2 = r8.A00
            r1 = 2
            X.FnC r0 = new X.FnC
            r0.<init>(r4, r1)
            r3.A02(r2, r0, r11)
            goto L_0x00ce
        L_0x00e3:
            r1 = r8
            goto L_0x0030
        L_0x00e6:
            X.MED r3 = new X.MED
            r3.<init>(r8, r12, r4)
            goto L_0x0016
        L_0x00ed:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationRepository.A00(java.lang.Boolean, java.lang.Boolean, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r13, X.AnonymousClass4D7 r14, boolean r15) {
        /*
            r12 = this;
            r3 = 42
            boolean r0 = X.C66129MDh.A01(r3, r14)
            if (r0 == 0) goto L_0x006c
            r4 = r14
            X.MDh r4 = (X.C66129MDh) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r4.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 != r6) goto L_0x0077
            java.lang.Object r1 = r4.A01
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r1 = (com.instagram.fanclub.consideration.FanClubConsiderationRepository) r1
            X.0eS.A00(r2)
        L_0x0028:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            r3 = 0
            if (r0 == 0) goto L_0x0042
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
        L_0x0033:
            X.C7k r0 = (X.C43740C7k) r0
            if (r0 == 0) goto L_0x0041
            X.C7j r0 = r0.A0E()
            if (r0 == 0) goto L_0x0041
            X.C7i r3 = r0.A0E()
        L_0x0041:
            return r3
        L_0x0042:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0072
            X.4lm r2 = r1.A01
            com.instagram.common.session.UserSession r0 = r1.A00
            java.lang.String r1 = r0.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r2.A07(r1, r0)
            r0 = r3
            goto L_0x0033
        L_0x0053:
            X.0eS.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r12.A02
            r4.A01 = r12
            r4.A00 = r6
            r5 = 0
            r3 = r13
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r15
            java.lang.Object r2 = r2.A0J(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r1 = r12
            goto L_0x0028
        L_0x006c:
            X.MDh r4 = new X.MDh
            r4.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x0072:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationRepository.A01(java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r12, X.AnonymousClass4D7 r13, boolean r14) {
        /*
            r11 = this;
            r3 = 43
            boolean r0 = X.C66129MDh.A01(r3, r13)
            if (r0 == 0) goto L_0x0079
            r7 = r13
            X.MDh r7 = (X.C66129MDh) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0079
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r7.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 1
            if (r0 == 0) goto L_0x0065
            if (r0 != r8) goto L_0x0084
            java.lang.Object r1 = r7.A01
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r1 = (com.instagram.fanclub.consideration.FanClubConsiderationRepository) r1
            X.0eS.A00(r2)
        L_0x0028:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            r4 = 0
            if (r0 == 0) goto L_0x0054
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r3 = r2.A00
        L_0x0033:
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x0053
            java.lang.Class<X.Bk4> r2 = X.Bk4.class
            r0 = 1972(0x7b4, float:2.763E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1978589853(0xffffffff8a111d63, float:-6.987023E-33)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x0053
            java.lang.Class<X.C7m> r2 = X.C43742C7m.class
            java.lang.String r1 = "fan_club"
            r0 = -1895408832(0xffffffff8f065b40, float:-6.624284E-30)
            X.3lr r4 = r3.A03(r2, r1, r0)
        L_0x0053:
            return r4
        L_0x0054:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007f
            X.4lm r2 = r1.A01
            com.instagram.common.session.UserSession r0 = r1.A00
            java.lang.String r1 = r0.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A07(r1, r0)
            r3 = r4
            goto L_0x0033
        L_0x0065:
            X.0eS.A00(r2)
            com.instagram.fanclub.api.FanClubApi r5 = r11.A02
            r7.A01 = r11
            r7.A00 = r8
            r6 = r12
            r10 = r14
            r9 = r8
            java.lang.Object r2 = r5.A0I(r6, r7, r8, r9, r10)
            if (r2 == r4) goto L_0x0053
            r1 = r11
            goto L_0x0028
        L_0x0079:
            X.MDh r7 = new X.MDh
            r7.<init>(r11, r13, r3)
            goto L_0x0016
        L_0x007f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationRepository.A02(java.lang.String, X.4D7, boolean):java.lang.Object");
    }
}
