package X;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: X.1EP  reason: invalid class name */
public final class AnonymousClass1EP extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final /* synthetic */ 1DI A00;

    public /* synthetic */ AnonymousClass1EP(1DI r1) {
        this.A00 = r1;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        1DI.A0P(telephonyDisplayInfo, this.A00);
    }
}
