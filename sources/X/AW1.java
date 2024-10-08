package X;

import android.util.Pair;

public final /* synthetic */ class AW1 implements C3736296h {
    public final Pair A00;
    public final C3735796c A01;

    public AW1(Pair pair, C3735796c r2) {
        this.A01 = r2;
        this.A00 = pair;
    }

    public final Object Ezj(AnonymousClass9GD r4) {
        C3735796c r2 = this.A01;
        Pair pair = this.A00;
        synchronized (r2) {
            r2.A00.remove(pair);
        }
        return r4;
    }
}
