package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.3rN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C253763rN implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C68031yx A02;

    public /* synthetic */ C253763rN(Context context, Intent intent, C68031yx r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = intent;
    }

    public final void run() {
        C68031yx.A00(this.A00, this.A01, this.A02);
    }
}
