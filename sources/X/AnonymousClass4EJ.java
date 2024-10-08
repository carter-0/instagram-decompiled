package X;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyDisplayInfo;
import java.util.List;

/* renamed from: X.4EJ  reason: invalid class name */
public final class AnonymousClass4EJ extends PhoneStateListener {
    public final /* synthetic */ AnonymousClass4EI A00;

    public AnonymousClass4EJ(AnonymousClass4EI r1) {
        this.A00 = r1;
    }

    public final void onCellInfoChanged(List list) {
        1DI.A0V(this.A00.A01, list);
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        1DI.A0P(telephonyDisplayInfo, this.A00.A01);
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        1DI.A0M(serviceState, this.A00.A01);
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        1DI.A0N(signalStrength, this.A00.A01);
    }
}
