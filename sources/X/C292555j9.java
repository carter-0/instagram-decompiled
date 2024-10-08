package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: X.5j9  reason: invalid class name and case insensitive filesystem */
public final class C292555j9 {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final HashMap A01 = new HashMap();

    public final void A00(AnonymousClass3W1 r5) {
        int hashCode = r5.hashCode();
        HashMap hashMap = this.A01;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) hashMap.get(valueOf);
        if (runnable != null) {
            this.A00.removeCallbacks(runnable);
            hashMap.remove(valueOf);
        }
        r5.A32 = false;
    }

    public final void A01(AnonymousClass3W1 r5, long j) {
        int hashCode = r5.hashCode();
        HashMap hashMap = this.A01;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) hashMap.get(valueOf);
        if (runnable != null) {
            this.A00.removeCallbacks(runnable);
            hashMap.remove(valueOf);
        }
        C41084Ao6 ao6 = new C41084Ao6(this, r5);
        hashMap.put(Integer.valueOf(r5.hashCode()), ao6);
        this.A00.postDelayed(ao6, j);
    }
}
