package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.Tyy  reason: case insensitive filesystem */
public final class C14594Tyy extends ImageView {
    public Animatable A00;
    public boolean A01;

    public final void A00() {
        Animatable animatable = this.A00;
        if (animatable != null) {
            animatable.start();
        }
        this.A01 = true;
    }

    public final void A01(Drawable drawable) {
        Animatable animatable = null;
        if (drawable instanceof Animatable) {
            animatable = drawable;
        }
        this.A00 = animatable;
        setImageDrawable(drawable);
    }

    public final void onAttachedToWindow() {
        Animatable animatable;
        int A06 = AnonymousClass0fD.A06(1442231565);
        super.onAttachedToWindow();
        if (this.A01 && (animatable = this.A00) != null && !animatable.isRunning()) {
            Animatable animatable2 = this.A00;
            0qQ.A0A(animatable2);
            animatable2.start();
        }
        AnonymousClass0fD.A0D(356321390, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-609705827);
        super.onDetachedFromWindow();
        Animatable animatable = this.A00;
        if (animatable != null && animatable.isRunning()) {
            Animatable animatable2 = this.A00;
            0qQ.A0A(animatable2);
            animatable2.stop();
        }
        AnonymousClass0fD.A0D(2135029554, A06);
    }

    public void setVisibility(int i) {
        Animatable animatable;
        super.setVisibility(i);
        if (getVisibility() != 0) {
            Animatable animatable2 = this.A00;
            if (animatable2 != null && animatable2.isRunning()) {
                Animatable animatable3 = this.A00;
                0qQ.A0A(animatable3);
                animatable3.stop();
            }
        } else if (this.A01 && (animatable = this.A00) != null && !animatable.isRunning()) {
            Animatable animatable4 = this.A00;
            0qQ.A0A(animatable4);
            animatable4.start();
        }
    }
}
