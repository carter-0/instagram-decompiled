package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.MrL  reason: case insensitive filesystem */
public final class C67633MrL extends BroadcastReceiver {
    public final /* synthetic */ C70843ONv A00;

    public C67633MrL(C70843ONv oNv) {
        this.A00 = oNv;
    }

    public final void onReceive(Context context, Intent intent) {
        int A03 = C66580MXl.A03(this, context, intent, -168906908);
        AnonymousClass7TG.A1N(context, intent);
        C70843ONv oNv = this.A00;
        oNv.A02 = oNv.A04.isSpeakerphoneOn();
        AnonymousClass0fD.A0E(-910608618, A03, intent);
    }
}
