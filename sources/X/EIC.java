package X;

import java.util.Map;

public final class EIC extends 0ng {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 2aC A01;
    public final /* synthetic */ C71082aO A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EIC(2aC r5, C71082aO r6, long j) {
        super(1182275044, 4, true, false);
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = j;
    }

    public final void run() {
        2aC r1 = this.A01;
        Map map = 2aC.A0V;
        if (r1.A05) {
            this.A02.A03();
            0no.A00().A01(this, this.A00 * 1000);
        }
    }
}
