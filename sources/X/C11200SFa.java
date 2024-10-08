package X;

import android.content.Context;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.SFa  reason: case insensitive filesystem */
public final class C11200SFa {
    public static volatile C11200SFa A06;
    public Thread.UncaughtExceptionHandler A00;
    public final Context A01;
    public final C13275TSq A02 = new C13275TSq(this);
    public final List A03 = new CopyOnWriteArrayList();
    public final C12545Sww A04 = new C12545Sww();
    public volatile C8338Qoo A05;

    public C11200SFa(Context context) {
        Context applicationContext = context.getApplicationContext();
        AnonymousClass3Qk.A02(applicationContext);
        this.A01 = applicationContext;
    }

    public static void A00() {
        if (!(Thread.currentThread() instanceof C13229TQv)) {
            throw AnonymousClass7TE.A0z("Call expected from worker thread");
        }
    }
}
