package com.instagram.creator.inspiration.repository;

import X.0qQ;
import X.1vm;
import X.C55936Hq0;
import X.C63967LFt;
import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;

public final class CreatorInspirationHubAudioPagingSource extends PagingSource {
    public final UserSession A00;
    public final C55936Hq0 A01;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.LCU r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            r3 = 32
            boolean r0 = X.MED.A04(r3, r14)
            if (r0 == 0) goto L_0x009f
            r5 = r14
            X.MED r5 = (X.MED) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r9 = 1
            if (r0 == 0) goto L_0x007e
            if (r0 != r9) goto L_0x01da
            java.lang.Object r8 = r5.A03
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r7 = r5.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r1 = r5.A01
            com.instagram.creator.inspiration.repository.CreatorInspirationHubAudioPagingSource r1 = (com.instagram.creator.inspiration.repository.CreatorInspirationHubAudioPagingSource) r1
            X.0eS.A00(r4)
        L_0x0030:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0188
            com.instagram.common.session.UserSession r0 = r1.A00
            X.HsS r11 = X.HZR.A00(r0)
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl r0 = (com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl) r0
            r6 = 0
            if (r0 == 0) goto L_0x00ee
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub r5 = r0.A0E()
            if (r5 == 0) goto L_0x00ee
            com.google.common.collect.ImmutableList r0 = r5.A0F()
            if (r0 == 0) goto L_0x00a6
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x005d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r2 = r3.next()
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$Sections r2 = (com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections) r2
            r1 = 2
            java.lang.String r0 = "section_id"
            java.lang.String r1 = X.C41847B3o.A1A(r2, r0, r1)
            X.N4R r0 = new X.N4R
            r0.<init>((com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections) r2)
            r8.put(r1, r0)
            X.0gF r0 = X.C60340gF.A00
            r4.add(r0)
            goto L_0x005d
        L_0x007e:
            X.0eS.A00(r4)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()
            X.Hq0 r2 = r12.A01
            r1 = 0
            r5.A01 = r12
            r5.A02 = r7
            r5.A03 = r8
            r5.A00 = r9
            java.lang.String r0 = "audios"
            java.lang.Object r4 = r2.A00(r0, r1, r5, r9)
            if (r4 != r3) goto L_0x009d
            return r3
        L_0x009d:
            r1 = r12
            goto L_0x0030
        L_0x009f:
            X.MED r5 = new X.MED
            r5.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x00a6:
            com.google.common.collect.ImmutableList r0 = r5.A0E()
            if (r0 == 0) goto L_0x00ee
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x00b4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00ee
            X.3lr r3 = X.C41845B3m.A0V(r4)
            if (r3 == 0) goto L_0x00d8
            r1 = 3
            java.lang.String r0 = "should_collapse"
            boolean r0 = r3.getRequiredBooleanField(r1, r0)
            if (r0 == 0) goto L_0x00d8
            r1 = 2
            java.lang.String r0 = "section_id"
            java.lang.String r0 = X.C41847B3o.A1A(r3, r0, r1)
            java.lang.Object r0 = r8.remove(r0)
        L_0x00d4:
            r2.add(r0)
            goto L_0x00b4
        L_0x00d8:
            r1 = 2
            java.lang.String r0 = "section_id"
            java.lang.String r0 = X.C41847B3o.A1A(r3, r0, r1)
            java.lang.Object r0 = r8.get(r0)
            X.N4R r0 = (X.N4R) r0
            if (r0 == 0) goto L_0x00ec
            r0.A00 = r3
            X.0gF r0 = X.C60340gF.A00
            goto L_0x00d4
        L_0x00ec:
            r0 = r6
            goto L_0x00d4
        L_0x00ee:
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x017f
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x00fe:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x017f
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.Object r2 = r8.get(r0)
            X.N4R r2 = (X.N4R) r2
            if (r2 == 0) goto L_0x00fe
            java.lang.Object r1 = r2.A02
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$Sections r1 = (com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections) r1
            if (r1 == 0) goto L_0x0124
            X.KQ2 r0 = new X.KQ2
            r0.<init>(r1)
            r7.add(r0)
        L_0x0124:
            java.lang.Object r0 = r2.A00
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent r0 = (com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent) r0
            if (r0 == 0) goto L_0x00fe
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent$Data r3 = r0.A0E()
            if (r3 == 0) goto L_0x00fe
            java.lang.Class<com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent$Data$AudiosSectionContentData> r2 = com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.AudiosSectionContentData.class
            r1 = -701503055(0xffffffffd62fe9b1, float:-4.8354558E13)
            java.lang.String r0 = "audios_section_content_data"
            X.3lr r3 = r3.getOptionalTreeField(r9, r0, r2, r1)
            if (r3 == 0) goto L_0x00fe
            java.lang.Class<com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent$Data$AudiosSectionContentData$AudioItems> r2 = com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.AudiosSectionContentData.AudioItems.class
            r1 = -1820006451(0xffffffff9384e7cd, float:-3.3550058E-27)
            r5 = 0
            java.lang.String r0 = "audio_items"
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r5, r0, r2, r1)
            if (r0 == 0) goto L_0x00fe
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0153:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00fe
            X.3lr r2 = X.C41845B3m.A0V(r3)
            if (r2 == 0) goto L_0x017d
            java.lang.Class<com.instagram.creator.inspiration.repository.graphql.AudioFragmentImpl> r1 = com.instagram.creator.inspiration.repository.graphql.AudioFragmentImpl.class
            r0 = -1423030943(0xffffffffab2e4561, float:-6.19135E-13)
            X.3lr r1 = r2.reinterpretRequired(r5, r1, r0)
            com.instagram.creator.inspiration.repository.graphql.AudioFragmentImpl r1 = (com.instagram.creator.inspiration.repository.graphql.AudioFragmentImpl) r1
            if (r1 == 0) goto L_0x017d
            X.KQ1 r0 = new X.KQ1
            r0.<init>(r1)
            boolean r0 = r7.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0179:
            r4.add(r0)
            goto L_0x0153
        L_0x017d:
            r0 = r6
            goto L_0x0179
        L_0x017f:
            r11.A00()
            X.Jjs r0 = new X.Jjs
            r0.<init>(r6, r7)
            return r0
        L_0x0188:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01d5
            com.instagram.common.session.UserSession r0 = r1.A00
            X.HsS r2 = X.HZR.A00(r0)
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r1 = r4.A00
            X.4dm r1 = (X.C268654dm) r1
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x01bc
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x01ae
        L_0x01ac:
            java.lang.String r0 = "response error"
        L_0x01ae:
            r2.A01(r0)
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
        L_0x01b6:
            X.Jjr r0 = new X.Jjr
            r0.<init>(r1)
            return r0
        L_0x01bc:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x01d0
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r1 = r1.A00
            java.lang.String r0 = r1.getMessage()
            if (r0 != 0) goto L_0x01cc
            java.lang.String r0 = "exception error"
        L_0x01cc:
            r2.A01(r0)
            goto L_0x01b6
        L_0x01d0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01d5:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01da:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.inspiration.repository.CreatorInspirationHubAudioPagingSource.A04(X.LCU, X.4D7):java.lang.Object");
    }

    public /* synthetic */ CreatorInspirationHubAudioPagingSource(UserSession userSession) {
        C55936Hq0 hq0 = new C55936Hq0(userSession, 1vm.A01(userSession));
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = hq0;
    }

    public final /* bridge */ /* synthetic */ Object A05(C63967LFt lFt) {
        return null;
    }
}
