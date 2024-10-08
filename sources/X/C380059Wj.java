package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9Wj  reason: invalid class name and case insensitive filesystem */
public final class C380059Wj extends Drawable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final LinkedHashMap A07;
    public final int A08;
    public final Paint A09;
    public final String A0A;

    public static void A00(Canvas canvas, Paint paint, Drawable drawable, int i) {
        paint.setColor(i);
        Canvas canvas2 = canvas;
        canvas2.drawRect((float) drawable.getBounds().left, (float) drawable.getBounds().top, (float) drawable.getBounds().right, (float) drawable.getBounds().bottom, paint);
    }

    public final void A03(String str, String str2, int i) {
        0qQ.A0B(str2, 1);
        this.A07.put(str, new Pair(str2, Integer.valueOf(i)));
        this.A00 = Math.max(str2.length(), this.A00);
        A01(AnonymousClass7TE.A0X(this));
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Paint paint = this.A09;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        A00(canvas, paint, this, -26624);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        A00(canvas, paint, this, 0);
        paint.setStyle(style);
        paint.setStrokeWidth(0.0f);
        paint.setColor(-1);
        this.A01 = this.A04;
        this.A02 = this.A05;
        if (this.A06) {
            A02(canvas, "Vito", this.A0A, this.A08);
        }
        Iterator A0s = AnonymousClass7TF.A0s(this.A07);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Pair pair = (Pair) A1J.getValue();
            Object obj = pair.first;
            0qQ.A06(obj);
            Object obj2 = pair.second;
            0qQ.A06(obj2);
            A02(canvas, (String) A1J.getKey(), (String) obj, AnonymousClass7TE.A0M(obj2));
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        A01(rect);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final void A01(Rect rect) {
        LinkedHashMap linkedHashMap = this.A07;
        if (!linkedHashMap.isEmpty() && this.A00 > 0) {
            int min = Math.min(72, Math.max(16, Math.min(rect.width() / this.A00, rect.height() / linkedHashMap.size())));
            this.A09.setTextSize((float) min);
            this.A03 = min + 8;
            this.A04 = rect.left + 10;
            this.A05 = rect.top + 10 + min;
        }
    }

    public C380059Wj(String str) {
        this.A0A = str;
        this.A08 = -16711936;
        this.A06 = true;
        this.A07 = AnonymousClass7TE.A1H();
        this.A09 = AnonymousClass7TE.A0V(1);
        this.A00 = 4;
        this.A07.clear();
        this.A00 = 4;
        invalidateSelf();
    }

    public final void A02(Canvas canvas, String str, String str2, int i) {
        AnonymousClass7TG.A1O(str, str2);
        String A0R = 002.A0R(str, ": ");
        Paint paint = this.A09;
        float measureText = paint.measureText(A0R);
        float measureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i2 = this.A01;
        int i3 = this.A02;
        canvas.drawRect((float) (i2 - 4), (float) (i3 + 8), ((float) i2) + measureText + measureText2 + 4.0f, (float) ((i3 - this.A03) + 8), paint);
        paint.setColor(-1);
        canvas.drawText(A0R, (float) this.A01, (float) this.A02, paint);
        paint.setColor(i);
        canvas.drawText(str2, ((float) this.A01) + measureText, (float) this.A02, paint);
        this.A02 += this.A03;
    }

    public C380059Wj() {
        this("");
    }
}
