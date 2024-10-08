package X;

import android.telephony.PhoneStateListener;

/* renamed from: X.4EI  reason: invalid class name */
public final class AnonymousClass4EI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1DI A01;

    public AnonymousClass4EI(1DI r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        1DI r1 = this.A01;
        if (r1.A03 != null) {
            PhoneStateListener phoneStateListener = r1.A00;
            if (phoneStateListener == null) {
                phoneStateListener = new AnonymousClass4EJ(this);
                r1.A00 = phoneStateListener;
            }
            r1.A03.A07(phoneStateListener, this.A00);
        }
    }
}
