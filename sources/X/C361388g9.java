package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.8g9  reason: invalid class name and case insensitive filesystem */
public final class C361388g9 {
    public boolean A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final 01W A02 = new 01W();

    public final void A00(0sP r3) {
        01W r1 = this.A02;
        if (!r1.isEmpty() || this.A00) {
            r1.addLast(r3);
            return;
        }
        this.A00 = true;
        r3.invoke(new AnonymousClass9L5(this, 4));
    }
}
