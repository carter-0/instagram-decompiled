package com.instagram.brandedcontent.disclosure;

import X.02z;
import X.05G;
import X.0qQ;
import X.2Fk;
import X.C60996Jus;
import X.DbT;
import X.JTO;
import com.instagram.api.schemas.BCPDealOutputTypeEnum;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi;
import com.instagram.common.session.UserSession;

public final class BrandedContentDisclosureMenuViewModel extends BrandedContentDisclosureBaseViewModel {
    public C60996Jus A00;
    public C60996Jus A01;
    public boolean A02;
    public boolean A03;
    public final 2Fk A04;
    public final UserSession A05;
    public final 05G A06;
    public final BrandedContentAdsApi A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrandedContentDisclosureMenuViewModel(BrandedContentAdsApi brandedContentAdsApi, UserSession userSession) {
        super(brandedContentAdsApi, userSession);
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        this.A07 = brandedContentAdsApi;
        02z A1J = JTO.A1J();
        this.A06 = A1J;
        this.A04 = DbT.A0G(A1J);
    }

    public static final BrandedContentProjectMetadata A01(BrandedContentDisclosureMenuViewModel brandedContentDisclosureMenuViewModel) {
        C60996Jus jus = brandedContentDisclosureMenuViewModel.A01;
        if (jus == null) {
            return null;
        }
        BrandedContentProjectAction brandedContentProjectAction = BrandedContentProjectAction.ADD_MEDIA_TO_PROJECT;
        String str = jus.A05;
        String str2 = jus.A01;
        String str3 = jus.A02;
        String str4 = jus.A06;
        return new BrandedContentProjectMetadata((BCPDealOutputTypeEnum) null, brandedContentProjectAction, (Boolean) null, str2, str3, jus.A03, jus.A04, str, str4);
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(X.AnonymousClass4D7 r17) {
        /*
            r16 = this;
            r4 = 10
            r5 = r17
            boolean r0 = X.C66128MDg.A01(r4, r5)
            r3 = r16
            if (r0 == 0) goto L_0x00c3
            r14 = r5
            X.MDg r14 = (X.C66128MDg) r14
            int r2 = r14.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c3
            int r2 = r2 - r1
            r14.A00 = r2
        L_0x001a:
            java.lang.Object r4 = r14.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r14.A00
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0083
            if (r0 != r1) goto L_0x00cf
            java.lang.Object r3 = r14.A01
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel r3 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel) r3
            X.0eS.A00(r4)
        L_0x002d:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007a
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.K1b r0 = (X.C61290K1b) r0
            com.instagram.common.session.UserSession r2 = r3.A05
            X.1E8 r1 = X.1E7.A00(r2)
            X.1Xj r0 = r0.A00()
            r1.A03(r0)
            java.lang.String r0 = r3.A04
            if (r0 == 0) goto L_0x0053
            X.1Xj r0 = X.DbV.A0U(r2, r0)
            if (r0 == 0) goto L_0x0053
            r0.AE7(r2)
        L_0x0053:
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 21
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r5, (int) r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r2)
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x0066:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0077
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ca
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 22
            X.MH8.A03(r3, r1, r0)
        L_0x0077:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x007a:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0066
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0083:
            X.0eS.A00(r4)
            X.Jus r0 = r3.A01
            if (r0 == 0) goto L_0x00ad
            com.instagram.api.schemas.BrandedContentProjectMetadata r4 = A01(r3)
        L_0x008e:
            com.instagram.common.session.UserSession r0 = r3.A05
            com.instagram.brandedcontent.repository.BrandedContentApi r8 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r8.<init>(r0)
            java.lang.String r11 = r3.A04
            if (r11 == 0) goto L_0x00d4
            java.util.List r12 = r3.A07
            java.util.List r13 = r3.A06
            boolean r15 = r3.A0E
            com.instagram.api.schemas.BrandedContentGatingInfo r9 = r3.A01
            r14.A01 = r3
            r14.A00 = r1
            r10 = r4
            java.lang.Object r4 = r8.A01(r9, r10, r11, r12, r13, r14, r15)
            if (r4 != r2) goto L_0x002d
            return r2
        L_0x00ad:
            X.Jus r0 = r3.A00
            if (r0 == 0) goto L_0x00c1
            com.instagram.api.schemas.BrandedContentProjectAction r6 = com.instagram.api.schemas.BrandedContentProjectAction.REMOVE_MEDIA_FROM_PROJECT
            java.lang.String r12 = r0.A05
            com.instagram.api.schemas.BrandedContentProjectMetadata r4 = new com.instagram.api.schemas.BrandedContentProjectMetadata
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r13 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x008e
        L_0x00c1:
            r4 = r5
            goto L_0x008e
        L_0x00c3:
            X.MDg r14 = new X.MDg
            r14.<init>(r3, r5, r4)
            goto L_0x001a
        L_0x00ca:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel.A09(X.4D7):java.lang.Object");
    }
}
