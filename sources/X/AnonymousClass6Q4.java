package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6Q4  reason: invalid class name */
public final class AnonymousClass6Q4 implements ComponentCallbacks2, AnonymousClass0gr {
    public final Set A00;

    public final void CuY(0TS r2) {
        0qQ.A0B(r2, 0);
        if (r2 == 0TS.A02) {
            A00();
        }
    }

    public final void DMb(0TS r2) {
        0qQ.A0B(r2, 0);
        if (r2 == 0TS.A02) {
            A00();
        }
    }

    public final void Dq7(0TS r2) {
        0qQ.A0B(r2, 0);
        if (r2 == 0TS.A02) {
            A00();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    private final void A00() {
        for (AnonymousClass6Q3 D7G : 00k.A0a(this.A00)) {
            D7G.D7G();
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 80) {
            A00();
        }
    }

    public AnonymousClass6Q4(Context context, AnonymousClass0TR r3) {
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        0qQ.A07(synchronizedSet);
        this.A00 = synchronizedSet;
        context.getApplicationContext().registerComponentCallbacks(this);
        if (r3 != null) {
            r3.A8y(this);
        }
    }

    public final void onLowMemory() {
        A00();
    }
}
