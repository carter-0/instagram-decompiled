package X;

import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Ut5  reason: case insensitive filesystem */
public final class C16335Ut5 extends MediaFrameLayout {
    public int A00;
    public int A01;
    public int A02;

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() != this.A00) {
            this.A00 = getChildCount();
            super.measure(this.A02, this.A01);
        }
        if (getChildCount() == 0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    public final void onMeasure(int i, int i2) {
        this.A00 = getChildCount();
        this.A01 = i2;
        this.A02 = i;
        super.onMeasure(i, i2);
    }
}
