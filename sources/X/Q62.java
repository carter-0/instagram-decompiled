package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public final class Q62 extends BroadcastReceiver {
    public boolean A00;
    public final /* synthetic */ NetInfoModule A01;

    public Q62(NetInfoModule netInfoModule) {
        this.A01 = netInfoModule;
    }

    public final void onReceive(Context context, Intent intent) {
        int A03 = C66580MXl.A03(this, context, intent, 2144380569);
        AnonymousClass7TG.A1N(context, intent);
        if (0qQ.A0K(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            this.A01.updateAndSendConnectionType();
        }
        AnonymousClass0fD.A0E(-1410027322, A03, intent);
    }
}
