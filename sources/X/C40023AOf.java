package X;

import android.view.View;

/* renamed from: X.AOf  reason: case insensitive filesystem */
public final class C40023AOf implements View.OnLayoutChangeListener {
    public final /* synthetic */ C358368an A00;

    public C40023AOf(C358368an r1) {
        this.A00 = r1;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C358368an r1 = this.A00;
        r1.A1K.removeOnLayoutChangeListener(this);
        C358368an.A0D(r1);
    }
}
