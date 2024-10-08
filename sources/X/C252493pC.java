package X;

import android.telephony.ServiceState;
import android.telephony.TelephonyCallback;

/* renamed from: X.3pC  reason: invalid class name and case insensitive filesystem */
public final class C252493pC extends TelephonyCallback implements TelephonyCallback.ServiceStateListener {
    public final /* synthetic */ 1DI A00;

    public /* synthetic */ C252493pC(1DI r1) {
        this.A00 = r1;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        1DI.A0M(serviceState, this.A00);
    }
}
