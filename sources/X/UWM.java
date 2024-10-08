package X;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import java.util.Arrays;

public final class UWM extends C309356Xy {
    public static final Property A06 = new C14638Tzk(9);
    public float A00;
    public int A01 = 1;
    public ObjectAnimator A02;
    public C3020561i A03;
    public boolean A04;
    public final C309276Xq A05;

    public UWM(UWK uwk) {
        super(3);
        this.A05 = uwk;
        this.A03 = new C3020561i();
    }

    public final void A01() {
        this.A04 = true;
        this.A01 = 1;
        Arrays.fill(this.A02, C18108Vlc.A01(this.A05.A05[0], this.A00.A01));
    }

    public final void A02() {
    }

    public final void A04() {
    }

    public final void A05(C309246Xn r1) {
    }

    public final void A00() {
        ObjectAnimator objectAnimator = this.A02;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void A03() {
        if (this.A02 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, A06, new float[]{0.0f, 1.0f});
            this.A02 = ofFloat;
            ofFloat.setDuration(333);
            this.A02.setInterpolator((TimeInterpolator) null);
            this.A02.setRepeatCount(-1);
            U0N.A00(this.A02, this, 8);
        }
        this.A04 = true;
        this.A01 = 1;
        Arrays.fill(this.A02, C18108Vlc.A01(this.A05.A05[0], this.A00.A01));
        this.A02.start();
    }
}
