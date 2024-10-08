package X;

import android.content.Context;

public final class M92 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ OU0 A01;
    public final /* synthetic */ 2MD A02;

    public M92(Context context, OU0 ou0, 2MD r3) {
        this.A02 = r3;
        this.A01 = ou0;
        this.A00 = context;
    }

    public final void run() {
        2MD r2 = this.A02;
        2MD.A02(this.A00, this.A01, r2);
    }
}
