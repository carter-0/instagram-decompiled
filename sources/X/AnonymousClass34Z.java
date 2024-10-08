package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.Set;

/* renamed from: X.34Z  reason: invalid class name */
public final class AnonymousClass34Z implements Runnable {
    public final /* synthetic */ AnonymousClass34Y A00;

    public AnonymousClass34Z(AnonymousClass34Y r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass34Y r8 = this.A00;
        Set<C67286MlL> set = r8.A02;
        for (C67286MlL mlL : set) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C67285MlK mlK = mlL.A00;
            if (elapsedRealtime > C67285MlK.A05) {
                C67285MlK.A00(mlK);
            }
        }
        set.size();
        if (!set.isEmpty()) {
            Handler handler = r8.A00;
            Runnable runnable = r8.A01;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }
}
