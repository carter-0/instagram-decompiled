package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import org.webrtc.CameraCapturer;

/* renamed from: X.Diw  reason: case insensitive filesystem */
public final class C46667Diw extends Drawable implements Drawable.Callback, AnonymousClass1MK {
    public static ScaleDrawable A02;
    public final int A00;
    public final Context A01;

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        0qQ.A0B(r6, 1);
        Bitmap bitmap = r6.A01;
        if (bitmap != null) {
            int i = this.A00;
            Bitmap A09 = 1MF.A09(bitmap, i, i, 0, false);
            0qQ.A07(A09);
            A02 = new ScaleDrawable(new BitmapDrawable(this.A01.getResources(), A09), 80, 1.0f, 1.0f);
            invalidateSelf();
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        ScaleDrawable scaleDrawable = A02;
        if (scaleDrawable != null) {
            int i = this.A00;
            scaleDrawable.setBounds(0, 0, i, i);
            scaleDrawable.setAlpha(255);
            scaleDrawable.setLevel(CameraCapturer.OPEN_CAMERA_TIMEOUT);
            scaleDrawable.draw(canvas);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public final void setAlpha(int i) {
        ScaleDrawable scaleDrawable = A02;
        if (scaleDrawable != null) {
            scaleDrawable.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        ScaleDrawable scaleDrawable = A02;
        if (scaleDrawable != null) {
            scaleDrawable.setColorFilter(colorFilter);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        ScaleDrawable scaleDrawable = A02;
        if (scaleDrawable != null) {
            scaleDrawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public C46667Diw(Context context, String str, int i) {
        this.A01 = context;
        this.A00 = AnonymousClass7TF.A02(context, i);
        if (A02 == null) {
            0nY.A00().ATE(new C47811EHx(this, str));
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
