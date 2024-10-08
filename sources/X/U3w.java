package X;

import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class U3w extends Animation {
    public float A00;
    public final float A01;
    public final /* synthetic */ IgdsSwitch A02;

    public U3w(IgdsSwitch igdsSwitch, float f, float f2) {
        this.A02 = igdsSwitch;
        this.A01 = f;
        float f3 = f2 - f;
        this.A00 = f3;
        int i = IgdsSwitch.A0M;
        setDuration((long) Math.abs((250.0f * f3) / ((float) igdsSwitch.A02)));
        setInterpolator(new DecelerateInterpolator());
    }

    public final void applyTransformation(float f, Transformation transformation) {
        IgdsSwitch igdsSwitch = this.A02;
        float f2 = this.A01 + (this.A00 * f);
        int i = IgdsSwitch.A0M;
        igdsSwitch.A00 = f2;
        igdsSwitch.invalidate();
    }
}
