package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4CG  reason: invalid class name */
public final class AnonymousClass4CG {
    public static final long A04 = TimeUnit.DAYS.toMillis(7);
    public final SharedPreferences A00;
    public final AnonymousClass4CF A01;
    public final Map A02 = new HashMap();
    public final Executor A03;

    public AnonymousClass4CG(SharedPreferences sharedPreferences, AnonymousClass4CF r3, Executor executor) {
        this.A03 = executor;
        this.A00 = sharedPreferences;
        this.A01 = r3;
    }
}
