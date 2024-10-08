package X;

import android.view.View;

public final /* synthetic */ class LYY implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ LWg A00;

    public /* synthetic */ LYY(LWg lWg) {
        this.A00 = lWg;
    }

    public final void onSystemUiVisibilityChange(int i) {
        LWg lWg = this.A00;
        if ((i & 2) != 0) {
            LWg.A01(lWg);
        }
    }
}
