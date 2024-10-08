package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.9pv  reason: invalid class name and case insensitive filesystem */
public final class C389619pv extends C299875vz implements C268714ds {
    public C339167jA A00;
    public C339177jB A01;
    public final int A02;
    public final int A03;
    public final C389509pk A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Resources A09;
    public final TextPaint A0A;
    public final 0rN A0B;
    public final PromptStickerModel A0C;
    public final C339167jA A0D;
    public final C306386Ly A0E;
    public final C306386Ly A0F;
    public final C363208jL A0G;
    public final CharSequence A0H;
    public final boolean A0I;
    public final boolean A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0074, code lost:
        if (r3 == -1) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0142, code lost:
        if (r1 != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0061, code lost:
        if (X.0qQ.A0K(r8.A00.Bzk(), "restyle_sticker_with_facepile_style") != false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C389619pv(android.content.Context r37, com.instagram.common.session.UserSession r38, com.instagram.reels.prompt.model.PromptStickerModel r39) {
        /*
            r36 = this;
            r15 = 1
            r14 = 3
            r8 = r39
            X.0qQ.A0B(r8, r14)
            r7 = r36
            r7.<init>()
            r7.A0C = r8
            r6 = r37
            android.content.res.Resources r1 = r6.getResources()
            r7.A09 = r1
            r0 = 2131165258(0x7f07004a, float:1.7944728E38)
            int r10 = r1.getDimensionPixelSize(r0)
            r7.A03 = r10
            int r2 = X.AnonymousClass7TE.A0E(r1)
            int r19 = X.AnonymousClass7TE.A0F(r1)
            r0 = r19
            r7.A08 = r0
            r9 = 2131165190(0x7f070006, float:1.794459E38)
            int r12 = r1.getDimensionPixelSize(r9)
            r7.A07 = r12
            int r0 = X.AnonymousClass7TE.A0D(r1)
            r7.A02 = r0
            int r5 = r8.A00()
            com.instagram.api.schemas.StoryPromptType r1 = r8.A03()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP
            if (r1 == r0) goto L_0x0063
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r8.A00
            java.lang.String r1 = r0.Bzk()
            java.lang.String r0 = "backdrop_sticker_with_facepile_style"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0063
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r8.A00
            java.lang.String r1 = r0.Bzk()
            java.lang.String r0 = "restyle_sticker_with_facepile_style"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r4 = 0
            if (r0 == 0) goto L_0x0064
        L_0x0063:
            r4 = 1
        L_0x0064:
            r7.A0I = r4
            r1 = 1058642330(0x3f19999a, float:0.6)
            r0 = -1
            int r3 = X.0nH.A08(r5, r1)
            if (r5 == r0) goto L_0x0076
            r18 = 1
            r29 = r3
            if (r3 != r0) goto L_0x007a
        L_0x0076:
            r18 = 0
            r29 = r5
        L_0x007a:
            if (r5 == r0) goto L_0x01ec
            r17 = r29
        L_0x007e:
            r27 = 0
            r16 = 2131165218(0x7f070022, float:1.7944647E38)
            X.7jA r0 = new X.7jA
            r20 = r0
            r21 = r6
            r22 = r29
            r23 = r16
            r24 = r15
            r25 = r27
            r26 = r15
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r0.setCallback(r7)
            r7.A00 = r0
            int r0 = r2 * 2
            int r10 = r10 - r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r8.A00
            java.lang.String r2 = r0.getText()
            java.lang.String r32 = ""
            if (r2 != 0) goto L_0x00aa
            r2 = r32
        L_0x00aa:
            android.content.res.Resources r0 = r6.getResources()
            float r24 = X.AnonymousClass7TE.A01(r0, r9)
            int r0 = X.AnonymousClass7TH.A01(r6)
            float r11 = (float) r0
            r0 = r16
            int r0 = X.AnonymousClass7TF.A02(r6, r0)
            float r0 = (float) r0
            r28 = r0
            android.text.TextPaint r1 = new android.text.TextPaint
            r1.<init>()
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r6)
            float r0 = r0.density
            r1.density = r0
            r1.setTextSize(r11)
            r7.A0A = r1
            r0 = 1065353216(0x3f800000, float:1.0)
            android.text.Layout$Alignment r21 = android.text.Layout.Alignment.ALIGN_NORMAL
            r23 = 0
            X.0rN r13 = new X.0rN
            r25 = r0
            r26 = r10
            r20 = r13
            r22 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r7.A0B = r13
            r21 = r32
            r22 = r2
            r24 = r15
            r25 = r27
            r23 = r32
            java.lang.CharSequence r13 = X.C252993q2.A01(r20, r21, r22, r23, r24, r25)
            X.0qQ.A07(r13)
            r7.A0H = r13
            X.6Ly r1 = X.AnonymousClass7TE.A0s(r6, r10)
            X.ABM.A00(r6, r1)
            boolean r13 = r13.equals(r2)
            if (r13 != 0) goto L_0x0109
            r11 = r28
        L_0x0109:
            r1.A0A(r11)
            r1.A0Q = r15
            int r11 = X.AnonymousClass7TF.A02(r6, r9)
            float r11 = (float) r11
            r1.A0B(r11, r0)
            if (r18 == 0) goto L_0x0119
            r3 = -1
        L_0x0119:
            r1.A0F(r3)
            r1.A0M(r2)
            java.lang.String r3 = "…"
            r1.A0G(r14, r3)
            r1.setCallback(r7)
            r7.A0F = r1
            com.instagram.api.schemas.StoryPromptTappableDataIntf r1 = r8.A00
            com.instagram.api.schemas.GenAIToolInfoDictIntf r1 = r1.B91()
            if (r1 == 0) goto L_0x01e9
            java.lang.String r3 = r1.Bhm()
            if (r3 == 0) goto L_0x0144
            int r1 = r3.length()
            if (r1 == 0) goto L_0x0144
            boolean r1 = r3.equals(r2)
            r2 = 1
            if (r1 == 0) goto L_0x0145
        L_0x0144:
            r2 = 0
        L_0x0145:
            r7.A0J = r2
            X.6Ly r10 = X.AnonymousClass7TE.A0s(r6, r10)
            android.content.res.Resources r11 = r6.getResources()
            r1 = r16
            X.AnonymousClass7TF.A11(r11, r10, r1)
            int r1 = X.AnonymousClass7TF.A02(r6, r9)
            float r1 = (float) r1
            r10.A0B(r1, r0)
            int r0 = X.2Yu.A08(r6)
            X.AnonymousClass7TE.A1O(r6, r10, r0)
            r0 = 34
            java.lang.String r0 = X.002.A0E(r3, r0, r0)
            r10.A0M(r0)
            java.lang.String r0 = "…\""
            r10.A0G(r15, r0)
            r10.setCallback(r7)
            r7.A0E = r10
            if (r2 == 0) goto L_0x01e7
            int r0 = r10.A06
            int r0 = r0 + r12
        L_0x017b:
            r7.A06 = r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165237(0x7f070035, float:1.7944685E38)
            float r3 = X.AnonymousClass7TE.A01(r1, r0)
            r1 = 2131099912(0x7f060108, float:1.781219E38)
            r0 = 80
            X.8jL r2 = new X.8jL
            r2.<init>(r6, r3, r1, r0)
            r2.setCallback(r7)
            int r1 = X.AnonymousClass7TE.A0A(r6)
            r0 = r29
            if (r0 == r1) goto L_0x01a2
            android.graphics.Paint r1 = r2.A08
            r1.setColor(r0)
        L_0x01a2:
            r7.A0G = r2
            java.lang.Integer r31 = X.AnonymousClass05K.A01
            r35 = 224(0xe0, float:3.14E-43)
            X.7jB r0 = new X.7jB
            r28 = r0
            r29 = r6
            r30 = r8
            r33 = r5
            r34 = r27
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            r0.setCallback(r7)
            r7.A01 = r0
            X.9pk r1 = new X.9pk
            r2 = r38
            r0 = r17
            r1.<init>(r6, r2, r8, r0)
            r7.A04 = r1
            r10 = -1
            X.7jA r0 = new X.7jA
            r8 = r0
            r9 = r6
            r11 = r16
            r12 = r27
            r13 = r12
            r14 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.setCallback(r7)
            r7.A0D = r0
            if (r4 == 0) goto L_0x01e5
            X.7jB r0 = r7.A01
            int r0 = r0.A01
            int r0 = r0 + r19
        L_0x01e2:
            r7.A05 = r0
            return
        L_0x01e5:
            r0 = 0
            goto L_0x01e2
        L_0x01e7:
            r0 = 0
            goto L_0x017b
        L_0x01e9:
            r3 = 0
            goto L_0x0144
        L_0x01ec:
            int r17 = r8.A01(r6)
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389619pv.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.prompt.model.PromptStickerModel):void");
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A0D.draw(canvas);
        this.A0F.draw(canvas);
        if (this.A0J) {
            this.A0E.draw(canvas);
        }
        if (this.A0I) {
            this.A01.draw(canvas);
        }
        this.A0G.draw(canvas);
        this.A04.draw(canvas);
    }

    public final List A07() {
        return 0sr.A1M(new Drawable[]{this.A00, this.A0D, this.A0F, this.A0E, this.A01, this.A0G, this.A04});
    }

    public final String A09() {
        String A002 = this.A0C.BkW().A00();
        0qQ.A07(A002);
        return A002;
    }

    public final C2802350v BzV() {
        return this.A0C;
    }

    public final int getIntrinsicHeight() {
        return this.A0F.A06 + (this.A08 * 2) + this.A06 + this.A0G.getIntrinsicHeight() + this.A05 + this.A04.A00 + (this.A02 * 2);
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A0D.setAlpha(i);
        this.A0F.setAlpha(i);
        this.A0E.setAlpha(i);
        this.A01.setAlpha(i);
        this.A0G.setAlpha(i);
        this.A04.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A03) / 2.0f;
        float f4 = f - f3;
        float f5 = f3 + f;
        float intrinsicHeight = f2 - (((float) getIntrinsicHeight()) / 2.0f);
        float intrinsicHeight2 = f2 + (((float) getIntrinsicHeight()) / 2.0f);
        this.A00.setBounds(AnonymousClass1GB.A01(f4), AnonymousClass1GB.A01(intrinsicHeight), AnonymousClass1GB.A01(f5), AnonymousClass1GB.A01(intrinsicHeight2));
        C339167jA r8 = this.A0D;
        int A012 = AnonymousClass1GB.A01(f4);
        int A013 = AnonymousClass1GB.A01(intrinsicHeight2);
        C389509pk r6 = this.A04;
        int i6 = r6.A00;
        int i7 = this.A02;
        r8.setBounds(A012, A013 - ((i7 * 2) + i6), AnonymousClass1GB.A01(f5), AnonymousClass1GB.A01(intrinsicHeight2));
        C306386Ly r11 = this.A0F;
        C306386Ly r14 = r11;
        float f6 = (float) (r11.A0A / 2);
        int A014 = AnonymousClass1GB.A01(f - f6);
        int i8 = this.A08;
        float f7 = ((float) i8) + intrinsicHeight;
        r11.setBounds(A014, AnonymousClass1GB.A01(f7), AnonymousClass1GB.A01(f6 + f), AnonymousClass1GB.A01(f7 + ((float) r11.A06)));
        if (this.A0J) {
            r11 = this.A0E;
            int A015 = AnonymousClass1GB.A01(f - ((float) (r11.A0A / 2)));
            int i9 = r14.getBounds().bottom;
            int i10 = this.A07;
            r11.setBounds(A015, i9 + i10, AnonymousClass1GB.A01(((float) (r11.A0A / 2)) + f), r14.getBounds().bottom + i10 + r11.A06);
        }
        int i11 = r11.getBounds().bottom;
        if (this.A0I) {
            C339177jB r10 = this.A01;
            int i12 = i8 + i11;
            r10.setBounds(AnonymousClass1GB.A01(f - ((float) (r10.getIntrinsicWidth() / 2))), i12, AnonymousClass1GB.A01(((float) (r10.getIntrinsicWidth() / 2)) + f), r10.A01 + i12);
            i11 = r10.getBounds().bottom;
        }
        C363208jL r7 = this.A0G;
        int i13 = i8 + i11;
        r7.setBounds(AnonymousClass1GB.A01(f4), i13, AnonymousClass1GB.A01(f5), r7.getIntrinsicHeight() + i13);
        r6.setBounds(AnonymousClass1GB.A01(f - ((float) (r6.getIntrinsicWidth() / 2))), r7.getBounds().bottom + i7, AnonymousClass1GB.A01(f + ((float) (r6.getIntrinsicWidth() / 2))), r7.getBounds().bottom + i6 + i7);
    }
}
