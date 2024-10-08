package com.instagram.brandedcontent.disclosure;

import X.2Fk;
import X.AnonymousClass2Fj;
import X.JTO;
import com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi;
import com.instagram.common.session.UserSession;

public final class BrandedContentDisclosureViewModel extends BrandedContentDisclosureBaseViewModel {
    public final 2Fk A00;
    public final AnonymousClass2Fj A01;
    public final UserSession A02;
    public final BrandedContentAdsApi A03;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 11
            boolean r0 = X.C66128MDg.A01(r3, r8)
            if (r0 == 0) goto L_0x0077
            r5 = r8
            X.MDg r5 = (X.C66128MDg) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0077
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 != r3) goto L_0x0082
            java.lang.Object r4 = r5.A01
            X.2YL r4 = (X.2YL) r4
            X.0eS.A00(r1)
        L_0x0028:
            boolean r0 = r1 instanceof X.C239793Ih
            r3 = 0
            if (r0 == 0) goto L_0x0054
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 23
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r3, (int) r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r2)
            X.3Ih r1 = X.C41845B3m.A0d(r0)
        L_0x0040:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0051
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007d
            X.6oS r1 = X.C318116oQ.A00(r4)
            r0 = 24
            X.MH8.A03(r4, r1, r0)
        L_0x0051:
            X.0gF r4 = X.C60340gF.A00
        L_0x0053:
            return r4
        L_0x0054:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0040
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005d:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r2 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r2.<init>(r0)
            java.util.List r1 = r6.A07
            java.util.List r0 = r6.A06
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r1 = r2.A04(r7, r1, r0, r5)
            if (r1 == r4) goto L_0x0053
            r4 = r6
            goto L_0x0028
        L_0x0077:
            X.MDg r5 = new X.MDg
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x007d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel.A09(java.lang.String, X.4D7):java.lang.Object");
    }

    public BrandedContentDisclosureViewModel(BrandedContentAdsApi brandedContentAdsApi, UserSession userSession) {
        super(brandedContentAdsApi, userSession);
        this.A02 = userSession;
        this.A03 = brandedContentAdsApi;
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A01 = A0K;
        this.A00 = A0K;
    }
}
