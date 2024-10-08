package X;

import android.os.Handler;

public final class T8V implements AnonymousClass7JJ {
    public final /* synthetic */ T8W A00;

    public final void DCn(Exception exc) {
        T8W t8w = this.A00;
        11Z.A02(new C13013THv(t8w, exc));
        t8w.A06.set(false);
    }

    public T8V(T8W t8w) {
        this.A00 = t8w;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.RAQ, java.lang.Runnable] */
    public final void DPg() {
        T8W t8w = this.A00;
        t8w.A05.set(false);
        ((Handler) t8w.A07.getValue()).post(new RAQ(t8w, AnonymousClass05K.A01, new MMF(t8w, 42)));
    }

    public final void Dc1(boolean z) {
        11Z.A02(new C13014THw(this.A00, z));
    }

    public final void Dc3() {
        T8W t8w = this.A00;
        11Z.A02(new TED(t8w));
        t8w.A06.set(false);
    }

    public final void E0F(long j, double d) {
        11Z.A02(new TJL(this.A00, d, j));
    }
}
