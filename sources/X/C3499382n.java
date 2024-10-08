package X;

import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.Collection;
import java.util.List;

/* renamed from: X.82n  reason: invalid class name and case insensitive filesystem */
public final class C3499382n {
    public final C349337zz A00;
    public final PromptStickerModel A01;
    public final C310416b1 A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARNING: type inference failed for: r10v1, types: [X.Aew, X.50v, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v4, types: [X.9m2, X.50v, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v4, types: [X.9m2, X.50v, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v12, types: [X.9m2, X.50v, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3499382n(com.instagram.api.schemas.StoryTemplateDict r21, com.instagram.reels.prompt.model.PromptStickerModel r22, X.C310416b1 r23, java.util.HashMap r24, int r25, boolean r26, boolean r27) {
        /*
            r20 = this;
            r4 = r20
            r4.<init>()
            r1 = r22
            r4.A01 = r1
            r0 = r23
            r4.A02 = r0
            r0 = r27
            r4.A05 = r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.A03 = r5
            r8 = 0
            if (r21 != 0) goto L_0x0023
            if (r22 == 0) goto L_0x00d9
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r1.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r21 = r0.C1M()
        L_0x0023:
            r6 = 1
            if (r21 == 0) goto L_0x040f
            java.util.List r1 = r21.C0G()
            if (r1 == 0) goto L_0x00e6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r1.iterator()
        L_0x0035:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00e3
            java.lang.Object r1 = r10.next()
            com.instagram.api.schemas.StoryTemplateCaptionDictIntf r1 = (com.instagram.api.schemas.StoryTemplateCaptionDictIntf) r1
            java.lang.String r15 = r1.getText()
            float r16 = r1.B78()
            java.lang.String r9 = r1.Ap4()
            r7 = 0
            X.0qQ.A0B(r9, r7)
            r3 = -1
            java.lang.String r2 = ","
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x0069 }
            java.util.List r2 = X.00l.A0R(r9, r2, r7)     // Catch:{ Exception -> 0x0069 }
            java.lang.Object r2 = X.00k.A0O(r2, r7)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0069 }
            if (r2 == 0) goto L_0x0069
            int r17 = X.0nH.A0B(r2, r3)     // Catch:{ Exception -> 0x0069 }
            goto L_0x006b
        L_0x0069:
            r17 = -1
        L_0x006b:
            java.lang.String r3 = r1.Aak()
            java.util.Map r2 = X.C391059sH.A01
            java.lang.Object r2 = r2.get(r3)
            X.9sH r2 = (X.C391059sH) r2
            if (r2 != 0) goto L_0x007b
            X.9sH r2 = X.C391059sH.CENTER
        L_0x007b:
            int r3 = r2.ordinal()
            r2 = 2
            if (r3 == r2) goto L_0x00d6
            if (r3 == r6) goto L_0x00d3
            if (r3 != r7) goto L_0x00dd
            android.text.Layout$Alignment r12 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x0088:
            com.instagram.api.schemas.ClipsTextFormatType r13 = r1.B7W()
            java.lang.String r2 = r1.B0J()
            X.6Mr r14 = X.A1S.A00(r2)
            java.lang.String r3 = r1.Abi()
            com.instagram.api.schemas.ClipsTextFormatType r2 = r1.B7W()
            X.0qQ.A0B(r2, r7)
            java.lang.String r2 = r2.A00
            boolean r18 = X.0qQ.A0K(r3, r2)
            X.Aet r11 = new X.Aet
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            float r2 = r1.Bod()
            double r2 = (double) r2
            double r2 = java.lang.Math.toDegrees(r2)
            float r7 = (float) r2
            float r15 = r1.CGs()
            float r16 = r1.CHR()
            float r17 = r1.BpU()
            int r19 = r1.getZIndex()
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.A7h r1 = new X.A7h
            r12 = r1
            r13 = r11
            r14 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.add(r1)
            goto L_0x0035
        L_0x00d3:
            android.text.Layout$Alignment r12 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0088
        L_0x00d6:
            android.text.Layout$Alignment r12 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0088
        L_0x00d9:
            r21 = r8
            goto L_0x0023
        L_0x00dd:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00e3:
            r5.addAll(r0)
        L_0x00e6:
            java.util.List r1 = r21.C1I()
            if (r1 == 0) goto L_0x01a0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r1.iterator()
        L_0x00f5:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x019d
            java.lang.Object r1 = r10.next()
            com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf r1 = (com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf) r1
            com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf r9 = r1.B9L()
            if (r9 == 0) goto L_0x00f5
            boolean r2 = X.AHN.A01(r9)
            if (r2 == 0) goto L_0x00f5
            java.lang.String r7 = "gif_"
            java.lang.String r3 = r9.B9D()
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x0197
            java.lang.String r12 = X.002.A0R(r7, r3)
            com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf r7 = r9.BFu()
            if (r7 == 0) goto L_0x0191
            java.lang.String r3 = r7.CGZ()
            if (r3 == 0) goto L_0x018b
            float r14 = java.lang.Float.parseFloat(r3)
            java.lang.String r3 = r7.BCv()
            if (r3 == 0) goto L_0x0185
            float r15 = java.lang.Float.parseFloat(r3)
            java.lang.String r7 = r7.getUrl()
            if (r7 == 0) goto L_0x017f
            int r3 = (int) r14
            int r2 = (int) r15
            com.instagram.common.typedurl.SimpleImageUrl r11 = new com.instagram.common.typedurl.SimpleImageUrl
            r11.<init>(r7, r3, r2)
            float r16 = r1.CGW()
            r13 = r12
            X.6o8 r3 = X.C317966o8.A00(r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = r9.getTitle()
            r3.A0g = r2
            X.6nz r2 = X.C317876nz.A0a
            X.6nz r2 = X.C317886o0.A05(r3, r12)
            X.9m2 r12 = new X.9m2
            r12.<init>()
            r12.A00 = r2
            float r13 = r1.Bod()
            r2 = 1135869952(0x43b40000, float:360.0)
            float r13 = r13 * r2
            float r14 = r1.CGs()
            float r15 = r1.CHR()
            int r18 = r1.getZIndex()
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.A7h r11 = new X.A7h
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r0.add(r11)
            goto L_0x00f5
        L_0x017f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0185:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x018b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0191:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0197:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x019d:
            r5.addAll(r0)
        L_0x01a0:
            com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf r10 = r21.BV3()
            if (r10 == 0) goto L_0x0220
            boolean r0 = X.AHN.A02(r10)
            r7 = 0
            if (r0 == 0) goto L_0x0220
            java.lang.String r0 = r10.AyE()
            X.6KJ r0 = X.A11.A00(r0)
            X.6KJ r2 = r0.A00()
            r9 = -1
            java.lang.String r3 = r10.getColor()
            if (r26 == 0) goto L_0x036f
            if (r3 == 0) goto L_0x0369
            int r1 = r3.length()
            r0 = 9
            if (r1 != r0) goto L_0x0369
            int r9 = X.0nH.A0B(r3, r9)
        L_0x01ce:
            com.instagram.api.schemas.LyricsIntf r0 = r10.BOn()
            if (r0 == 0) goto L_0x0366
            com.instagram.api.schemas.Lyrics r3 = r0.F5h()
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            X.15p r0 = X.AnonymousClass15o.A00
            X.17W r0 = r0.A0A(r1)
            X.AnonymousClass4DC.A00(r0, r3)
            r0.close()
            java.lang.String r0 = r1.toString()
            X.16F r0 = X.16P.A00(r0)
            X.9SE r1 = X.AnonymousClass9SD.parseFromJson(r0)
        L_0x01f5:
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.AHN.A00(r10)
            X.7zz r11 = X.C271404in.A07(r1, r0, r7, r2, r9)
            float r12 = r10.Bod()
            r0 = 1135869952(0x43b40000, float:360.0)
            float r12 = r12 * r0
            float r13 = r10.CGs()
            float r14 = r10.CHR()
            X.6KJ r0 = X.AnonymousClass6KJ.MUSIC_ONLY
            if (r2 != r0) goto L_0x0360
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0212:
            int r17 = r10.getZIndex()
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.A7h r10 = new X.A7h
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r5.add(r10)
        L_0x0220:
            com.instagram.api.schemas.StoryTemplateAssetDictIntf r7 = r21.C4X()
            if (r7 == 0) goto L_0x0292
            com.instagram.model.mediasize.ImageInfo r0 = r7.BGO()
            if (r0 == 0) goto L_0x0292
            com.instagram.model.mediasize.ImageInfo r2 = r7.BGO()
            if (r2 == 0) goto L_0x035d
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 1080(0x438, float:1.513E-42)
            r3 = r25
            int r0 = java.lang.Math.min(r3, r0)
            com.instagram.model.mediasize.ExtendedImageUrl r9 = X.1iI.A05(r2, r1, r0)
        L_0x0240:
            java.lang.String r1 = "stories_template_gallery_overlay_"
            java.lang.String r0 = r7.getPk()
            java.lang.String r10 = X.002.A0R(r1, r0)
            if (r9 == 0) goto L_0x0357
            int r0 = r9.getWidth()
            float r12 = (float) r0
            int r0 = r9.getHeight()
            float r13 = (float) r0
        L_0x0256:
            r14 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "stories_template_gallery_overlay"
            X.6o8 r1 = X.C317966o8.A00(r9, r10, r11, r12, r13, r14)
            X.6nz r0 = X.C317876nz.A0a
            java.lang.String r3 = r1.A0S
            X.0qQ.A07(r3)
            java.util.List r2 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r2)
            X.6oG r1 = X.C318046oG.STORIES_TEMPLATE_GALLERY_OVERLAY
            X.6nz r0 = new X.6nz
            r0.<init>(r1, r3, r2)
            X.9m2 r10 = new X.9m2
            r10.<init>()
            r10.A00 = r0
            java.lang.Integer r0 = r7.CHa()
            if (r0 == 0) goto L_0x03f7
            int r16 = r0.intValue()
            r11 = 0
            r12 = 1056964608(0x3f000000, float:0.5)
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.A7h r9 = new X.A7h
            r13 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.add(r9)
        L_0x0292:
            java.util.List r1 = r21.C0B()
            if (r1 == 0) goto L_0x0380
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r1.iterator()
        L_0x02a1:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x037d
            java.lang.Object r1 = r10.next()
            com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict r1 = (com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict) r1
            java.lang.Float r2 = r1.CGX()
            if (r2 == 0) goto L_0x0375
            float r16 = r2.floatValue()
            java.lang.String r2 = r1.B2z()
            r3 = r24
            if (r24 == 0) goto L_0x02a1
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x02d4
            java.lang.String r2 = r1.BI3()
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x02d4
            goto L_0x02a1
        L_0x02d4:
            com.instagram.common.typedurl.SimpleImageUrl r11 = new com.instagram.common.typedurl.SimpleImageUrl
            r11.<init>(r2)
            java.lang.String r12 = r1.BI3()
            if (r12 == 0) goto L_0x02a1
            r14 = 1142292480(0x44160000, float:600.0)
            java.lang.String r13 = ""
            r15 = r14
            X.6o8 r3 = X.C317966o8.A00(r11, r12, r13, r14, r15, r16)
            X.6nz r2 = X.C317876nz.A0a
            java.lang.String r9 = r3.A0S
            X.0qQ.A07(r9)
            java.util.List r7 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r7)
            java.lang.String r3 = r1.getMediaType()
            java.lang.String r2 = "image"
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x0354
            X.6oG r3 = X.C318046oG.AVATAR_STATIC
        L_0x0304:
            X.6nz r2 = new X.6nz
            r2.<init>(r3, r9, r7)
            X.9m2 r12 = new X.9m2
            r12.<init>()
            r12.A00 = r2
            java.lang.Float r2 = r1.Bof()
            if (r2 == 0) goto L_0x0352
            float r13 = r2.floatValue()
        L_0x031a:
            r2 = 1135869952(0x43b40000, float:360.0)
            float r13 = r13 * r2
            java.lang.Float r2 = r1.CGt()
            if (r2 == 0) goto L_0x034f
            float r14 = r2.floatValue()
        L_0x0327:
            java.lang.Float r2 = r1.CHS()
            if (r2 == 0) goto L_0x034c
            float r15 = r2.floatValue()
        L_0x0331:
            java.lang.Integer r1 = r1.CHa()
            if (r1 == 0) goto L_0x0349
            int r18 = r1.intValue()
        L_0x033b:
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.A7h r11 = new X.A7h
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r0.add(r11)
            goto L_0x02a1
        L_0x0349:
            r18 = 0
            goto L_0x033b
        L_0x034c:
            r15 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0331
        L_0x034f:
            r14 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0327
        L_0x0352:
            r13 = 0
            goto L_0x031a
        L_0x0354:
            X.6oG r3 = X.C318046oG.AVATAR_ANIMATED
            goto L_0x0304
        L_0x0357:
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0256
        L_0x035d:
            r9 = 0
            goto L_0x0240
        L_0x0360:
            float r16 = r10.CGW()
            goto L_0x0212
        L_0x0366:
            r1 = r7
            goto L_0x01f5
        L_0x0369:
            int r9 = X.0nH.A0C(r3, r9)
            goto L_0x01ce
        L_0x036f:
            int r9 = X.0nH.A0C(r3, r9)
            goto L_0x01ce
        L_0x0375:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x037d:
            r5.addAll(r0)
        L_0x0380:
            com.instagram.api.schemas.StoryTemplateFillableStickersDict r0 = r21.B5p()
            if (r0 == 0) goto L_0x03ff
            java.util.List r0 = r0.B5n()
            if (r0 == 0) goto L_0x03ff
            java.util.Iterator r3 = r0.iterator()
        L_0x0390:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03ff
            java.lang.Object r2 = r3.next()
            com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict r2 = (com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict) r2
            java.util.List r1 = r4.A03
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.Aew r10 = new X.Aew
            r10.<init>()
            r10.A00 = r2
            r10.A01 = r6
            java.lang.Float r0 = r2.Bof()
            if (r0 == 0) goto L_0x03f5
            float r11 = r0.floatValue()
            r0 = 1135869952(0x43b40000, float:360.0)
            float r11 = r11 * r0
        L_0x03b8:
            java.lang.Float r0 = r2.CGt()
            r13 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x03f2
            float r12 = r0.floatValue()
        L_0x03c4:
            java.lang.Float r0 = r2.CHS()
            if (r0 == 0) goto L_0x03ce
            float r13 = r0.floatValue()
        L_0x03ce:
            java.lang.Float r0 = r2.CGX()
            if (r0 == 0) goto L_0x03f0
            float r15 = r0.floatValue()
        L_0x03d8:
            java.lang.Integer r0 = r2.CHa()
            if (r0 == 0) goto L_0x03ed
            int r16 = r0.intValue()
        L_0x03e2:
            r14 = 1065353216(0x3f800000, float:1.0)
            X.A7h r9 = new X.A7h
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r1.add(r9)
            goto L_0x0390
        L_0x03ed:
            r16 = 0
            goto L_0x03e2
        L_0x03f0:
            r15 = 0
            goto L_0x03d8
        L_0x03f2:
            r12 = 1056964608(0x3f000000, float:0.5)
            goto L_0x03c4
        L_0x03f5:
            r11 = 0
            goto L_0x03b8
        L_0x03f7:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x03ff:
            java.util.List r1 = r4.A03
            int r0 = r1.size()
            if (r0 <= r6) goto L_0x040f
            X.ArJ r0 = new X.ArJ
            r0.<init>()
            X.01V.A1D(r1, r0)
        L_0x040f:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r4.A01
            if (r0 == 0) goto L_0x0441
            boolean r0 = r0.A0L()
            if (r0 != r6) goto L_0x0441
        L_0x0419:
            r4.A04 = r6
            java.util.List r0 = r4.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x0421:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x043f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.A7h r0 = (X.C39741A7h) r0
            X.50v r0 = r0.A06
            boolean r0 = r0 instanceof X.C349337zz
            if (r0 == 0) goto L_0x0421
        L_0x0434:
            X.A7h r1 = (X.C39741A7h) r1
            if (r1 == 0) goto L_0x043a
            X.50v r8 = r1.A06
        L_0x043a:
            X.7zz r8 = (X.C349337zz) r8
            r4.A00 = r8
            return
        L_0x043f:
            r1 = r8
            goto L_0x0434
        L_0x0441:
            r6 = 0
            goto L_0x0419
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3499382n.<init>(com.instagram.api.schemas.StoryTemplateDict, com.instagram.reels.prompt.model.PromptStickerModel, X.6b1, java.util.HashMap, int, boolean, boolean):void");
    }

    public final boolean A00() {
        C40605Aet aet;
        List<C39741A7h> list = this.A03;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C39741A7h a7h : list) {
            C2802350v r1 = a7h.A06;
            if ((r1 instanceof C40605Aet) && (aet = (C40605Aet) r1) != null && aet.A06) {
                return true;
            }
        }
        return false;
    }
}
