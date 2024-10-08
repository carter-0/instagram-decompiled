package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9lx  reason: invalid class name and case insensitive filesystem */
public final class C387279lx extends C369778vJ implements AnonymousClass5MJ {
    public final AnonymousClass0eM A00;

    public final /* synthetic */ void EqG() {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        ((Drawable) this.A00.getValue()).draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        ((Drawable) this.A00.getValue()).setBounds(rect);
        invalidateSelf();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C387279lx(android.content.Context r18, android.graphics.drawable.Drawable r19, com.instagram.common.session.UserSession r20, com.instagram.common.typedurl.ImageUrl r21, X.C15904UkT r22, X.1iA r23, X.1sw r24, com.instagram.model.mediatype.ProductType r25) {
        /*
            r17 = this;
            java.lang.Integer r14 = X.AnonymousClass05K.A0N
            r5 = 0
            r16 = 0
            r2 = r17
            r3 = r18
            r4 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r6 = r5
            r13 = r5
            r15 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = 12
            X.AwZ r0 = new X.AwZ
            r0.<init>(r1, r3, r2, r9)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387279lx.<init>(android.content.Context, android.graphics.drawable.Drawable, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, X.UkT, X.1iA, X.1sw, com.instagram.model.mediatype.ProductType):void");
    }

    public final C2802350v BzV() {
        return this.A0c;
    }

    public final void EXC(int i, int i2) {
        ((AnonymousClass9X4) this.A00.getValue()).A02.A00 = i;
    }

    public final int getDurationInMs() {
        Long l = this.A0c.A06;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 15000) {
                longValue = 15000;
            }
            return (int) longValue;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int getOpacity() {
        this.A00.getValue();
        return -3;
    }

    public final void setAlpha(int i) {
        ((Drawable) this.A00.getValue()).setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        ((Drawable) this.A00.getValue()).setColorFilter(colorFilter);
    }
}
