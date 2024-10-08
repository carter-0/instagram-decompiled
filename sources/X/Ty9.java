package X;

import android.content.Context;
import java.util.concurrent.Callable;

public final class Ty9 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C307996Sh A03;
    public final /* synthetic */ AnonymousClass6SH A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ C245603dB[] A06;

    public Ty9(Context context, C307996Sh r2, AnonymousClass6SH r3, Object obj, C245603dB[] r5, int i, long j) {
        this.A02 = context;
        this.A04 = r3;
        this.A05 = obj;
        this.A06 = r5;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return C307996Sh.A04.A02(this.A02, this.A03, this.A04, this.A05, this.A06, this.A00, this.A01);
    }
}
