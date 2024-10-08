package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9WN  reason: invalid class name */
public final class AnonymousClass9WN extends BroadcastReceiver {
    public static AtomicReference A01 = new AtomicReference();
    public final Context A00;

    public AnonymousClass9WN(Context context) {
        this.A00 = context;
    }

    public final void onReceive(Context context, Intent intent) {
        int A012 = AnonymousClass0fD.A01(-1811081252);
        AnonymousClass0fQ.A01(this, context, intent);
        synchronized (C3734195g.A09) {
            try {
                Iterator A0v = AnonymousClass7TF.A0v(C3734195g.A0A);
                while (A0v.hasNext()) {
                    C3734195g.A02((C3734195g) A0v.next());
                }
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0fD.A0E(1567831290, A012, intent);
                    throw th;
                }
            }
        }
        this.A00.unregisterReceiver(this);
        AnonymousClass0fD.A0E(2001282574, A012, intent);
    }
}
