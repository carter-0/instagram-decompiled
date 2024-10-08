package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.OYs  reason: case insensitive filesystem */
public final class C71017OYs {
    public int A00;
    public C70407O5k A01;
    public boolean A02;
    public final Handler A03;
    public final OJP A04 = new OJP(this);
    public final OZz A05;
    public final C74437Pus A06;
    public final OUV A07;
    public final Handler.Callback A08;

    public static final void A00(C71017OYs oYs) {
        oYs.A02 = true;
        Handler handler = oYs.A03;
        if (!handler.hasMessages(1)) {
            oYs.A07.A00(002.A0O("turnBluetoothOn: send MSG_START_SCO | attempts: ", oYs.A00), new Object[0]);
            oYs.A00 = 0;
            handler.sendEmptyMessage(1);
        }
    }

    public static final void A01(C71017OYs oYs, boolean z) {
        OZz oZz = oYs.A05;
        oYs.A07.A00("turnBluetoothOff: remove MSG_START_SCO messages", new Object[0]);
        if (z) {
            oYs.A02 = false;
            oYs.A00 = 0;
        }
        Handler handler = oYs.A03;
        handler.removeMessages(1);
        handler.removeMessages(2);
        oZz.A04(false);
    }

    public C71017OYs(OZz oZz, C74437Pus pus, OUV ouv) {
        this.A05 = oZz;
        this.A07 = ouv;
        C11457SVv sVv = new C11457SVv(this, 1);
        this.A08 = sVv;
        this.A06 = new C71762OqO(pus);
        this.A03 = new Handler(Looper.getMainLooper(), sVv);
    }
}
