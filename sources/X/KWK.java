package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

public final class KWK extends KHj {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Drawable A03;
    public final Drawable A04;
    public final PromptStickerModel A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003f, code lost:
        if (r13 != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ KWK(android.content.Context r10, com.instagram.reels.prompt.model.PromptStickerModel r11, java.lang.String r12, boolean r13) {
        /*
            r9 = this;
            r7 = -1
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            r1.getDimensionPixelSize(r0)
            r0 = 3
            r4 = r12
            X.DbW.A1N(r12, r0, r11)
            r9.<init>()
            r9.A02 = r10
            r9.A05 = r11
            int r5 = X.JTR.A07(r10)
            r9.A00 = r5
            r2 = 0
            r1 = 2131165213(0x7f07001d, float:1.7944637E38)
            X.KHm r0 = new X.KHm
            r0.<init>(r10, r1)
            r0.setCallback(r9)
            r9.A04 = r0
            int r6 = X.AnonymousClass7TG.A04(r10)
            int r0 = X.2Yu.A09(r10)
            int r8 = r10.getColor(r0)
            com.instagram.user.model.User r0 = r11.A02
            if (r0 == 0) goto L_0x0041
            com.instagram.common.typedurl.ImageUrl r3 = r0.Bh3()
            if (r13 == 0) goto L_0x0042
        L_0x0041:
            r3 = r2
        L_0x0042:
            X.3ay r2 = new X.3ay
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2.setCallback(r9)
            r9.A03 = r2
            int r0 = r5 / 2
            r9.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KWK.<init>(android.content.Context, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.String, boolean):void");
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (!this.A05.A09) {
            this.A04.draw(canvas);
        }
    }

    public final List A07() {
        Drawable[] drawableArr = {this.A04, this.A03};
        0qQ.A0B(drawableArr, 0);
        return 03t.A0I(drawableArr);
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i2 + i4)) / 2.0f;
        int i5 = this.A00;
        float f2 = ((float) i5) / 2.0f;
        int i6 = (int) ((((float) (i + i3)) / 2.0f) - f2);
        this.A04.setBounds(i6, (int) (f - f2), i5 + i6, (int) (f + f2));
    }
}
