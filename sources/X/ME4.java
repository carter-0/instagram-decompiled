package X;

public final class ME4 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r9v0, types: [X.ME4, java.lang.Object, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r6 = r9
            int r0 = r9.A03
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x005e;
                case 2: goto L_0x006b;
                case 3: goto L_0x007b;
                case 4: goto L_0x008b;
                case 5: goto L_0x0095;
                case 6: goto L_0x008b;
                case 7: goto L_0x008b;
                case 8: goto L_0x008b;
                case 9: goto L_0x008b;
                case 10: goto L_0x008b;
                case 11: goto L_0x00a2;
                case 12: goto L_0x00af;
                case 13: goto L_0x00bc;
                case 14: goto L_0x00c9;
                case 15: goto L_0x010e;
                case 16: goto L_0x011b;
                case 17: goto L_0x008b;
                case 18: goto L_0x010e;
                case 19: goto L_0x008b;
                case 20: goto L_0x008b;
                case 21: goto L_0x008b;
                case 22: goto L_0x0128;
                case 23: goto L_0x0135;
                case 24: goto L_0x0142;
                case 25: goto L_0x014f;
                case 26: goto L_0x015c;
                case 27: goto L_0x0169;
                case 28: goto L_0x0176;
                case 29: goto L_0x010e;
                case 30: goto L_0x0182;
                case 31: goto L_0x018f;
                case 32: goto L_0x019b;
                case 33: goto L_0x01a8;
                case 34: goto L_0x01bb;
                case 35: goto L_0x0128;
                case 36: goto L_0x0128;
                case 37: goto L_0x01c8;
                case 38: goto L_0x01d5;
                case 39: goto L_0x01e3;
                case 40: goto L_0x01f3;
                case 41: goto L_0x0201;
                case 42: goto L_0x020e;
                case 43: goto L_0x021d;
                case 44: goto L_0x022a;
                case 45: goto L_0x0237;
                case 46: goto L_0x0244;
                case 47: goto L_0x0250;
                case 48: goto L_0x025d;
                default: goto L_0x0006;
            }
        L_0x0006:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A09(r0, r9)
        L_0x0012:
            return r2
        L_0x0013:
            r9.A01 = r10
            int r5 = r9.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r4
            r9.A00 = r5
            java.lang.Object r3 = r9.A02
            r2 = 0
            boolean r0 = A03(r2, r9)
            if (r0 == 0) goto L_0x0050
            r1 = r9
            r0 = r5 & r4
            if (r0 == 0) goto L_0x0050
            int r5 = r5 - r4
            r9.A00 = r5
        L_0x002d:
            java.lang.Object r2 = r1.A01
            int r1 = r1.A00
            r0 = 1
            if (r1 == 0) goto L_0x0273
            if (r1 != r0) goto L_0x026e
            X.0eS.A00(r2)
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0047
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0269
            X.5sO r2 = X.JTU.A0R(r2)
        L_0x0047:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0055
            X.3Ih r2 = X.C51967G9n.A0d()
            return r2
        L_0x0050:
            X.ME4 r1 = A00(r3, r9, r2)
            goto L_0x002d
        L_0x0055:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0012
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005e:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource r1 = (com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource) r1
            r0 = 0
            java.lang.Object r2 = r1.A01(r0, r0, r9)
            return r2
        L_0x006b:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource r1 = (com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource) r1
            r2 = 0
            r3 = r2
            r4 = r2
            r5 = r2
            java.lang.Object r2 = r1.A00(r2, r3, r4, r5, r6)
            return r2
        L_0x007b:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.appreciation.mediasettings.AppreciationMediaSettingsApi r1 = (com.instagram.appreciation.mediasettings.AppreciationMediaSettingsApi) r1
            r2 = 0
            r3 = r2
            r4 = r2
            r5 = r2
            java.lang.Object r2 = r1.A00(r2, r3, r4, r5, r6)
            return r2
        L_0x008b:
            A01(r10, r9)
            java.lang.Object r0 = r9.A01
            java.lang.Object r2 = X.MCn.A00(r0, r9)
            return r2
        L_0x0095:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r1 = (com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService) r1
            r0 = 0
            java.lang.Object r2 = r1.A04(r0, r0, r9)
            return r2
        L_0x00a2:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.ar.core.effectcollection.EffectCollectionService r1 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r1
            r0 = 0
            java.lang.Object r2 = com.instagram.ar.core.effectcollection.EffectCollectionService.A04(r1, r0, r0, r9)
            return r2
        L_0x00af:
            A01(r10, r9)
            java.lang.Object r1 = r9.A01
            X.MCf r1 = (X.MCf) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r9)
            return r2
        L_0x00bc:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r1 = (com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0, r0, r9)
            return r2
        L_0x00c9:
            r9.A01 = r10
            int r5 = r9.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r4
            r9.A00 = r5
            java.lang.Object r3 = r9.A02
            r2 = 14
            boolean r0 = A03(r2, r9)
            if (r0 == 0) goto L_0x00fc
            r1 = r9
            r0 = r5 & r4
            if (r0 == 0) goto L_0x00fc
            int r5 = r5 - r4
            r9.A00 = r5
        L_0x00e4:
            java.lang.Object r2 = r1.A01
            int r0 = r1.A00
            r1 = 1
            if (r0 == 0) goto L_0x0106
            if (r0 != r1) goto L_0x0101
            X.0eS.A00(r2)
            int r0 = X.AnonymousClass7TE.A0M(r2)
            if (r0 > 0) goto L_0x00f7
            r1 = 0
        L_0x00f7:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L_0x00fc:
            X.ME4 r1 = A00(r3, r9, r2)
            goto L_0x00e4
        L_0x0101:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0106:
            X.0eS.A00(r2)
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x010e:
            A01(r10, r9)
            java.lang.Object r1 = r9.A01
            X.MCh r1 = (X.C66118MCh) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r9)
            return r2
        L_0x011b:
            A01(r10, r9)
            java.lang.Object r1 = r9.A01
            X.IkV r1 = (X.C58037IkV) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r9)
            return r2
        L_0x0128:
            A01(r10, r9)
            java.lang.Object r1 = r9.A01
            X.IkW r1 = (X.C58038IkW) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r9)
            return r2
        L_0x0135:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.avatars.graphql.AvatarMentionsRepository r1 = (com.instagram.avatars.graphql.AvatarMentionsRepository) r1
            r0 = 0
            java.lang.Object r2 = com.instagram.avatars.graphql.AvatarMentionsRepository.A00(r1, r0, r9)
            return r2
        L_0x0142:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.avatars.graphql.AvatarMentionsRepository r1 = (com.instagram.avatars.graphql.AvatarMentionsRepository) r1
            r0 = 0
            java.lang.Object r2 = com.instagram.avatars.graphql.AvatarMentionsRepository.A01(r1, r9, r0)
            return r2
        L_0x014f:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.avatars.graphql.AvatarStickerGraphQLRepository r1 = (com.instagram.avatars.graphql.AvatarStickerGraphQLRepository) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0, r0, r9)
            return r2
        L_0x015c:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.avatars.graphql.AvatarStickerGraphQLRepository r1 = (com.instagram.avatars.graphql.AvatarStickerGraphQLRepository) r1
            r0 = 0
            java.lang.Object r2 = r1.A02(r0, r9)
            return r2
        L_0x0169:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.avatars.graphql.AvatarStickerGraphQLRepository r1 = (com.instagram.avatars.graphql.AvatarStickerGraphQLRepository) r1
            r0 = 0
            java.lang.Object r2 = r1.A03(r0, r9)
            return r2
        L_0x0176:
            A02(r10, r9)
            java.lang.Object r0 = r9.A02
            com.instagram.avatars.graphql.InstantAvatarsGraphQLRepository r0 = (com.instagram.avatars.graphql.InstantAvatarsGraphQLRepository) r0
            java.lang.Object r2 = r0.A00(r9)
            return r2
        L_0x0182:
            A01(r10, r9)
            java.lang.Object r1 = r9.A01
            X.MCj r1 = (X.C66119MCj) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r9)
            return r2
        L_0x018f:
            A02(r10, r9)
            java.lang.Object r0 = r9.A02
            com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r0 = (com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository) r0
            java.lang.Object r2 = r0.A03(r9)
            return r2
        L_0x019b:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.avatars.suggestions.LexiconRecommendationProvider r1 = (com.instagram.avatars.suggestions.LexiconRecommendationProvider) r1
            r0 = 0
            java.lang.Object r2 = com.instagram.avatars.suggestions.LexiconRecommendationProvider.A00(r0, r1, r0, r9)
            return r2
        L_0x01a8:
            A02(r10, r9)
            java.lang.Object r0 = r9.A02
            com.instagram.avatars.suggestions.interactor.IGContextualSuggestionsAPI r0 = (com.instagram.avatars.suggestions.interactor.IGContextualSuggestionsAPI) r0
            r1 = 0
            r7 = 0
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r8 = r7
            java.lang.Object r2 = r0.A00(r1, r2, r3, r4, r5, r6, r7, r8)
            return r2
        L_0x01bb:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.banyan.BanyanCoordinator r1 = (com.instagram.banyan.BanyanCoordinator) r1
            r0 = 0
            java.lang.Object r2 = com.instagram.banyan.BanyanCoordinator.A01(r1, r0, r9)
            return r2
        L_0x01c8:
            A01(r10, r9)
            java.lang.Object r1 = r9.A01
            X.IkS r1 = (X.C58034IkS) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r9)
            return r2
        L_0x01d5:
            A02(r10, r9)
            java.lang.Object r2 = r9.A02
            com.instagram.barcelonaig.getapp.GetAppFragment$Companion r2 = (com.instagram.barcelonaig.getapp.GetAppFragment$Companion) r2
            r1 = 0
            r0 = 0
            java.lang.Object r2 = com.instagram.barcelonaig.getapp.GetAppFragment$Companion.A00(r2, r1, r9, r0)
            return r2
        L_0x01e3:
            A02(r10, r9)
            java.lang.Object r2 = r9.A02
            com.instagram.barcelonaig.getapp.api.GetAppApi r2 = (com.instagram.barcelonaig.getapp.api.GetAppApi) r2
            r3 = 0
            r7 = 0
            r4 = r3
            r5 = r3
            java.lang.Object r2 = r2.A00(r3, r4, r5, r6, r7)
            return r2
        L_0x01f3:
            A02(r10, r9)
            java.lang.Object r2 = r9.A02
            com.instagram.barcelonaig.goldenticket.api.BarcelonaPreRegisterApi r2 = (com.instagram.barcelonaig.goldenticket.api.BarcelonaPreRegisterApi) r2
            r1 = 0
            r0 = 0
            java.lang.Object r2 = r2.A00(r1, r9, r0)
            return r2
        L_0x0201:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.barcelonaig.goldenticket.api.GoldenTicketInfoApi r1 = (com.instagram.barcelonaig.goldenticket.api.GoldenTicketInfoApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0, r9)
            return r2
        L_0x020e:
            A02(r10, r9)
            java.lang.Object r3 = r9.A02
            com.instagram.barcelonaig.goldenticket.api.GoldenTicketInfoApi r3 = (com.instagram.barcelonaig.goldenticket.api.GoldenTicketInfoApi) r3
            r2 = 0
            r0 = 0
            java.lang.Object r2 = r3.A01(r2, r9, r0)
            return r2
        L_0x021d:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi r1 = (com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0, r9)
            return r2
        L_0x022a:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi r1 = (com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A01(r0, r9)
            return r2
        L_0x0237:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A05(r0, r9)
            return r2
        L_0x0244:
            A02(r10, r9)
            java.lang.Object r0 = r9.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r0 = (com.instagram.brandedcontent.repository.BrandedContentApi) r0
            java.lang.Object r2 = r0.A0A(r9)
            return r2
        L_0x0250:
            A02(r10, r9)
            java.lang.Object r1 = r9.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A02(r0, r0, r9)
            return r2
        L_0x025d:
            A02(r10, r9)
            java.lang.Object r0 = r9.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r0 = (com.instagram.brandedcontent.repository.BrandedContentApi) r0
            java.lang.Object r2 = r0.A0B(r9)
            return r2
        L_0x0269:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x026e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0273:
            X.0eS.A00(r2)
            java.lang.String r0 = "isLiked"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ME4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME4(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static ME4 A00(Object obj, AnonymousClass4D7 r3, int i) {
        return new ME4(obj, r3, i, 42);
    }

    public static void A01(Object obj, ME4 me4) {
        me4.A02 = obj;
        me4.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static void A02(Object obj, ME4 me4) {
        me4.A01 = obj;
        me4.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A03(int i, Object obj) {
        if (!(obj instanceof ME4) || ((ME4) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME4(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
