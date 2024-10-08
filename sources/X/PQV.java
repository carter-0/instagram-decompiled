package X;

import android.view.ViewGroup;

public final class PQV implements C315616kD {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ ViewGroup A04;

    public PQV(ViewGroup viewGroup, float f, float f2, int i, int i2) {
        this.A02 = i;
        this.A00 = f;
        this.A03 = i2;
        this.A01 = f2;
        this.A04 = viewGroup;
    }

    public final void DaF(C294975nL r12, float f) {
        float f2 = (float) this.A02;
        float f3 = this.A00;
        if (f2 != f3) {
            double d = (double) f;
            float A032 = (float) AnonymousClass37Q.A03(d, (double) f2, (double) f3);
            float f4 = (float) this.A03;
            C66583MXo.A0v(this.A04, A032, (float) AnonymousClass37Q.A03(d, (double) f4, (double) this.A01));
        }
    }
}
