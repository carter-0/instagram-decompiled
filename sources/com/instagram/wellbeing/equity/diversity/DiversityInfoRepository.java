package com.instagram.wellbeing.equity.diversity;

import X.0qQ;
import X.19E;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.LCQ;
import X.MMF;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class DiversityInfoRepository {
    public final UserSession A00;
    public final Map A01;
    public final C262224Cq A02 = 19E.A01();
    public final LCQ A03;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.2IV r14, com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r15, X.AnonymousClass4D7 r16) {
        /*
            r1 = r15
            r5 = 26
            r6 = r16
            boolean r0 = X.C66139MDr.A01(r5, r6)
            if (r0 == 0) goto L_0x00d0
            r3 = r6
            X.MDr r3 = (X.C66139MDr) r3
            int r4 = r3.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x00d0
            int r4 = r4 - r2
            r3.A00 = r4
        L_0x0019:
            java.lang.Object r5 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r11 = 1
            if (r0 == 0) goto L_0x008d
            if (r0 != r11) goto L_0x00dc
            java.lang.Object r1 = r3.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r1 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r1
            X.0eS.A00(r5)
        L_0x002b:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            java.lang.String r4 = "update_diversity_info"
            if (r0 == 0) goto L_0x0084
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r6 = r5.A00
            X.3JC r6 = (X.AnonymousClass3JC) r6
            X.LCQ r5 = r1.A03
            com.instagram.common.session.UserSession r0 = r1.A00
            java.lang.String r0 = r0.A06
            long r2 = java.lang.Long.parseLong(r0)
            r5.A00(r2, r4)
            java.lang.Object r5 = r6.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0082
            java.lang.Class<X.QWX> r3 = X.QWX.class
            r0 = 771(0x303, float:1.08E-42)
            java.lang.String r2 = X.Pxd.A00(r0)
            r0 = -922171226(0xffffffffc908c8a6, float:-560266.4)
            X.3lr r3 = r5.A03(r3, r2, r0)
            if (r3 == 0) goto L_0x0082
            java.lang.Class<X.UQY> r2 = X.UQY.class
            r0 = -989627154(0xffffffffc5037cee, float:-2103.808)
            X.3lr r0 = r3.A01(r2, r0)
        L_0x0066:
            X.3Ih r5 = X.C41845B3m.A0d(r0)
        L_0x006a:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0081
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00d7
            X.4dm r3 = X.JTP.A0N(r5)
            X.LCQ r2 = r1.A03
            com.instagram.common.session.UserSession r0 = r1.A00
            A03(r3, r0, r2, r4)
            X.5sO r5 = X.DbU.A0f()
        L_0x0081:
            return r5
        L_0x0082:
            r0 = 0
            goto L_0x0066
        L_0x0084:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x006a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008d:
            X.0eS.A00(r5)
            r12 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r4 = X.C41845B3m.A04()
            java.lang.String r0 = "input"
            r5.A00(r14, r0)
            boolean r0 = X.AnonymousClass7TF.A1V(r14)
            X.1vR r6 = X.C41845B3m.A06(r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.QWY> r10 = X.QWY.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "DiverseOwnedBusinessMutate"
            r13 = 0
            java.lang.String r15 = "ig_shop_diversity_profile_update"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r1.A00
            X.1vn r0 = X.1vm.A01(r0)
            r3.A01 = r1
            r3.A00 = r11
            java.lang.Object r5 = r0.A04(r5, r3)
            if (r5 != r2) goto L_0x002b
            return r2
        L_0x00d0:
            X.MDr r3 = new X.MDr
            r3.<init>(r15, r6, r5)
            goto L_0x0019
        L_0x00d7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A00(X.2IV, com.instagram.wellbeing.equity.diversity.DiversityInfoRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r22, java.lang.String r23, X.AnonymousClass4D7 r24) {
        /*
            r4 = r22
            r5 = r23
            r3 = 10
            r7 = r24
            boolean r0 = X.C66131MDj.A01(r3, r7)
            if (r0 == 0) goto L_0x0101
            r6 = r7
            X.MDj r6 = (X.C66131MDj) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0101
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001c:
            java.lang.Object r1 = r6.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r6.A00
            r7 = 1
            if (r0 == 0) goto L_0x0090
            if (r0 != r7) goto L_0x010d
            java.lang.Object r5 = r6.A02
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r6.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r4 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r4
            X.0eS.A00(r1)
        L_0x0032:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            java.lang.String r3 = "get_diversity_info"
            if (r0 == 0) goto L_0x0087
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r6 = r1.A00
            X.3JC r6 = (X.AnonymousClass3JC) r6
            X.LCQ r2 = r4.A03
            long r0 = java.lang.Long.parseLong(r5)
            r2.A00(r0, r3)
            java.lang.Object r5 = r6.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0085
            java.lang.Class<X.QWZ> r2 = X.QWZ.class
            r0 = 770(0x302, float:1.079E-42)
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 927452178(0x3747cc12, float:1.1908838E-5)
            X.3lr r2 = r5.A03(r2, r1, r0)
            if (r2 == 0) goto L_0x0085
            java.lang.Class<X.UQY> r1 = X.UQY.class
            r0 = -989627154(0xffffffffc5037cee, float:-2103.808)
            X.3lr r0 = r2.A01(r1, r0)
        L_0x0069:
            X.3Ih r1 = X.C41845B3m.A0d(r0)
        L_0x006d:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0084
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0108
            X.4dm r2 = X.JTP.A0N(r1)
            X.LCQ r1 = r4.A03
            com.instagram.common.session.UserSession r0 = r4.A00
            A03(r2, r0, r1, r3)
            X.5sO r1 = X.DbU.A0f()
        L_0x0084:
            return r1
        L_0x0085:
            r0 = 0
            goto L_0x0069
        L_0x0087:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x006d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0090:
            X.0eS.A00(r1)
            r20 = 0
            X.2IS r2 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            java.lang.String r0 = "id"
            boolean r0 = X.C41848B3p.A1Z(r2, r0, r5)
            X.1vR r14 = X.C41845B3m.A06(r0)
            java.util.Map r16 = r2.getParamsCopy()
            java.util.Map r17 = r1.getParamsCopy()
            java.lang.Class<X.QWa> r18 = X.C7763QWa.class
            java.util.ArrayList r24 = X.AnonymousClass7TE.A1C()
            java.lang.String r15 = "DiverseOwnedBusiness"
            r0 = 0
            java.lang.String r23 = "ig_shop_diversity_profile"
            com.facebook.pando.PandoGraphQLRequest r13 = new com.facebook.pando.PandoGraphQLRequest
            r19 = r0
            r21 = r0
            r22 = r20
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.instagram.common.session.UserSession r9 = r4.A00
            X.0Tu r10 = X.DbS.A0J(r9, r0)
            r0 = 36606212422505828(0x820d2800041564, double:3.213254365154297E-306)
            long r0 = X.182.A01(r10, r9, r0)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x00de
            r0 = 60
        L_0x00de:
            long r2 = r3.toMillis(r0)
            r0 = 36324737445736748(0x810d280003312c, double:3.035248456436773E-306)
            boolean r0 = X.182.A06(r10, r9, r0)
            if (r0 == 0) goto L_0x00f3
            r13.setFreshCacheAgeMs(r2)
            r13.setMaxToleratedCacheAgeMs(r2)
        L_0x00f3:
            X.1vn r0 = X.1vm.A01(r9)
            X.C51966G9m.A1P(r4, r5, r6, r7)
            java.lang.Object r1 = r0.A04(r13, r6)
            if (r1 != r8) goto L_0x0032
            return r8
        L_0x0101:
            X.MDj r6 = new X.MDj
            r6.<init>(r4, r7, r3)
            goto L_0x001c
        L_0x0108:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x010d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A01(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r15, X.AnonymousClass4D7 r16) {
        /*
            r4 = 25
            r5 = r16
            boolean r0 = X.C66139MDr.A01(r4, r5)
            if (r0 == 0) goto L_0x00c8
            r2 = r5
            X.MDr r2 = (X.C66139MDr) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00c8
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0018:
            java.lang.Object r3 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L_0x008a
            if (r0 != r9) goto L_0x00d4
            java.lang.Object r15 = r2.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r15 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r15
            X.0eS.A00(r3)
        L_0x002a:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            java.lang.String r4 = "delete_diversity_info"
            if (r0 == 0) goto L_0x0081
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r3 = r3.A00
            X.3JC r3 = (X.AnonymousClass3JC) r3
            X.LCQ r2 = r15.A03
            com.instagram.common.session.UserSession r0 = r15.A00
            java.lang.String r0 = r0.A06
            long r0 = java.lang.Long.parseLong(r0)
            r2.A00(r0, r4)
            java.lang.Object r5 = r3.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x007f
            java.lang.Class<X.BnE> r3 = X.BnE.class
            r2 = 0
            r0 = 1439(0x59f, float:2.016E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -270936568(0xffffffffefd9d608, float:-1.3483399E29)
            X.3lr r1 = r5.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x007f
            java.lang.String r0 = "success"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
        L_0x0063:
            X.3Ih r3 = X.JTT.A0j(r0)
        L_0x0067:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x007e
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00cf
            X.4dm r2 = X.JTP.A0N(r3)
            X.LCQ r1 = r15.A03
            com.instagram.common.session.UserSession r0 = r15.A00
            A03(r2, r0, r1, r4)
            X.5sO r3 = X.DbU.A0f()
        L_0x007e:
            return r3
        L_0x007f:
            r0 = 0
            goto L_0x0063
        L_0x0081:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0067
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008a:
            X.0eS.A00(r3)
            r10 = 0
            X.2IS r3 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r4 = X.C41845B3m.A05()
            java.util.Map r6 = r3.getParamsCopy()
            java.util.Map r7 = r0.getParamsCopy()
            java.lang.Class<X.BnF> r8 = X.BnF.class
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.lang.String r5 = "DiverseOwnedBusinessDelete"
            r11 = 0
            r0 = 1439(0x59f, float:2.016E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r0)
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.instagram.common.session.UserSession r0 = r15.A00
            X.1vn r0 = X.1vm.A01(r0)
            r2.A01 = r15
            r2.A00 = r9
            java.lang.Object r3 = r0.A04(r3, r2)
            if (r3 != r1) goto L_0x002a
            return r1
        L_0x00c8:
            X.MDr r2 = new X.MDr
            r2.<init>(r15, r5, r4)
            goto L_0x0018
        L_0x00cf:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A02(com.instagram.wellbeing.equity.diversity.DiversityInfoRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        X.DbS.A1H(r2, r0);
        X.DbS.A1J(r2, "error");
        r2.AAJ("event_source", com.facebook.common.dextricks.DexOptimization.OPT_KEY_CLIENT);
        r2.AAJ("error_message", r3);
        X.DbV.A1J(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r0 = "diversity_info_gql_failure_unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3 != null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r3.equals("UnknownNetworkError") != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r5 = java.lang.Long.parseLong(r6.A06);
        r4 = !r1;
        r2 = X.AnonymousClass7TE.A0e(r7.A00, X.AnonymousClass000.A00(304));
        r2.A9F("ig_userid", java.lang.Long.valueOf(r5));
        r2.AAJ("product", "network_call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r4 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r0 = "diversity_info_gql_failure";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C268654dm r5, com.instagram.common.session.UserSession r6, X.LCQ r7, java.lang.String r8) {
        /*
            boolean r0 = r5 instanceof X.C268664dn
            java.lang.String r1 = "UnknownNetworkError"
            if (r0 == 0) goto L_0x005b
            X.4dn r5 = (X.C268664dn) r5
            java.lang.Throwable r0 = r5.A00
            java.lang.String r3 = r0.getLocalizedMessage()
            if (r3 == 0) goto L_0x0017
        L_0x0010:
            boolean r0 = r3.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            java.lang.String r0 = r6.A06
            long r5 = java.lang.Long.parseLong(r0)
            r4 = r1 ^ 1
            X.0wc r1 = r7.A00
            r0 = 304(0x130, float:4.26E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = "ig_userid"
            r2.A9F(r0, r1)
            java.lang.String r1 = "network_call"
            java.lang.String r0 = "product"
            r2.AAJ(r0, r1)
            if (r4 == 0) goto L_0x0058
            java.lang.String r0 = "diversity_info_gql_failure"
        L_0x0040:
            X.DbS.A1H(r2, r0)
            java.lang.String r0 = "error"
            X.DbS.A1J(r2, r0)
            java.lang.String r1 = "client"
            java.lang.String r0 = "event_source"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "error_message"
            r2.AAJ(r0, r3)
            X.DbV.A1J(r2, r8)
            return
        L_0x0058:
            java.lang.String r0 = "diversity_info_gql_failure_unknown"
            goto L_0x0040
        L_0x005b:
            boolean r0 = r5 instanceof X.C268674do
            if (r0 == 0) goto L_0x0061
            r3 = r1
            goto L_0x0010
        L_0x0061:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A03(X.4dm, com.instagram.common.session.UserSession, X.LCQ, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 9
            boolean r0 = X.C66131MDj.A01(r3, r9)
            if (r0 == 0) goto L_0x0083
            r6 = r9
            X.MDj r6 = (X.C66131MDj) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0083
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r4) goto L_0x0092
            java.lang.Object r8 = r6.A02
            java.lang.Object r2 = r6.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r2 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r2
            X.0eS.A00(r1)
        L_0x002a:
            r5 = r1
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0089
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r4 = r5.A00
            X.UQY r4 = (X.UQY) r4
            java.util.Map r0 = r2.A01
            java.lang.Object r0 = r0.get(r8)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0097
            java.util.Iterator r1 = r0.iterator()
        L_0x0045:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r1.next()
            X.MUW r0 = (X.MUW) r0
            r0.DoO(r4)
            goto L_0x0045
        L_0x0055:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r3 = r7.A00
            r2 = 0
            X.0qQ.A0B(r3, r2)
            X.MM0 r1 = X.MM0.A00
            java.lang.Class<X.Lii> r0 = X.C64822Lii.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.Lii r0 = (X.C64822Lii) r0
            X.0qQ.A0B(r8, r2)
            android.util.LruCache r0 = r0.A00
            java.lang.Object r0 = r0.get(r8)
            if (r0 == 0) goto L_0x0078
            X.3Ih r5 = X.C41845B3m.A0d(r0)
            return r5
        L_0x0078:
            X.C51966G9m.A1P(r7, r8, r6, r4)
            java.lang.Object r1 = A01(r7, r8, r6)
            if (r1 == r5) goto L_0x00b5
            r2 = r7
            goto L_0x002a
        L_0x0083:
            X.MDj r6 = new X.MDj
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0089:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00b5
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0092:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0097:
            com.instagram.common.session.UserSession r3 = r2.A00
            r2 = 0
            X.0qQ.A0B(r3, r2)
            X.MM0 r1 = X.MM0.A00
            java.lang.Class<X.Lii> r0 = X.C64822Lii.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.Lii r0 = (X.C64822Lii) r0
            X.0qQ.A0B(r8, r2)
            if (r4 == 0) goto L_0x00b6
            android.util.LruCache r0 = r0.A00
            r0.put(r8, r4)
        L_0x00b1:
            X.3Ih r5 = X.C41845B3m.A0d(r4)
        L_0x00b5:
            return r5
        L_0x00b6:
            r4 = 0
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A04(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.util.List r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r8 = this;
            r3 = 11
            boolean r0 = X.C66131MDj.A01(r3, r11)
            if (r0 == 0) goto L_0x009e
            r6 = r11
            X.MDj r6 = (X.C66131MDj) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009e
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r7 = 1
            if (r1 == 0) goto L_0x006e
            if (r1 != r7) goto L_0x00ae
            java.lang.Object r4 = r6.A02
            java.lang.Object r2 = r6.A01
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r2 = (com.instagram.wellbeing.equity.diversity.DiversityInfoRepository) r2
            X.0eS.A00(r0)
        L_0x002a:
            r5 = r0
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a5
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r5 = r5.A00
            X.UQY r5 = (X.UQY) r5
            if (r5 == 0) goto L_0x00cb
            X.Kil r3 = X.C62614Kil.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 4
            r0 = 1688(0x698, float:2.365E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.google.common.collect.ImmutableList r1 = r5.getRequiredCompactedEnumListField(r1, r0, r3)
            if (r1 == 0) goto L_0x00cb
            X.Kil r0 = X.C62614Kil.INSTAGRAM
            boolean r0 = r1.contains(r0)
            if (r0 != r7) goto L_0x00cb
            java.util.Map r0 = r2.A01
            java.lang.Object r0 = r0.get(r4)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x00b3
            java.util.Iterator r1 = r0.iterator()
        L_0x005e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r1.next()
            X.MUW r0 = (X.MUW) r0
            r0.DoO(r5)
            goto L_0x005e
        L_0x006e:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r3 = r8.A00
            java.lang.String r4 = r3.A06
            X.2IV r2 = new X.2IV
            r2.<init>()
            java.lang.String r0 = "diversity_type"
            r2.A05(r0, r9)
            java.lang.String r0 = "ethnicity"
            r2.A09(r10, r0)
            X.MM0 r1 = X.MM0.A00
            java.lang.Class<X.Lii> r0 = X.C64822Lii.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.Lii r0 = (X.C64822Lii) r0
            android.util.LruCache r0 = r0.A00
            r0.remove(r4)
            X.C51966G9m.A1P(r8, r4, r6, r7)
            java.lang.Object r0 = A00(r2, r8, r6)
            if (r0 == r5) goto L_0x00cf
            r2 = r8
            goto L_0x002a
        L_0x009e:
            X.MDj r6 = new X.MDj
            r6.<init>(r8, r11, r3)
            goto L_0x0016
        L_0x00a5:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00cf
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00b3:
            com.instagram.common.session.UserSession r3 = r2.A00
            r2 = 0
            X.0qQ.A0B(r3, r2)
            X.MM0 r1 = X.MM0.A00
            java.lang.Class<X.Lii> r0 = X.C64822Lii.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.Lii r0 = (X.C64822Lii) r0
            X.0qQ.A0B(r4, r2)
            android.util.LruCache r0 = r0.A00
            r0.put(r4, r5)
        L_0x00cb:
            X.3Ih r5 = X.C41845B3m.A0d(r5)
        L_0x00cf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A05(java.util.List, java.lang.String, X.4D7):java.lang.Object");
    }

    public DiversityInfoRepository(UserSession userSession) {
        this.A00 = userSession;
        0qQ.A0B(userSession, 0);
        this.A03 = (LCQ) userSession.A01(LCQ.class, new MMF(userSession, 43));
        this.A01 = AnonymousClass7TE.A1H();
    }
}
