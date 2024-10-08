package X;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;

/* renamed from: X.Wja  reason: case insensitive filesystem */
public final class C20014Wja implements Runnable {
    public final /* synthetic */ WVI A00;

    public C20014Wja(WVI wvi) {
        this.A00 = wvi;
    }

    public final void run() {
        WVI wvi = this.A00;
        ScaleAnimation scaleAnimation = wvi.A03;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
        float f = wvi.A00;
        float f2 = wvi.A01;
        View view = wvi.A06;
        C14718U3z u3z = new C14718U3z(wvi.A07, f, 0.92f, f2, 0.92f, ((float) view.getWidth()) / 2.0f, ((float) view.getHeight()) / 2.0f);
        u3z.setInterpolator(new OvershootInterpolator());
        u3z.setDuration((long) ViewConfiguration.getLongPressTimeout());
        wvi.A02 = u3z;
        view.startAnimation(u3z);
        wvi.A04 = true;
    }
}
