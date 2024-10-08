package X;

import android.os.Handler;

/* renamed from: X.Vsd  reason: case insensitive filesystem */
public final class C18483Vsd {
    public long A00 = 0;
    public long A01 = 0;
    public Handler A02;
    public VLD A03;
    public final Runnable A04 = new C19927Whw(this);

    public static synchronized void A00(C18483Vsd vsd) {
        synchronized (vsd) {
            Handler handler = vsd.A02;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            C341447mt.A02(vsd.A02, false, true);
            vsd.A02 = null;
        }
    }
}
