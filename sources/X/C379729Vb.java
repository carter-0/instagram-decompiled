package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import com.instagram.android.R;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.9Vb  reason: invalid class name and case insensitive filesystem */
public final class C379729Vb extends Drawable {
    public final float A00;
    public final int A01;
    public final Paint A02;
    public final AnonymousClass8DV A03;

    public C379729Vb(Context context, Bitmap bitmap, float f, int i) {
        this.A00 = f;
        this.A01 = i;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A02 = A0V;
        AnonymousClass7TE.A1N(context, A0V, R.color.black_15_transparent);
        A0V.setStyle(Paint.Style.STROKE);
        A0V.setStrokeWidth(C61380mr.A00(context, 1.0f));
        Resources resources = context.getResources();
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, min, min);
        0qQ.A07(extractThumbnail);
        AnonymousClass8DV r1 = new AnonymousClass8DV(resources, extractThumbnail);
        r1.A02(f);
        r1.A08.setAntiAlias(true);
        r1.invalidateSelf();
        this.A03 = r1;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        int A0J = AnonymousClass7TE.A0J(this);
        int i = this.A01;
        int i2 = A0J + i;
        int i3 = getBounds().top + i;
        int i4 = getBounds().right - i;
        int i5 = getBounds().bottom - i;
        AnonymousClass8DV r1 = this.A03;
        r1.setBounds(new Rect(i2, i3, i4, i5));
        r1.draw(canvas);
        RectF rectF = new RectF((float) i2, (float) i3, (float) i4, (float) i5);
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A02);
    }

    @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "PixelFormat.TRANSPARENT", imports = {"android.graphics.PixelFormat"}))
    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }
}
