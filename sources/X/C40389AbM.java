package X;

import android.widget.ProgressBar;

/* renamed from: X.AbM  reason: case insensitive filesystem */
public final class C40389AbM implements C357968a9 {
    public final /* synthetic */ C353498Hw A00;

    public C40389AbM(C353498Hw r1) {
        this.A00 = r1;
    }

    public final void Cwf(double d) {
        AnonymousClass85M r3 = this.A00.A1d;
        int i = (int) (100.0d * d);
        ProgressBar progressBar = r3.A02;
        if (progressBar != null) {
            progressBar.post(new C41057Anf(r3, i));
        }
    }
}
