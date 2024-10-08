package X;

import android.view.View;

public final class WMS implements X32 {
    public final /* synthetic */ W1m A00;

    public WMS(W1m w1m) {
        this.A00 = w1m;
    }

    public final void D9F(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.A00.A07(0);
    }
}
