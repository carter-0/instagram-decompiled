package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

public final class H7w extends C255963v0 {
    public final float A00;

    public final void E3E(View view, ReboundViewPager reboundViewPager, float f, int i) {
        0qQ.A0B(view, 1);
        float cameraDistance = view.getCameraDistance();
        float f2 = this.A00;
        int i2 = 0;
        if (cameraDistance != f2) {
            view.setCameraDistance(f2);
        }
        if (Math.abs(f) >= 1.0f) {
            i2 = 4;
        }
        view.setVisibility(i2);
    }

    public final boolean FHR(ReboundViewPager reboundViewPager, float f, float f2) {
        return true;
    }

    public H7w(float f) {
        this.A00 = f;
    }
}
