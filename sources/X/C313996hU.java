package X;

import android.view.View;

/* renamed from: X.6hU  reason: invalid class name and case insensitive filesystem */
public final class C313996hU implements Runnable {
    public final /* synthetic */ C313986hT A00;

    public C313996hU(C313986hT r1) {
        this.A00 = r1;
    }

    public final void run() {
        C305736Ji r0;
        C313986hT r1 = this.A00;
        if (r1.A02 && (r0 = r1.A01) != null) {
            Object value = r0.A0C.getValue();
            0qQ.A07(value);
            C315596kB.A08(new View[]{(View) value}, true);
        }
    }
}
