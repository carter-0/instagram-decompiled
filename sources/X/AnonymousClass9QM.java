package X;

import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.instagram.android.R;

/* renamed from: X.9QM  reason: invalid class name */
public final class AnonymousClass9QM implements C301745zt {
    public float[] A00;
    public int[] A01;
    public final float A02;
    public final Context A03;

    public AnonymousClass9QM(Context context, float f) {
        0qQ.A0B(context, 1);
        this.A03 = context;
        this.A02 = f;
    }

    public final float BhW(long j) {
        return ((((float) j) / 2000.0f) * 360.0f) % 360.0f;
    }

    public final boolean CPz() {
        return true;
    }

    public final int[] BhU(int i) {
        int[] iArr = this.A01;
        if (iArr != null) {
            return iArr;
        }
        Context context = this.A03;
        int[] iArr2 = {context.getColor(R.color.clips_gradient_redesign_color_0), context.getColor(R.color.clips_gradient_redesign_color_1), context.getColor(R.color.clips_gradient_redesign_color_2), context.getColor(R.color.clips_gradient_redesign_color_3), context.getColor(R.color.clips_gradient_redesign_color_4)};
        this.A01 = iArr2;
        return iArr2;
    }

    public final float[] BhV() {
        float[] fArr = this.A00;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = {0.15f, 0.3f, 0.5f, 0.7f, 0.85f};
        this.A00 = fArr2;
        return fArr2;
    }

    public final float BhX(float f, long j) {
        long j2;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        long currentTimeMillis = System.currentTimeMillis() % 2000;
        float f2 = 0.75f * f;
        if (currentTimeMillis < 1000) {
            j2 = -500 + currentTimeMillis;
        } else {
            j2 = 500 - currentTimeMillis;
        }
        return f + (f2 * accelerateDecelerateInterpolator.getInterpolation(((float) j2) / 500.0f));
    }

    public final float CEI() {
        return this.A02;
    }
}
