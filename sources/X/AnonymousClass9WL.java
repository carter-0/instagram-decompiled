package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.9WL  reason: invalid class name */
public final class AnonymousClass9WL extends BroadcastReceiver {
    public C41271ArA A00;

    public final void onReceive(Context context, Intent intent) {
        int i;
        NetworkInfo activeNetworkInfo;
        int A01 = AnonymousClass0fD.A01(-98332995);
        AnonymousClass0fQ.A01(this, context, intent);
        C41271ArA arA = this.A00;
        if (arA == null) {
            i = -446118876;
        } else {
            C3734195g r0 = arA.A00.A02;
            C3734195g.A01(r0);
            ConnectivityManager connectivityManager = (ConnectivityManager) r0.A00.getSystemService(AnonymousClass000.A00(567));
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                i = -400368065;
            } else {
                Log.isLoggable("FirebaseInstanceId", 3);
                FirebaseInstanceId.A04(this.A00, 0);
                C3734195g r02 = this.A00.A00.A02;
                C3734195g.A01(r02);
                r02.A00.unregisterReceiver(this);
                this.A00 = null;
                i = -1336453422;
            }
        }
        AnonymousClass0fD.A0E(i, A01, intent);
    }
}
