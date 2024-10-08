package X;

import android.os.Bundle;

/* renamed from: X.Ans  reason: case insensitive filesystem */
public final class C41070Ans implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C384909i5 A01;

    public C41070Ans(Bundle bundle, C384909i5 r2) {
        this.A01 = r2;
        this.A00 = bundle;
    }

    public final void run() {
        AnonymousClass80Q r0 = this.A01.A00;
        if (r0 != null) {
            r0.A00.A0x.onSaveInstanceState(this.A00);
        }
    }
}
