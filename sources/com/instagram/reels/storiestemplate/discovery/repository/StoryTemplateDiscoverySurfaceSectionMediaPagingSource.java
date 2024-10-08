package com.instagram.reels.storiestemplate.discovery.repository;

import X.0qQ;
import X.C45310CuE;
import X.C48117EWj;
import X.C63967LFt;
import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;

public final class StoryTemplateDiscoverySurfaceSectionMediaPagingSource extends PagingSource {
    public final UserSession A00;
    public final C48117EWj A01;
    public final C45310CuE A02;

    public StoryTemplateDiscoverySurfaceSectionMediaPagingSource(UserSession userSession, C48117EWj eWj, C45310CuE cuE) {
        0qQ.A0B(cuE, 2);
        this.A00 = userSession;
        this.A02 = cuE;
        this.A01 = eWj;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C48117EWj r14, com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionMediaPagingSource r15, java.lang.String r16, X.AnonymousClass4D7 r17, int r18) {
        /*
            r4 = 7
            r5 = r17
            boolean r0 = X.MEA.A03(r4, r5)
            if (r0 == 0) goto L_0x00e7
            r2 = r5
            X.MEA r2 = (X.MEA) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00e7
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0017:
            java.lang.Object r1 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r7 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r7) goto L_0x010e
            X.0eS.A00(r1)
        L_0x0025:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00f0
            X.3lr r3 = X.C41846B3n.A0R(r1)
            if (r3 == 0) goto L_0x00f9
            java.lang.Class<X.C3a> r2 = X.C43626C3a.class
            java.lang.String r1 = "xdt_trending_template_section_medias(request:$request)"
            r0 = 276983450(0x10826e9a, float:5.144637E-29)
            X.3lr r0 = r3.A05(r2, r1, r0)
            X.3Ih r3 = X.C41845B3m.A0d(r0)
            return r3
        L_0x0041:
            X.0eS.A00(r1)
            X.CuE r0 = r15.A02
            r2.A00 = r7
            r12 = 0
            X.EWj r1 = X.C48117EWj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            if (r14 != r1) goto L_0x005f
            java.lang.String r0 = "Invalid section type provided"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            X.4dn r0 = new X.4dn
            r0.<init>(r1)
            X.5sO r1 = X.C41845B3m.A0c(r0)
        L_0x005c:
            if (r1 != r3) goto L_0x0025
            return r3
        L_0x005f:
            r13 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r8 = X.C41845B3m.A04()
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Integer r4 = new java.lang.Integer
            r1 = r18
            r4.<init>(r1)
            java.lang.String r1 = "count"
            X.0Df r6 = X.C41845B3m.A03(r6, r4, r1)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            r1 = 1173(0x495, float:1.644E-42)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.0Df.A00(r6, r4, r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            r1 = 815(0x32f, float:1.142E-42)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.0Df.A00(r6, r4, r1)
            java.lang.String r1 = "cursor"
            r4 = r16
            X.0Df.A00(r6, r4, r1)
            java.lang.String r4 = r14.toString()
            java.lang.String r1 = "trending_story_template_section_type"
            X.0Df.A00(r6, r4, r1)
            java.lang.String r4 = "stories_template_discovery_surface"
            java.lang.String r1 = "caller"
            X.0Df.A00(r6, r4, r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            java.lang.String r1 = "direct_participation_enabled"
            X.0Df.A00(r6, r4, r1)
            java.lang.String r1 = "request"
            X.1vR r7 = X.C41847B3o.A04(r6, r5, r1)
            java.util.Map r9 = r5.getParamsCopy()
            java.util.Map r10 = r8.getParamsCopy()
            java.lang.Class<X.C3b> r11 = X.C43627C3b.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "StoryTemplateDiscoverySurfaceSectionMediaQuery"
            java.lang.String r16 = "xdt_trending_template_section_medias"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4 = 600000(0x927c0, double:2.964394E-318)
            X.1Ef r1 = r6.setFreshCacheAgeMs(r4)
            r4 = 900000(0xdbba0, double:4.44659E-318)
            X.1Ef r1 = r1.setMaxToleratedCacheAgeMs(r4)
            X.1vn r0 = r0.A01
            java.lang.Object r1 = r0.A04(r1, r2)
            goto L_0x005c
        L_0x00e7:
            r0 = 42
            X.MEA r2 = new X.MEA
            r2.<init>(r15, r5, r4, r0)
            goto L_0x0017
        L_0x00f0:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0109
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r1 = r1.A00
            goto L_0x0104
        L_0x00f9:
            java.lang.String r0 = "Empty response received from server"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            X.4dn r1 = new X.4dn
            r1.<init>(r0)
        L_0x0104:
            X.5sO r3 = X.C41845B3m.A0c(r1)
            return r3
        L_0x0109:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x010e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionMediaPagingSource.A00(X.EWj, com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionMediaPagingSource, java.lang.String, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.LCU r36, X.AnonymousClass4D7 r37) {
        /*
            r35 = this;
            r3 = 37
            r4 = r37
            boolean r0 = X.C66138MDq.A02(r3, r4)
            r6 = r35
            if (r0 == 0) goto L_0x01f9
            r5 = r4
            X.MDq r5 = (X.C66138MDq) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01f9
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x01dc
            if (r0 != r2) goto L_0x0243
            java.lang.Object r3 = r5.A01
            com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionMediaPagingSource r3 = (com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionMediaPagingSource) r3
            X.0eS.A00(r1)
        L_0x002c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0217
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            X.3lr r1 = (X.C250663lr) r1
            X.EWj r0 = r3.A01
            r34 = r0
            java.lang.Class<X.C3Z> r5 = X.C3Z.class
            java.lang.String r4 = "prompts_info"
            r0 = 358861823(0x1563cbff, float:4.600321E-26)
            com.google.common.collect.ImmutableList r0 = r1.A06(r5, r4, r0)
            X.0qQ.A07(r0)
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r0.iterator()
        L_0x0052:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0200
            X.3lr r12 = X.C41845B3m.A0V(r16)
            java.lang.Class<X.C3S> r5 = X.C3S.class
            java.lang.String r4 = "media_infos"
            r0 = -954439339(0xffffffffc71c6955, float:-40041.332)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r12, r5, r4, r2, r0)
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3lr r0 = (X.C250663lr) r0
            if (r0 == 0) goto L_0x0052
            java.lang.Class<X.C3Q> r7 = X.C3Q.class
            r6 = 4
            java.lang.String r5 = "user"
            r4 = -1830948778(0xffffffff92ddf056, float:-1.4006308E-27)
            X.3lr r13 = r0.getOptionalTreeField(r6, r5, r7, r4)
            X.C3Q r13 = (X.C3Q) r13
            r10 = 2
            java.lang.String r4 = "reel_pks"
            com.google.common.collect.ImmutableList r4 = r12.getRequiredCompactedStringListField(r10, r4)
            X.0qQ.A07(r4)
            java.lang.Object r7 = X.00k.A0J(r4)
            java.lang.String r7 = (java.lang.String) r7
            r11 = 0
            java.lang.String r8 = "strong_id__"
            java.lang.String r31 = r0.getRequiredStringField(r11, r8)
            java.lang.String r4 = "media_type"
            int r33 = r0.getCoercedIntField(r2, r4)
            java.lang.Class<X.C3N> r6 = X.C3N.class
            java.lang.String r5 = "image_versions2"
            r4 = -1464713362(0xffffffffa8b23f6e, float:-1.9789478E-14)
            X.3lr r9 = r0.getOptionalTreeField(r10, r5, r6, r4)
            if (r9 == 0) goto L_0x01d8
            java.lang.Class<X.C3M> r6 = X.C3M.class
            java.lang.String r5 = "candidates"
            r4 = 732073700(0x2ba28ee4, float:1.1550452E-12)
            com.google.common.collect.ImmutableList r4 = r9.getOptionalCompactedTreeListField(r11, r5, r6, r4)
            if (r4 == 0) goto L_0x01d8
            java.lang.Object r5 = X.00k.A0J(r4)
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x01d8
            java.lang.String r4 = "url"
            java.lang.String r32 = r5.getOptionalStringField(r10, r4)
        L_0x00c2:
            java.lang.Class<X.C3R> r6 = X.C3R.class
            r10 = 3
            java.lang.String r5 = "video_versions"
            r4 = -1574597159(0xffffffffa2258dd9, float:-2.2436763E-18)
            com.google.common.collect.ImmutableList r4 = r0.getOptionalCompactedTreeListField(r10, r5, r6, r4)
            if (r4 == 0) goto L_0x01d5
            java.lang.Object r6 = X.00k.A0J(r4)
            X.C3R r6 = (X.C3R) r6
        L_0x00d6:
            java.lang.Class<com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData> r5 = com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData.class
            java.lang.String r4 = "prompt_sticker"
            com.facebook.pando.TreeJNI r5 = r12.getTreeValue(r4, r5)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r5 = (com.instagram.api.schemas.StoryPromptTappableDataIntf) r5
            X.0qQ.A07(r5)
            com.instagram.reels.prompt.model.PromptStickerModel r4 = new com.instagram.reels.prompt.model.PromptStickerModel
            r4.<init>(r5)
            com.instagram.reels.prompt.model.PromptStickerModel r5 = r4.A04()
            java.lang.String r8 = r0.getRequiredStringField(r11, r8)
            X.0qQ.A07(r8)
            java.lang.String r4 = "_"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r15 = 0
            java.util.List r4 = X.00l.A0R(r8, r4, r11)
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x01d1
            java.lang.Object r8 = r4.get(r11)
        L_0x0108:
            java.lang.String r8 = (java.lang.String) r8
            X.0qQ.A0B(r8, r11)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r4 = r5.A00
            X.Vib r4 = r4.AKQ()
            r4.A0N = r8
            com.instagram.api.schemas.StoryPromptTappableData r4 = r4.A00()
            r5.A00 = r4
            com.instagram.api.schemas.StoryTemplateDictIntf r4 = r4.C1M()
            if (r4 == 0) goto L_0x01ce
            X.A9D r8 = r4.AKS()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r8.A05 = r4
            com.instagram.api.schemas.StoryTemplateDictIntf r4 = r8.A00()
        L_0x012f:
            r5.A07(r4)
            java.lang.Class<X.C3Y> r9 = X.C3Y.class
            java.lang.String r8 = "tappable_position"
            r4 = -1195047103(0xffffffffb8c50741, float:-9.395043E-5)
            X.3lr r9 = r12.getOptionalTreeField(r10, r8, r9, r4)
            if (r9 == 0) goto L_0x01cb
            java.lang.Class<X.C3F> r8 = X.C3F.class
            r4 = 673612569(0x28268319, float:9.243278E-15)
            X.3lr r8 = r9.reinterpretRequired(r11, r8, r4)
            if (r8 == 0) goto L_0x01cb
            com.instagram.common.session.UserSession r4 = r3.A00
            X.1E5 r10 = X.1E4.A00(r4)
            java.lang.Class<X.CNv> r4 = X.CNv.class
            com.facebook.pando.TreeJNI r4 = r8.reinterpret(r4)
            X.CNv r4 = (X.CNv) r4
            java.util.HashSet r9 = X.AnonymousClass7TE.A1F()
            X.1E9 r8 = new X.1E9
            r8.<init>(r10, r9, r11)
            r4.E86(r8)
            java.lang.Float r19 = r4.A0J()
            java.lang.Float r20 = r4.A0H()
            java.lang.Float r21 = r4.A0I()
            java.lang.Float r22 = r4.A0G()
            java.lang.Float r23 = r4.A0C()
            java.lang.Float r24 = r4.A0F()
            java.lang.Integer r25 = X.C41845B3m.A0f(r4)
            java.lang.Integer r26 = X.C41845B3m.A0h(r4)
            java.lang.Integer r27 = X.C41845B3m.A0e(r4)
            java.lang.String r28 = r4.A0Z()
            java.lang.String r29 = r4.A0d()
            java.lang.String r30 = r4.A0e()
            X.3WT r18 = X.AnonymousClass3WT.PROMPT
            X.3ui r17 = new X.3ui
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x019b:
            java.lang.Class<com.instagram.feed.media.ImmutablePandoCreativeConfig> r8 = com.instagram.feed.media.ImmutablePandoCreativeConfig.class
            java.lang.String r4 = "creative_config"
            com.facebook.pando.TreeJNI r4 = r0.getTreeValue(r4, r8)
            com.instagram.feed.media.CreativeConfigIntf r4 = (com.instagram.feed.media.CreativeConfigIntf) r4
            if (r4 == 0) goto L_0x01c8
            X.1hu r0 = new X.1hu
            r0.<init>(r15)
            com.instagram.feed.media.CreativeConfig r24 = r4.FDz(r0)
        L_0x01b0:
            X.N3s r0 = new X.N3s
            r23 = r0
            r25 = r34
            r26 = r17
            r27 = r5
            r28 = r13
            r29 = r6
            r30 = r7
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r14.add(r0)
            goto L_0x0052
        L_0x01c8:
            r24 = 0
            goto L_0x01b0
        L_0x01cb:
            r17 = 0
            goto L_0x019b
        L_0x01ce:
            r4 = 0
            goto L_0x012f
        L_0x01d1:
            java.lang.String r8 = ""
            goto L_0x0108
        L_0x01d5:
            r6 = 0
            goto L_0x00d6
        L_0x01d8:
            r32 = 0
            goto L_0x00c2
        L_0x01dc:
            X.0eS.A00(r1)
            X.EWj r3 = r6.A01
            r0 = r36
            int r1 = r0.A00
            java.lang.Object r0 = r0.A00()
            java.lang.String r0 = (java.lang.String) r0
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r1 = A00(r3, r6, r0, r5, r1)
            if (r1 != r4) goto L_0x01f6
            return r4
        L_0x01f6:
            r3 = r6
            goto L_0x002c
        L_0x01f9:
            X.MDq r5 = new X.MDq
            r5.<init>(r6, r4, r3)
            goto L_0x001a
        L_0x0200:
            java.lang.String r0 = "has_next_page"
            boolean r0 = r1.getRequiredBooleanField(r2, r0)
            if (r0 == 0) goto L_0x0215
            r2 = 2
            java.lang.String r0 = "cursor"
            java.lang.String r0 = r1.getRequiredStringField(r2, r0)
        L_0x020f:
            X.Jjs r1 = new X.Jjs
            r1.<init>(r0, r14)
            return r1
        L_0x0215:
            r0 = 0
            goto L_0x020f
        L_0x0217:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x023e
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r1 = r1.A00
            X.4dm r1 = (X.C268654dm) r1
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x022f
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r0 = r1.A00
            X.Jjr r1 = new X.Jjr
            r1.<init>(r0)
            return r1
        L_0x022f:
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0239
            X.Jjq r1 = new X.Jjq
            r1.<init>()
            return r1
        L_0x0239:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x023e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0243:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionMediaPagingSource.A04(X.LCU, X.4D7):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object A05(C63967LFt lFt) {
        return null;
    }
}
