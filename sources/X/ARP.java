package X;

import java.util.concurrent.TimeUnit;

public final class ARP implements C368918tX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ARO A01;

    public ARP(ARO aro, int i) {
        this.A01 = aro;
        this.A00 = i;
    }

    public final boolean CSa(long j) {
        ARO aro = this.A01;
        SIO sio = (SIO) aro.A01.get(this.A00);
        0JA.A03(sio, "timeline effect should not be null.");
        return sio.A00.A06(TimeUnit.MICROSECONDS, j, aro.A02);
    }
}
