package com.instagram.creator.inspiration.repository;

import X.02z;
import X.05G;
import X.106;
import X.1E4;
import X.1E5;
import X.1E6;
import X.1vm;
import X.AnonymousClass0Ud;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C55936Hq0;
import X.C59702JUj;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class CreatorInspirationHubAccountsRepository {
    public final 1E6 A00;
    public final UserSession A01;
    public final C55936Hq0 A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017d, code lost:
        if (r2 != null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0181, code lost:
        if (r2 != null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0185, code lost:
        if (r2 != null) goto L_0x013c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            r4 = 17
            boolean r0 = X.C66129MDh.A01(r4, r14)
            if (r0 == 0) goto L_0x00bd
            r3 = r14
            X.MDh r3 = (X.C66129MDh) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bd
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x00a9
            if (r0 != r4) goto L_0x00cd
            java.lang.Object r3 = r3.A01
            com.instagram.creator.inspiration.repository.CreatorInspirationHubAccountsRepository r3 = (com.instagram.creator.inspiration.repository.CreatorInspirationHubAccountsRepository) r3
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00c4
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.util.List r9 = r3.A03
            java.lang.Object r2 = r0.A01
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl r2 = (com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl) r2
            if (r2 == 0) goto L_0x00d2
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub r0 = r2.A0E()
            if (r0 == 0) goto L_0x00d2
            com.google.common.collect.ImmutableList r0 = r0.A0E()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent r0 = (com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent) r0
            if (r0 == 0) goto L_0x00d2
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent$Data r6 = r0.A0E()
            if (r6 == 0) goto L_0x00d2
            java.lang.Class<com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent$Data$AccountsSectionContentData> r5 = com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.AccountsSectionContentData.class
            r1 = -1283851880(0xffffffffb379f998, float:-5.8201834E-8)
            java.lang.String r0 = "accounts_section_content_data"
            X.3lr r6 = r6.A04(r5, r0, r1)
            if (r6 == 0) goto L_0x00d2
            java.lang.Class<com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent$Data$AccountsSectionContentData$UserItems> r5 = com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.AccountsSectionContentData.UserItems.class
            r1 = -924154888(0xffffffffc8ea83f8, float:-480287.75)
            java.lang.String r0 = "user_items"
            com.google.common.collect.ImmutableList r1 = r6.A06(r5, r0, r1)
            if (r1 == 0) goto L_0x00d2
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x0078:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00d6
            X.3lr r6 = X.C41845B3m.A0V(r10)
            java.lang.Class<com.instagram.creator.inspiration.repository.graphql.UserInfoFragmentImpl> r5 = com.instagram.creator.inspiration.repository.graphql.UserInfoFragmentImpl.class
            r1 = 1766112135(0x6944bb87, float:1.486469E25)
            X.3lr r5 = r6.A01(r5, r1)
            X.1E6 r8 = r3.A00
            r7 = 0
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r1 = com.instagram.user.model.ImmutablePandoUserDict.class
            com.facebook.pando.TreeJNI r6 = r5.reinterpret(r1)
            X.0qQ.A07(r6)
            com.instagram.user.model.ImmutablePandoUserDict r6 = (com.instagram.user.model.ImmutablePandoUserDict) r6
            r5 = 6
            X.1E9 r1 = new X.1E9
            r1.<init>(r8, r5, r7)
            com.instagram.user.model.User r1 = X.1aC.A01(r1, r6)
            r0.add(r1)
            goto L_0x0078
        L_0x00a9:
            X.0eS.A00(r1)
            X.Hq0 r1 = r12.A02
            r3.A01 = r12
            r3.A00 = r4
            java.lang.String r0 = "accounts"
            java.lang.Object r1 = r1.A00(r0, r13, r3, r4)
            if (r1 == r2) goto L_0x017b
            r3 = r12
            goto L_0x0028
        L_0x00bd:
            X.MDh r3 = new X.MDh
            r3.<init>(r12, r14, r4)
            goto L_0x0016
        L_0x00c4:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0169
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00cd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d2:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
        L_0x00d6:
            r9.addAll(r0)
            X.05G r5 = r3.A04
            X.62P r11 = X.AnonymousClass62Q.A00(r9)
            if (r11 != 0) goto L_0x00e3
            X.0sn r11 = X.0sn.A00
        L_0x00e3:
            r7 = 0
            if (r2 == 0) goto L_0x017c
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub r0 = r2.A0E()
            if (r0 == 0) goto L_0x017c
            com.google.common.collect.ImmutableList r0 = r0.A0F()
            if (r0 == 0) goto L_0x017c
            java.lang.Object r6 = X.00k.A0J(r0)
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$Sections r6 = (com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections) r6
            if (r6 == 0) goto L_0x017c
            r1 = 2
            java.lang.String r0 = "section_id"
            java.lang.String r8 = X.C41847B3o.A1A(r6, r0, r1)
        L_0x0101:
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub r0 = r2.A0E()
            if (r0 == 0) goto L_0x0180
            com.google.common.collect.ImmutableList r0 = r0.A0F()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r6 = X.00k.A0J(r0)
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x0180
            r1 = 4
            java.lang.String r0 = "title_text"
            java.lang.String r9 = X.C41847B3o.A1A(r6, r0, r1)
        L_0x011c:
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub r0 = r2.A0E()
            if (r0 == 0) goto L_0x0184
            com.google.common.collect.ImmutableList r0 = r0.A0E()
            if (r0 == 0) goto L_0x0184
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent r0 = (com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent) r0
            if (r0 == 0) goto L_0x0184
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent$PagingInfo r1 = r0.A0F()
            if (r1 == 0) goto L_0x0184
            java.lang.String r0 = "max_id"
            java.lang.String r10 = r1.A07(r0)
        L_0x013c:
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub r0 = r2.A0E()
            if (r0 == 0) goto L_0x015b
            com.google.common.collect.ImmutableList r0 = r0.A0E()
            if (r0 == 0) goto L_0x015b
            java.lang.Object r2 = X.00k.A0J(r0)
            X.3lr r2 = (X.C250663lr) r2
            if (r2 == 0) goto L_0x015b
            r1 = 3
            java.lang.String r0 = "should_collapse"
            boolean r0 = r2.getRequiredBooleanField(r1, r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x015b:
            X.Jw0 r6 = new X.Jw0
            r6.<init>((java.lang.Boolean) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.util.List) r11)
            X.C41847B3o.A1T(r6, r5, r4)
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r1 = X.C41845B3m.A0d(r0)
        L_0x0169:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0179
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0188
            X.05G r2 = r3.A04
            java.lang.String r1 = "error"
            r0 = 0
            X.C41847B3o.A1T(r1, r2, r0)
        L_0x0179:
            X.0gF r2 = X.C60340gF.A00
        L_0x017b:
            return r2
        L_0x017c:
            r8 = r7
            if (r2 == 0) goto L_0x0180
            goto L_0x0101
        L_0x0180:
            r9 = r7
            if (r2 == 0) goto L_0x0184
            goto L_0x011c
        L_0x0184:
            r10 = r7
            if (r2 == 0) goto L_0x015b
            goto L_0x013c
        L_0x0188:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.inspiration.repository.CreatorInspirationHubAccountsRepository.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    public /* synthetic */ CreatorInspirationHubAccountsRepository(UserSession userSession) {
        C55936Hq0 hq0 = new C55936Hq0(userSession, 1vm.A01(userSession));
        1E5 A002 = 1E4.A00(userSession);
        AnonymousClass7TG.A1P(userSession, A002);
        this.A01 = userSession;
        this.A02 = hq0;
        this.A00 = A002;
        02z A012 = 106.A01(C59702JUj.A00);
        this.A04 = A012;
        this.A05 = A012;
    }
}
