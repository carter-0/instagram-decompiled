package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.nio.charset.Charset;

/* renamed from: X.4BZ  reason: invalid class name */
public final class AnonymousClass4BZ extends BroadcastReceiver {
    public final /* synthetic */ 1bO A00;

    public AnonymousClass4BZ(1bO r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0fD.A01(-467084556);
        AnonymousClass0fQ.A01(this, context, intent);
        1bO r1 = this.A00;
        Charset charset = 1bO.A0w;
        r1.A0J.obtainMessage(7, intent.getParcelableExtra("otherNetwork")).sendToTarget();
        AnonymousClass0fD.A0E(-473422874, A01, intent);
    }
}
