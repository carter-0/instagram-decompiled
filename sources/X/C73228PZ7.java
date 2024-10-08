package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.PZ7  reason: case insensitive filesystem */
public final class C73228PZ7 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;

    public C73228PZ7(Intent intent, Context context) {
        this.A01 = intent;
        this.A00 = context;
    }

    public final void run() {
        Intent intent = this.A01;
        0kR.A00.A07().A0D(this.A00, intent);
    }
}
