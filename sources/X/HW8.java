package X;

public abstract class HW8 {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
        throw X.DbW.A0c("unknown destination ", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.C307896Rx r16, X.AnonymousClass6Tm r17) {
        /*
            r0 = 0
            r2 = r17
            java.lang.Object r1 = r2.A03(r0)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 1
            java.util.List r3 = r2.A00
            java.lang.Object r2 = r3.get(r0)
            X.4tV r2 = (X.C276544tV) r2
            r0 = 2
            java.lang.String r5 = X.DbU.A0t(r3, r0)
            r10 = 0
            if (r2 == 0) goto L_0x00c1
            com.instagram.user.model.Product r15 = X.C18132Vm8.A01(r2)
        L_0x001e:
            androidx.fragment.app.FragmentActivity r6 = X.C308206Td.A04(r16)
            X.0iw r4 = X.C308206Td.A08(r16)
            X.0lg r8 = X.C308206Td.A0B(r16)
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            int r0 = r1.hashCode()
            switch(r0) {
                case 110844: goto L_0x0076;
                case 2072880909: goto L_0x003a;
                case 2073932338: goto L_0x0096;
                default: goto L_0x0033;
            }
        L_0x0033:
            java.lang.String r0 = "unknown destination "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r1)
            throw r0
        L_0x003a:
            java.lang.String r0 = "merchant_shop"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0033
            if (r5 == 0) goto L_0x00c0
            java.lang.String r2 = ""
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r2)
            com.instagram.common.typedurl.SimpleImageUrl r0 = com.instagram.user.model.User.A08
            com.instagram.user.model.User r1 = X.1aC.A03(r1, r5, r2)
            X.ITU r9 = new X.ITU
            r9.<init>(r4)
            X.3kF r5 = X.C249713kF.A00
            java.lang.String r13 = X.AnonymousClass3ZA.A00(r1)
            X.4Cl r0 = r1.A03
            java.lang.String r14 = r0.getUsername()
            X.4Cl r0 = r1.A03
            com.instagram.api.schemas.SellerShoppableFeedType r7 = r0.BsB()
            r0 = 171(0xab, float:2.4E-43)
            java.lang.String r12 = X.AnonymousClass000.A00(r0)
            r11 = r10
            X.W2P r0 = r5.A0N(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A05()
            return r10
        L_0x0076:
            java.lang.String r0 = "pdp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0033
            X.ITT r0 = new X.ITT
            r0.<init>(r4)
            if (r15 == 0) goto L_0x00c0
            X.3kF r11 = X.C249713kF.A00
            java.lang.String r16 = "bloks"
            r12 = r6
            r13 = r8
            r14 = r0
            r17 = r10
            X.WNN r0 = r11.A0L(r12, r13, r14, r15, r16, r17)
            X.WNN.A01(r0)
            return r10
        L_0x0096:
            java.lang.String r0 = "merchant_profile"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0033
            if (r5 == 0) goto L_0x00c0
            X.6Yo r3 = X.DbU.A0Q(r6, r8)
            X.1a1 r2 = X.C46447Df9.A02()
            java.lang.String r1 = r4.getModuleName()
            r0 = 1592(0x638, float:2.231E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = X.C46474Dfc.A01(r8, r5, r0, r1)
            androidx.fragment.app.Fragment r0 = r2.A02(r8, r0)
            r3.A0E(r0)
            r3.A04()
        L_0x00c0:
            return r10
        L_0x00c1:
            r15 = r10
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HW8.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
