package com.facebook.avatar.expresso.graphql.asset;

import X.0qQ;
import X.1vm;
import X.1vn;
import com.instagram.common.session.UserSession;

public final class ODRAssetRepository {
    public final UserSession A00;
    public final 1vn A01;

    public ODRAssetRepository(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        1vn A012 = 1vm.A01(userSession);
        0qQ.A0B(A012, 2);
        this.A00 = userSession;
        this.A01 = A012;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0092, code lost:
        r6 = X.BrC.class;
        r4 = X.AnonymousClass000.A00(1966);
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r18) {
        /*
            r17 = this;
            r5 = 19
            r6 = r18
            boolean r0 = X.C66144MDw.A02(r5, r6)
            r4 = r17
            if (r0 == 0) goto L_0x007b
            r3 = r6
            X.MDw r3 = (X.C66144MDw) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007b
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r2) goto L_0x00e0
            X.0eS.A00(r5)
        L_0x0028:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0081
            X.5sO r5 = (X.C297815sO) r5
            java.lang.Object r0 = r5.A00
            java.lang.String r1 = r0.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            X.5sO r1 = X.C41845B3m.A0c(r0)
            return r1
        L_0x0040:
            X.0eS.A00(r5)
            r12 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r6 = X.C41845B3m.A05()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r0.getParamsCopy()
            java.lang.Class<X.BrD> r10 = X.BrD.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "ODRAssetsQueryQuery"
            r11 = 0
            r0 = 1966(0x7ae, float:2.755E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r0)
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1vn r0 = r4.A01
            r3.A01 = r4
            r3.A00 = r2
            java.lang.Object r5 = r0.A04(r5, r3)
            if (r5 != r1) goto L_0x0028
            return r1
        L_0x007b:
            X.MDw r3 = new X.MDw
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x0081:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00db
            java.lang.Class<X.Kfz> r0 = X.C62449Kfz.class
            java.util.EnumMap r7 = new java.util.EnumMap
            r7.<init>(r0)
            X.3lr r8 = X.C41846B3n.A0R(r5)
            if (r8 == 0) goto L_0x00cf
            java.lang.Class<X.BrC> r6 = X.BrC.class
            r5 = 0
            r0 = 1966(0x7ae, float:2.755E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            r3 = 715405302(0x2aa437f6, float:2.9171083E-13)
            X.3lr r1 = r8.getOptionalTreeField(r5, r4, r6, r3)
            if (r1 == 0) goto L_0x00cf
            java.lang.String r0 = "url"
            java.lang.String r1 = r1.getOptionalStringField(r2, r0)
            if (r1 == 0) goto L_0x00cf
            X.Kfz r0 = X.C62449Kfz.USER_MODEL_URL
            r7.put(r0, r1)
            X.Kfz r2 = X.C62449Kfz.RENDER_CONFIG_HASH
            X.3lr r1 = r8.getOptionalTreeField(r5, r4, r6, r3)
            if (r1 == 0) goto L_0x00c5
            r0 = 39
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = r1.getOptionalStringField(r5, r0)
            if (r0 != 0) goto L_0x00c7
        L_0x00c5:
            java.lang.String r0 = ""
        L_0x00c7:
            r7.put(r2, r0)
            X.3Ih r1 = X.C41845B3m.A0d(r7)
            return r1
        L_0x00cf:
            java.lang.String r1 = "Illegal Query Response"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            X.5sO r1 = X.C41845B3m.A0c(r0)
            return r1
        L_0x00db:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.graphql.asset.ODRAssetRepository.A00(X.4D7):java.lang.Object");
    }
}
