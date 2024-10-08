package X;

import android.view.View;

/* renamed from: X.AOi  reason: case insensitive filesystem */
public final class C40026AOi implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C363188jJ A01;

    public C40026AOi(View view, C363188jJ r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A00.removeOnLayoutChangeListener(this);
        C363188jJ.A02(this.A01, i4 - i2);
    }
}
