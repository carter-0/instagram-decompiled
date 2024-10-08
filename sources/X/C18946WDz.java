package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.WDz  reason: case insensitive filesystem */
public final class C18946WDz implements X01 {
    public Handler A00;
    public HandlerThread A01;
    public C18412VrH A02;
    public final Context A03;
    public final 1rR A04;
    public final Object A05 = new Object();
    public final C16762V4v A06;

    public static void A00(C18946WDz wDz) {
        wDz.A02 = null;
        synchronized (wDz.A05) {
            wDz.A00.removeCallbacks((Runnable) null);
            HandlerThread handlerThread = wDz.A01;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            wDz.A00 = null;
            wDz.A01 = null;
        }
    }

    public C18946WDz(Context context, 1rR r3, C16762V4v v4v) {
        02V.A03(context, AnonymousClass000.A00(2181));
        02V.A03(r3, "FontRequest cannot be null");
        this.A03 = context.getApplicationContext();
        this.A04 = r3;
        this.A06 = v4v;
    }
}
