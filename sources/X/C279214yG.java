package X;

import android.os.Handler;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4yG  reason: invalid class name and case insensitive filesystem */
public final class C279214yG {
    public final AnonymousClass29r A00;
    public final List A01 = Collections.synchronizedList(new LinkedList());
    public final int A02;
    public final Handler A03;
    public final Runnable A04 = new C279224yH(this);

    public static void A00(C279214yG r5) {
        r5.A03.postDelayed(r5.A04, TimeUnit.SECONDS.toMillis((long) r5.A02));
    }

    public C279214yG(Handler handler, AnonymousClass29r r3, int i) {
        this.A00 = r3;
        this.A03 = handler;
        this.A02 = i;
        A00(this);
    }
}
