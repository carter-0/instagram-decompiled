package X;

import android.view.View;

public final class P19 implements MSI {
    public final int A00;
    public final Object A01;

    public P19(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DFi() {
        View view;
        if (1 - this.A00 != 0) {
            view = (View) this.A01;
        } else {
            view = ((OM2) this.A01).A0F;
        }
        view.setVisibility(0);
    }
}
