package X;

import android.os.Handler;
import com.google.android.exoplayer2.util.Util;

public final class WMA implements AnonymousClass4YX {
    public C290325f8 A00;
    public boolean A01;
    public final C265184Sw A02;
    public final /* synthetic */ WMB A03;

    public WMA(WMB wmb, C265184Sw r2) {
        this.A03 = wmb;
        this.A02 = r2;
    }

    public final void release() {
        Handler handler = this.A03.A01;
        handler.getClass();
        Util.A0E(handler, new C19966Wid(this));
    }
}
