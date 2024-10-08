package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.ui.widget.drawing.EffectSlider;

/* renamed from: X.5zZ  reason: invalid class name and case insensitive filesystem */
public final class C301585zZ extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ EffectSlider A00;

    public C301585zZ(EffectSlider effectSlider) {
        this.A00 = effectSlider;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        EffectSlider effectSlider = this.A00;
        if (effectSlider.A0G != C301555zW.HIDDEN && y <= effectSlider.A08 + (effectSlider.A06 * 2.0f) + effectSlider.A0S) {
            effectSlider.A0I = true;
            effectSlider.A0E.A03();
            EffectSlider.A03(effectSlider, y);
        }
        return effectSlider.A0I;
    }
}
