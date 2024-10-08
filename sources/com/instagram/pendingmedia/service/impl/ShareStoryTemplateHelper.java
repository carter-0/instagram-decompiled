package com.instagram.pendingmedia.service.impl;

import X.0qQ;

public final class ShareStoryTemplateHelper {
    public final MediaUploader A00;

    public ShareStoryTemplateHelper(MediaUploader mediaUploader) {
        0qQ.A0B(mediaUploader, 1);
        this.A00 = mediaUploader;
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [X.4D7, X.MDN] */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r8.A32 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r4 = r0.A02(X.AnonymousClass55S.A0P, "Missing IG Media Id For Template Overlay");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010d, code lost:
        if (r11.A32 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0193, code lost:
        if (r1 == 0) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.LP8 r17, X.AnonymousClass4D7 r18) {
        /*
            r16 = this;
            r0 = r17
            r10 = 1
            r4 = r18
            boolean r1 = r4 instanceof X.MDN
            r5 = r16
            if (r1 == 0) goto L_0x013b
            r14 = r4
            X.MDN r14 = (X.MDN) r14
            int r1 = r14.A07
            if (r1 != r10) goto L_0x013b
            int r3 = r14.A01
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x013b
            int r3 = r3 - r2
            r14.A01 = r3
        L_0x001d:
            java.lang.Object r4 = r14.A06
            X.1Hj r13 = X.1Hj.A02
            int r2 = r14.A01
            java.lang.String r12 = "Missing IG Media Id For Template Overlay"
            r7 = 2
            r6 = 0
            r9 = 0
            r1 = 1
            if (r2 == 0) goto L_0x006b
            if (r2 == r10) goto L_0x0054
            if (r2 != r7) goto L_0x0142
            int r1 = r14.A00
            java.lang.Object r8 = r14.A04
            X.3Q2 r8 = (X.AnonymousClass3Q2) r8
            java.lang.Object r11 = r14.A03
            X.3Q2 r11 = (X.AnonymousClass3Q2) r11
            java.lang.Object r0 = r14.A02
            X.LP8 r0 = (X.LP8) r0
            X.0eS.A00(r4)
        L_0x0040:
            X.55U r4 = (X.AnonymousClass55U) r4
            if (r4 != 0) goto L_0x0111
            java.lang.String r2 = r8.A32
            if (r2 != 0) goto L_0x0147
        L_0x0048:
            X.55S r1 = X.AnonymousClass55S.A0P
            X.55U r4 = r0.A02(r1, r12)
        L_0x004e:
            X.KVk r13 = new X.KVk
            r13.<init>(r4)
        L_0x0053:
            return r13
        L_0x0054:
            int r1 = r14.A00
            java.lang.Object r8 = r14.A05
            X.3Q2 r8 = (X.AnonymousClass3Q2) r8
            java.lang.Object r11 = r14.A04
            X.3Q2 r11 = (X.AnonymousClass3Q2) r11
            java.lang.Object r0 = r14.A03
            X.LP8 r0 = (X.LP8) r0
            java.lang.Object r3 = r14.A02
            com.instagram.pendingmedia.service.impl.ShareStoryTemplateHelper r3 = (com.instagram.pendingmedia.service.impl.ShareStoryTemplateHelper) r3
            X.0eS.A00(r4)
            goto L_0x0107
        L_0x006b:
            X.0eS.A00(r4)
            X.3QD r3 = r0.A05
            X.3QD r2 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r3 != r2) goto L_0x0195
            X.3Q2 r4 = r0.A0D
            java.util.Iterator r8 = X.JTQ.A0g(r4)
        L_0x007a:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00bb
            java.lang.Object r11 = r8.next()
            r2 = r11
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            com.instagram.pendingmedia.model.constants.ShareType r3 = r2.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.STORY_TEMPLATE_ASSET
            if (r3 != r2) goto L_0x007a
        L_0x008f:
            X.3Q2 r11 = (X.AnonymousClass3Q2) r11
            java.util.Iterator r4 = X.JTQ.A0g(r4)
        L_0x0095:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x00b9
            java.lang.Object r8 = r4.next()
            r2 = r8
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            com.instagram.pendingmedia.model.constants.ShareType r3 = r2.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.STORY_TEMPLATE_BACKGROUND_ASSET
            if (r3 != r2) goto L_0x0095
        L_0x00aa:
            X.3Q2 r8 = (X.AnonymousClass3Q2) r8
            if (r11 != 0) goto L_0x00bd
            if (r8 != 0) goto L_0x00bd
            X.55S r2 = X.AnonymousClass55S.A0P
            java.lang.String r1 = "Missing Template Overlay and Template Background for Story Template"
            X.55U r4 = r0.A02(r2, r1)
            goto L_0x004e
        L_0x00b9:
            r8 = r6
            goto L_0x00aa
        L_0x00bb:
            r11 = r6
            goto L_0x008f
        L_0x00bd:
            X.3Q2[] r2 = new X.AnonymousClass3Q2[]{r11, r8}
            java.util.List r3 = X.0sr.A1P(r2)
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x00d2
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x00d2
        L_0x00cf:
            X.KVl r13 = X.C62012KVl.A00
            return r13
        L_0x00d2:
            java.util.Iterator r3 = r3.iterator()
        L_0x00d6:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00cf
            X.3Q2 r2 = X.JTO.A0m(r3)
            if (r2 == 0) goto L_0x00d6
            java.lang.String r2 = r2.A32
            if (r2 != 0) goto L_0x00d6
            if (r11 == 0) goto L_0x011a
            com.instagram.pendingmedia.service.impl.MediaUploader r4 = r5.A00
            java.lang.String r3 = r0.A0I
            android.content.Context r2 = r0.A0B
            X.1Cn r1 = new X.1Cn
            r1.<init>(r2)
            r14.A02 = r5
            r14.A03 = r0
            r14.A04 = r11
            r14.A05 = r8
            r14.A00 = r10
            r14.A01 = r10
            java.lang.Object r4 = r4.A01(r11, r1, r3, r14)
            if (r4 == r13) goto L_0x0053
            r3 = r5
            r1 = 1
        L_0x0107:
            X.55U r4 = (X.AnonymousClass55U) r4
            if (r4 != 0) goto L_0x0111
            java.lang.String r2 = r11.A32
            if (r2 != 0) goto L_0x011b
            goto L_0x0048
        L_0x0111:
            X.55S r2 = r4.A01
            java.lang.String r1 = r4.A03
            r0.A02(r2, r1)
            goto L_0x004e
        L_0x011a:
            r3 = r5
        L_0x011b:
            if (r8 == 0) goto L_0x0147
            com.instagram.pendingmedia.service.impl.MediaUploader r5 = r3.A00
            java.lang.String r4 = r0.A0I
            android.content.Context r3 = r0.A0B
            X.1Cn r2 = new X.1Cn
            r2.<init>(r3)
            r14.A02 = r0
            r14.A03 = r11
            r14.A04 = r8
            r14.A05 = r6
            r14.A00 = r1
            r14.A01 = r7
            java.lang.Object r4 = r5.A01(r8, r2, r4, r14)
            if (r4 != r13) goto L_0x0040
            return r13
        L_0x013b:
            X.MDN r14 = new X.MDN
            r14.<init>(r5, r4, r10)
            goto L_0x001d
        L_0x0142:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0147:
            X.3Q2 r2 = r0.A0D
            java.util.List r4 = r2.A4b
            if (r11 == 0) goto L_0x0211
            java.lang.String r7 = r11.A32
        L_0x014f:
            if (r8 == 0) goto L_0x0153
            java.lang.String r6 = r8.A32
        L_0x0153:
            if (r11 == 0) goto L_0x0157
            int r9 = r11.A0I
        L_0x0157:
            r5 = 0
            X.0qQ.A0B(r4, r5)
            X.3WT r2 = X.AnonymousClass3WT.MUSIC_PICK_STICKER
            X.3ui r3 = X.C289745e8.A00(r2, r4)
            java.lang.String r8 = "Required value was null."
            if (r3 == 0) goto L_0x01bc
            com.instagram.reels.musicpick.model.MusicPickStickerModel r4 = r3.A0D()
            r2 = 1877(0x755, float:2.63E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            com.instagram.api.schemas.StoryTemplateAssetDict r6 = X.C394589yM.A00(r6, r7, r2, r5)
            if (r4 == 0) goto L_0x0214
            com.instagram.reels.musicpick.model.MusicPickStickerModel r2 = r4.A00()
            com.instagram.api.schemas.StoryMusicPickTappableData r2 = r2.A00
            com.instagram.api.schemas.TrackData r7 = r2.A04
            java.lang.String r8 = r2.A05
            com.instagram.api.schemas.StoryPromptDisablementState r5 = r2.A02
            java.util.List r12 = r2.A09
            java.lang.String r9 = r2.A06
            java.lang.String r10 = r2.A07
            com.instagram.api.schemas.OriginalSoundData r4 = r2.A01
            int r13 = r2.A00
            java.lang.String r11 = r2.A08
            com.instagram.api.schemas.StoryMusicPickTappableData r2 = X.C63029KqK.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3.A0X = r2
        L_0x0193:
            if (r1 != 0) goto L_0x01b9
        L_0x0195:
            X.37k r3 = r0.A0E
            X.3Q2 r5 = r0.A0D
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "from "
            r2.append(r1)
            X.3QD r1 = r0.A05
            r2.append(r1)
            java.lang.String r1 = " to "
            r2.append(r1)
            X.3QD r0 = r0.A06
            java.lang.String r7 = X.AnonymousClass7TF.A0i(r0, r2)
            r4 = 0
            java.lang.String r6 = "STORY_TEMPLATE_STATE_MACHINE_ERROR"
            r8 = r4
            r3.Cji(r4, r5, r6, r7, r8)
        L_0x01b9:
            X.KVm r13 = X.C62013KVm.A00
            return r13
        L_0x01bc:
            X.3WT r2 = X.AnonymousClass3WT.PROMPT
            X.3ui r3 = X.C289745e8.A00(r2, r4)
            if (r3 == 0) goto L_0x0193
            com.instagram.reels.prompt.model.PromptStickerModel r4 = r3.A0F()
            if (r4 == 0) goto L_0x0193
            boolean r2 = r4.A0L()
            if (r2 == r10) goto L_0x0193
            boolean r2 = r4.A0M()
            if (r2 != r10) goto L_0x0193
            com.instagram.api.schemas.StoryPromptTappableDataIntf r2 = r4.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r5 = r2.C1M()
            if (r5 == 0) goto L_0x0219
            r2 = 1877(0x755, float:2.63E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            com.instagram.api.schemas.StoryTemplateAssetDict r6 = X.C394589yM.A00(r6, r7, r2, r9)
            com.instagram.reels.prompt.model.PromptStickerModel r4 = r4.A04()
            com.instagram.api.schemas.StoryTemplateDict r2 = r5.FBY()
            com.instagram.api.schemas.StoryTemplateFillableStickersDict r7 = r2.A01
            java.lang.Boolean r10 = r2.A04
            java.lang.Boolean r11 = r2.A05
            com.instagram.api.schemas.StoryTemplateMusicStickerDict r8 = r2.A02
            com.instagram.api.schemas.StoryTemplateReshareMediaDict r9 = r2.A03
            java.util.List r12 = r2.A06
            java.util.List r13 = r2.A07
            java.util.List r14 = r2.A08
            java.util.List r15 = r2.A09
            com.instagram.api.schemas.StoryTemplateDict r5 = new com.instagram.api.schemas.StoryTemplateDict
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4.A07(r5)
            com.instagram.api.schemas.StoryPromptTappableData r2 = r4.A02()
            r3.A0Z = r2
            goto L_0x0193
        L_0x0211:
            r7 = r6
            goto L_0x014f
        L_0x0214:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0219:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.ShareStoryTemplateHelper.A00(X.LP8, X.4D7):java.lang.Object");
    }
}
