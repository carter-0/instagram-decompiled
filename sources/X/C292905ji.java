package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.5ji  reason: invalid class name and case insensitive filesystem */
public final class C292905ji {
    public final HashMap A00 = new HashMap();
    public final Handler A01 = new Handler(Looper.getMainLooper());

    public static final void A00(UserSession userSession, 1Xj r3, AnonymousClass4DU r4, AnonymousClass3W1 r5) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        C282835Ex r1 = C282835Ex.A00;
        if (r1.A05(userSession, r3, r4) && r1.A03(userSession, r3, r4) && !r5.A1j) {
            r5.A1j = true;
            AnonymousClass3W1.A00(r5, 76);
        }
    }

    public final void A01(AnonymousClass3W1 r5) {
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

    public final void A02(AnonymousClass3W1 r4, long j) {
        0qQ.A0B(r4, 0);
        A01(r4);
        C57835IhE ihE = new C57835IhE(this, r4);
        this.A00.put(Integer.valueOf(r4.hashCode()), ihE);
        this.A01.postDelayed(ihE, j);
    }
}
