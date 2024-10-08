package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ca.psiphon.PsiphonTunnel;

/* renamed from: X.W2n  reason: case insensitive filesystem */
public final class C18800W2n {
    public static C18800W2n A04;
    public VV6 A00;
    public VV6 A01;
    public final Handler A02 = new Handler(Looper.getMainLooper(), new W6B(this, 3));
    public final Object A03 = new Object();

    public static C18800W2n A00() {
        C18800W2n w2n = A04;
        if (w2n != null) {
            return w2n;
        }
        C18800W2n w2n2 = new C18800W2n();
        A04 = w2n2;
        return w2n2;
    }

    public static void A01(VV6 vv6, C18800W2n w2n) {
        int i = vv6.A00;
        if (i != -2) {
            int i2 = 2750;
            if (i > 0) {
                i2 = i;
            } else if (i == -1) {
                i2 = PsiphonTunnel.VPN_INTERFACE_MTU;
            }
            Handler handler = w2n.A02;
            handler.removeCallbacksAndMessages(vv6);
            handler.sendMessageDelayed(Message.obtain(handler, 0, vv6), (long) i2);
        }
    }

    public static void A02(C18800W2n w2n) {
        VV6 vv6 = w2n.A01;
        if (vv6 != null) {
            w2n.A00 = vv6;
            w2n.A01 = null;
            X1C x1c = (X1C) vv6.A02.get();
            if (x1c != null) {
                AnonymousClass7TE.A1S(W1m.A0D, ((WMX) x1c).A00, 0);
            } else {
                w2n.A00 = null;
            }
        }
    }

    public static boolean A03(X1C x1c, C18800W2n w2n) {
        VV6 vv6 = w2n.A00;
        if (vv6 == null || x1c == null || vv6.A02.get() != x1c) {
            return false;
        }
        return true;
    }

    public static boolean A04(VV6 vv6, C18800W2n w2n, int i) {
        X1C x1c = (X1C) vv6.A02.get();
        if (x1c == null) {
            return false;
        }
        w2n.A02.removeCallbacksAndMessages(vv6);
        Handler handler = W1m.A0D;
        handler.sendMessage(handler.obtainMessage(1, i, 0, ((WMX) x1c).A00));
        return true;
    }

    public final void A05(X1C x1c) {
        synchronized (this.A03) {
            if (A03(x1c, this)) {
                VV6 vv6 = this.A00;
                if (!vv6.A01) {
                    vv6.A01 = true;
                    this.A02.removeCallbacksAndMessages(vv6);
                }
            }
        }
    }

    public final void A06(X1C x1c) {
        synchronized (this.A03) {
            if (A03(x1c, this)) {
                VV6 vv6 = this.A00;
                if (vv6.A01) {
                    vv6.A01 = false;
                    A01(vv6, this);
                }
            }
        }
    }
}
