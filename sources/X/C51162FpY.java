package X;

import android.view.View;

/* renamed from: X.FpY  reason: case insensitive filesystem */
public final class C51162FpY implements Runnable {
    public final /* synthetic */ C46655Dia A00;

    public C51162FpY(C46655Dia dia) {
        this.A00 = dia;
    }

    public final void run() {
        int i;
        C46655Dia dia = this.A00;
        View view = dia.mView;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        dia.A00 = i;
    }
}
