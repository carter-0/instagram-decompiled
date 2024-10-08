package X;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5kj  reason: invalid class name and case insensitive filesystem */
public final class C293435kj {
    public final Map A00 = new LinkedHashMap();
    public final Handler A01 = new Handler(Looper.getMainLooper());

    public final void A00(AnonymousClass3W1 r5) {
        int hashCode = r5.hashCode();
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) map.get(valueOf);
        if (runnable != null) {
            this.A01.removeCallbacks(runnable);
            map.remove(valueOf);
        }
    }

    public final void A01(AnonymousClass3W1 r4, long j) {
        A00(r4);
        GI6 gi6 = new GI6(this, r4);
        this.A00.put(Integer.valueOf(r4.hashCode()), gi6);
        this.A01.postDelayed(gi6, j);
    }
}
