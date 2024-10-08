package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.8vM  reason: invalid class name and case insensitive filesystem */
public final class C369808vM extends Drawable implements AnonymousClass5MJ, C300645xY, C369788vK, B1L {
    public final Drawable A00;
    public final C369798vL A01;
    public final 1sw A02;
    public final ProductType A03 = ProductType.IGTV;
    public final String A04;

    public C369808vM(Context context, Drawable drawable, C3498682d r5, 1sw r6) {
        this.A00 = drawable;
        this.A02 = r6;
        C369798vL r0 = new C369798vL(context, r5, true);
        this.A01 = r0;
        this.A04 = r0.C4F();
    }

    public final /* synthetic */ void EqG() {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A00.draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A01.setBounds(rect);
        this.A00.setBounds(rect);
        invalidateSelf();
    }

    public final Drawable Aco() {
        return this.A00;
    }

    public final 1sw BRP() {
        return this.A02;
    }

    public final ProductType BgY() {
        return this.A03;
    }

    public final C2802350v BzV() {
        return this.A01.A05;
    }

    public final String C4F() {
        return this.A04;
    }

    public final void EXC(int i, int i2) {
        this.A01.A00 = i;
    }

    public final int getDurationInMs() {
        return -1;
    }

    public final int getIntrinsicHeight() {
        return Math.round(this.A01.A03);
    }

    public final int getIntrinsicWidth() {
        return Math.round(this.A01.A04);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }
}
