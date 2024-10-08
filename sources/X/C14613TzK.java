package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.TzK  reason: case insensitive filesystem */
public final class C14613TzK extends ImageView {
    public boolean A00;
    public final ObjectAnimator A01;

    public C14613TzK(Context context) {
        super(context);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", new float[]{0.0f, 360.0f}).setDuration(850);
        0qQ.A07(duration);
        this.A01 = duration;
        duration.setRepeatMode(1);
        duration.setRepeatCount(-1);
        C51969G9p.A10(duration);
        DbU.A13(context, this, R.drawable.spinner_large);
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        if (getWindowToken() == null) {
            return;
        }
        if (i != 0 || getVisibility() != 0) {
            this.A01.cancel();
            this.A00 = false;
        } else if (getAnimation() != null) {
        } else {
            if (getMeasuredWidth() != 0) {
                this.A01.start();
            } else {
                this.A00 = true;
            }
        }
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(1260640904);
        super.onAttachedToWindow();
        if (isShown()) {
            this.A01.start();
        }
        AnonymousClass0fD.A0D(777578769, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-1361385964);
        this.A00 = false;
        this.A01.cancel();
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(1141284911, A06);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00) {
            this.A01.start();
            this.A00 = false;
        }
    }
}
