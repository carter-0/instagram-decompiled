package com.instagram.brandedcontent.repository;

import X.02z;
import X.05G;
import X.1a8;
import X.1vn;
import X.2Dm;
import X.AnonymousClass0Ud;
import X.C318146oT;
import X.C51967G9n;
import X.C51970G9q;
import X.C61042Jvg;
import X.C64582LeO;
import X.DbS;
import X.JTO;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.monetization.api.MonetizationApi;

public final class BrandedContentSettingsRepository {
    public final BrandedContentProjectRepository A00;
    public final C64582LeO A01;
    public final BrandedContentApi A02;
    public final 1a8 A03 = new 1a8(C318146oT.A01);
    public final 2Dm A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0Ud A0B;
    public final AnonymousClass0Ud A0C;
    public final AnonymousClass0Ud A0D;
    public final 1vn A0E;
    public final MonetizationApi A0F;
    public final 05G A0G;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r6, X.AnonymousClass4D7 r7, boolean r8) {
        /*
            r5 = this;
            r3 = 9
            boolean r0 = X.JUG.A03(r3, r7)
            if (r0 == 0) goto L_0x0043
            r4 = r7
            X.JUG r4 = (X.JUG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0043
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r2) goto L_0x0048
            X.0eS.A00(r1)
        L_0x0024:
            boolean r0 = r1 instanceof X.C239793Ih
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002b:
            X.0eS.A00(r1)
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r1.<init>(r6)
            if (r8 == 0) goto L_0x0040
            java.lang.String r0 = "opted_in"
        L_0x0037:
            r4.A00 = r2
            java.lang.Object r1 = r1.A08(r0, r4)
            if (r1 != r3) goto L_0x0024
            return r3
        L_0x0040:
            java.lang.String r0 = "not_opted_in"
            goto L_0x0037
        L_0x0043:
            X.JUG r4 = X.JUG.A00(r5, r7, r3)
            goto L_0x0016
        L_0x0048:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentSettingsRepository.A00(com.instagram.common.session.UserSession, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.util.List r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 14
            boolean r0 = X.C66128MDg.A01(r3, r10)
            if (r0 == 0) goto L_0x0075
            r4 = r10
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 2
            r7 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r7) goto L_0x0053
            if (r0 != r5) goto L_0x007b
            X.0eS.A00(r2)
        L_0x0027:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x002a:
            X.0eS.A00(r2)
            com.instagram.monetization.api.MonetizationApi r6 = r8.A0F
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x0037:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.UserMonetizationProductType r0 = (com.instagram.api.schemas.UserMonetizationProductType) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            goto L_0x0037
        L_0x0049:
            r4.A01 = r8
            r4.A00 = r7
            X.MCA r2 = r6.A01(r2)
            r1 = r8
            goto L_0x0058
        L_0x0053:
            java.lang.Object r1 = r4.A01
            X.0eS.A00(r2)
        L_0x0058:
            r0 = 15
            X.MC9 r0 = X.MC9.A00(r2, r0)
            X.0qC r2 = new X.0qC
            r2.<init>(r0)
            r0 = 17
            X.MCj r1 = X.C66119MCj.A00(r1, r0)
            r0 = 0
            r4.A01 = r0
            r4.A00 = r5
            java.lang.Object r0 = r2.collect(r1, r4)
            if (r0 != r3) goto L_0x0027
            return r3
        L_0x0075:
            X.MDg r4 = new X.MDg
            r4.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentSettingsRepository.A01(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r2.getCoercedBooleanField(0, X.Pxd.A00(707)) != true) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r2 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r2.getCoercedBooleanField(1, X.Pxd.A00(823)) != true) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r3 = r5.A0G;
        r2 = new X.C61042Jvg(r4, r1, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        r1 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r18) {
        /*
            r17 = this;
            r5 = 13
            r6 = r18
            boolean r0 = X.C66128MDg.A01(r5, r6)
            r4 = r17
            if (r0 == 0) goto L_0x00c1
            r3 = r6
            X.MDg r3 = (X.C66128MDg) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c1
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r7 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x0084
            if (r0 != r1) goto L_0x00cd
            java.lang.Object r5 = r3.A01
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r5 = (com.instagram.brandedcontent.repository.BrandedContentSettingsRepository) r5
            X.0eS.A00(r7)
        L_0x002c:
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r0 = r7 instanceof X.C239793Ih
            r2 = 0
            r6 = 0
            if (r0 == 0) goto L_0x0077
            X.3lr r4 = X.C41846B3n.A0R(r7)
            if (r4 == 0) goto L_0x0058
            java.lang.Class<X.QWH> r3 = X.QWH.class
            r0 = 291(0x123, float:4.08E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            r0 = -1918912611(0xffffffff8d9fb79d, float:-9.843335E-31)
            X.3lr r2 = r4.getOptionalTreeField(r6, r2, r3, r0)
            if (r2 == 0) goto L_0x0058
            r0 = 707(0x2c3, float:9.91E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r2.getCoercedBooleanField(r6, r0)
            r4 = 1
            if (r0 == r1) goto L_0x005b
        L_0x0058:
            r4 = 0
            if (r2 == 0) goto L_0x0075
        L_0x005b:
            r0 = 823(0x337, float:1.153E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r2.getCoercedBooleanField(r1, r0)
            if (r0 != r1) goto L_0x0075
        L_0x0067:
            X.05G r3 = r5.A0G
            r0 = 3
            X.Jvg r2 = new X.Jvg
            r2.<init>((boolean) r4, (boolean) r1, (int) r0)
        L_0x006f:
            r3.Epw(r2)
            X.0gF r2 = X.C60340gF.A00
        L_0x0074:
            return r2
        L_0x0075:
            r1 = 0
            goto L_0x0067
        L_0x0077:
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c8
            X.05G r3 = r5.A0G
            r0 = 3
            X.Jvg r2 = new X.Jvg
            r2.<init>((int) r0, (int) r0, (boolean) r6)
            goto L_0x006f
        L_0x0084:
            X.0eS.A00(r7)
            r12 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r6 = X.C41845B3m.A05()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r0.getParamsCopy()
            java.lang.Class<X.QWI> r10 = X.QWI.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "IGCreatorDynamicAdsEligibility"
            r11 = 0
            r0 = 291(0x123, float:4.08E-43)
            java.lang.String r15 = X.Pxd.A00(r0)
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1vn r0 = r4.A0E
            r3.A01 = r4
            r3.A00 = r1
            java.lang.Object r7 = r0.A04(r5, r3)
            if (r7 == r2) goto L_0x0074
            r5 = r4
            goto L_0x002c
        L_0x00c1:
            X.MDg r3 = new X.MDg
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x00c8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00cd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentSettingsRepository.A02(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r7, boolean r8) {
        /*
            r6 = this;
            r3 = 10
            boolean r0 = X.JUG.A03(r3, r7)
            if (r0 == 0) goto L_0x0057
            r5 = r7
            X.JUG r5 = (X.JUG) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r2 = r5.A00
            r1 = 1
            if (r2 == 0) goto L_0x002b
            if (r2 != r1) goto L_0x005c
            X.0eS.A00(r0)
        L_0x0024:
            boolean r0 = r0 instanceof X.C239793Ih
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002b:
            X.0eS.A00(r0)
            com.instagram.brandedcontent.repository.BrandedContentApi r0 = r6.A02
            r5.A00 = r1
            if (r8 == 0) goto L_0x0054
            java.lang.String r1 = "business/branded_content/onboard_creator_to_creator_marketplace/"
        L_0x0036:
            com.instagram.common.session.UserSession r0 = r0.A00
            r3 = 19346664(0x12734e8, float:3.0711014E-38)
            X.1NY r2 = new X.1NY
            r2.<init>(r0, r3)
            r2.A04()
            r2.A0E = r1
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r0 = X.DbU.A0S(r2, r1, r0)
            java.lang.Object r0 = r0.A00(r3, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x0054:
            java.lang.String r1 = "business/branded_content/offboard_creator_from_creator_marketplace/"
            goto L_0x0036
        L_0x0057:
            X.JUG r5 = X.JUG.A00(r6, r7, r3)
            goto L_0x0016
        L_0x005c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentSettingsRepository.A03(X.4D7, boolean):java.lang.Object");
    }

    public BrandedContentSettingsRepository(BrandedContentProjectRepository brandedContentProjectRepository, C64582LeO leO, BrandedContentApi brandedContentApi, 2Dm r7, 1vn r8, MonetizationApi monetizationApi) {
        this.A0F = monetizationApi;
        this.A02 = brandedContentApi;
        this.A04 = r7;
        this.A00 = brandedContentProjectRepository;
        this.A01 = leO;
        this.A0E = r8;
        02z A1J = JTO.A1J();
        this.A07 = A1J;
        this.A0D = A1J;
        02z A0u = C51967G9n.A0u();
        this.A06 = A0u;
        this.A0C = A0u;
        02z A10 = C51970G9q.A10(false);
        this.A05 = A10;
        this.A0B = A10;
        02z A102 = DbS.A10(new C61042Jvg(3, 3, false));
        this.A0G = A102;
        this.A08 = A102;
        this.A0A = brandedContentProjectRepository.A02;
        this.A09 = leO.A05;
    }
}
