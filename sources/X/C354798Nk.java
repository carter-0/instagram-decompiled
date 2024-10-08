package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.8Nk  reason: invalid class name and case insensitive filesystem */
public final class C354798Nk extends C299875vz implements C354808Nl, C268714ds {
    public int A00;
    public C339167jA A01;
    public C339177jB A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final Resources A09;
    public final AnonymousClass6M4 A0A;
    public final PromptStickerModel A0B;
    public final C339197jD A0C;
    public final Integer A0D;
    public final String A0E;
    public final AnonymousClass0eM A0F;
    public final boolean A0G;

    public final void FK8(Integer num) {
        int i;
        int i2;
        Integer num2 = num;
        0qQ.A0B(num2, 0);
        boolean z = false;
        if (num2 == AnonymousClass05K.A01) {
            z = true;
        }
        this.A0A.A00();
        PromptStickerModel promptStickerModel = this.A0B;
        PromptStickerModel A042 = promptStickerModel.A04();
        A042.A0C(00k.A0d(promptStickerModel.A00.B3f(), 1));
        Context context = this.A08;
        String str = this.A0E;
        if (!z) {
            A042 = promptStickerModel;
        }
        Integer num3 = this.A0D;
        int i3 = this.A04;
        if (z) {
            i = 1;
        } else {
            i = 3;
            if (promptStickerModel.A0M()) {
                i = 2;
            }
        }
        C339177jB r5 = new C339177jB(context, A042, num3, str, i3, i, 192);
        r5.setCallback(this);
        this.A02 = r5;
        C339167jA r8 = new C339167jA(context, i3, R.dimen.account_discovery_bottom_gap, !z, promptStickerModel.A0M(), true);
        r8.setCallback(this);
        this.A01 = r8;
        if (z) {
            int A082 = (this.A06 - this.A02.A08()) - this.A0C.A01;
            int i4 = 3;
            if (promptStickerModel.A0M()) {
                i4 = 4;
            }
            i2 = A082 / i4;
        } else {
            i2 = this.A05;
        }
        this.A00 = i2;
        setBounds(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float f;
        int i;
        Drawable drawable;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        if (!this.A03) {
            this.A01.draw(canvas);
            this.A02.draw(canvas);
            if (this.A0B.A0M()) {
                if (this.A0G) {
                    drawable = this.A0C;
                    f = (float) drawable.getBounds().right;
                    i = this.A02.getBounds().left;
                } else {
                    f = (float) this.A02.getBounds().right;
                    i = this.A0C.getBounds().left;
                    drawable = this.A02;
                }
                float f2 = f + (((float) (i - drawable.getBounds().right)) / 2.0f);
                canvas2.drawLine(f2, (float) this.A01.getBounds().top, f2, (float) this.A01.getBounds().bottom, (Paint) this.A0F.getValue());
            }
            this.A0C.draw(canvas);
            this.A0A.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0098, code lost:
        if (r1.A0B.A0M() != false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C354798Nk(android.content.Context r22, com.instagram.common.session.UserSession r23, com.instagram.reels.prompt.model.PromptStickerModel r24, java.lang.String r25, int r26, boolean r27, boolean r28) {
        /*
            r21 = this;
            r3 = r28
            r5 = r24
            r0 = r26 & 8
            if (r0 == 0) goto L_0x0025
            r6 = 0
            java.lang.String r10 = ""
            X.0sn r15 = X.0sn.A00
            r16 = 0
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            com.instagram.api.schemas.StoryPromptType r7 = com.instagram.api.schemas.StoryPromptType.DEFAULT
            com.instagram.reels.prompt.model.PromptStickerModel r5 = new com.instagram.reels.prompt.model.PromptStickerModel
            r8 = r6
            r11 = r10
            r12 = r6
            r13 = r6
            r14 = r6
            r17 = r16
            r18 = r16
            r19 = r16
            r20 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0025:
            r0 = r26 & 16
            r6 = r22
            if (r0 == 0) goto L_0x00f0
            boolean r4 = X.0mk.A02(r6)
        L_0x002f:
            r0 = r26 & 32
            if (r0 == 0) goto L_0x0035
            r27 = 0
        L_0x0035:
            r0 = r26 & 64
            if (r0 == 0) goto L_0x003a
            r3 = 0
        L_0x003a:
            r2 = 1
            r0 = 4
            X.0qQ.A0B(r5, r0)
            r1 = r21
            r1.<init>()
            r1.A08 = r6
            r9 = r25
            r1.A0E = r9
            r1.A0B = r5
            r1.A0G = r4
            r1.A03 = r3
            android.content.res.Resources r3 = r6.getResources()
            r1.A09 = r3
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r0 = r3.getDimensionPixelSize(r0)
            r1.A07 = r0
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r3 = r3.getDimensionPixelSize(r0)
            r1.A05 = r3
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r1.A0B
            int r10 = r0.A00()
            r1.A04 = r10
            X.9Kl r0 = new X.9Kl
            r0.<init>(r1, r2)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r1.A0F = r0
            r0 = r23
            X.6M3 r4 = X.C339157j9.A01(r6, r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r11 = 0
            X.0qQ.A0B(r0, r11)
            r4.A06 = r0
            X.6M4 r0 = r4.A00()
            r1.A0A = r0
            if (r27 != 0) goto L_0x009a
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r1.A0B
            boolean r0 = r0.A0M()
            r17 = 0
            if (r0 == 0) goto L_0x009c
        L_0x009a:
            r17 = 1
        L_0x009c:
            r15 = 2131165218(0x7f070022, float:1.7944647E38)
            X.7jA r12 = new X.7jA
            r13 = r6
            r14 = r10
            r16 = r2
            r18 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r12.setCallback(r1)
            r1.A01 = r12
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            r1.A0D = r8
            com.instagram.reels.prompt.model.PromptStickerModel r7 = r1.A0B
            r12 = 224(0xe0, float:3.14E-43)
            X.7jB r5 = new X.7jB
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r5.setCallback(r1)
            r1.A02 = r5
            r0 = 2131238318(0x7f081dae, float:1.8092911E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r1.A0B
            boolean r0 = r0.A0C
            if (r0 != 0) goto L_0x00cf
            r2 = 0
        L_0x00cf:
            X.7jD r5 = new X.7jD
            r5.<init>(r6, r2)
            r1.A0C = r5
            r1.A00 = r3
            X.7jB r0 = r1.A02
            int r4 = r0.A08()
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r1.A0B
            boolean r2 = r0.A0M()
            r0 = 3
            if (r2 == 0) goto L_0x00e8
            r0 = 4
        L_0x00e8:
            int r3 = r3 * r0
            int r4 = r4 + r3
            int r0 = r5.A01
            int r4 = r4 + r0
            r1.A06 = r4
            return
        L_0x00f0:
            r4 = 0
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354798Nk.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.String, int, boolean, boolean):void");
    }

    public final List A07() {
        return 0sr.A1M(new Drawable[]{this.A01, this.A02, this.A0C});
    }

    public final String A09() {
        String A002 = this.A0B.BkW().A00();
        0qQ.A07(A002);
        return A002;
    }

    public final /* synthetic */ Integer Ail() {
        return null;
    }

    public final Integer Aiy() {
        int i = this.A0C.A01;
        int i2 = this.A00;
        int i3 = 1;
        if (this.A0B.A0M()) {
            i3 = 2;
        }
        return Integer.valueOf(i + (i2 * i3));
    }

    public final PromptStickerModel BTZ() {
        return this.A0B;
    }

    public final C2802350v BzV() {
        return this.A0B;
    }

    public final void EVv(float f) {
        this.A02.A09(f);
    }

    public final /* synthetic */ void Euc() {
        this.A0A.A01();
    }

    public final int getIntrinsicHeight() {
        return this.A02.A01 + this.A07;
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        this.A0C.setAlpha(i);
        this.A02.setAlpha(i);
        if (this.A0B.A0M()) {
            ((Paint) this.A0F.getValue()).setAlpha(i);
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float intrinsicWidth;
        float f3;
        float f4;
        super.setBounds(i, i2, i3, i4);
        float f5 = ((float) (i + i3)) / 2.0f;
        float f6 = ((float) (i2 + i4)) / 2.0f;
        float f7 = ((float) this.A06) / 2.0f;
        float f8 = f5 - f7;
        float f9 = f5 + f7;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f10 = f6 - intrinsicHeight;
        float f11 = intrinsicHeight + f6;
        this.A01.setBounds(AnonymousClass1GB.A01(f8), AnonymousClass1GB.A01(f10), AnonymousClass1GB.A01(f9), AnonymousClass1GB.A01(f11));
        boolean z = this.A0G;
        if (z) {
            float intrinsicWidth2 = f9 - ((float) this.A02.getIntrinsicWidth());
            f = (float) this.A00;
            f2 = intrinsicWidth2 - f;
        } else {
            f = (float) this.A00;
            f2 = f + f8;
        }
        int A012 = AnonymousClass1GB.A01(f2);
        if (z) {
            intrinsicWidth = f9 - f;
        } else {
            f = (float) this.A00;
            intrinsicWidth = ((float) this.A02.getIntrinsicWidth()) + f8 + f;
        }
        int A013 = AnonymousClass1GB.A01(intrinsicWidth);
        if (z) {
            f3 = f + f8;
        } else {
            f3 = (f9 - ((float) this.A0C.A01)) - f;
        }
        int A014 = AnonymousClass1GB.A01(f3);
        if (z) {
            f4 = f8 + ((float) this.A0C.A01) + f;
        } else {
            f4 = f9 - f;
        }
        int A015 = AnonymousClass1GB.A01(f4);
        this.A02.setBounds(A012, AnonymousClass1GB.A01(f10), A013, (int) f11);
        C339197jD r4 = this.A0C;
        float intrinsicHeight2 = (float) (r4.getIntrinsicHeight() / 2);
        r4.setBounds(A014, AnonymousClass1GB.A01(f6 - intrinsicHeight2), A015, AnonymousClass1GB.A01(f6 + intrinsicHeight2));
    }
}
