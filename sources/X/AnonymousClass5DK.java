package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.5DK  reason: invalid class name */
public final class AnonymousClass5DK extends BroadcastReceiver {
    public final /* synthetic */ 1Ou A00;

    public AnonymousClass5DK(1Ou r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0fD.A01(-675831796);
        AnonymousClass0fQ.A01(this, context, intent);
        1Ou r4 = this.A00;
        IntentFilter intentFilter = 1Ou.A0W;
        if (!((Boolean) r4.A0I.get()).booleanValue() || ((Boolean) r4.A0J.get()).booleanValue()) {
            r4.A05.obtainMessage(2).sendToTarget();
            1Ou.A07(r4, "onConnectivityChanged", 0);
        } else {
            r4.A0B("onConnectivityChanged");
        }
        AnonymousClass0fD.A0E(5153498, A01, intent);
    }
}
