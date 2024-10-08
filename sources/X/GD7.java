package X;

import android.view.View;

public final class GD7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C52012GBj A00;

    public GD7(C52012GBj gBj) {
        this.A00 = gBj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = i4 - i2;
        GBY gby = this.A00.A09.A0B;
        if (i9 > 0 && i10 > 0) {
            GBQ gbq = gby.A06;
            C58676Ivl ivl = new C58676Ivl(gby, 33);
            if (!(i9 == gbq.A01 && i10 == gbq.A00)) {
                gbq.A01 = i9;
                gbq.A00 = i10;
                ivl.invoke();
            }
            GBY.A01(gby);
        }
    }
}
