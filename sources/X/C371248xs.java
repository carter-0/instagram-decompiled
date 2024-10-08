package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.8xs  reason: invalid class name and case insensitive filesystem */
public final class C371248xs extends BroadcastReceiver {
    public final /* synthetic */ C371238xr A00;

    public C371248xs(C371238xr r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0fD.A01(1096517738);
        AnonymousClass0fQ.A01(this, context, intent);
        this.A00.A03.post(new C41105AoR(context, intent, this));
        AnonymousClass0fD.A0E(-1826468405, A01, intent);
    }
}
