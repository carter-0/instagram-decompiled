package X;

import java.util.Map;

/* renamed from: X.ShD  reason: case insensitive filesystem */
public final class C11827ShD implements C13689Tf6 {
    public final int A00;
    public final Object A01;

    public C11827ShD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Cy0() {
        if (this.A00 != 0) {
            TLC tlc = (TLC) this.A01;
            tlc.A01.A00.Cgp((Map) null, (Map) null, "client_init_iap_store_connection_stopped");
            tlc.A02.Ewn(this, false);
        }
    }

    public final void Cy1(C11230SGo sGo) {
        if (this.A00 == 0) {
            0qQ.A0B(sGo, 0);
            if (sGo.A00 != 0) {
                ((S6Q) this.A01).A00 = false;
            }
            S6Q s6q = (S6Q) this.A01;
            s6q.A02(s6q);
        }
    }
}
