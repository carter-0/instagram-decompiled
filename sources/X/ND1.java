package X;

import android.content.Context;
import com.facebook.rsys.externalcall.gen.ExternalCallDelegate;
import com.facebook.rsys.externalcall.gen.ExternalCallProxy;

public final class ND1 extends ExternalCallProxy {
    public ExternalCallDelegate A00;
    public boolean A01;
    public final Context A02;
    public final C74299PsY A03;
    public final OT7 A04;

    public final void setExternalCallDelegate(ExternalCallDelegate externalCallDelegate) {
        0qQ.A0B(externalCallDelegate, 0);
        this.A00 = externalCallDelegate;
    }

    public final int isExternalCallConflict() {
        return OT7.A00(this.A02) ? 1 : 0;
    }

    public final void startMonitoringExternalCalls() {
        if (!this.A01) {
            OT7 ot7 = this.A04;
            ot7.A01.A07(ot7.A00, 32);
        }
        this.A01 = true;
    }

    public final void stopMonitoringExternalCalls() {
        if (this.A01) {
            OT7 ot7 = this.A04;
            ot7.A01.A07(ot7.A00, 0);
        }
        this.A01 = false;
    }

    public ND1(Context context, C74540PwZ pwZ) {
        this.A02 = context;
        C71783Oqj oqj = new C71783Oqj(this);
        this.A03 = oqj;
        OT7 AL4 = pwZ.AL4(context, oqj);
        0qQ.A07(AL4);
        this.A04 = AL4;
    }
}
