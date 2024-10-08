package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.webrtc.ScreenCapturerAndroid;

public final class NEo extends C67649Mrc {
    public float A00;
    public float A01;
    public AnonymousClass61R A02;
    public boolean A03 = true;
    public final float A04;
    public final Path A05 = C51965G9l.A0C();
    public final RectF A06 = AnonymousClass7TE.A0Y();

    public NEo(AnonymousClass7NF r4, float f) {
        this.A04 = f;
        r4.A02(new C74179PqL(this, 36), new C69357Njw[]{C69357Njw.CRY_WAVE_BOTTOM, C69357Njw.CRY_WAVE_TOP_SM, C69357Njw.CRY_WAVE_TOP_LG});
    }

    public final void draw(Canvas canvas) {
        AnonymousClass61R r5;
        0qQ.A0B(canvas, 0);
        if (this.A03 && (r5 = this.A02) != null) {
            int A062 = AnonymousClass7TF.A06(this);
            int i = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
            if (400 < A062) {
                i = A062;
            }
            int intrinsicHeight = (r5.getIntrinsicHeight() * i) / r5.getIntrinsicWidth();
            this.A00 = (float) (AnonymousClass7TF.A04(this) - (i / 2));
            this.A01 = (float) (JTP.A06(this) - ((i * 30) / ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI));
            r5.setBounds(0, 0, i, intrinsicHeight);
            r5.E2p();
        }
        this.A03 = false;
        Path path = this.A05;
        path.rewind();
        RectF rectF = this.A06;
        float f = this.A04;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            float f2 = this.A00;
            float f3 = this.A01;
            save = canvas.save();
            canvas.translate(f2, f3);
            AnonymousClass61R r0 = this.A02;
            if (r0 != null) {
                r0.draw(canvas);
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A03 = true;
        C67649Mrc.A01(rect, this.A06);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
