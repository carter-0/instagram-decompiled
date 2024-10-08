package X;

import java.util.List;

/* renamed from: X.P3b  reason: case insensitive filesystem */
public final class C72362P3b implements C74471PvR {
    public final /* synthetic */ C70817OMm A00;

    public C72362P3b(C70817OMm oMm) {
        this.A00 = oMm;
    }

    public final void Cyg() {
        C69028NdD ndD = this.A00.A03;
        ndD.A0U();
        ndD.A0b((List) null);
    }

    public final void D8J(long j) {
        C69028NdD ndD = this.A00.A03;
        if (j != 0) {
            ndD.A0Q(PH4.A00, 0);
            ndD.A05.A07(j);
            C69028NdD.A08(C69028NdD.A03(ndD), ndD, 15.0f, 250, true, true, false);
        }
    }

    public final void DwM(String str) {
        C69028NdD ndD = this.A00.A03;
        ndD.A05.A0A(str);
        ndD.A0P(new PH9(1.0f));
    }

    public final void Euw() {
        C71054OaW.A01(this.A00.A00, C69312NjD.MUTE_NOTE);
    }
}
