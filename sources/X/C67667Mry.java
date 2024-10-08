package X;

import android.telephony.PhoneStateListener;

/* renamed from: X.Mry  reason: case insensitive filesystem */
public final class C67667Mry extends PhoneStateListener {
    public final C74299PsY A00;

    public final void onCallStateChanged(int i, String str) {
        if (i == 2) {
            this.A00.CvX();
        }
    }

    public C67667Mry(C74299PsY psY) {
        this.A00 = psY;
    }
}
