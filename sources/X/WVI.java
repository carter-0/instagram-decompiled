package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;

public final class WVI implements XAL {
    public float A00;
    public float A01;
    public ScaleAnimation A02;
    public ScaleAnimation A03;
    public boolean A04;
    public Runnable A05;
    public final View A06;
    public final C17220VMy A07 = new C17220VMy(this);

    public WVI(View view) {
        0qQ.A0B(view, 1);
        this.A06 = view;
        this.A00 = view.getScaleX();
        this.A01 = view.getScaleY();
    }

    public final void EKR(MotionEvent motionEvent) {
        C20014Wja wja = new C20014Wja(this);
        this.A05 = wja;
        this.A06.postDelayed(wja, 150);
    }

    public final void Exa() {
        if (this.A04) {
            ScaleAnimation scaleAnimation = this.A02;
            if (scaleAnimation != null) {
                scaleAnimation.cancel();
            }
            float f = this.A00;
            float f2 = this.A01;
            View view = this.A06;
            C14718U3z u3z = new C14718U3z(this.A07, f, 1.0f, f2, 1.0f, ((float) view.getWidth()) / 2.0f, ((float) view.getHeight()) / 2.0f);
            u3z.setInterpolator(new OvershootInterpolator());
            u3z.setDuration((long) ViewConfiguration.getLongPressTimeout());
            this.A03 = u3z;
            view.startAnimation(u3z);
            this.A04 = false;
            return;
        }
        this.A06.removeCallbacks(this.A05);
    }
}
