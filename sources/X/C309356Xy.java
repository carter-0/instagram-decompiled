package X;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* renamed from: X.6Xy  reason: invalid class name and case insensitive filesystem */
public abstract class C309356Xy {
    public AnonymousClass6Y1 A00;
    public final float[] A01;
    public final int[] A02;

    public void A00() {
        ObjectAnimator objectAnimator = ((C309346Xx) this).A03;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void A01() {
        C309346Xx r4 = (C309346Xx) this;
        r4.A02 = 0;
        r4.A02[0] = C18108Vlc.A01(r4.A07.A05[0], r4.A00.A01);
        r4.A01 = 0.0f;
    }

    public void A02() {
        C309346Xx r1 = (C309346Xx) this;
        if (r1.A04.isRunning()) {
            return;
        }
        if (r1.A00.isVisible()) {
            r1.A04.start();
        } else {
            r1.A00();
        }
    }

    public void A03() {
        C309346Xx r4 = (C309346Xx) this;
        if (r4.A03 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r4, C309346Xx.A08, new float[]{0.0f, 1.0f});
            r4.A03 = ofFloat;
            ofFloat.setDuration(5400);
            r4.A03.setInterpolator((TimeInterpolator) null);
            r4.A03.setRepeatCount(-1);
            r4.A03.addListener(new U07(r4));
        }
        if (r4.A04 == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r4, C309346Xx.A09, new float[]{0.0f, 1.0f});
            r4.A04 = ofFloat2;
            ofFloat2.setDuration(333);
            r4.A04.setInterpolator(r4.A06);
            r4.A04.addListener(new U08(r4));
        }
        r4.A02 = 0;
        r4.A02[0] = C18108Vlc.A01(r4.A07.A05[0], r4.A00.A01);
        r4.A01 = 0.0f;
        r4.A03.start();
    }

    public void A04() {
        ((C309346Xx) this).A05 = null;
    }

    public void A05(C309246Xn r2) {
        ((C309346Xx) this).A05 = r2;
    }

    public C309356Xy(int i) {
        this.A01 = new float[(i * 2)];
        this.A02 = new int[i];
    }
}
