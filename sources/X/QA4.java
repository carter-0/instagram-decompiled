package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.view.ViewPropertyAnimator;
import android.widget.ProgressBar;
import com.instagram.android.R;

public final class QA4 extends ProgressBar {
    public Drawable A00;
    public GradientDrawable A01;
    public RotateDrawable A02;
    public ViewPropertyAnimator A03;

    public final void setIcon(RH3 rh3) {
        0qQ.A0B(rh3, 0);
        setIconFromDrawable(AnonymousClass2E0.A0A().A05(AnonymousClass7TE.A0S(this), rh3.A00, rh3.A01));
    }

    public final void A00(int i) {
        RotateDrawable rotateDrawable = this.A02;
        if (rotateDrawable == null) {
            0qQ.A0F("layerSpinnerRingDrawable");
            throw AnonymousClass00P.createAndThrow();
        }
        Drawable drawable = rotateDrawable.getDrawable();
        if (drawable != null) {
            drawable.setTint(AnonymousClass2E0.A0A().A03(AnonymousClass7TE.A0S(this), i));
        }
    }

    public final void setCircleColor(int i) {
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable == null) {
            0qQ.A0F("layerCircleDrawable");
            throw AnonymousClass00P.createAndThrow();
        } else {
            gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), AnonymousClass2E0.A0A().A03(AnonymousClass7TE.A0S(this), i));
        }
    }

    public final void setCircleColorRaw(int i) {
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable == null) {
            0qQ.A0F("layerCircleDrawable");
            throw AnonymousClass00P.createAndThrow();
        } else {
            gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), i);
        }
    }

    private final void setIconFromDrawable(Drawable drawable) {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        0qQ.A0C(indeterminateDrawable, C273654mx.A00(16));
        ((LayerDrawable) indeterminateDrawable).setDrawableByLayerId(R.id.layer_item_icon, drawable);
        if (drawable instanceof Animatable) {
            getViewTreeObserver().addOnGlobalLayoutListener(new C11512SbZ(this, 4));
        }
    }

    public final ViewPropertyAnimator animate() {
        ViewPropertyAnimator animate = super.animate();
        this.A03 = animate;
        0qQ.A0A(animate);
        return animate;
    }

    public final void setIcon(int i) {
        Drawable drawable = getResources().getDrawable(i, getContext().getTheme());
        0qQ.A07(drawable);
        setIconFromDrawable(drawable);
    }
}
