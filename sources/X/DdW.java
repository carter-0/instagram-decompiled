package X;

import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppReminder;

public final /* synthetic */ class DdW implements TimeInAppReminder {
    public final /* synthetic */ 2Ay A00;
    public final /* synthetic */ C46358DdV A01;
    public final /* synthetic */ 2Aq A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ DdW(2Ay r1, C46358DdV ddV, 2Aq r3, boolean z) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = z;
        this.A01 = ddV;
    }

    public final void remind() {
        2Aq r1 = this.A02;
        2Ay r3 = this.A00;
        boolean z = this.A03;
        C46358DdV ddV = this.A01;
        2Ci.A01(r1.A05, r3, AnonymousClass05K.A0W, r1.A0P(), z);
        ddV.run();
    }
}
