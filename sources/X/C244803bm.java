package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.3bm  reason: invalid class name and case insensitive filesystem */
public final class C244803bm extends Drawable {
    public static boolean A05;
    public static final C244813bn A06 = new Object();
    public static final AnonymousClass0eM A07 = AnonymousClass0eN.A01(C244823bo.A00);
    public static final AnonymousClass0eM A08 = AnonymousClass0eN.A01(C244833bp.A00);
    public final int A00;
    public final Paint A01 = new Paint();
    public final Paint A02;
    public final String A03;
    public final List A04;

    public C244803bm(List list) {
        int i;
        0qQ.A0B(list, 1);
        this.A04 = list;
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20.0f);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setAntiAlias(true);
        int size = list.size();
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(list.size());
            sb.append('x');
            this.A03 = sb.toString();
            i = 570490624;
            if (((Boolean) list.get(size - 1)).booleanValue()) {
                i = 587137024;
            }
        } else {
            this.A03 = "";
            i = 0;
        }
        this.A00 = i;
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        Rect bounds = getBounds();
        0qQ.A07(bounds);
        Paint paint = this.A01;
        paint.setColor(this.A00);
        canvas2.drawRect(bounds, paint);
        List list = this.A04;
        int size = list.size();
        int i = bounds.left + 4;
        int i2 = bounds.right;
        int i3 = bounds.top + 4;
        int i4 = i3 + 10;
        int min = Math.min(i4, bounds.bottom);
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (i5 * 12) + i;
            int i7 = i6 + 8;
            if (i7 >= i2) {
                break;
            }
            int i8 = -872349952;
            if (((Boolean) list.get(i5)).booleanValue()) {
                i8 = -855703552;
            }
            paint.setColor(i8);
            canvas2.drawRect((float) i6, (float) i3, (float) i7, (float) min, paint);
        }
        canvas2.drawText(this.A03, ((float) i) + 4.0f, ((float) i4) + 20.0f + 2.0f, this.A02);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
