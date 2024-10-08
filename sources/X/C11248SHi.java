package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.PowerManager;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SHi  reason: case insensitive filesystem */
public final class C11248SHi {
    public static final IntentFilter A06;
    public final BroadcastReceiver A00;
    public final Context A01;
    public final Handler A02;
    public final AtomicLong A03 = Pxe.A1D(-1);
    public final AtomicReference A04 = new AtomicReference((Object) null);
    public final C10936S1p A05;

    static {
        IntentFilter intentFilter = new IntentFilter();
        A06 = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.setPriority(999);
    }

    public final boolean A00() {
        Boolean bool = (Boolean) this.A04.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            T9D A002 = this.A05.A00(PowerManager.class, "power");
            if (!(A002 instanceof C7860Qbk)) {
                return ((PowerManager) A002.A01()).isInteractive();
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public C11248SHi(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, C10936S1p s1p) {
        this.A01 = context;
        this.A05 = s1p;
        this.A02 = handler;
        Q64 q64 = new Q64(realtimeSinceBootClock, this);
        this.A00 = q64;
        try {
            0DH.A01(q64, this.A01, A06, this.A02);
        } catch (Exception e) {
            if (!(e.getCause() instanceof DeadObjectException)) {
                throw e;
            }
        }
    }
}
