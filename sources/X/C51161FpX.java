package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.FpX  reason: case insensitive filesystem */
public final class C51161FpX implements Runnable {
    public final /* synthetic */ C46655Dia A00;

    public C51161FpX(C46655Dia dia) {
        this.A00 = dia;
    }

    public final void run() {
        ViewGroup.LayoutParams layoutParams;
        C46655Dia dia = this.A00;
        View view = dia.mView;
        if (view == null || view.getHeight() != dia.A00) {
            View view2 = dia.mView;
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = dia.A00;
                }
            } else {
                layoutParams = null;
            }
            View view3 = dia.mView;
            if (view3 != null) {
                view3.setLayoutParams(layoutParams);
            }
        }
    }
}
