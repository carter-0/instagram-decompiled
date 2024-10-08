package X;

import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;

/* renamed from: X.1DY  reason: invalid class name */
public final class AnonymousClass1DY extends TelephonyCallback implements TelephonyCallback.SignalStrengthsListener {
    public final /* synthetic */ 1DI A00;

    public /* synthetic */ AnonymousClass1DY(1DI r1) {
        this.A00 = r1;
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        1DI.A0N(signalStrength, this.A00);
    }
}
