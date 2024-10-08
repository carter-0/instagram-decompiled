package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.9XC  reason: invalid class name */
public final class AnonymousClass9XC extends Drawable implements C268714ds {
    public String A00;
    public final Context A01;
    public final Bitmap A02;
    public final Paint A03 = AnonymousClass7TE.A0V(3);
    public final Rect A04;
    public final String A05;

    public AnonymousClass9XC(Context context, Rect rect, String str, String str2) {
        Rect A0W = AnonymousClass7TE.A0W();
        this.A04 = A0W;
        this.A01 = context;
        this.A05 = str;
        this.A00 = str2;
        Bitmap A0E = 1MF.A0E(str2, rect.width(), rect.height());
        if (A0E != null) {
            this.A02 = A0E;
            A0W.set(rect);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.drawBitmap(this.A02, (Rect) null, this.A04, this.A03);
    }

    @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "PixelFormat.TRANSLUCENT", imports = {"android.graphics.PixelFormat"}))
    public final int getOpacity() {
        return -3;
    }

    public final C2802350v BzV() {
        String str = this.A00;
        if (str == null) {
            try {
                str = AnonymousClass45F.A02(this.A02);
                this.A00 = str;
            } catch (IOException unused) {
                return null;
            }
        }
        return new C19473WaL(this.A04, this.A05, str);
    }

    public final int getIntrinsicHeight() {
        return this.A04.height();
    }

    public final int getIntrinsicWidth() {
        return this.A04.width();
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        this.A04.set(i, i2, i3, i4);
        super.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }

    public AnonymousClass9XC(Context context, Bitmap bitmap, Rect rect, String str) {
        AnonymousClass7TG.A1O(context, str);
        Rect A0W = AnonymousClass7TE.A0W();
        this.A04 = A0W;
        this.A01 = context;
        this.A05 = str;
        this.A02 = bitmap;
        A0W.set(rect);
    }

    public AnonymousClass9XC(Context context, Bitmap bitmap, String str) {
        Rect A0W = AnonymousClass7TE.A0W();
        this.A04 = A0W;
        this.A01 = context;
        this.A05 = str;
        this.A02 = bitmap;
        A0W.set(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }
}
