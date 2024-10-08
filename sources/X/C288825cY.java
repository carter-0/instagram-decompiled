package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5cY  reason: invalid class name and case insensitive filesystem */
public final class C288825cY extends C267794cD implements C267814cG {
    public C62320sa A00;
    public boolean A01;

    public final void A0D() {
        this.A01 = false;
    }

    public final void AQM(AnonymousClass5Q4 r3) {
        0qQ.A0B(r3, 0);
        if (!this.A01) {
            this.A01 = true;
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).postAtFrontOfQueue(new C289375dU(this));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        r3.AQW();
    }

    public final /* synthetic */ void DPk() {
    }
}
