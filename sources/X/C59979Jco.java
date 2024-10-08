package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jco  reason: case insensitive filesystem */
public final class C59979Jco extends Drawable {
    public String A00;
    public final Paint A01;
    public final Rect A02;
    public final Drawable A03;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A03.draw(canvas);
        String str = this.A00;
        if (str != null && str.length() != 0) {
            canvas.drawText(str, (float) getBounds().centerX(), (float) this.A02.bottom, this.A01);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C59979Jco(int i, int i2, int i3, int i4) {
        Paint A0C = JTO.A0C();
        this.A01 = A0C;
        A0C.setFilterBitmap(true);
        A0C.setAntiAlias(true);
        A0C.setTypeface(Typeface.DEFAULT_BOLD);
        A0C.setTextAlign(Paint.Align.CENTER);
        A0C.setTextSize((float) i2);
        A0C.setColor(i3);
        Rect A0W = AnonymousClass7TE.A0W();
        this.A02 = A0W;
        C59971Jcg jcg = new C59971Jcg(i4);
        this.A03 = jcg;
        A0C.getTextBounds("0:00:00", 0, 7, A0W);
        A0W.offsetTo(i, i);
        int i5 = i * 2;
        setBounds(0, 0, A0W.width() + i5, A0W.height() + i5);
        jcg.setBounds(getBounds());
    }

    public final int getIntrinsicHeight() {
        return JTP.A06(this);
    }

    public final int getIntrinsicWidth() {
        return AnonymousClass7TF.A06(this);
    }
}
