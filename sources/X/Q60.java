package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class Q60 extends BroadcastReceiver {
    public final /* synthetic */ SwG A00;

    public Q60(SwG swG) {
        this.A00 = swG;
    }

    public final void onReceive(Context context, Intent intent) {
        int A03 = C66580MXl.A03(this, context, intent, -2118526327);
        SwG swG = this.A00;
        swG.A04.post(new TDF(swG));
        AnonymousClass0fD.A0E(-925848450, A03, intent);
    }
}
