package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.Jd1  reason: case insensitive filesystem */
public final class C59992Jd1 extends Drawable {
    public static final int[] A08 = {4, 8, 14};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public final Deque A05 = new LinkedList();
    public final Paint A06 = AnonymousClass7TE.A0V(1);
    public final RectF A07 = AnonymousClass7TE.A0Y();

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        Deque deque = this.A05;
        if (!deque.isEmpty() && this.A00 > 0.0f) {
            Iterator it = deque.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                float f2 = (((float) A08[AnonymousClass7TG.A0F(it) - 1]) * this.A00) + f;
                RectF rectF = this.A07;
                rectF.set(f, 0.0f, f2, this.A02);
                float f3 = this.A03;
                canvas.drawRoundRect(rectF, f3, f3, this.A06);
                f = this.A01 + f2;
            }
        }
    }

    public final int getIntrinsicHeight() {
        return (int) Math.ceil((double) this.A02);
    }

    public final int getIntrinsicWidth() {
        return (int) Math.ceil((double) this.A04);
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    public C59992Jd1(int i) {
        StringBuilder A0n;
        boolean z = true;
        while (true) {
            if (i > 0) {
                int i2 = i & 3;
                if (i2 <= 0) {
                    z = false;
                    break;
                } else {
                    this.A05.addFirst(Integer.valueOf(i2));
                    i >>= 2;
                }
            } else {
                break;
            }
        }
        if (!z) {
            A0n = AnonymousClass7TF.A0n("Invalid code value ");
        } else if (this.A05.size() < 6 || this.A05.size() > 12) {
            A0n = AnonymousClass7TF.A0n("Invalid code value ");
            A0n.append(i);
            A0n.append(" with length ");
            i = this.A05.size();
        } else {
            return;
        }
        A0n.append(i);
        0wb.A03("LineCodeDrawable", A0n.toString());
        this.A05.clear();
    }
}
