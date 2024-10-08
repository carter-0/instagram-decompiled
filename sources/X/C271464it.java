package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4it  reason: invalid class name and case insensitive filesystem */
public final class C271464it {
    public static final IntentFilter A02 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    public static final C271464it A03 = new C271464it();
    public BroadcastReceiver A00 = null;
    public final List A01 = new ArrayList();

    public final void A00(Object obj) {
        Runnable runnable = (Runnable) obj;
        if (runnable == null) {
            0KC.A0D("IgZeroPlatform", "Ignoring an attempt to cancel a null Runnable");
        } else {
            0no.A00().A02(runnable);
        }
    }

    public final void A01(Runnable runnable, long j) {
        if (runnable == null) {
            0KC.A0D("IgZeroPlatform", "Ignoring an attempt to schedule a null Runnable");
        } else {
            0no.A00().A01(new AnonymousClass4j1(this, runnable), j);
        }
    }
}
