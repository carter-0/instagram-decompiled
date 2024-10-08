package X;

import android.content.Context;
import com.facebook.rsys.externalcall.gen.ExternalCallDelegate;
import com.facebook.rsys.externalcall.gen.ExternalCallProxy;

public final class ND0 extends ExternalCallProxy {
    public ExternalCallDelegate A00;
    public boolean A01;
    public final Context A02;
    public final AnonymousClass0eM A03 = C73922Pm2.A01(this, 48);

    public final void setExternalCallDelegate(ExternalCallDelegate externalCallDelegate) {
        0qQ.A0B(externalCallDelegate, 0);
        this.A00 = externalCallDelegate;
    }

    public final int isExternalCallConflict() {
        return OT7.A00(this.A02) ? 1 : 0;
    }

    public final void startMonitoringExternalCalls() {
        if (!this.A01) {
            11Z.A03(new C73140PXb(this));
        }
        this.A01 = true;
    }

    public final void stopMonitoringExternalCalls() {
        if (this.A01) {
            11Z.A03(new C73141PXc(this));
        }
        this.A01 = false;
    }

    public ND0(Context context) {
        this.A02 = context;
    }
}
