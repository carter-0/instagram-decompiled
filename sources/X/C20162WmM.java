package X;

import android.os.Handler;

/* renamed from: X.WmM  reason: case insensitive filesystem */
public final class C20162WmM implements Runnable {
    public final /* synthetic */ W1V A00;
    public final /* synthetic */ C14711U2w A01;

    public C20162WmM(W1V w1v, C14711U2w u2w) {
        this.A01 = u2w;
        this.A00 = w1v;
    }

    public final void run() {
        C14711U2w u2w = this.A01;
        C263634Mt r2 = u2w.A08;
        C263634Mt.A05(r2, "stop", new Object[0]);
        Handler handler = r2.A0E;
        handler.sendMessage(handler.obtainMessage(37));
        u2w.setAlpha(0.0f);
        W1V w1v = this.A00;
        w1v.A00++;
        w1v.A06 = false;
        w1v.A05 = false;
        w1v.A03 = null;
        w1v.A04 = null;
        C59721JVf jVf = w1v.A02;
        if (jVf != null) {
            w1v.A04(jVf);
            w1v.A02 = null;
        }
    }
}
