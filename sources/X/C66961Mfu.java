package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: X.Mfu  reason: case insensitive filesystem */
public final class C66961Mfu implements C59900bo {
    public final Activity A00;

    public C66961Mfu(Activity activity) {
        this.A00 = activity;
    }

    public final ArrayList BIF() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new IntentFilter("CLOSE_CLIPS_RIGHT_PANEL_FRAGMENT"));
        return A1C;
    }

    public final void Dbc(Context context, Intent intent, C59880bj r4) {
        BroadcastReceiver broadcastReceiver;
        DbY.A1S(context, r4);
        this.A00.onBackPressed();
        if (r4 instanceof BroadcastReceiver) {
            broadcastReceiver = (BroadcastReceiver) r4;
        } else {
            broadcastReceiver = null;
        }
        context.unregisterReceiver(broadcastReceiver);
    }
}
