package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.user.model.Product;

/* renamed from: X.9q6  reason: invalid class name and case insensitive filesystem */
public final class C389729q6 extends C369528uu implements Drawable.Callback, AnonymousClass1MK {
    public int A00;
    public int A01;
    public C59985Jcu A02;
    public C306386Ly A03;
    public C306386Ly A04;
    public Product A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Context A0B;
    public final Resources A0C;
    public final Paint A0D;
    public final RectF A0E;
    public final String A0F = "product_item_tile_sticker_black_white";

    public final void CyF(C226952iF r2, AnonymousClass3LX r3) {
        0qQ.A0B(r3, 1);
        A00(r3.A01, this);
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public C389729q6(Context context) {
        0qQ.A0B(context, 1);
        this.A0B = context;
        Resources resources = context.getResources();
        this.A0C = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.album_music_sticker_album_art_size);
        this.A07 = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_album_art_size);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
        this.A09 = dimensionPixelSize3;
        int A0H = AnonymousClass7TE.A0H(resources);
        this.A08 = A0H;
        this.A0E = AnonymousClass7TE.A0Y();
        this.A01 = -1;
        this.A0D = AnonymousClass7TE.A0V(1);
        this.A06 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        C306386Ly A0s = AnonymousClass7TE.A0s(context, dimensionPixelSize2);
        A0s.A0F(-1);
        AnonymousClass7TF.A11(resources, A0s, R.dimen.action_bar_item_spacing_right);
        A0s.A0J(Typeface.SANS_SERIF, 1);
        A0s.A0G(1, "…");
        this.A04 = A0s;
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context, dimensionPixelSize2);
        A0s2.A0F(-1);
        AnonymousClass7TF.A11(resources, A0s2, R.dimen.action_bar_item_spacing_right);
        A0s2.A0J(Typeface.SANS_SERIF, 0);
        A0s2.A0G(1, "…");
        this.A03 = A0s2;
        this.A0A = Math.max(dimensionPixelSize, dimensionPixelSize2);
        this.A00 = dimensionPixelSize + dimensionPixelSize3 + this.A04.A06 + A0H + A0s2.A06 + dimensionPixelSize3;
    }

    public static final void A00(Bitmap bitmap, C389729q6 r3) {
        if (bitmap != null) {
            Context context = r3.A0B;
            r3.A01 = context.getColor(2Yu.A04(context));
            float f = (float) r3.A06;
            int i = r3.A07;
            C59985Jcu A002 = AES.A00(bitmap, f, i, i);
            A002.setCallback(r3);
            r3.A02 = A002;
            r3.invalidateSelf();
        }
    }

    public final String C4F() {
        return this.A0F;
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A0A;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        Rect A0X = AnonymousClass7TE.A0X(this);
        float f = (float) A0X.left;
        int i = this.A0A;
        int i2 = this.A07;
        canvas.translate(f + (((float) (i - i2)) / 2.0f), (float) A0X.top);
        C59985Jcu jcu = this.A02;
        if (jcu != null) {
            int i3 = this.A01;
            if (i3 != -1) {
                Paint paint = this.A0D;
                paint.setColor(i3);
                RectF rectF = this.A0E;
                rectF.set(jcu.getBounds());
                float f2 = (float) this.A06;
                canvas.drawRoundRect(rectF, f2, f2, paint);
            }
            jcu.draw(canvas);
            canvas.restore();
            invalidateSelf();
        }
        canvas.save();
        AnonymousClass7TF.A13(canvas, AnonymousClass7TE.A0X(this));
        canvas.save();
        canvas.translate(0.0f, (float) (i2 + this.A09));
        this.A04.draw(canvas);
        canvas.save();
        C306386Ly r2 = this.A03;
        AnonymousClass7TF.A15(canvas, r2, 0.0f, (float) (r2.A06 + this.A08));
        canvas.restore();
        canvas.restore();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass7TH.A0L(this, runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass7TH.A0M(this, runnable, j);
    }
}
