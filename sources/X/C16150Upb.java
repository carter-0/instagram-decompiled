package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.Upb  reason: case insensitive filesystem */
public final class C16150Upb extends C16152Upd {
    public boolean A00;
    public final Drawable A01;
    public final AnonymousClass6M4 A02;
    public final C15839UjP A03;
    public final List A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        if (r3.A06().contains(com.instagram.reels.question.model.responsetype.QuestionResponseType.MEDIA) != true) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16150Upb(android.content.Context r7, com.instagram.common.session.UserSession r8, X.C19477WaP r9) {
        /*
            r6 = this;
            r2 = 1
            X.AnonymousClass7TF.A1B(r8, r2, r7)
            r6.<init>(r7, r8, r9)
            X.UjP r5 = new X.UjP
            r5.<init>(r7)
            r5.setCallback(r6)
            r6.A03 = r5
            r0 = 2131238579(0x7f081eb3, float:1.809344E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r6.A01 = r0
            X.WaP r3 = r6.A0D
            if (r3 == 0) goto L_0x0031
            java.lang.String r4 = r3.A01
            if (r4 != 0) goto L_0x0038
            java.util.List r1 = r3.A06()
            com.instagram.reels.question.model.responsetype.QuestionResponseType r0 = com.instagram.reels.question.model.responsetype.QuestionResponseType.MEDIA
            boolean r1 = r1.contains(r0)
            r0 = 2131969410(0x7f134582, float:1.9575742E38)
            if (r1 == r2) goto L_0x0034
        L_0x0031:
            r0 = 2131971054(0x7f134bee, float:1.9579076E38)
        L_0x0034:
            java.lang.String r4 = X.C51967G9n.A0p(r7, r0)
        L_0x0038:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A04 = r0
            int r0 = r6.A08
            X.6M3 r1 = new X.6M3
            r1.<init>(r7, r6, r0)
            r1.A07 = r4
            r0 = 2131165389(0x7f0700cd, float:1.7944994E38)
            r1.A02(r0)
            X.6M4 r0 = r1.A00()
            r6.A02 = r0
            r6.A00 = r2
            java.util.List r0 = r6.A04
            java.util.ArrayList r4 = X.00k.A0U(r0)
            X.6Ly r2 = r6.A0F
            android.graphics.drawable.Drawable r1 = r6.A0B
            X.6Ly r0 = r6.A0E
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r5, r2, r1, r0}
            java.util.Collections.addAll(r4, r0)
            if (r3 == 0) goto L_0x008c
            android.content.Context r0 = r6.A09
            int r0 = r3.A03(r0)
            X.UjP r2 = r6.A03
            r2.A09(r0)
            r2.A0B(r0)
            r2.A08()
            X.UNR r0 = r3.A00
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x008c
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
            X.U1N r0 = r2.A0B
            r0.A00(r1)
        L_0x008c:
            r6.A0D()
            r6.A0C()
            if (r3 == 0) goto L_0x00b0
            android.content.Context r0 = r6.A09
            int r1 = r3.A04(r0)
            android.graphics.drawable.Drawable r0 = r6.A01
            if (r0 == 0) goto L_0x00b0
            android.graphics.drawable.Drawable r2 = r0.mutate()
            if (r2 == 0) goto L_0x00b0
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r1 = X.0nH.A07(r1, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16150Upb.<init>(android.content.Context, com.instagram.common.session.UserSession, X.WaP):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.UjP r0 = r3.A03
            r0.draw(r4)
            X.6Ly r0 = r3.A0F
            r0.draw(r4)
            X.WaP r0 = r3.A0D
            if (r0 == 0) goto L_0x0040
            X.UNR r0 = r0.A00
            com.instagram.reels.question.constants.QuestionStickerType r1 = r0.A00
            if (r1 != 0) goto L_0x001a
            com.instagram.reels.question.constants.QuestionStickerType r1 = com.instagram.reels.question.constants.QuestionStickerType.TEXT
        L_0x001a:
            com.instagram.reels.question.constants.QuestionStickerType r0 = com.instagram.reels.question.constants.QuestionStickerType.TEXT
            if (r1 == r0) goto L_0x0040
            android.graphics.drawable.Drawable r0 = r3.A0C
            if (r0 == 0) goto L_0x0025
            r0.draw(r4)
        L_0x0025:
            android.graphics.drawable.Drawable r2 = r3.A01
            if (r2 != 0) goto L_0x0030
            java.lang.String r1 = "QuestionStickerDrawable"
            java.lang.String r0 = "music icon drawable is null"
            X.0wb.A03(r1, r0)
        L_0x0030:
            if (r2 == 0) goto L_0x0035
            r2.draw(r4)
        L_0x0035:
            X.6Ly r0 = r3.A0E
            r0.draw(r4)
            X.6M4 r0 = r3.A02
            r0.draw(r4)
            return
        L_0x0040:
            android.graphics.drawable.Drawable r2 = r3.A0B
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16150Upb.draw(android.graphics.Canvas):void");
    }

    public final int getIntrinsicHeight() {
        int i = this.A04;
        return this.A03.A00 + this.A05 + this.A0F.A06 + i + (this.A02 * 2) + this.A0E.A06 + i;
    }

    public final int getIntrinsicWidth() {
        return this.A08;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setBounds(int r21, int r22, int r23, int r24) {
        /*
            r20 = this;
            r8 = r20
            r2 = r24
            r10 = r23
            r14 = r21
            r3 = r22
            super.setBounds(r14, r3, r10, r2)
            int r19 = r8.getIntrinsicHeight()
            X.UjP r1 = r8.A03
            int r0 = r1.A00
            r18 = r0
            int r15 = r8.A05
            X.6Ly r9 = r8.A0F
            int r0 = r9.A06
            int r17 = r15 + r0
            int r7 = r8.A02
            X.6Ly r6 = r8.A0E
            int r0 = r6.A06
            int r16 = r7 + r0
            int r11 = r8.A06
            int r4 = r11 * 2
            int r12 = r8.A01
            int r4 = r4 + r12
            int r5 = r8.A00
            int r4 = r4 + r5
            int r0 = r6.A0A
            int r4 = r4 + r0
            int r13 = r4 / 2
            X.WaP r0 = r8.A0D
            if (r0 == 0) goto L_0x00cd
            X.UNR r0 = r0.A00
            com.instagram.reels.question.constants.QuestionStickerType r4 = r0.A00
            if (r4 != 0) goto L_0x0042
            com.instagram.reels.question.constants.QuestionStickerType r4 = com.instagram.reels.question.constants.QuestionStickerType.TEXT
        L_0x0042:
            com.instagram.reels.question.constants.QuestionStickerType r0 = com.instagram.reels.question.constants.QuestionStickerType.TEXT
            if (r4 == r0) goto L_0x00cd
            int r0 = r12 + r5
            int r5 = r0 / 2
        L_0x004a:
            int r0 = r21 + r23
            int r4 = r0 / 2
            int r3 = r22 + r24
            int r3 = r3 / 2
            int r0 = r19 / 2
            int r2 = r3 - r0
            int r3 = r3 + r0
            r1.setBounds(r14, r2, r10, r3)
            int r0 = r9.A0A
            int r1 = r0 / 2
            int r0 = r4 - r1
            int r2 = r2 + r18
            int r15 = r15 + r2
            int r1 = r1 + r4
            int r2 = r2 + r17
            r9.setBounds(r0, r15, r1, r2)
            android.graphics.drawable.Drawable r9 = r8.A0B
            if (r9 == 0) goto L_0x007b
            int r2 = r8.A04
            int r14 = r21 + r2
            int r1 = r3 - r2
            int r0 = r1 - r16
            int r0 = r0 - r7
            int r10 = r23 - r2
            r9.setBounds(r14, r0, r10, r1)
        L_0x007b:
            android.graphics.drawable.Drawable r10 = r8.A0C
            if (r10 == 0) goto L_0x008d
            int r9 = r4 - r13
            int r0 = r8.A04
            int r2 = r3 - r0
            int r1 = r2 - r16
            int r1 = r1 - r7
            int r0 = r4 + r13
            r10.setBounds(r9, r1, r0, r2)
        L_0x008d:
            android.graphics.drawable.Drawable r10 = r8.A01
            if (r10 == 0) goto L_0x00ba
            int r0 = r4 - r13
            int r11 = r11 + r0
            int r11 = r11 + r12
            int r0 = r10.getIntrinsicWidth()
            int r9 = r11 - r0
            int r0 = r8.A04
            int r2 = r3 - r0
            int r12 = r7 + r16
            int r0 = r10.getIntrinsicHeight()
            int r0 = r0 + r12
            int r0 = r0 / 2
            int r1 = r2 - r0
            int r0 = r10.getIntrinsicHeight()
            int r12 = r12 + r0
            int r0 = r12 / 2
            int r2 = r2 - r0
            int r0 = r10.getIntrinsicHeight()
            int r2 = r2 + r0
            r10.setBounds(r9, r1, r11, r2)
        L_0x00ba:
            int r0 = r6.A0A
            int r2 = r0 / 2
            int r1 = r4 - r2
            int r1 = r1 + r5
            int r0 = r8.A04
            int r3 = r3 - r0
            int r0 = r3 - r16
            int r4 = r4 + r2
            int r4 = r4 + r5
            int r3 = r3 - r7
            r6.setBounds(r1, r0, r4, r3)
            return
        L_0x00cd:
            r5 = 0
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16150Upb.setBounds(int, int, int, int):void");
    }
}
