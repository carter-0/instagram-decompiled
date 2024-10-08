package X;

import android.content.Context;

/* renamed from: X.FuO  reason: case insensitive filesystem */
public final class C51454FuO implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C49945FFy A01;
    public final /* synthetic */ C332277Ui A02;

    public C51454FuO(Context context, C49945FFy fFy, C332277Ui r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = fFy;
    }

    public final void run() {
        C332277Ui r0 = this.A02;
        if (r0 != null) {
            r0.D9V();
        }
        Context context = this.A00;
        if (context != null) {
            this.A01.A05(context);
        }
    }
}
