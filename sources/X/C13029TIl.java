package X;

import android.content.res.Configuration;
import android.util.DisplayMetrics;

/* renamed from: X.TIl  reason: case insensitive filesystem */
public final class C13029TIl implements Runnable {
    public final /* synthetic */ Configuration A00;
    public final /* synthetic */ DisplayMetrics A01;
    public final /* synthetic */ Q6K A02;

    public C13029TIl(Configuration configuration, DisplayMetrics displayMetrics, Q6K q6k) {
        this.A02 = q6k;
        this.A00 = configuration;
        this.A01 = displayMetrics;
    }

    public final void run() {
        try {
            Q6K q6k = this.A02;
            if (!q6k.A00) {
                q6k.A01.updateConfiguration(this.A00, this.A01);
                q6k.A00 = true;
            }
        } catch (Throwable unused) {
        }
    }
}
