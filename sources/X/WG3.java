package X;

import android.view.View;

public final class WG3 implements X7P {
    public final /* synthetic */ C18660VwH A00;

    public WG3(C18660VwH vwH) {
        this.A00 = vwH;
    }

    public final float AwL() {
        C340407lD r0 = this.A00.A05;
        r0.getClass();
        View view = (View) r0.A00.get();
        if (view != null) {
            return C13989Tnp.A03(view.getContext());
        }
        return 0.0f;
    }

    public final int getHeight() {
        C340407lD r0 = this.A00.A05;
        r0.getClass();
        View view = (View) r0.A00.get();
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    public final int getWidth() {
        C340407lD r0 = this.A00.A05;
        r0.getClass();
        View view = (View) r0.A00.get();
        if (view != null) {
            return view.getWidth();
        }
        return 0;
    }
}
