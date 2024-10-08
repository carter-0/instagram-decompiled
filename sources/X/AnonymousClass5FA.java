package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: X.5FA  reason: invalid class name */
public final class AnonymousClass5FA {
    public static final AnonymousClass0eM A02 = AnonymousClass0eN.A01(AnonymousClass5FB.A00);
    public final HashMap A00 = new HashMap();
    public final Handler A01 = new Handler(Looper.getMainLooper());

    public final void A00(AnonymousClass3W1 r5) {
        0qQ.A0B(r5, 0);
        int hashCode = r5.hashCode();
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) hashMap.get(valueOf);
        if (runnable != null) {
            this.A01.removeCallbacks(runnable);
            hashMap.remove(valueOf);
        }
    }

    public final void A01(AnonymousClass3W1 r4, long j) {
        0qQ.A0B(r4, 0);
        A00(r4);
        AnonymousClass5FC r2 = new AnonymousClass5FC(this, r4);
        this.A00.put(Integer.valueOf(r4.hashCode()), r2);
        this.A01.postDelayed(r2, j);
    }
}
