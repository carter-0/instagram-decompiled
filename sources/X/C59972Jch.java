package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.creation.capture.quickcapture.sundial.widget.durationpickerview.DurationPickerView;

/* renamed from: X.Jch  reason: case insensitive filesystem */
public final class C59972Jch extends Drawable {
    public final float A00;
    public final int A01;
    public final Paint A02;
    public final RectF A03 = AnonymousClass7TE.A0Y();
    public final L0Y A04;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C59972Jch(L0Y l0y, int i, int i2) {
        this.A01 = i;
        this.A04 = l0y;
        this.A00 = ((float) i) / 2.0f;
        Paint A0D = JTP.A0D();
        A0D.setColor(i2);
        this.A02 = A0D;
    }

    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        canvas.save();
        canvas.translate((float) A0L.left, (float) A0L.top);
        int width = A0L.width();
        int height = A0L.height();
        DurationPickerView durationPickerView = this.A04.A00;
        int i = durationPickerView.A01;
        int i2 = i / 15;
        int i3 = IgNetworkConsentStorage.MAX_ENTRIES;
        if (1000 < i2) {
            i3 = i2;
        }
        float f = ((float) width) / ((float) i);
        for (int i4 = 0; i4 < i; i4 += i3) {
            if (i4 != 0) {
                int i5 = durationPickerView.A01 / 15;
                int i6 = IgNetworkConsentStorage.MAX_ENTRIES;
                if (1000 < i5) {
                    i6 = i5;
                }
                float f2 = 0.5833333f;
                if (i4 % (i6 * 2) < i6) {
                    f2 = 1.0f;
                }
                float f3 = ((float) i4) * f;
                float f4 = (float) height;
                float f5 = (f4 / 2.0f) * (1.0f - f2);
                RectF rectF = this.A03;
                rectF.set(f3, f5, ((float) this.A01) + f3, (f4 * f2) + f5);
                float f6 = this.A00;
                canvas.drawRoundRect(rectF, f6, f6, this.A02);
            }
        }
        canvas.restore();
    }
}
