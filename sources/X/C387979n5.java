package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.9n5  reason: invalid class name and case insensitive filesystem */
public final class C387979n5 extends AnonymousClass8D8 {
    public final Drawable A00;
    public final 1Ng A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.7w8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.9qB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.9qC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: X.9k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: X.9k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: X.9k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: X.9k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.9k0} */
    /* JADX WARNING: type inference failed for: r6v2, types: [android.graphics.drawable.Drawable] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C387979n5(android.content.Context r26, com.instagram.common.session.UserSession r27, X.AnonymousClass8BA r28, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r29, X.C3499982t r30, com.instagram.reels.question.model.QuestionResponseReshareModel r31) {
        /*
            r25 = this;
            r7 = r29
            r13 = 0
            r14 = 0
            r2 = 0
            r19 = 111(0x6f, float:1.56E-43)
            r4 = r25
            r16 = r28
            r15 = r4
            r17 = r13
            r18 = r13
            r20 = r2
            r21 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r10 = r27
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r10)
            r4.A01 = r0
            r1 = r26
            android.content.res.Resources r3 = r1.getResources()
            r0 = 2131165374(0x7f0700be, float:1.7944963E38)
            int r15 = r3.getDimensionPixelSize(r0)
            java.lang.String r6 = r30.BUn()
            r0 = r31
            com.instagram.reels.question.model.responsetype.QuestionResponseType r3 = r0.A03
            int r5 = r3.ordinal()
            r3 = 3
            if (r5 == r3) goto L_0x010c
            r3 = 2
            if (r5 == r3) goto L_0x0053
            boolean r2 = r0.A09
            if (r2 == 0) goto L_0x004d
            X.9qC r6 = new X.9qC
            r6.<init>(r1, r0, r15)
        L_0x0047:
            r4.A00 = r6
            X.AnonymousClass7TG.A13(r6)
            return
        L_0x004d:
            X.9qB r6 = new X.9qB
            r6.<init>(r1, r0, r15)
            goto L_0x0047
        L_0x0053:
            com.instagram.reels.questionv2.model.QuestionMediaResponseModel r9 = r0.A04
            r9.getClass()
            java.lang.Integer r3 = r9.A04
            r3.getClass()
            int r5 = r3.intValue()
            X.1iA r3 = X.1iA.A0Q
            int r3 = r3.A00
            if (r5 != r3) goto L_0x00a1
            com.instagram.model.mediasize.ImageInfo r6 = r9.A00
            r6.getClass()
            java.lang.Integer r8 = r9.A06
            r8.getClass()
            int r7 = r8.intValue()
            java.lang.Integer r3 = r9.A05
            r3.getClass()
            int r5 = r3.intValue()
            com.instagram.model.mediasize.ExtendedImageUrl r9 = X.C18240Vo7.A00(r1, r6, r7, r5)
            float r6 = (float) r15
            r8.getClass()
            float r3 = (float) r7
            float r6 = r6 / r3
            float r3 = (float) r5
            float r6 = r6 * r3
            java.lang.String r5 = r0.A07
            X.9q9 r3 = new X.9q9
            r3.<init>(r1, r5, r15)
            java.lang.Float r12 = java.lang.Float.valueOf(r6)
            X.9k0 r6 = new X.9k0
            r7 = r1
            r8 = r13
            r10 = r0
            r11 = r3
            r13 = r15
            r14 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0047
        L_0x00a1:
            java.lang.String r3 = r9.A0A
            r3.getClass()
            java.io.File r5 = X.AnonymousClass7TE.A0t(r3)
            X.1iA r3 = X.1iA.A0a
            int r3 = r3.A00
            com.instagram.common.gallery.Medium r9 = X.C282665Eg.A03(r5, r3, r2)
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r7 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r7
            X.81W r3 = r7.A0K
            int r8 = r3.getWidth()
            int r7 = r3.getHeight()
            java.lang.String r5 = r0.A07
            X.9q9 r3 = new X.9q9
            r3.<init>(r1, r5, r15)
            float r6 = (float) r15
            float r5 = (float) r8
            float r6 = r6 / r5
            float r5 = (float) r7
            float r6 = r6 * r5
            int r5 = (int) r6
            X.9sQ r11 = X.C391149sQ.QUESTION_RESPONSE_STICKER
            r6 = 12
            float r20 = X.0nA.A04(r1, r6)
            float r21 = X.0nA.A04(r1, r6)
            r17 = 1
            X.9Hy r8 = new X.9Hy
            r16 = r8
            r18 = r14
            r19 = r14
            r16.<init>(r17, r18, r19, r20, r21)
            X.9sL r12 = X.C391099sL.NOT_CLIPS
            r17 = -1
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            X.9X8 r7 = new X.9X8
            r19 = r2
            r16 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.9k0 r6 = new X.9k0
            r16 = r6
            r17 = r1
            r18 = r7
            r19 = r13
            r20 = r0
            r21 = r3
            r22 = r13
            r23 = r15
            r24 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0047
        L_0x010c:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.9Ws r3 = new X.9Ws
            r3.<init>(r1, r0, r15)
            r5.add(r3)
            X.9Wr r3 = new X.9Wr
            r3.<init>(r1, r0, r15)
            r5.add(r3)
            com.instagram.api.schemas.MusicProduct r3 = com.instagram.api.schemas.MusicProduct.QUESTION_RESPONSE_RESHARE
            com.instagram.reels.question.model.MusicQuestionResponseModel r0 = r0.A01
            r0.getClass()
            com.instagram.api.schemas.TrackData r0 = r0.A00
            com.instagram.music.common.model.MusicAssetModel r2 = com.instagram.music.common.model.MusicAssetModel.A01(r0, r2)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.music.common.model.MusicOverlayStickerModel r3 = X.C59670JTa.A04(r3, r2, r0, r6)
            java.util.Iterator r2 = r5.iterator()
        L_0x013a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x014a
            android.graphics.drawable.Drawable r0 = X.AnonymousClass7TE.A0Z(r2)
            X.B3c r0 = (X.B3c) r0
            r0.Edm(r3)
            goto L_0x013a
        L_0x014a:
            X.7w8 r6 = new X.7w8
            r6.<init>(r1, r10, r13, r5)
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387979n5.<init>(android.content.Context, com.instagram.common.session.UserSession, X.8BA, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.82t, com.instagram.reels.question.model.QuestionResponseReshareModel):void");
    }
}
