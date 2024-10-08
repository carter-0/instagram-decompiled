package com.instagram.shopping.repository.mediafeed;

import X.02z;
import X.05G;
import X.0sn;
import X.10b;
import X.1E7;
import X.1Xi;
import X.1Xj;
import X.AnonymousClass0r6;
import X.AnonymousClass7TE;
import X.C61066Jw4;
import X.DbS;
import X.DbW;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class FeaturedProductsMediaFeedRepository {
    public final AnonymousClass0r6 A00;
    public final UserSession A01;
    public final String A02;
    public final 05G A03;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 4
            boolean r0 = X.C66139MDr.A01(r3, r7)
            if (r0 == 0) goto L_0x0072
            r5 = r7
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0072
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 != r3) goto L_0x0085
            java.lang.Object r1 = r5.A01
            com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository r1 = (com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository) r1
            X.0eS.A00(r2)
        L_0x0027:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0054
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.CFf r0 = (X.C43839CFf) r0
            X.05G r5 = r1.A03
            java.lang.Object r1 = r5.getValue()
            X.Jw4 r1 = (X.C61066Jw4) r1
            X.CuG r0 = r0.A00
            if (r0 == 0) goto L_0x007b
            java.util.List r4 = r0.A00
            if (r4 == 0) goto L_0x0078
            boolean r3 = r0.A01
            boolean r2 = r1.A02
            r1 = 10
            X.Jw4 r0 = new X.Jw4
            r0.<init>((java.util.List) r4, (int) r1, (boolean) r3, (boolean) r2)
            r5.Epw(r0)
        L_0x0051:
            X.0gF r4 = X.C60340gF.A00
        L_0x0053:
            return r4
        L_0x0054:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0051
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005d:
            X.0eS.A00(r2)
            com.instagram.shopping.repository.featuredproducts.FeaturedProductsMediaApi r2 = com.instagram.shopping.repository.featuredproducts.FeaturedProductsMediaApi.A00
            com.instagram.common.session.UserSession r1 = r6.A01
            java.lang.String r0 = r6.A02
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r2 = r2.A00(r1, r0, r5)
            if (r2 == r4) goto L_0x0053
            r1 = r6
            goto L_0x0027
        L_0x0072:
            X.MDr r5 = new X.MDr
            r5.<init>(r6, r7, r3)
            goto L_0x0015
        L_0x0078:
            java.lang.String r0 = "mediaFeed"
            goto L_0x007d
        L_0x007b:
            java.lang.String r0 = "pivotItems"
        L_0x007d:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0085:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository.A00(X.4D7):java.lang.Object");
    }

    public FeaturedProductsMediaFeedRepository(UserSession userSession, String str, String str2, boolean z) {
        List list;
        boolean A1Y = DbW.A1Y(str);
        this.A01 = userSession;
        this.A02 = str;
        if (z) {
            1Xj A022 = 1E7.A00(userSession).A02(str2 != null ? str2 : str);
            if (A022 != null) {
                list = AnonymousClass7TE.A1I(1Xi.A01(A022));
                02z A10 = DbS.A10(new C61066Jw4(list, 10, A1Y, false));
                this.A03 = A10;
                this.A00 = 10b.A03(A10);
            }
        }
        list = 0sn.A00;
        02z A102 = DbS.A10(new C61066Jw4(list, 10, A1Y, false));
        this.A03 = A102;
        this.A00 = 10b.A03(A102);
    }
}
