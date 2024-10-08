package X;

import java.util.Map;

/* renamed from: X.SsX  reason: case insensitive filesystem */
public final class C12383SsX implements C13727Tfx {
    public C7232Q0d A00;
    public int A01;
    public final C11286SJe A02;
    public final RQK A03;
    public final C13727Tfx A04;
    public final C11284SJc A05;
    public final Integer A06;
    public final /* synthetic */ C12384SsY A07;

    public final synchronized void D5I(String str, int i, Map map) {
        this.A04.D5I(str, i, map);
    }

    public final synchronized void DEh(Exception exc, Map map, int i, boolean z) {
        if (z) {
            int i2 = this.A01;
            if (i2 < 5) {
                this.A01 = i2 + 1;
                int intValue = this.A06.intValue();
                if (intValue == 0) {
                    this.A07.A00.EMk(this.A00, this);
                } else if (intValue != 1) {
                    C13820Thp thp = this.A07.A00;
                    RQK rqk = this.A03;
                    if (rqk != null) {
                        thp.ELd(rqk, this);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    this.A07.A00.EMS(this.A02, this.A03, this, this.A05);
                }
            }
        }
        this.A04.DEh(exc, map, i, z);
    }

    public C12383SsX(C11286SJe sJe, RQK rqk, C13727Tfx tfx, C12384SsY ssY, C11284SJc sJc, Integer num) {
        this.A07 = ssY;
        this.A06 = num;
        this.A04 = tfx;
        this.A03 = rqk;
        this.A05 = sJc;
        this.A02 = sJe;
    }
}
