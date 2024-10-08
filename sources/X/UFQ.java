package X;

import androidx.viewpager.widget.ViewPager;

public abstract class UFQ extends ViewPager {
    public float A00;
    public int A01;

    public float getScrollOffset() {
        return this.A00;
    }

    public int getScrollPosition() {
        return this.A01;
    }

    public final void A0G(int i, float f, int i2) {
        UFQ.super.A0G(i, f, i2);
        this.A01 = i;
        this.A00 = f;
    }

    public final void A0H(int i, int i2, boolean z, boolean z2) {
        UFQ.super.A0H(i, i2, z, z2);
        C587808r A0A = A0A(i);
        if (A0A != null) {
            this.A01 = A0A.A02;
        }
    }

    public final void onMeasure(int i, int i2) {
        UFQ.super.onMeasure(i, i2);
    }
}
