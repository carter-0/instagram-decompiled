package com.instagram.brandedcontent.repository;

import X.0qQ;
import com.instagram.common.session.UserSession;

public final class BrandedContentApi {
    public final UserSession A00;

    public BrandedContentApi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r10, java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r9 = this;
            r5 = 3
            boolean r0 = X.JUG.A03(r5, r12)
            if (r0 == 0) goto L_0x005a
            r4 = r12
            X.JUG r4 = (X.JUG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r7) goto L_0x008f
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005f
            return r1
        L_0x002b:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r9.A00
            X.1NY r8 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "business/branded_content/change_approval_request_status_for_creator/"
            r8.A0A(r0)
            java.lang.Class<X.K16> r1 = X.K16.class
            java.lang.Class<X.LHb> r0 = X.C63983LHb.class
            r2 = 0
            r8.A0O(r3, r1, r0, r2)
            java.lang.String r0 = "creator_igid"
            r8.A9m(r0, r11)
            java.lang.String r1 = r10.A00
            java.lang.String r0 = "new_status"
            X.1OC r1 = X.DbT.A0T(r8, r0, r1)
            r4.A00 = r7
            r0 = 1444377988(0x56177584, float:4.1632745E13)
            java.lang.Object r1 = r1.A02(r4, r0, r5, r2)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x005a:
            X.JUG r4 = X.JUG.A00(r9, r12, r5)
            goto L_0x0015
        L_0x005f:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x008a
            X.4dm r1 = X.JTP.A0N(r1)
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x007c
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r0 = r1.A00
            X.1XQ r0 = (X.1XQ) r0
            int r0 = r0.mStatusCode
            java.lang.Integer r0 = X.JTO.A0w(r0)
            X.5sO r6 = X.C41845B3m.A0c(r0)
            return r6
        L_0x007c:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x0085
            X.5sO r6 = X.C41845B3m.A0c(r3)
            return r6
        L_0x0085:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A00(com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.api.schemas.BrandedContentGatingInfo r10, com.instagram.api.schemas.BrandedContentProjectMetadataIntf r11, java.lang.String r12, java.util.List r13, java.util.List r14, X.AnonymousClass4D7 r15, boolean r16) {
        /*
            r9 = this;
            r3 = 6
            boolean r0 = X.JUG.A03(r3, r15)
            if (r0 == 0) goto L_0x006d
            r4 = r15
            X.JUG r4 = (X.JUG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r4.A01
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r6 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r6) goto L_0x0077
            X.0eS.A00(r0)
        L_0x0023:
            r5 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0030
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0072
            X.5sO r5 = X.DbU.A0f()
        L_0x0030:
            return r5
        L_0x0031:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r8 = r9.A00
            r7 = 0
            r3 = 0
            X.1NY r2 = X.AnonymousClass7TG.A0a(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r12}
            java.lang.String r0 = "media/%s/edit_media/"
            X.DbU.A1P(r2, r0, r1)
            java.lang.Class<X.K1b> r1 = X.C61290K1b.class
            java.lang.Class<X.LJl> r0 = X.C64024LJl.class
            r2.A0O(r3, r1, r0, r7)
            r0 = r16
            X.LSV.A04(r2, r8, r13, r14, r0)
            X.LSV.A02(r2, r10)
            if (r11 == 0) goto L_0x005a
            com.instagram.api.schemas.BrandedContentProjectMetadata r3 = r11.F0y()
        L_0x005a:
            X.LSV.A03(r2, r3)
            X.1OC r1 = r2.A0M()
            r4.A00 = r6
            r0 = 146206461(0x8b6eefd, float:1.1009912E-33)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r5) goto L_0x0023
            return r5
        L_0x006d:
            X.JUG r4 = X.JUG.A00(r9, r15, r3)
            goto L_0x0015
        L_0x0072:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A01(com.instagram.api.schemas.BrandedContentGatingInfo, com.instagram.api.schemas.BrandedContentProjectMetadataIntf, java.lang.String, java.util.List, java.util.List, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r8 = this;
            r3 = 4
            boolean r0 = X.JUG.A03(r3, r11)
            if (r0 == 0) goto L_0x0070
            r5 = r11
            X.JUG r5 = (X.JUG) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0070
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 0
            r7 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r7) goto L_0x00aa
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007a
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.K0t r0 = (X.C61282K0t) r0
            X.MWZ r0 = r0.A00
            if (r0 != 0) goto L_0x0075
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003c:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1NY r3 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "business/branded_content/update_whitelist_settings/"
            r3.A0A(r0)
            java.lang.Class<X.K0t> r2 = X.C61282K0t.class
            java.lang.Class<X.LHB> r1 = X.LHB.class
            r0 = 0
            r3.A0O(r4, r2, r1, r0)
            if (r9 == 0) goto L_0x0059
            java.lang.String r0 = "added_user_id"
            r3.A9m(r0, r9)
        L_0x0059:
            if (r10 == 0) goto L_0x0060
            java.lang.String r0 = "removed_user_id"
            r3.A9m(r0, r10)
        L_0x0060:
            X.1OC r1 = r3.A0M()
            r5.A00 = r7
            r0 = 50545580(0x30343ac, float:3.8575123E-37)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x0070:
            X.JUG r5 = X.JUG.A00(r8, r11, r3)
            goto L_0x0015
        L_0x0075:
            X.3Ih r6 = X.C41845B3m.A0d(r0)
            return r6
        L_0x007a:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00a5
            X.4dm r1 = X.JTP.A0N(r1)
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0097
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r0 = r1.A00
            X.1XQ r0 = (X.1XQ) r0
            int r0 = r0.mStatusCode
            java.lang.Integer r0 = X.JTO.A0w(r0)
            X.5sO r6 = X.C41845B3m.A0c(r0)
            return r6
        L_0x0097:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x00a0
            X.5sO r6 = X.C41845B3m.A0c(r4)
            return r6
        L_0x00a0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a5:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A03(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r8, java.util.List r9, java.util.List r10, X.AnonymousClass4D7 r11) {
        /*
            r7 = this;
            r3 = 5
            boolean r0 = X.JUG.A03(r3, r11)
            if (r0 == 0) goto L_0x0061
            r5 = r11
            X.JUG r5 = (X.JUG) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r6 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r6) goto L_0x006b
            X.0eS.A00(r0)
        L_0x0023:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0030
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0066
            X.5sO r4 = X.DbU.A0f()
        L_0x0030:
            return r4
        L_0x0031:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r3 = r7.A00
            X.1NY r2 = X.AnonymousClass7TG.A0a(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "media/%s/edit_media/"
            X.DbU.A1P(r2, r0, r1)
            java.lang.Class<X.K1b> r1 = X.C61290K1b.class
            java.lang.Class<X.LJl> r0 = X.C64024LJl.class
            r2.A0Q(r1, r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r10)
            X.LSV.A04(r2, r3, r9, r10, r0)
            X.1OC r1 = r2.A0M()
            r5.A00 = r6
            r0 = 146206461(0x8b6eefd, float:1.1009912E-33)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0023
            return r4
        L_0x0061:
            X.JUG r5 = X.JUG.A00(r7, r11, r3)
            goto L_0x0015
        L_0x0066:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A04(java.lang.String, java.util.List, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r5 = 1
            boolean r0 = X.JUG.A03(r5, r8)
            if (r0 == 0) goto L_0x005c
            r4 = r8
            X.JUG r4 = (X.JUG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            if (r1 == 0) goto L_0x0030
            if (r1 != r5) goto L_0x0066
            X.0eS.A00(r0)
        L_0x0022:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x002f
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0061
            X.5sO r3 = X.DbU.A0f()
        L_0x002f:
            return r3
        L_0x0030:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "business/branded_content/get_pending_approval_requests_for_brand/"
            r2.A0A(r0)
            java.lang.Class<X.K1J> r1 = X.K1J.class
            java.lang.Class<X.LHc> r0 = X.C63984LHc.class
            r2.A0Q(r1, r0)
            if (r7 == 0) goto L_0x004c
            java.lang.String r0 = "cursor"
            r2.A9m(r0, r7)
        L_0x004c:
            X.1OC r1 = r2.A0M()
            r4.A00 = r5
            r0 = 132968731(0x7ecf11b, float:3.5651042E-34)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L_0x0022
            return r3
        L_0x005c:
            X.JUG r4 = X.JUG.A00(r6, r8, r5)
            goto L_0x0015
        L_0x0061:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A06(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 2
            boolean r0 = X.JUG.A03(r3, r10)
            if (r0 == 0) goto L_0x0053
            r6 = r10
            X.JUG r6 = (X.JUG) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0053
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A01
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r5) goto L_0x008a
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0058
            return r1
        L_0x002b:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1NY r3 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "business/branded_content/create_brand_approval_request/"
            r3.A0A(r0)
            java.lang.Class<X.K0y> r2 = X.C61287K0y.class
            java.lang.Class<X.LHY> r1 = X.LHY.class
            r0 = 0
            r3.A0O(r4, r2, r1, r0)
            java.lang.String r0 = "brand_igid"
            X.1OC r1 = X.DbT.A0T(r3, r0, r9)
            r6.A00 = r5
            r0 = 2124031084(0x7e9a246c, float:1.0244511E38)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r7) goto L_0x0024
            return r7
        L_0x0053:
            X.JUG r6 = X.JUG.A00(r8, r10, r3)
            goto L_0x0015
        L_0x0058:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0085
            X.4dm r1 = X.JTP.A0N(r1)
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0077
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r0 = r1.A00
            X.1XR r0 = (X.1XR) r0
            int r0 = r0.getStatusCode()
            java.lang.Integer r0 = X.JTO.A0w(r0)
            X.5sO r7 = X.C41845B3m.A0c(r0)
            return r7
        L_0x0077:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x0080
            X.5sO r7 = X.C41845B3m.A0c(r4)
            return r7
        L_0x0080:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0085:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A07(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 7
            boolean r0 = X.JUG.A03(r3, r7)
            if (r0 == 0) goto L_0x0065
            r4 = r7
            X.JUG r4 = (X.JUG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0065
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r2) goto L_0x006f
            X.0eS.A00(r1)
        L_0x0023:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x002f
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x006a
            X.5sO r1 = X.DbU.A0f()
        L_0x002f:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0038
            X.3Ih r1 = X.JTT.A0j(r2)
        L_0x0037:
            return r1
        L_0x0038:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0037
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0041:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1NY r1 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "business/branded_content/update_branded_content_opt_in_status/"
            X.Dba.A1H(r1, r0)
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.1OC r1 = X.DbT.A0T(r1, r0, r6)
            r4.A00 = r2
            r0 = 649201540(0x26b20784, float:1.2353268E-15)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r3) goto L_0x0023
            return r3
        L_0x0065:
            X.JUG r4 = X.JUG.A00(r5, r7, r3)
            goto L_0x0015
        L_0x006a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x006f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A08(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0C(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 0
            boolean r0 = X.JUG.A03(r3, r7)
            if (r0 == 0) goto L_0x0053
            r5 = r7
            X.JUG r5 = (X.JUG) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0053
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r3) goto L_0x005d
            X.0eS.A00(r0)
        L_0x0023:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0030
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0058
            X.5sO r4 = X.DbU.A0f()
        L_0x0030:
            return r4
        L_0x0031:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "business/branded_content/get_pending_approval_requests_for_creator/"
            r2.A0A(r0)
            java.lang.Class<X.K1J> r1 = X.K1J.class
            java.lang.Class<X.LHc> r0 = X.C63984LHc.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r5.A00 = r3
            r0 = 1900719496(0x714aad88, float:1.0036121E30)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0023
            return r4
        L_0x0053:
            X.JUG r5 = X.JUG.A00(r6, r7, r3)
            goto L_0x0015
        L_0x0058:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A0C(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r8, java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r7 = this;
            r4 = 47
            boolean r0 = X.ME4.A03(r4, r10)
            if (r0 == 0) goto L_0x0070
            r3 = r10
            X.ME4 r3 = (X.ME4) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0070
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r5) goto L_0x007a
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0075
            X.5sO r4 = X.DbU.A0f()
        L_0x0031:
            return r4
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r7.A00
            r6 = 0
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "business/branded_content/bc_pending_tag_megaphone_for_brand/"
            r2.A0A(r0)
            java.lang.Class<X.Dw6> r1 = X.Dw6.class
            java.lang.Class<X.F4n> r0 = X.C49748F4n.class
            r2.A0Q(r1, r0)
            java.lang.String r0 = X.Dbp.A01()
            r2.A9m(r0, r8)
            if (r9 == 0) goto L_0x0060
            java.lang.String r0 = "_"
            java.util.List r0 = X.DbV.A18(r9, r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = X.C51966G9m.A1G(r0, r6)
            X.JTO.A1W(r2, r0)
        L_0x0060:
            X.1OC r1 = r2.A0M()
            r3.A00 = r5
            r0 = 141471847(0x86eb067, float:7.182788E-34)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x0070:
            X.ME4 r3 = X.ME4.A00(r7, r10, r4)
            goto L_0x0016
        L_0x0075:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A02(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 45
            boolean r0 = X.ME4.A03(r3, r10)
            if (r0 == 0) goto L_0x0054
            r6 = r10
            X.ME4 r6 = (X.ME4) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0054
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r5) goto L_0x0089
            X.0eS.A00(r1)
        L_0x0025:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0059
            return r1
        L_0x002c:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1NY r3 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "business/branded_content/cancel_brand_approval_request_for_creator/"
            r3.A0A(r0)
            java.lang.Class<X.K16> r2 = X.K16.class
            java.lang.Class<X.LHb> r1 = X.C63983LHb.class
            r0 = 0
            r3.A0O(r4, r2, r1, r0)
            java.lang.String r0 = "brand_igid"
            X.1OC r1 = X.DbT.A0T(r3, r0, r9)
            r6.A00 = r5
            r0 = 1367811425(0x51872561, float:7.2555962E10)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r7) goto L_0x0025
            return r7
        L_0x0054:
            X.ME4 r6 = X.ME4.A00(r8, r10, r3)
            goto L_0x0016
        L_0x0059:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0084
            X.4dm r1 = X.JTP.A0N(r1)
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0076
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r0 = r1.A00
            X.1XQ r0 = (X.1XQ) r0
            int r0 = r0.mStatusCode
            java.lang.Integer r0 = X.JTO.A0w(r0)
            X.5sO r7 = X.C41845B3m.A0c(r0)
            return r7
        L_0x0076:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x007f
            X.5sO r7 = X.C41845B3m.A0c(r4)
            return r7
        L_0x007f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0084:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0089:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A05(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.util.List r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 49
            boolean r0 = X.ME4.A03(r3, r9)
            if (r0 == 0) goto L_0x0076
            r6 = r9
            X.ME4 r6 = (X.ME4) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0076
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 != r4) goto L_0x008e
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0032
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0089
            X.5sO r1 = X.DbU.A0f()
        L_0x0032:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007b
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.CCy r0 = (X.C43780CCy) r0
            X.Jx8 r0 = r0.A00
            if (r0 != 0) goto L_0x0084
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0048:
            X.0eS.A00(r1)
            java.lang.String r3 = X.C51970G9q.A0k(r8)
            X.0qQ.A07(r3)
            com.instagram.common.session.UserSession r0 = r7.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "business/branded_content/get_organic_permission_with_brands/"
            r2.A0A(r0)
            java.lang.Class<X.CCy> r1 = X.C43780CCy.class
            java.lang.Class<X.Cxn> r0 = X.C45513Cxn.class
            r2.A0Q(r1, r0)
            java.lang.String r0 = "brand_ids"
            X.1OC r1 = X.DbT.A0T(r2, r0, r3)
            r6.A00 = r4
            r0 = 903993422(0x35e1d84e, float:1.6826759E-6)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0076:
            X.ME4 r6 = X.ME4.A00(r7, r9, r3)
            goto L_0x0016
        L_0x007b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0088
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0084:
            X.3Ih r1 = X.C41845B3m.A0d(r0)
        L_0x0088:
            return r1
        L_0x0089:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A09(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 46
            boolean r0 = X.ME4.A03(r3, r7)
            if (r0 == 0) goto L_0x0054
            r5 = r7
            X.ME4 r5 = (X.ME4) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0054
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r3) goto L_0x005e
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0059
            X.5sO r4 = X.DbU.A0f()
        L_0x0031:
            return r4
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "business/branded_content/get_whitelist_sponsors/"
            r2.A0A(r0)
            java.lang.Class<X.K15> r1 = X.K15.class
            java.lang.Class<X.LHZ> r0 = X.LHZ.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r5.A00 = r3
            r0 = 1923560763(0x72a7353b, float:6.6237886E30)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x0054:
            X.ME4 r5 = X.ME4.A00(r6, r7, r3)
            goto L_0x0016
        L_0x0059:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A0A(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0B(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 48
            boolean r0 = X.ME4.A03(r3, r7)
            if (r0 == 0) goto L_0x006a
            r5 = r7
            X.ME4 r5 = (X.ME4) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 != r3) goto L_0x0082
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0032
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007d
            X.5sO r1 = X.DbU.A0f()
        L_0x0032:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006f
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.K0t r0 = (X.C61282K0t) r0
            X.MWZ r0 = r0.A00
            if (r0 != 0) goto L_0x0078
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0048:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "business/branded_content/get_whitelist_settings/"
            r2.A0A(r0)
            java.lang.Class<X.K0t> r1 = X.C61282K0t.class
            java.lang.Class<X.LHB> r0 = X.LHB.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r5.A00 = r3
            r0 = 2034397097(0x79426fa9, float:6.3098145E34)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x006a:
            X.ME4 r5 = X.ME4.A00(r6, r7, r3)
            goto L_0x0016
        L_0x006f:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x007c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0078:
            X.3Ih r1 = X.C41845B3m.A0d(r0)
        L_0x007c:
            return r1
        L_0x007d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A0B(X.4D7):java.lang.Object");
    }
}
