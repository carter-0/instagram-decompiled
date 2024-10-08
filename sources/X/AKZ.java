package X;

import android.content.DialogInterface;

public final class AKZ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C353498Hw A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ boolean A02;

    public AKZ(C353498Hw r1, Runnable runnable, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C353498Hw r2 = this.A00;
        27p.A01(r2.A1D).A1l(AnonymousClass000.A00(929));
        C353498Hw.A17(r2, this.A01);
    }
}
